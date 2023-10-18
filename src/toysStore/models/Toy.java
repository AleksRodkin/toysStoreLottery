package toysStore.models;

public class Toy {

    private int id;
    private String toyName;
    private int quantity;
    private double dropProbability;

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

    @Override
    public String toString() {
        return String.format("%d. %s, количество штук - %d, шанс выпадения - %.1f\n",
                getId(), getToyName(), getQuantity(), getDropProbability());
    }
}
