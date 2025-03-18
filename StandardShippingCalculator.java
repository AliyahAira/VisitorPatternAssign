public class StandardShippingCalculator implements ShippingCostCalculator {
    @Override
    public void visit(Chair chair) {
        double cost = chair.getWeight() * 5; // Flat rate per weight
        System.out.println("Shipping cost for Chair: $" + cost);
    }

    @Override
    public void visit(Table table) {
        double cost = table.getSurfaceArea() * 2; // Cost based on surface area
        System.out.println("Shipping cost for Table: $" + cost);
    }

    @Override
    public void visit(Sofa sofa) {
        double cost = sofa.getVolume() * 5 + sofa.getDistance() * 0.5; // Volume + Distance factor
        System.out.println("Shipping cost for Sofa: $" + cost);
    }
}