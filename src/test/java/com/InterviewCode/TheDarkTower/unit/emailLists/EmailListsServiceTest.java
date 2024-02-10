package com.InterviewCode.TheDarkTower.unit.emailLists;

import com.InterviewCode.TheDarkTower.emailLists.services.EmailListsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EmailListsServiceTest {

    /*
        From reason.md
        Example:
            Input: ["test.email+alex@email.com","test.e.mail+bob.cathy@email.com","testemail+david@e.mail.com"]
            Output: 2

        Test Caxses:
            ["test.email+alex@alphaomega.com","test.e.mail+bob.cathy@alphaomega.com","testemail+david@alpha.omega.com","testemail+davidnatera@alphaomega.com","teste+mail.davidnatera@alphaomega.com","teste.mail.davidnatera@alphaomega.com","test.email@davidalpha+omega.com","test+email@davidalpha.omega.com","test+email@david.alpha.omega.com","test+email+david@alpha+omega.com","test+email.david@alpha+omega.com",".t.est.email+@david.alpha.omega.com",".t.est.emai+l+@.david.alpha.omega.com","+test.email@david.alpha.omega.com"]
    */

    // I have however changed the return to Sets and Lists because that is more useful and you can get .size() just fine.

    List<String> EXAMPLE_LIST = List.of("test.email+alex@email.com","test.e.mail+bob.cathy@email.com","testemail+david@e.mail.com");
    List<String> GIVEN_TEST_LIST = List.of("test.email+alex@alphaomega.com","test.e.mail+bob.cathy@alphaomega.com","testemail+david@alpha.omega.com","testemail+davidcompany@alphaomega.com","teste+mail.davidcompany@alphaomega.com","teste.mail.davidcompany@alphaomega.com","test.email@davidalpha+omega.com","test+email@davidalpha.omega.com","test+email@david.alpha.omega.com","test+email+david@alpha+omega.com","test+email.david@alpha+omega.com",".t.est.email+@david.alpha.omega.com",".t.est.emai+l+@.david.alpha.omega.com","+test.email@david.alpha.omega.com");

    @Autowired
    EmailListsService emailListsService;

    @Test
    public void simpStringFirstExampleAlex() {
        String expected = "testemail@email.com";
        assertEquals(expected, emailListsService.simpString(EXAMPLE_LIST.get(0)));
    }

    @Test
    public void simpStringFirstExampleBob() {
        String expected = "testemail@email.com";
        assertEquals(expected, emailListsService.simpString(EXAMPLE_LIST.get(1)));
    }

    @Test
    public void distListExample() {
        emailListsService.purgeEmailList();
        List<String> expected = List.of("testemail@email.com", "testemail@e.mail.com");
        assertEquals(expected, emailListsService.distList(EXAMPLE_LIST));
    }

    @Test
    public void distListTestSet() {
        emailListsService.purgeEmailList();
        List<String> expected = List.of("testemail@alphaomega.com",
                "testemail@alpha.omega.com",
                "teste@alphaomega.com",
                "testemaildavidcompany@alphaomega.com",
                "testemail@davidalpha+omega.com",
                "test@davidalpha.omega.com",
                "test@david.alpha.omega.com",
                "test@alpha+omega.com",
                "testemail@david.alpha.omega.com",
                "testemai@.david.alpha.omega.com",
                "@david.alpha.omega.com");
        assertEquals(expected, emailListsService.distList(GIVEN_TEST_LIST));
    }

    @Test
    public void setDistListTestExample() {
        Set<String> expected = Set.of("testemail@email.com", "testemail@e.mail.com");
        assertEquals(expected, emailListsService.setDistList(EXAMPLE_LIST));
    }

    @Test
    public void setDistListTestSet() {
        Set<String> expected = Set.of("testemail@alphaomega.com",
                "testemail@alpha.omega.com",
                "teste@alphaomega.com",
                "testemaildavidcompany@alphaomega.com",
                "testemail@davidalpha+omega.com",
                "test@davidalpha.omega.com",
                "test@david.alpha.omega.com",
                "test@alpha+omega.com",
                "testemail@david.alpha.omega.com",
                "testemai@.david.alpha.omega.com",
                "@david.alpha.omega.com");
        assertEquals(expected, emailListsService.setDistList(GIVEN_TEST_LIST));
    }
}
