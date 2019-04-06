package main.java.junit.project;

public class Client {


    Store store = new Store();

    String response;
    String request;

    public void storeResponseRequest(String request, String response) {

        store.learnResponse(request, response);
        this.response = response;
        this.request = request;

    }


    public void unlearn(){
        store.unlearnAll();
    }


    public String getResponse(String request){
        storeResponseRequest(request,response);
        store.getResponse(request);
        return response;


    }


}