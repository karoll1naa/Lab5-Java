package Gemstone;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Necklace {
    private List<Stone> stones;
    public Necklace() {
        this.stones = new ArrayList<>();
    }
    public void addStone(Stone stone) {
        if (stone == null ){
            throw new IllegalArgumentException("Камінь не може дорівнювати null");
        }
        stones.add(stone);
    }
    public double calculateWeight(){
        return stones.stream().mapToDouble(Stone::getWeight).sum();
    }
    public double calculateCost(){
        return stones.stream().mapToDouble(Stone::getCost).sum();
    }
    public void sortByCost(){
        stones.sort(Comparator.comparingDouble(Stone::getCost).reversed());
    }
    public List<Stone> findByTransparency(double min, double max){
        if(min < 0 || max > 1 || min > max){
            throw new IllegalArgumentException("Некоректний діапазон прозорості");
        }
        return stones.stream()
                .filter(g -> g.getTransparency() >= min && g.getTransparency() <= max)
                .collect(Collectors.toList());
    }
    @Override
    public String toString() {
        return stones.toString();
    }
}