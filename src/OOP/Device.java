package OOP;


public abstract class Device {

    private String name;
    private int power;
    private int id;
    private static int idTotal;


//    @Override
//    public String toString() {
//        return "Device[Name: " +name + ", Power: " +power + "]";
//    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", id=" + id +
                '}';
    }


//    @Override
//    public String toString() {                   //PrintInfo
//        return "Device{" +
//                "power=" + power +
//                ", name='" + name + '\'' +
//                '}';
//    }

    public Device (String name, int power){   //constructor max
        this.name=name;
        this.power=power;
        this.id=++idTotal;
    }

    public Device (String name){              //constructor
        this.name=name;
        this.id=++idTotal;
    }

    public Device (int power){                //constructor
        this.power=power;
        this.id=++idTotal;
    }

    public Device setDevicePowerAndReturn(int power){            // set or change power value in device's and return this object
            this.power=power;
    return this;
    }


//    public int calculatePowerOfAllDevice(arrayDevice){
//        int summaryDevicePower;
//        summaryDevicePower=this.getPower();
//
//    }

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

    public abstract String compare(Device comparedDevice);



}
