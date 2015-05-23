package OOP;


public class Servers extends Computers {

    private int core;    //n- CPU
    private static int  totalServersCores=0;


    public int getTotalServersCores() {
        return totalServersCores;
    }



    @Override
    public String toString() {
        return "Servers{" +
                "core=" + core +
                "} " + super.toString();
    }

    public Servers (String name, int power, int ram, int core){       //constructor max
        super(name, power, ram);
        this.core=core;
        totalServersCores=totalServersCores+core;
}

    public Servers (String name, int ram, int core){                  //constructor
        super(name, ram);
        this.core=core;
        totalServersCores=totalServersCores+core;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        totalServersCores=totalServersCores-this.core;
        this.core = core;
        totalServersCores=totalServersCores+core;


    }


}
