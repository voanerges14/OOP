package OOP;


public class Tube extends Tv {

    private int hz;     //refresh rate


    @Override
    public String toString() {
        return "Tube{" +
                "hz=" + hz +
                "} " + super.toString();
    }

    public Tube (String name, int power, int screenSize, int hz){    //constructor max
        super(name, power, screenSize);
        this.hz=hz;
    }
    public Tube (String name, int screenSize, int hz){              //constructor
        super(name, screenSize);
        this.hz=hz;
    }


    public int getHz() {
        return hz;
    }

    public void setHz(int hz) {
        this.hz = hz;
    }
}
