package OOP;


public class Main {

    static Device[] arrayDevice = new Device[10];

    public static void main(String[] args) {

        Laptops lp1 = new Laptops("Hp", 4, 1.5f);
       // System.out.println(lp1);
        lp1.setPower(100);
    //    System.out.println(lp1);

        Computers comp1 = new Computers("PC1", 8);
        comp1.setDevicePowerAndReturn(900);
        System.out.println(comp1);

        Tv tv1 = new Tv("Lg SmartTVS5500", 180, 55);

        Servers srv1 = new Servers("Apalon 1", 200, 16, 8);
        Computers comp2 = new Computers("PC2",140,4);
        System.out.println(comp2);
       // System.out.println(srv1);

        Computers cc=new Computers("asd",2);
        arrayDevice[0] = tv1;
        arrayDevice[1] = srv1;
        arrayDevice[2] = lp1;
        arrayDevice[3] = comp1;
        arrayDevice[4] = comp2;
//        System.out.println(tv1);
//        System.out.println(srv1);
//        System.out.println(lp1);
//        System.out.println(comp1);
          System.out.println("Summary power of all Device: " + calculatePowerOfAllDevice(arrayDevice) + "W" );
          System.out.println("Summary RAM of all Computers: "  + calculateRAMOfAllComputers(arrayDevice)+ "Gb" );
        System.out.println(comp1.compare(comp2));

    }


    public static int calculatePowerOfAllDevice(Device arrayDevice[]) {
        int summaryDevicePower = 0;

        for (int i = 0; i < arrayDevice.length; i++) {
            if (arrayDevice[i]==null)
                break;
            else
            summaryDevicePower = summaryDevicePower + arrayDevice[i].getPower();

        }
        return summaryDevicePower;
    }

    public static int calculateRAMOfAllComputers (Device arrayDevice[]){
     int totalRam=0;
        Computers comp2;
        for (int i=0; i< arrayDevice.length;i++) {
             if ( arrayDevice[i] instanceof Computers) {
                 comp2 = (Computers) arrayDevice[i];
                totalRam=totalRam+comp2.getRam();
             }
        }
        return totalRam;
    }



}
