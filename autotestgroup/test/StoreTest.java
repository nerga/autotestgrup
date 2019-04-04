
import main.java.junit.project.Store;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import main.java.junit.project.setResponse;


public class StoreTest {

    Store test;
    setResponse learn;

    @Before
    public void setup() {
        test = new Store();
        learn = new setResponse();


    }

   /* public void setResponses() {

        test.learnResponse("Hej", "då");
    }*/

    @Test
    public void happyPath() {

        learn.storeResponseRequest("Hej","då");
        Assert.assertEquals("då", test.getResponse("Hej"));
        test.unlearnAll();
        Assert.assertEquals(null, test.getResponse("Hej"));

    }
}

