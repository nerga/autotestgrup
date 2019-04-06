package main.java.junit.project;

public class setResponse {


    Store store = new Store();
    String request;
    String response;


    public String storeResponseRequest(String request, String response) {

        store.learnResponse(request, response);

        this.request = request;
        this.response = response;
        return request;

    }


    public void unlearn(){
        store.unlearnAll();
    }


    public String getResponse(String request){
        storeResponseRequest(request,response);
        
        store.getResponse(request);

        this.request = request;
        return request;

    }


}