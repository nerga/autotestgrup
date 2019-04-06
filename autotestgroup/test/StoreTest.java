
import main.java.junit.project.Store;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import main.java.junit.project.setResponse;



public class StoreTest {


    setResponse learn;



    @Before
    public void setup() {

        learn = new setResponse();


    }

   /* public void setResponses() {

        test.learnResponse("Hej", "då");
    }*/

    @Test
    public void happyPath() {

        learn.storeResponseRequest("Hej","då");
        Assert.assertEquals("då", learn.getResponse("Hej"));
        learn.unlearn();
        Assert.assertEquals(null, learn.getResponse("Hej"));

    }

    @Test
    public void aTestThatWorks(){


    }

}

