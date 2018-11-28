package se.nackademin.onlinetest;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class GetQuestionTest extends TestCase {


    public void testreturnQuestion() throws Exception {

       GetQuestion.setArray();
       Assertions.assertEquals(GetQuestion.returnQuestion(0),"Que1: Which one among these is not a datatype");

        Assertions.assertEquals(GetQuestion.returnQuestion(3),"Que4: What happens when thread's sleep() method is called");

        Assertions.assertNotEquals(GetQuestion.returnQuestion(7),"Que10: Which one among these is not a valid component");

    }

}
