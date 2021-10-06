package creational.singleton;

public class EagerSingleton {

    public static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {

        return instance;

    }

}
