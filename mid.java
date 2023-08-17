public class mid {
    public static void main(String[] args) {
        Product chair = new Product("Chair", 500.0);
        Electronics tv = new Electronics("Television", 20000.0,"Samsung", "Neo QLED");
        Smartphone iphone = new Smartphone("Iphone", 40000.0, "Apple", "Iphone 99", "ios");
        Book oppProgramming = new Book("OOP Programing", 250.0, "John Doe", 300);

        chair.getName();
        chair.getPrice();
        System.out.println("******************");

        tv.getName();
        tv.getPrice();
        tv.getBrand();
        tv.getModel();
        System.out.println("******************");

        iphone.getName();
        iphone.getPrice();
        iphone.getBrand();
        iphone.getModel();
        iphone.getOperatingSystem();
        System.out.println("******************");

        oppProgramming.getName();
        oppProgramming.getPrice();
        oppProgramming.getAuthor();
        oppProgramming.getPage();
    }
}
class Product{
    private String name;
    private double price;

    public void getName(){
        System.out.println("Product Name: "+this.name);
    }

    public void setName(String name){
        this.name = name;
    }

    public void getPrice(){
        System.out.println("Product Price: "+this.price);
    }

    public void setPrice(){
        this.price = price;
    }

    public Product(String name,double price){
        this.name = name;
        this.price = price;
    }
}

class Electronics extends Product{
    private String brand;
    private String model;

    public void getBrand(){
        System.out.println("Brand: "+this.brand);
    }

    public void setBrand(){
        this.brand = brand; 
    }

    public void getModel(){
        System.out.println("Model: "+this.model);
    }

    public void setModel(){
        this.model = model;
    }

    public Electronics(String name , double price, String brand,String model){
        super(name, price);
        this.model = model;
        this.brand = brand;
    }
}

class Smartphone extends Electronics{
    private String operatingSystem;

    public void getOperatingSystem(){
        System.out.println("Operating System: " + this.operatingSystem);
    }

    public void setOperatingSystem(String ops){
        this.operatingSystem = ops;
    }

    public Smartphone(String name, double price, String brand, String model, String ops){
        super(name, price, brand, model);
        this.operatingSystem = ops;
    }
}

class Book extends Product{
    private String author;
    private int pages;

    public void getAuthor(){
        System.out.println("Brand: "+this.author);
    }

    public void setAuthor(){
        this.author = author; 
    }

    public void getPage(){
        System.out.println("Model: "+this.pages);
    }

    public void setPages(){
        this.pages = pages;
    }

    public Book(String name,double price,String aurtor,int pages){
        super(name, price);
        this.author = aurtor;
        this.pages = pages;
    }
}