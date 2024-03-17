package creational.singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
        EagerSingleton  eagerSingleton = EagerSingleton.getInstance();
        LazySingleton lazySingleton = LazySingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
//        BillPughSingleton singletonclone =billPughSingleton.clone();

    }

}
