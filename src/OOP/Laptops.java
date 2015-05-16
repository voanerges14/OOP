package OOP;


public class Laptops extends Computers {

   private float weight;


   @Override
   public String toString() {
      return "Laptops{" +
              "weight=" + weight +
              "} " + super.toString();
   }

   public Laptops(String name, int power, int ram, float weight){        //constructor max
      super(name,power,ram);
      this.weight=weight;
   }

   public Laptops(String name,int ram, float weight){                   //constructor
      super(name, ram);
      this.weight=weight;
   }



   public float getWeight() {
      return weight;
   }

   public void setWeight(float weight) {
      this.weight = weight;
   }


}
