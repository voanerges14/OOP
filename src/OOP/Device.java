package OOP;


public class Device {

    private String name;
    private int power;

//    @Override
//    public String toString() {
//        return "Device[Name: " +name + ", Power: " +power + "]";
//    }
    //test update

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
