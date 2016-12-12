package OOP;

public class TV extends Device {

    private int screenSize;

    @Override
    public String toString() {
        return "TV [" +
                "screenSize=" + screenSize +
                " ] " + super.toString();
    }

    public TV(String name, int screenSize) {
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
        TV TV1;
        String result = "";
        if (comparedDevice instanceof TV) {
            TV1 = (TV) comparedDevice;
            if (this.getScreenSize() > TV1.getScreenSize()) {
                result = this.getName() + " have bigger Screen Size";
            } else if (this.getScreenSize() < TV1.getScreenSize()) {
                result = TV1.getName() + " have bigger Screen Size";
            } else
                result = "The same Screen Size";
        }
        return result;
    }
}
