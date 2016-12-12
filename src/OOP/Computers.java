package OOP;


public class Computers extends Device {
    public final static int minRAM = 1;
    public final static int maxRAM = 64;
    public final static int minROM = 20;
    public final static int maxROM = 2048;
    private int RAM;
    private int ROM;

    @Override
    public String toString() {
        return "Computers [" +
                "RAM=" + RAM + ' ' +
                "ROM=" + ROM +
                "] " + super.toString();
    }

    public Computers(String name, int RAM, int ROM) {
        super(name);
        if (RAM >= minRAM && RAM <= maxRAM)
            this.RAM = RAM;
        if (ROM >= minROM && ROM <= maxROM)
            this.ROM = ROM;
        else
            System.out.println("ERROR, PLEASE INPUT CORRECT RAM VALUE!");
    }

    public Computers setComputerRAMAndReturn(int RAM) {
        if (RAM >= minRAM && RAM <= maxRAM)
            this.RAM = RAM;
        else
            System.out.println("ERROR, PLEASE INPUT CORRECT RAM VALUE!");
        return this;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        if (RAM >= minRAM && RAM <= maxRAM)
            this.RAM = RAM;
        else
            System.out.println("ERROR, PLEASE INPUT CORRECT RAM VALUE!");
    }

    public int getROM() {
        return ROM;
    }

    public void setROM(int ROM) {
        if (ROM >= minROM && ROM <= maxROM)
            this.ROM = ROM;
        else
            System.out.println("ERROR, PLEASE INPUT CORRECT RAM VALUE!");
    }

    private String compareRAM(Computers comp) {
        if (this.getRAM() > comp.getRAM()) {
            return this.getName() + " have more RAM";
        } else if (this.getRAM() < comp.getRAM()) {
            return comp.getName() + " have more RAM";
        } else {
            return  "The same RAM";
        }
    }
    private String compareROM(Computers comp) {
        if (this.getROM() > comp.getROM()) {
            return this.getName() + " have more ROM";
        } else if (this.getROM() < comp.getROM()) {
            return comp.getName() + " have more ROM";
        } else {
            return  "The same ROM";
        }
    }

    public String compare(Device comparedDevice) {
        Computers comp;
        String result = "";
        if (comparedDevice instanceof Computers) {
            comp = (Computers) comparedDevice;
            result = compareRAM(comp) + " | " + compareROM(comp);
        }
        return result;
    }
}

