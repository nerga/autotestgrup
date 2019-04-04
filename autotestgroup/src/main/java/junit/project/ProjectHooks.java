package main.java.junit.project;

public class ProjectHooks {

    private static ProjectWorld world;

    public static ProjectWorld getWorld() {
        return world;
    }


    public void setup(){
        world = new ProjectWorld();
    }


}
