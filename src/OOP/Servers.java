package OOP;

public class Servers extends Computers {

    private int core;
    private static int totalServersCores = 0;

    public int getTotalServersCores() {
        return totalServersCores;
    }

    @Override
    public String toString() {
        return "Servers [" +
                "core=" + core +
                " ] " + super.toString();
    }

    public Servers(String name, int RAM, int ROM, int core) {
        super(name, RAM, ROM);
        this.core = core;
        totalServersCores = totalServersCores + core;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        totalServersCores = totalServersCores - this.core;
        this.core = core;
        totalServersCores = totalServersCores + core;
    }

}
