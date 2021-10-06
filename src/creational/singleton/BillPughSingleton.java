package creational.singleton;

public class BillPughSingleton {


    private BillPughSingleton() {

    }

    public static BillPughSingleton getInstance() {
        return SingletonCreator.INSTANCE;
    }

    // Inner class to provide instance of class
    private static class SingletonCreator {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

}
