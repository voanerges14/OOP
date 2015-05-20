package OOP;


public class Computers extends Device {

   private int ram;

    @Override
    public String toString() {                           //PrintInfo
        return "Computers{" +
                "ram=" + ram +
                "} " + super.toString();
    }

    @Override
    public Device setDevicePowerAndReturn(int power) {
        return super.setDevicePowerAndReturn(power);
    }

    public Computers (String name, int power, int ram) { //constructor max
        super(name,power);
        this.ram = ram;
    }

    public Computers(String name, int ram){             //constructor
        super(name);
        this.ram=ram;
    }


    public Computers setComputerRamAndReturn (int ram){             //set or change ram value in computer's and return this object
        this.ram=ram;
        return this;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
