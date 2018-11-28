package se.nackademin.onlinetest;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;


public class OnlineTestTest extends TestCase {

    public void testOnlineTest() throws Exception {
        OnlineTest test = new OnlineTest("Test of Online Game");

        test.current = 0;
        test.jb[1].setSelected(true);
        Assertions.assertTrue(test.check());
        System.out.println(test.check());

        test.current = 4;
        test.jb[1].setSelected(true);
        Assertions.assertTrue(test.check());
        System.out.println(test.check());

        test.current = 7;
        test.jb[2].setSelected(true);
        Assertions.assertTrue(test.check());
        System.out.println(test.check());

        test.current = 9;
        test.jb[3].setSelected(true);
        Assertions.assertFalse(test.check());
        System.out.println(test.check());

        test.current = 11;
        test.jb[3].setSelected(true);
        Assertions.assertFalse(test.check());
        System.out.println(test.check());


    }
    public void testLabelQuestions() throws Exception {
        OnlineTest test = new OnlineTest("Test of Online Game");
        String assertionError = null;

        test.current = 0;
        test.set();
        Assertions.assertEquals(test.l.getText(), GetQuestion.returnQuestion(test.current));
        test.current = 3;
        test.set();
        Assertions.assertEquals(test.l.getText(), GetQuestion.returnQuestion(3));
        test.current = 6;
        test.set();
        Assertions.assertEquals(test.l.getText(), GetQuestion.returnQuestion(test.current));
        test.current = 8;
        test.set();

        try {
                Assertions.assertEquals(test.l.getText(), GetQuestion.returnQuestion(9));

            } catch (AssertionError e) {
                assertionError = e.toString();
                System.out.println(assertionError);
            }

        }
    }



