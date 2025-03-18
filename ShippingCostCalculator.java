public interface ShippingCostCalculator {
    void visit(Chair chair);
    void visit(Table table);
    void visit(Sofa sofa);
}