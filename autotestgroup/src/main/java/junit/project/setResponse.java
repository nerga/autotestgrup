package main.java.junit.project;

public class setResponse {
    Store test = new Store();
    String response;
    String request;


    public void storeResponseRequest(String request, String response) {
        test.learnResponse(request, response);
        this.request = request;
        this.response = response;

    }

}