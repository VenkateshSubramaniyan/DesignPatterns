package structural.facade;

public class FacadePatternClient {

    private static int choice;

    public static void main(String args[]) {
        ShopKeeperAsFacade facade = new ShopKeeperAsFacade();
        facade.iphoneSale();
        facade.samsungSale();
    }
}