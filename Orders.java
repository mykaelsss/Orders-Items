import java.util.ArrayList;
public class Orders{
    private String name;
    private boolean ready;
    private ArrayList<Items> items = new ArrayList<Items>();

    public Orders(){
        this.name = "Guest";
        this.ready = false;
    }

    public Orders(String name){
        this.name = name;
        this.ready = false;
    }

    public void addItem(Items item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready.";
        }
        return "Thank you for waiting. Your order will be ready soon.";
    }

    public double getOrderTotal(){
        double sum = 0.0;
        for(Items item : this.items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void display(){
        System.out.printf("Customer Name: %s \n", this.name);
        for(Items item : this.items){
            System.out.println(item.getName() + " - " +  item.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public ArrayList<Items> getItems(){
        return this.items;
    }

    public boolean isReady(){
        return this.ready;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }
    public void setItems(ArrayList<Items> items){
        this.items = items;
    }
}
