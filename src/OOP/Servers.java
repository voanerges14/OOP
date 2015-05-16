package OOP;


public class Servers extends Computers {

    private int core;    //n- CPU

    @Override
    public String toString() {
        return "Servers{" +
                "core=" + core +
                "} " + super.toString();
    }

    public Servers (String name, int power, int ram, int core){       //constructor max
        super(name, power, ram);
        this.core=core;
    }

    public Servers (String name, int ram, int core){                  //constructor
        super(name, ram);
        this.core=core;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }


}
