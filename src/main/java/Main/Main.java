package Main;
import Gemstone.Necklace;
import Gemstone.SemiPreciousStone;
import Gemstone.Stone;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int recordBook = 5543;
        int C13 = recordBook % 13; //5

        Necklace necklace = new Necklace();
        try{
            necklace.addStone(new SemiPreciousStone("Рубін", 1.2, 3000, 0.8));
            necklace.addStone(new SemiPreciousStone("Діамант", 1.5, 5000, 0.95));
            necklace.addStone(new SemiPreciousStone("Аметист", 2.0, 1500, 0.7));

            System.out.println("Загальна вага намиста: " + necklace.calculateWeight() + " каратів");
            System.out.println("Загальна вартість намиста: " + necklace.calculateCost());

            System.out.println("\nДо сортування:");
            System.out.println(necklace);
            necklace.sortByCost();
            System.out.println("\nПісля сортування:");
            System.out.println(necklace);

            System.out.println("\nКамені з прозорістю від 0.75 до 1.0:");
            List<Stone> filteredStone = necklace.findByTransparency(0.75, 1.0);
            filteredStone.forEach(System.out::println);
        }catch (IllegalArgumentException e) {
            System.err.println("Помилка: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Непередбачена помилка: " + e.getMessage());
        }
    }
}