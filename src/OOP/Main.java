package OOP;


public class Main {

    static Device[] arrayDevice = new Device[10];

    public static void main(String[] args) {

        Laptops lp1 = new Laptops("Hp",4,1.5f);
        System.out.println(lp1);
        lp1.setPower(100);
        System.out.println(lp1);

        Computers comp1 = new Computers("PC1",8);
        comp1.setDevicePowerAndReturn(900);
        System.out.println(comp1);

        Tv tv1 =new Tv("Lg SmartTVS5500",180,55);
        Servers srv1=new Servers("Apalon1",1200,32,16);


        arrayDevice[0]=tv1;
        arrayDevice[1]=srv1;
        arrayDevice[2]=lp1;

        System.out.println(calculatePowerOfAllDevice(arrayDevice));
    }
    public static int calculatePowerOfAllDevice(Device arrayDevice[]) {
        int summaryDevicePower=0;
        int temp=0;
         for (int i=0;i<arrayDevice.length;i++){
             summaryDevicePower=summaryDevicePower+arrayDevice[i].getPower();
         }
        return summaryDevicePower;
    }

}
