package toysStore.models;

import toysStore.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToysGenerator {

    public static List<Toy> generateToysList(int count){
        List<Toy> toysList = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            Random random = new Random();
            String[] toyName = {"Робот", "Трансформер", "Гоночная машинка", "Лего Цветок", "Оптимус Прайм", "Черепашка-Ниндзя Рафаэль", "Человек-Паук", "Бэтмен", "Коллекционная фигурка", "Мягкая игрушка", "Кукла", "Машинка", "Динозавр", "Конструктор", "Мыльные пузыри", "Деревянный меч"};
            int[] toysQuantity = {1, 2, 3};
            double[] dropChance = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7};

            toysList.add(i, new Toy(i + 1, toyName[random.nextInt(toyName.length)], toysQuantity[random.nextInt(toysQuantity.length)], dropChance[random.nextInt(dropChance.length)]));
        }

        return toysList;
    }

    public static void printToysList(List<Toy> toysList){
        if (toysList.size() == 0) {
            System.out.println(Text.toysListIsEmpty);
        } else {
            for (Toy toy : toysList) {
                System.out.println(toy);
            }
        }
    }
}

