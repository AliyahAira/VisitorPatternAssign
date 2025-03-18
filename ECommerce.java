//Client Code
import java.util.Arrays;
import java.util.List;

public class ECommerce {
    public static void main(String[] args) {
        List<Furniture> furnitureItems = Arrays.asList(
                new Chair(10),      // Weight in kg
                new Table(15),      // Surface area in square meters
                new Sofa(50, 50)   // Volume in cubic meters, Distance in km
        );

        ShippingCostCalculator calculator = new StandardShippingCalculator();
        
        for (Furniture furniture : furnitureItems) {
            furniture.accept(calculator);
        }
    }
}