package creational.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {

    }

    public static ThreadSafeSingleton getInstance() {

        if (instance == null) {
            //synchronized block instead of method to remove overhead
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }

            }
        }
        return instance;
    }
}
