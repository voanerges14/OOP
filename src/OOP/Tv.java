package OOP;


public class Tv extends Device {

    private int screenSize;         //

    @Override
    public String toString() {
        return "Tv{" +
                "screenSize=" + screenSize +
                "} " + super.toString();
    }

    public Tv (String name, int power, int screenSize){    //constructor max
        super(name, power);
        this.screenSize=screenSize;
    }

    public Tv (String name, int screenSize){              //constructor
        super(name);
        this.screenSize=screenSize;
    }


   public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }


}
