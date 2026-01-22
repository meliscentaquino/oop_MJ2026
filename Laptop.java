public class Laptop{
    String brand;
    double storage;
    double memory;
    double dimension;
    String model;
    String condition;
    double price;

    void printDetails(){
        System.out.printf("""
        %s \n%s \n%s \n%s \n%s \n%s \n%s
        """, brand, storage, memory, dimension, model, condition, price);
    }
}