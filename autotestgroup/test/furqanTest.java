
import main.java.junit.project.RequestResponse;
import main.java.junit.project.Store;
import org.bouncycastle.cert.ocsp.Req;
import org.junit.*;
import org.junit.Test;





public class furqanTest {
    String x = "Furkan";
    String z = "Gencer";
    String Anka = "kalle";
    String Kalle = "Anka";


    Store test = new Store();
    RequestResponse Reqtest = new RequestResponse(Kalle, Anka);


    public String askforRequest(String az) {
        az = Reqtest.getRequest();
        return Reqtest.getRequest();
    }

    @Test
    public void settingreq() {

        Reqtest.setRequest(Kalle);


    }


    public void setresponserinos() {



        test.learnResponse("Anka", "Kalle");


    }

    @Test
    public void Efternamnkorrekt() {


        Assert.assertEquals("Gencer", Reqtest.getResponse());
        System.out.println("Ditt Efternamn är  " + Reqtest.getResponse());

    }


    @Test
    public void testafunktionalitet() {

        setresponserinos();
     //   Reqtest.setRequest("Furkan");
      //  Reqtest.setResponse("Gencer");

     //  test.learnResponse("Furkan", "Gencer");

        //   test.getResponse("Furkan");


        Assert.assertEquals("Gencer", test.getResponse("Furkan"),null);

        if (test.getResponse("Furkan").equals("Gencer")) {
            System.out.println("Ditt efternamn är Gencer, och ditt förnamn är Furkan . Testet har gått igenom.");
            test.unlearnAll();
        } else {
            System.out.println("Någonting gick fel under denna process.");
            test.unlearnAll();
        }

    }

    @Test
    public void Learningprogramtoadd() {


        setresponserinos();

        Assert.assertEquals(Anka, test.getResponse(Kalle));


        if (test.getResponse(Anka).equals(Kalle)) {
            System.out.println("Ditt efternamn är Anka, och ditt förnamn är Kalle . Testet har gått igenom.");
        } else {
            System.out.println("Någonting gick fel under denna process.");
        }


        //      test.getResponse(Anka);


    }
}





