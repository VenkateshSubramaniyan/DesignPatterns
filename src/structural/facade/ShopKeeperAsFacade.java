package structural.facade;

public class ShopKeeperAsFacade {

    private MobileShop iphone;
    private MobileShop samsung;

    public ShopKeeperAsFacade(){
        iphone= new Iphone();
        samsung=new Samsung();
    }
    public void iphoneSale(){
        iphone.modelNo();
        iphone.price();
    }
    public void samsungSale(){
        samsung.modelNo();
        samsung.price();
    }

}
