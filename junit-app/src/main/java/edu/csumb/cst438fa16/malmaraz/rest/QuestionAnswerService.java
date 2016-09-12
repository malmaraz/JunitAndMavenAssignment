package edu.csumb.cst438fa16.malmaraz;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Set;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * A half-secretive map  of questions to answers
 * gives out random questions from the map and
 * can be queried to test if the correct answer is given
 *
 */
@Path("/")
public class QuestionAnswerService
{
    private HashMap<String, String> map = new HashMap<String, String>();
    
    public QuestionAnswerService() {
        map.put("WHat color is the sky?", "blue");
        map.put("What language does android use?", "java");
        map.put("2+2=?", "4");
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
    @GET
    @Path("/checkAnswer")
    public boolean testAnswer(@QueryParam("question") String question, @QueryParam("answer") String answer) {
        return map.get(question).equals(answer);
    }

    /**
     * gives out a random question from keyset
     */
    @GET
    @Path("/randomquestion")
    public String getRandomQuestion() {
        return "test";
        //return map.keySet().toArray()[ThreadLocalRandom.current().nextInt(1, map.size())].toString();
    }

    @GET
    @Path("/testanswer")
    public String getAnswer(@QueryParam("question") String question) {
        return map.get(question);
    }


}
