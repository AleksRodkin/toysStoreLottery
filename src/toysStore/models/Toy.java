package toysStore.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Toy {

    private int id;
    private String toyName;
    private int quantity;
    private double dropProbability;

    private List<Toy> toys = new ArrayList<>();

    public int getId() {
        return id;
    }

    public String getToyName() {
        return toyName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDropProbability() {
        return dropProbability;
    }

    public void setDropProbability(int dropProbability) {
        this.dropProbability = dropProbability;
    }

    public Toy(int id, String name, int quantity, double dropProbability) {
        this.id = id;
        this.toyName = name;
        this.quantity = quantity;
        this.dropProbability = dropProbability;
    }

    public void reduceByOne(Toy toy){
        toy.setQuantity(getQuantity() - 1);
    }

    public void deleteToyFromList(List<Toy> toys, int index){
        toys.remove(index);
    }

    public static int playLottery(List<Toy> toys){
        ArrayList<Double> chances = new ArrayList<>();
        for (int i = 0; i < toys.size(); i++) {
            double randomizer = Math.random()+0.1;
            double chance = (randomizer * toys.get(i).getDropProbability()) * 10;
            chances.add(i, chance);
        }

        int maxAt = 0;
        for (int i = 0; i < chances.size(); i++) {
            maxAt = chances.get(i) > chances.get(maxAt) ? i : maxAt;
        }

        return maxAt;
    }

    @Override
    public String toString() {
        return String.format("%d. %s, количество штук - %d, шанс выпадения - %.1f\n",
                getId(), getToyName(), getQuantity(), getDropProbability());
    }
}
