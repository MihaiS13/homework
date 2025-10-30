package ex;

 public class Light {
     private int lumens;

     public Light (int lumens) {
         this.lumens = lumens;

         }
         public void setLumens(int lumens) {
             this.lumens = lumens;
         }
         public int getLumens() {
             return lumens;
     }
         void turnOn () {
             if (lumens >= 1000)
                 System.out.println("Lumina este aprinsa");
         }
         void turnOff () {
             if (lumens == 0)
                 System.out.println("Lumina este stinsa");
         }
         void Dim () {
             if (lumens < 1000)
                 System.out.println("Intensitatea luminii a fost redusa");
         }
         void brighten () {
             if (lumens > 1500)
                 System.out.println("Intensitatea luminii a fot ridicata");
         }

         public static void main (String[]args){

         Light bec = new Light(0);
         bec.setLumens(1200);
             bec.turnOn();
             }
         }




