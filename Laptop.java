public class Laptop{
    String brand;
    double storage;
    double memory;
    double dimension;
    String model;
    String condition;
    double price;

    void printDeatils(){
        System.out.printf("""
        %s %s %s
        """, condition, brand, model);
    }
}