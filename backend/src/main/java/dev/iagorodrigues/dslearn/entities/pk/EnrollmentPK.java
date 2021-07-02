package dev.iagorodrigues.dslearn.entities.pk;

import dev.iagorodrigues.dslearn.entities.Offer;
import dev.iagorodrigues.dslearn.entities.User;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class EnrollmentPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    private User user;

    @ManyToOne
    private Offer offer;

    public EnrollmentPK() {
    }

    public EnrollmentPK(User user, Offer offer) {
        this.user = user;
        this.offer = offer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnrollmentPK that = (EnrollmentPK) o;

        if (!getUser().equals(that.getUser())) return false;
        return getOffer().equals(that.getOffer());
    }

    @Override
    public int hashCode() {
        int result = getUser().hashCode();
        result = 31 * result + getOffer().hashCode();
        return result;
    }
}
