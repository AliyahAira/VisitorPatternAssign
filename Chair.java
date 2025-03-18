public class Chair implements Furniture {
    private final double weight;
    
    public Chair(double weight) {
        this.weight = weight;
    }
    
    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(ShippingCostCalculator visitor) {
        visitor.visit(this);
    }
}