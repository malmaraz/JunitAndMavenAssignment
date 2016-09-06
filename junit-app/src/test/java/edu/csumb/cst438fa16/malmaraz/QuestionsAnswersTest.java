package edu.csumb.cst438fa16.malmaraz;

import org.junit.Test;
import org.hamcrest.CoreMatchers;
import org.junit.Assert.*;


public class QuestionsAnswersTest
{
    @Test
    public void TestPut()
    {
         QuestionsAnswers mock = new QuestionsAnswers();
         String question = "What color is the sky?";
         String answer = "blue";

         mock.put(question, answer);
         org.junit.Assert.assertTrue(mock.testAnswer(question, answer));
    }
}
