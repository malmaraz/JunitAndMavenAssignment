package edu.csumb.cst438fa16.malmaraz;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Set;

/**
 * A half-secretive map  of questions to answers
 * gives out random questions from the map and
 * can be queried to test if the correct answer is given
 *
 */
public class QuestionsAnswers
{
    private HashMap<String, String> map = new HashMap<String, String>();
    
    public QuestionsAnswers() {
        return;
    }

    /**
     * Maps question to answer
     */
    void put(String question, String answer) {
        map.put(question, answer);
    }

    /**
     * Queries if question maps to answer
     */
    boolean testAnswer(String question, String answer) {
        return map.get(question).equals(answer);
    }

    /**
     * gives out a random question from keyset
     */
    String getRandomQuestion() {
        return map.keySet().toArray()[ThreadLocalRandom.current().nextInt(1, map.size())].toString();
    }


}
