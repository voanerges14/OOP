package OOP;


public class Computers extends Device {
    public final static int minRam=1;
    public final static int maxRam=64;
    private int ram;

    @Override
    public String toString() {
        return "Computers{" +
                "ram=" + ram +
                "} " + super.toString();
    }

//    @Override
//    public String toString() {                           //PrintInfo
//        return "Computers{" +
//                "ram=" + ram +
//                "} " + super.toString();
//    }

    @Override
    public Device setDevicePowerAndReturn(int power) {
        return super.setDevicePowerAndReturn(power);
    }

    public Computers(String name, int power, int ram) { //constructor max
        super(name, power);
        if (ram>=minRam && ram<=maxRam)
            this.ram = ram;
        else
            System.out.println("ERROR, PLEASE INPUT CORRECT RAM VALUE!");
    }

    public Computers(String name, int ram) {             //constructor
        super(name);
        if (ram>=minRam && ram<=maxRam)
            this.ram = ram;
        else
            System.out.println("ERROR, PLEASE INPUT CORRECT RAM VALUE!");
    }


    public Computers setComputerRamAndReturn(int ram) {             //set or change ram value in computer's and return this object
        if (ram>=minRam && ram<=maxRam)
            this.ram = ram;
        else
            System.out.println("ERROR, PLEASE INPUT CORRECT RAM VALUE!");
        return this;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram>=minRam && ram<=maxRam)
            this.ram = ram;
        else
            System.out.println("ERROR, PLEASE INPUT CORRECT RAM VALUE!");
    }

    public String compare(Device comparedDevice) {
       Computers comp;
       String result = "";
        if (comparedDevice instanceof Computers) {
            comp = (Computers) comparedDevice;
            if (this.getRam() > comp.getRam()) {
                result = this.getName() + " have more RAM";
            }
            else
            if (this.getRam() < comp.getRam()) {
                result = comp.getName() + " have more RAM";
            }
            else{
                result="The same RAM";
            }
        }
        else {
           if (this.getPower() > comparedDevice.getPower())
               result=this.getName()+" used more power" + "("+this.getPower()+")" ;
           if (this.getPower() < comparedDevice.getPower())
               result=comparedDevice.getName()+" used more power" + "("+comparedDevice.getPower()+")" ;
           else
               result="The same Power";
        }
        return result;
    }
}

