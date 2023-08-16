package com.neebal;

import com.neebal.entities.Question;
import com.neebal.entities.QuestionOption;
import com.neebal.entities.Topic;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

public class CreateTopic {
    public static void main(String[] args) {

        QuestionOption opt1 = new QuestionOption("A. 1960",false);
        QuestionOption opt2 = new QuestionOption("B. 1950",false);
        QuestionOption opt3 = new QuestionOption("C. 1947",true);
        QuestionOption opt4 = new QuestionOption("D. 1920",false);

        Question question1 = new Question("Which year India got independence?",5);

        Topic topic = new Topic("History");

        opt1.setQuestion(question1);
        opt2.setQuestion(question1);
        opt3.setQuestion(question1);
        opt4.setQuestion(question1);


        Set<QuestionOption> questionOptionSet = new HashSet<>();
        questionOptionSet.add(opt1);
        questionOptionSet.add(opt2);
        questionOptionSet.add(opt3);
        questionOptionSet.add(opt4);
        question1.setQuestion_optionSet(questionOptionSet);


        question1.setTopic(topic);
        Set<Question> questionSet = new HashSet<>();
        questionSet.add(question1);
        topic.setQuestionSet(questionSet);

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try(Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(topic);
            transaction.commit();
        }
    }
}
