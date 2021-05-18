
public class DecompositionWithMethods {

    private void task2(int a, int b, int c, int d){
        int divNumber = 1;
        while (a % divNumber != 0 & b % divNumber !=0
        & c % divNumber != 0 & d % divNumber != 0 | divNumber == 1){
                       divNumber++;
        }
        System.out.println("NOD for these numbers is " + divNumber);

        //TODO
    }


    private void task1(int a, int b){
if (NOK(a, b) == (a*b)/NOD(a,b)){
        System.out.println("This numbers " + a + " and " + b + " is true!");
    }
    //TODO
    }

 private int NOD(int a, int b){
     int c = 1;

     while (a%c != 0 & b%c !=0){
            c++;
     }
     System.out.println("NOD of numbers a and b = " + c);
     return c;
 }

 private int NOK(int a, int b){
     int c = 1;

     while (c%a != 0 & c%b != 0){
         if (a == 1 | b == 1){
             break;
         }
         c++;
     }
     System.out.println("NOK of numbers a and b = " + c);
     return c;
 }

    public static void main(String[] args) {
        DecompositionWithMethods decompositionWithMethods = new DecompositionWithMethods();
        decompositionWithMethods.task1(5,7);
        decompositionWithMethods.task2(7,14,28,42);
    }
}
