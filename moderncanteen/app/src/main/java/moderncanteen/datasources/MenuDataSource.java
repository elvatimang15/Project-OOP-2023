package moderncanteen.datasources;

import java.util.ArrayList;
import java.util.List;
import moderncanteen.models.Drink;
import moderncanteen.models.Food;

public class MenuDataSource {
    public static List<Food> getAllFood() {
        List<Food> foods = new ArrayList<>();
        foods.add(new Food("Nasi Campur Telur Sejahtera", 13, 5));
        foods.add(new Food("Nasi Campur Ayam Tirex", 15, 5));
        foods.add(new Food("Nasi Goreng Bahagia", 15, 6));
        foods.add(new Food("Mie Bakso Huhuhaha", 15, 5));
        foods.add(new Food("Mie Ayam Spesial Bett", 18, 5));
        return foods;
    }

    public static List<Drink> getAllDrink() {
        List<Drink> drinks = new ArrayList<>();
        drinks.add(new Drink("Es Teh Susu kopi", 5, 2));
        drinks.add(new Drink("Jus Jeruk Ga Sie", 7, 3));
        drinks.add(new Drink("Jus Alpukat HEHE", 12, 3));
        drinks.add(new Drink("Es Jelly Buah", 12, 4));
        drinks.add(new Drink("Es Dogerererer", 18, 4));
        return drinks;
    }
}