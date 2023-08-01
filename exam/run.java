package exam;

public class run {
    public static void main(String[] args) {
        Customer c=new Customer("5155", "rony", "tangail", "01747430447");
        c.addCustomer();
        c.deleteCustomer();
        c.editCustomer();

        
    }
}
 class Customer {
    public String id;
    public String name;
    public String address;
    public String phoneNumber;

    public Customer(String id, String name, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void addCustomer() {
        // Implementation for adding a customer
        System.out.println("addcustomer");
    }

    public void editCustomer() {
        // Implementation for editing a customer
        System.out.println("edit customer");
    }

    public void deleteCustomer() {
        // Implementation for deleting a customer
        System.out.println("delete customer");
    }

    
}

 class Order {
    public String time;
    public int duration;
    //public String date;

    public Order(String time, int duration, String date) {
        this.time = time;
        this.duration = duration;
        this.date = date;
    }

    public void createOrder() {
        // Implementation for creating an order
        System.out.println("create order");
    }

    public void editOrder() {
        // Implementation for editing an order
        System.out.println("edit order");
    }

    
}

 class Product {
    public float price;
    public String type;

    public Product(float price, String type) {
        this.price = price;
        this.type = type;
    }

    public void addProduct() {
        // Implementation for adding a product
        System.out.println("add product");
    }

    public void modifyProduct() {
        // Implementation for modifying a product
        System.out.println("modify product");
    }
}
