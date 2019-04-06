
import main.java.junit.project.Store;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import main.java.junit.project.Client;



public class StoreTest {


    Client learn;



    @Before
    public void setup() {

        learn = new Client();


    }

    /*public void setResponses() {

        store.learnResponse("Hej", "då");
    }*/

    @Test
    public void happyPath() {
        
        learn.storeResponseRequest("Hej","då");
        Assert.assertEquals("då", learn.getResponse("Hej"));
        learn.unlearn();
        Assert.assertEquals(null,learn.getResponse("Hej"));

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

