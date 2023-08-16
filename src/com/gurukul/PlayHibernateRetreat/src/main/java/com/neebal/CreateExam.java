package com.neebal;

import com.neebal.entities.Exam;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CreateExam {

    public static void main(String[] args) {
        Exam exam = new Exam("Sem1",30.0,25l);

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        try(Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();
            session.save(exam);
            transaction.commit();
        }
    }
}
