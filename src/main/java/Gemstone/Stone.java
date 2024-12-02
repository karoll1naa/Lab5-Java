package Gemstone;

public abstract class Stone {
    private String name;
    private double weight;
    private double cost;
    private double transparency;

    public Stone(String name, double weight, double cost, double transparency) {
        if(weight <= 0 || cost <= 0 || transparency < 0 || transparency > 1){
            throw new IllegalArgumentException("Некоректні параметри для каміння");
        }
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.transparency = transparency;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public double getCost() {
        return cost;
    }
    public double getTransparency() {
        return transparency;
    }
    @Override
    public String toString() {
        return String.format("Каміння: назва = '%s', вага = %.2f, вартість = %.2f, прозорість = %.2f", name, weight, cost, transparency);
    }
}