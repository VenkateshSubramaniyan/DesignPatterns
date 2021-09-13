package behavioural.visitor;


/**
 Advantages :
    1)  If the logic of operation changes, then we need to make change only in the
            visitor implementation rather than doing it in all the item classes.
    2)  Adding a new item to the system require change only in visitor interface and
            implementation and existing item classes will not be affected.
**/

public class ShoppingCartClient {

    public static void main(String[] args) {

        ItemElement[] items = new ItemElement[]{new Book(20, "1234"),
                new Book(100, "5678"), new Fruit(10, 2, "Banana"),
                new Fruit(5, 5, "Apple")};

        int total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }

    private static int calculatePrice(ItemElement[] items)
    {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum=0;
        for(ItemElement item : items)
        {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }

}
