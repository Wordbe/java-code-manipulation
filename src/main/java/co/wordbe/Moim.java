package co.wordbe;

public class Moim {

    int limitPerson;

    int currentEnrollment;

    public boolean isEnrollmentFull() {
        if (limitPerson == 0) {
            return false;
        }

        if (currentEnrollment < limitPerson) {
            return false;
        }

        return true;
    }
}
