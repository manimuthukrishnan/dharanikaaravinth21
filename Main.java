//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept five product information from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter pid, price, quantity for product " + (i + 1) + ": ");
            int pid = sc.nextInt();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        // Find pid of the product with the highest price
        double maxPrice = products[0].getPrice();
        int maxPricePid = products[0].getPid();
        for (Product p : products) {
            if (p.getPrice() > maxPrice) {
                maxPrice = p.getPrice();
                maxPricePid = p.getPid();
            }
        }
        System.out.println("Product ID with highest price: " + maxPricePid);

        // Calculate and return total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);
    }

    // Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double sum = 0;
        for (Product p : products) {
            sum += p.getPrice() * p.getQuantity();
        }
        return sum;
    }
}

public class Person {
    private String name;
    private int age;

    // Default constructor with default age 18
    public Person(String name) {
        this.name = name;
        this.age = 18;
    }

    // Constructor with name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Product {
    private int pid;
    private double price;
    private int quantity;

    // Parameterized constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept five product information from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter pid, price, quantity for product " + (i + 1) + ": ");
            int pid = sc.nextInt();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        // Find pid of the product with the highest price
        double maxPrice = products[0].getPrice();
        int maxPricePid = products[0].getPid();
        for (Product p : products) {
            if (p.getPrice() > maxPrice) {
                maxPrice = p.getPrice();
                maxPricePid = p.getPid();
            }
        }
        System.out.println("Product ID with highest price: " + maxPricePid);

        // Calculate and return total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);
    }

    // Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double sum = 0;
        for (Product p : products) {
            sum += p.getPrice() * p.getQuantity();
        }
        return sum;
    }
}
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept five product information from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter pid, price, quantity for product " + (i + 1) + ": ");
            int pid = sc.nextInt();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        // Find pid of the product with the highest price
        double maxPrice = products[0].getPrice();
        int maxPricePid = products[0].getPid();
        for (Product p : products) {
            if (p.getPrice() > maxPrice) {
                maxPrice = p.getPrice();
                maxPricePid = p.getPid();
            }
        }
        System.out.println("Product ID with highest price: " + maxPricePid);

        // Calculate and return total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);
    }

    // Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double sum = 0;
        for (Product p : products) {
            sum += p.getPrice() * p.getQuantity();
        }
        return sum;
    }
}
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept five product information from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter pid, price, quantity for product " + (i + 1) + ": ");
            int pid = sc.nextInt();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        // Find pid of the product with the highest price
        double maxPrice = products[0].getPrice();
        int maxPricePid = products[0].getPid();
        for (Product p : products) {
            if (p.getPrice() > maxPrice) {
                maxPrice = p.getPrice();
                maxPricePid = p.getPid();
            }
        }
        System.out.println("Product ID with highest price: " + maxPricePid);

        // Calculate and return total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);
    }

    // Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double sum = 0;
        for (Product p : products) {
            sum += p.getPrice() * p.getQuantity();
        }
        return sum;
    }
}
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept five product information from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter pid, price, quantity for product " + (i + 1) + ": ");
            int pid = sc.nextInt();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        // Find pid of the product with the highest price
        double maxPrice = products[0].getPrice();
        int maxPricePid = products[0].getPid();
        for (Product p : products) {
            if (p.getPrice() > maxPrice) {
                maxPrice = p.getPrice();
                maxPricePid = p.getPid();
            }
        }
        System.out.println("Product ID with highest price: " + maxPricePid);

        // Calculate and return total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);
    }

    // Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double sum = 0;
        for (Product p : products) {
            sum += p.getPrice() * p.getQuantity();
        }
        return sum;
    }
}