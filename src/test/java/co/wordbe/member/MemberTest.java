package co.wordbe.member;

import org.junit.Assert;
import org.junit.Test;

public class MemberTest {

    @Test
    public void lombok() {
        Member member = new Member();
        member.setName("rdi");

        Assert.assertEquals(member.getName(), "rdi");
    }
}