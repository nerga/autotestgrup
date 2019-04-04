
import main.java.junit.project.ProjectHooks;
import main.java.junit.project.Store;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import main.java.junit.project.setResponse;


public class StoreTest {

    setResponse learn;

    @Before
    public void setup() {
        ProjectHooks.getWorld();
        learn = new setResponse();


    }

   /* public void setResponses() {

        test.learnResponse("Hej", "då");
    }*/

    @Test
    public void happyPath() {

        learn.storeResponseRequest("Hej","då");
        Assert.assertEquals("då", ProjectHooks.getWorld().getTest().getResponse("Hej"));
        ProjectHooks.getWorld().getTest().unlearnAll();
        Assert.assertEquals(null, ProjectHooks.getWorld().getTest().getResponse("Hej"));

    }
}

