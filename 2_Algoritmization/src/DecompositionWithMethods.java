import java.util.Random;

public class DecompositionWithMethods {
    Random random = new Random();
    int exponentiating;

    private void task16(int sizeOfArray){
        System.out.println();
        int sum = 0;
        int [] noEvenArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++){
            noEvenArray[i] = random.nextInt(10000);
            if (oddYearTotalsNumbers(noEvenArray[i]) == true){
                sum += noEvenArray[i];
            }
        }
        evenNumbers(sum);
        System.out.println("sum = " + sum);

    }

    private int evenNumbers(int number){
        int count = 0;
        String string = String.valueOf(number);
        int size = string.length();
        char[] array = string.toCharArray();
        for (int i = 0; i < size; i++){
            String transitLineOne =  String.valueOf(array[i]);
            int realNumberOne = Integer.valueOf(transitLineOne);
            if (realNumberOne % 2 == 0){
                count++;
            }
        }
        System.out.println(count + "  numbers are even!!");

        return number;
    }

    private boolean oddYearTotalsNumbers(int number){
        boolean indicator;
        int count = 0;
        String string = String.valueOf(number);
        int size = string.length();
        char[] array = string.toCharArray();
                   for (int i = 0; i < size; i++){
                String transitLineOne =  String.valueOf(array[i]);
                int realNumberOne = Integer.valueOf(transitLineOne);
                   if (realNumberOne % 2 == 0){
                    count++;
                }
            }
        if (count > 0){
            System.out.println("This number is wrong!");
            indicator = false;
        } else {
            System.out.println("Number " + number + "All right!");
            indicator = true;
        }
        return indicator;
    }

    private void task15(int number, int sizeOfArray){
        int [] growNumbersArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++){
          growNumbersArray[i] = random.nextInt(1000000);
            System.out.println(growNumbersArray[i]);}

        for (int i = 0; i < sizeOfArray; i++){
        growNumbers(growNumbersArray[i]);
    }
    }

        private int growNumbers(int number){
            int count = 0;
            String string = String.valueOf(number);
            int size = string.length();
            char[] array = string.toCharArray();
            for (int j = 0; j < size; j++)
            for (int i = j+1; i < size; i++){
                String transitLineOne =  String.valueOf(array[i]);
                int realNumberOne = Integer.valueOf(transitLineOne);
                String transitLineTwo =  String.valueOf(array[j]);
                int realNumberTwo = Integer.valueOf(transitLineTwo);
            if (realNumberTwo >= realNumberOne){
                    count++;
                }
        }
            if (count > 0){
                System.out.println("This number is wrong!");
            } else System.out.println("All right!");

            return number;
        }


       private void task14(int k, int number, int sizeOfArray) {
           if (k < sizeOfArray){
           int [] armstrongArray = new int[sizeOfArray];
        createArray(armstrongArray);
        for (int i = 1; i < k; i++) {
            exponentiatingAndSplitNumber(armstrongArray[i]);
            if (armstrongArray[i] == exponentiating) {
                System.out.println("It is Armstrong's number! " + number);
            }
            else System.out.println("It isn't Armstrong's number!!");
        }
    }
       else System.out.println("Input other k or sizeOfArray (k < sizeOfArray)");
       }

    private void createArray(int [] arr){
           for (int i = 0; i<arr.length; i++){
                   arr[i] = random.nextInt(1000);
               System.out.println(arr[i]);

    }}
    private int exponentiatingAndSplitNumber(int number){
        exponentiating = 0;
        String string = String.valueOf(number);
        char[] array = string.toCharArray();
        for (int i = 0; i < array.length; i++){
            String s =  String.valueOf(array[i]);
            exponentiating += Math.pow(Integer.valueOf(s), array.length);

        }
        return exponentiating;

    }

    private void task13(int sizeOfArray){
        int [] arrayForEquals = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++){
            arrayForEquals[i] = random.nextInt(5);
            System.out.println(arrayForEquals[i]);
        }
        findNumbers(3, arrayForEquals);
    }

    private void findNumbers(int n, int [] arr){
        if (n > 2){
            for (int j = n; j < n * 2; j++)
                for (int i = n+1; i < n * 2; i++){
                     if (arr[i] == arr[j] - 2 | arr[j] == arr[i] - 2){
                         System.out.println("Twins numbers  " + arr[j] +
                                 "  and  " + arr[i]);
                     }
                    System.out.println("Twins numbers haven't found!!");
}
        }
        else System.out.println("Number n must be more then 2!!");
    }

    private void task12(int k, int n){
        int [] a = new int[n];

        for (int i = 0; i < n; i++){
            int loopRandomNumber = random.nextInt(n);
            System.out.println("This random number = " + loopRandomNumber);
            if (sumOfNumbers(loopRandomNumber) == k){
                a[i] = loopRandomNumber;
                System.out.println("Number  " + a[i]);
            }

        }


    }

    private int sumOfNumbers(int number){
        int sum = 0;
        String string = String.valueOf(number);
        char[] array = string.toCharArray();
        for (int i = 0; i<array.length; i++){
            String s =  String.valueOf(array[i]);
            sum += Integer.valueOf(s);
          //  System.out.println(array[i]);
          //  System.out.println("Sum = " + sum);
            }
        return sum;
    }
    private void task11(int firstNumber, int secondNumber){
        System.out.println();
        String firstCount = String.valueOf(firstNumber);
        String secondCount = String.valueOf(secondNumber);
        if (firstCount.length() > secondCount.length()){
            System.out.println("First number " + firstNumber + " > second number " + secondNumber);
        }
        else System.out.println("First number " + firstNumber + " < second number " + secondNumber);

    }

    private void task10(int n){
        String string = String.valueOf(n);
        char[] array = string.toCharArray();
        for (int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    private void task9(int x, int y, int z, int t){
int squareOfTrapezeFirst = ((y + z) / 2) * x;
        System.out.println("Square of trapeze first = " + squareOfTrapezeFirst);
    }

    private void task8(int sizeOfArray){
        int [] arrayForSumm = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++){
            arrayForSumm[i] = random.nextInt(100);
            System.out.print(arrayForSumm[i] + "  ");
        }
        sumOf3thElements(arrayForSumm, sizeOfArray);
        //TODO
    }

    private void sumOf3thElements(int [] arr, int sizeOfArray){
        int step = 3;
        int parts = (int) Math.floor(sizeOfArray/2);
        for (int i = 1; i < parts; i++){
            int sumInArray = 0;
            if (i == 1){
                for (int j = 0; j<=step; j++){
                   sumInArray += arr[j];

                }
                System.out.println("Sum = " + sizeOfArray);
                step += 2;
            }
            else{
                for (int j = step; j < step + 2; j++){
                    sumInArray += arr[j];

                }
            }

            System.out.println("Sum of these elements which index from  " + (step-2) +
                    " till " + step + " = " + sumInArray);


        }

    }


    private void task7(){

for (int i = 1; i<10; i++){
    int multiplyNumber = 1;
    if (i % 2 != 0){
        for (int j = 1; j <= i; j++){
            multiplyNumber *= j;

           // multiplyNumber++;
        }
        System.out.println(i + " Factorial number = " + multiplyNumber);
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
        decompositionWithMethods.task8(9);
        decompositionWithMethods.task9(2,4,5,8);
        decompositionWithMethods.task10(12345);
        decompositionWithMethods.task11(9999, 1234);
        decompositionWithMethods.task12(5, 15);
        decompositionWithMethods.task13(9);
        decompositionWithMethods.task14(7, 153, 9);
        decompositionWithMethods.task15(123456, 10);
        decompositionWithMethods.task16(10);
    }
}
