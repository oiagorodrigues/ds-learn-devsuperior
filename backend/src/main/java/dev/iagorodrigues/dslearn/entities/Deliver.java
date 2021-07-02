package dev.iagorodrigues.dslearn.entities;

import dev.iagorodrigues.dslearn.entities.enums.DeliverStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_deliver")
public class Deliver implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uri;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;

    private DeliverStatus status;
    private String feedback;
    private Integer correctCount;

    @ManyToOne
    private Lesson lesson;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "offer_id"),
            @JoinColumn(name = "user_id")
    })
    private Enrollment enrollment;

    public Deliver() {
    }

    public Deliver(Long id, String uri, Instant moment, DeliverStatus status, String feedback, Integer correctCount, Lesson lesson, Enrollment enrollment) {
        this.id = id;
        this.uri = uri;
        this.moment = moment;
        this.status = status;
        this.feedback = feedback;
        this.correctCount = correctCount;
        this.lesson = lesson;
        this.enrollment = enrollment;
    }

    public Long getId() {
        return id;
    }

    public String getUri() {
        return uri;
    }

    public Instant getMoment() {
        return moment;
    }

    public DeliverStatus getStatus() {
        return status;
    }

    public String getFeedback() {
        return feedback;
    }

    public Integer getCorrectCount() {
        return correctCount;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public Enrollment getEnrollment() {
        return enrollment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Deliver deliver = (Deliver) o;

        return getId().equals(deliver.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
