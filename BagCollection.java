public class BagCollection {
    public static void main(String[] args) {
        Bags first_bag = new Bags();
        first_bag.purpose = "Travel Bag";
        first_bag.material = "Nylon";

        Bags second_bag = new Bags();
        second_bag.purpose = "Luxury Bag";
        second_bag.material = "Leather";

        first_bag.printDetails();
        second_bag.printDetails();

    }
}