import java.util.Random;

public class DecompositionWithMethods {
    Random random = new Random();

    private void task7(){

for (int i = 1; i<10; i++){
    int multiplyNumber = 1;
    if (i % 2 != 0){
        for (int j = 1; j <= i; j++){
            multiplyNumber *= j;

           // multiplyNumber++;
        }
        System.out.println(i + " Fibonachi number = " + multiplyNumber);
    }
}
    }

    private void task6(int a, int b, int c){
        int count = 0;
        //int [] easyNumbers = new int[10];
        for (int i = 1; i < 10; i++){
            if (a % i == 0 | b % i == 0 | c % i == 0){
              //easyNumbers[count] = i;
                System.out.println("This number is  " + i);
                count++;
                if (count == 3){
                    System.out.println("This is easy numbers: " + a + "  " + b + "  " + "  " + c);
                }
                else System.out.println("These numbers aren't easy!!");
            }

        }
//TODO
    }


    private void task5(int sizeOfArray){
        int [] arrayForChoiсe = new int[sizeOfArray];
        int max;
        System.out.println();

        for (int i = 0; i < sizeOfArray; i++){
            arrayForChoiсe[i] = random.nextInt(100);
            System.out.print(arrayForChoiсe[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i<sizeOfArray; i++){
            for (int j = sizeOfArray-1; j>0; j--){
                max = arrayForChoiсe[i];
                if (max < arrayForChoiсe[j] & j>i){
                    max = arrayForChoiсe[j];
                    arrayForChoiсe[j] = arrayForChoiсe[i];
                    arrayForChoiсe[i] = max;
                }
            }
        }
        for (int i = 0; i < sizeOfArray; i++){
            System.out.print(arrayForChoiсe[i] + "  ");
        }
        System.out.println("We want to have this number choiced   " + arrayForChoiсe[2]);
    }

    private void task4(int n){
    int firstPoint;
    int secondPoint;
        int [] arrayFirstPoint = new int[n];
        int [] arraySecondPoint = new int[n];

        for (int i = 0; i < n; i++){
            firstPoint = random.nextInt(100);
            secondPoint = random.nextInt(50);
            arrayFirstPoint[i] = firstPoint;
            arraySecondPoint[i] = secondPoint;
            System.out.print(arrayFirstPoint[i] + " ; " + arraySecondPoint[i] + "    ");
        }

            int maxVal;
            System.out.println();

            for (int i = 0; i<n; i++){
                for (int j = n-1; j>0; j--){
                    maxVal = arrayFirstPoint[i];
                    if (maxVal < arrayFirstPoint[j] & j>i){
                        maxVal = arrayFirstPoint[j];
                        arrayFirstPoint[j] = arrayFirstPoint[i];
                        arrayFirstPoint[i] = maxVal;
                    }
                }

            }

        int maxNumber;
        System.out.println();

        for (int i = 0; i<n; i++){
            for (int j = n-1; j>0; j--){
                maxNumber = arrayFirstPoint[i];
                if (maxNumber < arrayFirstPoint[j] & j>i){
                    maxNumber = arrayFirstPoint[j];
                    arrayFirstPoint[j] = arrayFirstPoint[i];
                    arrayFirstPoint[i] = maxNumber;
                }
            }

        }

        for (int i = 0; i < n; i++){
            System.out.println(arrayFirstPoint[i] + "  ; " + arraySecondPoint[i]);
        }
 int maxDistanceOnFirstCoordinat = arrayFirstPoint[0] - arrayFirstPoint[n-1];
        System.out.println(maxDistanceOnFirstCoordinat);
//TODO
        }



    private void task3(int side){
double square = 6 * theAreaOfATrueTriangle(side);
        System.out.println("The square = " + square);
    }

    private double theAreaOfATrueTriangle(int side){
        double square = (Math.pow(side,2) * Math.sqrt(3))/4;
        return square;
    }

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

     while (c % a != 0 & c % b != 0){
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
        decompositionWithMethods.task3(5);
        decompositionWithMethods.task4(6);
        decompositionWithMethods.task5(6);
        decompositionWithMethods.task6(1, 6, 7);
        decompositionWithMethods.task7();
    }
}
