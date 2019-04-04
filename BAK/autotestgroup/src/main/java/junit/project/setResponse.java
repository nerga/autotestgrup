package main.java.junit.project;

public class setResponse {
    ProjectHooks test = new ProjectHooks();
    String response;
    String request;


    public void storeResponseRequest(String request, String response) {
        ProjectHooks.getWorld().test.learnResponse(request, response);
        this.request = request;
        this.response = response;

    }

}