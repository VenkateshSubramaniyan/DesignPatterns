package creational.abstractfactory;

/**
 * Here the language supported by our application itself got changed.
 * But there is no change in our application since we were usi
 */


public class AbstractFactoryDemo {


    public static void main(String[] args) {
        MessagesAbstractFactory factory;
        factory = new MessagesEnFactory();
        doGreet(factory);
        System.out.println("Changing language");
        factory = new MessagesEsFactory();
        doGreet(factory);

    }

    public static void doGreet(MessagesAbstractFactory factory ){

        Greetings greetings= factory.getGreetings();
        System.out.println( greetings.goodMorning());
        System.out.println( greetings.goodMorning());

    }

}
