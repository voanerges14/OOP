package OOP;


public class Main {

    public static void main(String[] args) {

        Device device1 = new Device();
        device1.setName("Iphone 5");
        device1.setPower(20);
        System.out.println(device1);
        Device device2 = new Device();


        Computers computer1 = new Computers();
        computer1.setRam(1024);
        System.out.println(computer1.getRam());
    }
}
