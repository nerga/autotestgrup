
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

    /*public void setResponses() {

        store.learnResponse("Hej", "då");
    }*/

    @Test
    public void happyPath() {

        String request = "Hej";
        String response = "då";

        learn.storeResponseRequest(request,response);
        Assert.assertEquals(response, learn.getResponse(request));
        learn.unlearn();
        Assert.assertEquals(null, learn.getResponse(request));

    }

    @Test
    public void aTestThatWorks(){

        Store store = new Store();
        store.learnResponse("Hej", "då");
        Assert.assertEquals("då", store.getResponse("Hej"));
        store.unlearnAll();
        Assert.assertEquals(null, store.getResponse("Hej"));



    }

}

