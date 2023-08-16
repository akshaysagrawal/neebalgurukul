package com.neebal.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String questionDesc;

    @Column(nullable = false)
    private Integer marks;

    @ManyToOne
    private Topic topic;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private Set<QuestionOption> question_optionSet;

    @OneToMany(mappedBy = "question")
    private Set<ExamQuestion> examQuestionSet;

    public Question() {
    }

    public Question(String questionDesc, Integer marks) {
        this.questionDesc = questionDesc;
        this.marks = marks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionDesc() {
        return questionDesc;
    }

    public void setQuestionDesc(String questionDesc) {
        this.questionDesc = questionDesc;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

   public Set<QuestionOption> getQuestion_optionSet() {
        return question_optionSet;
    }

    public void setQuestion_optionSet(Set<QuestionOption> question_optionSet) {
        this.question_optionSet = question_optionSet;
    }

    public Set<ExamQuestion> getExamQuestionSet() {
        return examQuestionSet;
    }

    public void setExamQuestionSet(Set<ExamQuestion> examQuestionSet) {
        this.examQuestionSet = examQuestionSet;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", questionDesc='" + questionDesc + '\'' +
                ", marks=" + marks +
                ", topic=" + topic +
                '}';
    }
}
