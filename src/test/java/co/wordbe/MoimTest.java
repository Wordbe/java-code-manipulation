package co.wordbe;

import org.junit.Assert;
import org.junit.Test;

public class MoimTest {

    @Test
    public void isFull() {
        Moim moim = new Moim();
        moim.limitPerson = 100;
        moim.currentEnrollment = 10;
        Assert.assertFalse(moim.isEnrollmentFull());
    }
}