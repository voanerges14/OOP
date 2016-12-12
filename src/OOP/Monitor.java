package OOP;
public final class Monitor extends TV {

    private int resolution_X;
    private int resolution_Y;

    @Override
    public String toString() {
        return "Monitor [" +
                "resolution_X=" + resolution_X +
                ", resolution_Y=" + resolution_Y +
                "] " + super.toString();
    }

    public Monitor(String name, int screenSize, int resolution_X, int resolution_Y) {
        super(name, screenSize);
        this.resolution_X = resolution_X;
        this.resolution_Y = resolution_Y;
    }

    public int getResolution_Y() {
        return resolution_Y;
    }

    public void setResolution_Y(int resolution_Y) {
        this.resolution_Y = resolution_Y;
    }

    public int getResolution_X() {
        return resolution_X;
    }

    public void setResolution_X(int resolution_X) {
        this.resolution_X = resolution_X;
    }


}
