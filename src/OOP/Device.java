package OOP;


public class Device {

    private String name;
    private int power;

//    @Override
//    public String toString() {
//        return "Device[Name: " +name + ", Power: " +power + "]";
//    }


    @Override
    public String toString() {                   //PrintInfo
        return "Device{" +
                "power=" + power +
                ", name='" + name + '\'' +
                '}';
    }

    public Device (String name, int power){   //constructor max
        this.name=name;
        this.power=power;
    }

    public Device (String name){              //constructor
        this.name=name;
    }

    public Device (int power){                //constructor
        this.power=power;
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

}
