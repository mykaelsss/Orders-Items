import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {

        // Menu items
        Items item1 = new Items("mocha", 3.50);
        Items item2= new Items("latte", 4.0);
        Items item3 = new Items("drip coffee", 3.0);
        Items item4 = new Items("cappucino", 4.50 );
        // Order variables -- order1, order2 etc.
        Orders order1 = new Orders();
        Orders order2 = new Orders();

        Orders order3 = new Orders("Mykael");
        Orders order4 = new Orders("Seki");
        Orders order5 = new Orders("Kio");
    //Adding items to each order instance using the method built inside of the Orders class
        order1.addItem(item1);
        order1.addItem(item4);

        order2.addItem(item2);
        order2.addItem(item3);

        order3.addItem(item1);
        order3.addItem(item3);

        order4.addItem(item2);
        order4.addItem(item4);

    //Updating the isReady member using the setReady setter in the Orders class
    order3.setReady(true);
    order4.setReady(true);
    System.out.println(order1.getStatusMessage());
    System.out.println(order2.getStatusMessage());
    System.out.println(order3.getStatusMessage());
    System.out.println(order4.getStatusMessage());
    System.out.println(order5.getStatusMessage());

    System.out.println(order1.getOrderTotal());

    //Displaying all the orders
    order1.display();
    order2.display();
    order3.display();
    order4.display();
    order5.display();
    }
}
