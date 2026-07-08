// Problem Statement

// Design an Online Shopping System using Java OOP principles.

// Create the following classes:
// Person (Abstract Class)
// id
// name
// email
// Customer extends Person
// city
// primeMember
// Seller extends Person
// companyName
// sellerRating
// Product
// productId
// productName
// category
// price
// rating
// inStock
// Seller seller
// Requirements
// Use Encapsulation
// Use Inheritance
// Use Constructors
// Override toString()
// Store all objects using ArrayList
// Create
// 4 Customers
// 3 Sellers
// 8 Products
// Using Stream API, perform the following operations
// Display all product names.
// Display all products that are in stock.
// Find products costing more than ₹1000.
// Find all Prime customers.
// Find sellers with rating above 4.5.
// Sort products by price.
// Sort sellers by rating (descending).
// Display all unique product categories.
// Count products that are in stock.
// Find the costliest and cheapest product.
// Calculate the average product price.
// Calculate the total value of all products using reduce().
// Check whether all products are in stock.
// Check whether any customer belongs to Delhi.
// Find the first Prime customer.
// Display the top 3 highest-rated products.
// Group products by category.
// Group products by seller.
// Partition products into In Stock and Out of Stock.
// Create a Map<Integer, Product> using Product ID as the key.
// Print all customer names separated by commas.







import java.util.*;
import java.util.stream.*;

abstract class Person {
    private int id;
    private String name;
    private String email;

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId(){return id;}
    public String getName(){ return name;}
    public String getEmail(){ return email;}


@Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Email: " + email;
    }
}

class Customer extends Person {
    private String city;
    private boolean primeMember;

    public Customer(int id, String name, String email, String city, boolean primeMember) {
        super(id, name, email);
        this.city = city;
        this.primeMember = primeMember;
    }

    public String getCity() { return city; }
    public boolean isPrimeMember() { return primeMember; }

    @Override
    public String toString() {
        return super.toString() + ", City: " + city + ", Prime: " + primeMember;
    }
}

class Seller extends Person {
    private String companyName;
    private double sellerRating;

    public Seller(int id, String name, String email, String companyName, double sellerRating) {
        super(id, name, email);
        this.companyName = companyName;
        this.sellerRating = sellerRating;
    }

    public String getCompanyName() { return companyName; }
    public double getSellerRating() { return sellerRating; }

    @Override
    public String toString() {
        return super.toString() + ", Company: " + companyName + ", Rating: " + sellerRating;
    }
}

class Product {
    private int productId;
    private String productName;
    private String category;
    private double price;
    private double rating;
    private boolean inStock;
    private Seller seller;

    public Product(int productId, String productName, String category, double price, double rating, boolean inStock, Seller seller) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.rating =rating;
        this.inStock =inStock;
        this.seller =seller;
    }

    public int getProductId() { return productId; }
    public String getProductName() { return productName; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public double getRating() { return rating; }
    public boolean isInStock() { return inStock; }
    public Seller getSeller() { return seller; }

    @Override
    public String toString() {
        return productName + " (" + category + ") - Rs " + price + ", Rating: " + rating + ", InStock: " + inStock;
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        // Customers
        List<Customer> customers = Arrays.asList(
            new Customer(1, "Abhinav", "abhi@gmail.com", "Mathura", true),
            new Customer(2, "Ravi", "ravi@gmail.com", "Delhi", false),
            new Customer(3, "Priya", "priya@gmail.com", "Agra", true),
            new Customer(4, "Neha", "neha@gmail.com", "Noida", false)
        );

        // Sellers
        Seller s1 = new Seller(101, "Amit", "amit@shop.com", "TechWorld", 4.8);
        Seller s2 = new Seller(102, "Kiran", "kiran@shop.com", "FashionHub", 4.2);
        Seller s3 = new Seller(103, "Manoj", "manoj@shop.com", "HomeNeeds", 4.9);

        List<Seller> sellers = Arrays.asList(s1, s2, s3);

        // Products
        List<Product> products = Arrays.asList(
            new Product(201, "Laptop", "Electronics", 55000, 4.7, true, s1),
            new Product(202, "Mobile", "Electronics", 15000, 4.5, true, s1),
            new Product(203, "Shoes", "Fashion", 1200, 4.2, false, s2),
            new Product(204, "T-Shirt", "Fashion", 800, 4.0, true, s2),
            new Product(205, "Mixer", "HomeAppliance", 2500, 4.3, true, s3),
            new Product(206, "Fridge", "HomeAppliance", 30000, 4.8, false, s3),
            new Product(207, "Book", "Stationery", 500, 4.1, true, s2),
            new Product(208, "Pen", "Stationery", 50, 3.9, true, s2)
        );

        // Stream Operations
        System.out.println("\nAll Product Names:");
        products.stream().map(Product::getProductName).forEach(System.out::println);

        System.out.println("\nProducts In Stock:");
        products.stream().filter(Product::isInStock).forEach(System.out::println);

        System.out.println("\nProducts costing > ₹1000:");
        products.stream().filter(p -> p.getPrice() > 1000).forEach(System.out::println);

        System.out.println("\nPrime Customers:");
        customers.stream().filter(Customer::isPrimeMember).forEach(System.out::println);

        System.out.println("\nSellers with rating > 4.5:");
        sellers.stream().filter(s -> s.getSellerRating() > 4.5).forEach(System.out::println);

        System.out.println("\nProducts sorted by Price:");
        products.stream().sorted(Comparator.comparing(Product::getPrice)).forEach(System.out::println);

        System.out.println("\nSellers sorted by Rating (desc):");
        sellers.stream().sorted(Comparator.comparing(Seller::getSellerRating).reversed()).forEach(System.out::println);

        System.out.println("\nUnique Product Categories:");
        products.stream().map(Product::getCategory).distinct().forEach(System.out::println);

        System.out.println("\nCount of Products In Stock: " +
            products.stream().filter(Product::isInStock).count());

        System.out.println("\nCostliest Product: " +
            products.stream().max(Comparator.comparing(Product::getPrice)).get());

        System.out.println("\nCheapest Product: " +
            products.stream().min(Comparator.comparing(Product::getPrice)).get());

        System.out.println("\nAverage Product Price: " +
            products.stream().mapToDouble(Product::getPrice).average().getAsDouble());

        System.out.println("\nTotal Value of Products: " +
            products.stream().map(Product::getPrice).reduce(0.0, Double::sum));

        System.out.println("\nAll Products In Stock? " +
            products.stream().allMatch(Product::isInStock));

        System.out.println("\nAny Customer from Delhi? " +
            customers.stream().anyMatch(c -> c.getCity().equalsIgnoreCase("Delhi")));

        System.out.println("\nFirst Prime Customer: " +
            customers.stream().filter(Customer::isPrimeMember).findFirst().get());

        System.out.println("\nTop 3 Highest Rated Products:");
        products.stream().sorted(Comparator.comparing(Product::getRating).reversed())
                .limit(3).forEach(System.out::println);

        System.out.println("\nGroup Products by Category:");
        products.stream().collect(Collectors.groupingBy(Product::getCategory))
                .forEach((cat, list) -> System.out.println(cat + " -> " + list));

        System.out.println("\nGroup Products by Seller:");
        products.stream().collect(Collectors.groupingBy(p -> p.getSeller().getCompanyName()))
                .forEach((sellerName, list) -> System.out.println(sellerName + " -> " + list));

        System.out.println("\nPartition Products (In Stock vs Out of Stock):");
        products.stream().collect(Collectors.partitioningBy(Product::isInStock))
                .forEach((inStock, list) -> System.out.println(inStock + " -> " + list));

        System.out.println("\nMap<ProductId, Product>:");
        Map<Integer, Product> productMap = products.stream()
                .collect(Collectors.toMap(Product::getProductId, p -> p));
        productMap.forEach((id, prod) -> System.out.println(id + " -> " + prod));

        System.out.println("\nCustomer Names (comma separated):");
        String names = customers.stream().map(Customer::getName).collect(Collectors.joining(", "));
        System.out.println(names);
    }
}
