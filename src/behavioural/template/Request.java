package behavioural.template;


public class Request {

    private String name;
    private int age;
    private float weight;

    public Request(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

}
