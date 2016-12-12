package OOP;


public class Main {

    static Device[] arrayDevice = new Device[10];

    public static void main(String[] args) {

        Laptops lp1 = new Laptops("HP", 4, 50, 1.5f);
        System.out.println(lp1);
            lp1.setWeight(2.9f);
            lp1.setRAM(8);
        System.out.println(lp1);

        Computers comp1 = new Computers("PC1", 8, 100);
        System.out.println(comp1);

        TV TV1 = new TV("Samsung SmartTV", 55);

        Servers srv1 = new Servers("Cray 1", 16, 1024, 8);
        Computers comp2 = new Computers("PC2", 4, 200);
        System.out.println(comp2);

        Computers cc=new Computers("asd",2, 500);
        arrayDevice[0] = TV1;
        arrayDevice[1] = srv1;
        arrayDevice[2] = lp1;
        arrayDevice[3] = comp1;
        arrayDevice[4] = comp2;
        System.out.println(TV1);
        System.out.println(srv1);
        System.out.println(lp1);
        System.out.println(comp1);
          System.out.println("Summary RAM | ROM of all Computers: "  + calculateRAMROMOfAllComputers(arrayDevice)+ "Gb" );
        System.out.println(comp1.compare(comp2));

    }


    public static String calculateRAMROMOfAllComputers (Device arrayDevice[]){
        int totalRAM=0;
        int totalROM=0;
        Computers comp2;
        for (int i=0; i< arrayDevice.length;i++) {
             if ( arrayDevice[i] instanceof Computers) {
                 comp2 = (Computers) arrayDevice[i];
                 totalRAM=totalRAM+comp2.getRAM();
                 totalROM=totalROM+comp2.getROM();
             }
        }
        return totalRAM + " | " + totalROM;
    }

}
