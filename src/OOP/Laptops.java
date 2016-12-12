package OOP;
public class Laptops extends Computers {

    private float weight;


    @Override
    public String toString() {
        return "Laptops [" +
                "weight=" + weight +
                "] " + super.toString();
    }

    public Laptops(String name, int RAM, int ROM, float weight) {
        super(name, RAM, ROM);
        this.weight = weight;
    }


    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


}
