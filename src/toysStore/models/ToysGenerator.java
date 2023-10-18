package toysStore.models;

import java.util.Random;

public class ToysGenerator {

    public static Toy[] generateToysList(int count){
        Toy[] toysList = new Toy[count];
        for (int i = 0; i < count; i++) {
            Random random = new Random();
            String[] toyName = {"Робот", "Мягкая игрушка", "Кукла", "Машинка", "Динозавр", "Конструктор", "Мыльные пузыри", "Деревянный меч"};
            int[] toysQuantity = {1, 2, 3};
            double[] dropChance = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7};

            toysList[i] = new Toy(i+1, toyName[random.nextInt(toyName.length)], toysQuantity[random.nextInt(toysQuantity.length)], dropChance[random.nextInt(dropChance.length)]);
        }

        return toysList;
    }

    public static void printToysList(Toy[] toysList){
        for (Toy toy : toysList) {
            System.out.println(toy);
        }
    }
}

