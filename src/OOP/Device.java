package OOP;
public abstract class Device {

    private String name;
    private int id;
    private static int idTotal;

    @Override
    public String toString() {
        return "Device [" +
                "name='" + name + '\'' +
                ", id=" + id +
                "] ";
    }

    public Device(String name) {
        this.name = name;
        this.id = ++idTotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String compare(Device comparedDevice);
}
