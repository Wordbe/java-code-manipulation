package co.wordbe.moim;

public class Moim {

    public int limitPerson;

    public int currentEnrollment;

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
