
import main.java.junit.project.Store;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class StoreTest {

Store test;


    @Before
    public void setup() {

    test = new Store();



    }
    @Test
    public void happyPath() {
    test.learnResponse("Hej", "då");
        Assert.assertEquals("då", test.getResponse("Hej"));
    test.unlearnAll();
        Assert.assertEquals(null, test.getResponse("Hej"));

    }

}

