public class Bags {
    String purpose;
    String material;

    void printDetails() {
        System.out.printf("""
                %s %s
                """, purpose, material);
    }
}