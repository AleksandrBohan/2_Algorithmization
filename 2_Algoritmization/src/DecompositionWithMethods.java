
public class DecompositionWithMethods {


    private void task1(int a, int b){
if (NOK(a, b) == (a*b)/NOD(a,b)){
        System.out.println("This numbers " + a + " and " + b + " is true!");
    }
    //TODO
    }

 private int NOD(int a, int b){
     int c = 1;

     while (a%c == 0 & b%c ==0){
         c++;
     }
     System.out.println("NOD of numbers a and b = " + c);
     return c;
 }

 private int NOK(int a, int b){
     int c = 1;

     while (c%a != 0 & c%b != 0){
         c++;
     }
     System.out.println("NOK of numbers a and b = " + c);
     return c;
 }

    public static void main(String[] args) {
        DecompositionWithMethods decompositionWithMethods = new DecompositionWithMethods();
        decompositionWithMethods.task1(5,7);
    }
}
