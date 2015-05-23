package OOP;


public class Tv extends Device {

    private int screenSize;         //

    @Override
    public String toString() {
        return "Tv{" +
                "screenSize=" + screenSize +
                "} " + super.toString();
    }

    public Tv(String name, int power, int screenSize) {    //constructor max
        super(name, power);
        this.screenSize = screenSize;
    }

    public Tv(String name, int screenSize) {              //constructor
        super(name);
        this.screenSize = screenSize;
    }


    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String compare(Device comparedDevice) {
        Tv tv1;
        String result="";
        if (comparedDevice instanceof Tv) {
            tv1 = (Tv) comparedDevice;
            if (this.getScreenSize() > tv1.getScreenSize()) {
                result = this.getName() + " have bigger Screen Size";
            }
            else
            if (this.getScreenSize() < tv1.getScreenSize()) {
                result = tv1.getName() + " have bigger Screen Size";
            }
            else
                result="The same Screen Size";
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
