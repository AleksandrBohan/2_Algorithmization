import java.util.Random;
import java.util.Scanner;

public class ArraysOfArray {

   private Random random = new Random(100);

private void task15(int parametreOfMatrix){
    System.out.println();
    int [][] squareMatrix = new int[parametreOfMatrix][parametreOfMatrix];
    int maxElement = 0;
    for (int i = 0; i<parametreOfMatrix; i++){
        System.out.println();
        for (int j = 0; j<parametreOfMatrix; j++) {
            squareMatrix[i][j] = random.nextInt(100);
            if (maxElement < squareMatrix[i][j]){
            maxElement = squareMatrix[i][j];}
            System.out.print(squareMatrix[i][j] + "  ");
        }}
    System.out.println();
    for (int i = 0; i<parametreOfMatrix; i++){
        System.out.println();
        for (int j = 0; j<parametreOfMatrix; j++) {
            if (squareMatrix[i][j] % 2 != 0){
                squareMatrix[i][j] = maxElement;
            }
            System.out.print(squareMatrix[i][j] + "  ");
        }}
}

   private void task14(int m, int n){

       if (m>n){
       System.out.println();
       int [][] squareMatrix = new int[m][n];
       int count = 0;
       for (int i = 0; i<m; i++){
           System.out.println();
           for (int j = 0; j<n; j++) {
               if (count > i+1){
               squareMatrix[i][j] = 0;
                   System.out.print(squareMatrix[i][j] + "  ");

       } else {
                   squareMatrix[i][j] = 1;
                   System.out.print(squareMatrix[i][j] + "  ");
           }
               if (squareMatrix[i][j] == 1){
                   count++;
               }
       }
       }
       }else System.out.println("Wrong matrix!");

       //TODO
   }


   private void task13(int parametreOfMatrix){
       System.out.println();
       int [][] squareMatrix = new int[parametreOfMatrix][parametreOfMatrix];
       int count = 0;
       for (int i = 0; i<parametreOfMatrix; i++){
           System.out.println();
           for (int j = 0; j<parametreOfMatrix; j++) {
               squareMatrix[i][j] = random.nextInt(100);
               System.out.print(squareMatrix[i][j] + "  ");
           }}

       for (int i = 0; i<parametreOfMatrix-1; i++){
                     System.out.print(squareMatrix[i][count] + "  ");
count++;
           }
//TODO
   }


   private void task12(int parametreOfMatrix){
       System.out.println();
       int [][] squareMatrix = new int[parametreOfMatrix][parametreOfMatrix];
       for (int i = 0; i<parametreOfMatrix; i++){
           System.out.println();

           for (int j = 0; j<parametreOfMatrix; j++){
               squareMatrix[i][j] = random.nextInt(100);
               System.out.print(squareMatrix[i][j] + "  ");
           }}





       for (int i = 0; i<parametreOfMatrix; i++){
           System.out.println();
           boolean sorted = false;
           int temp;
           while(!sorted) {
               sorted = true;
           for (int j = 0; j<parametreOfMatrix-1; j++){
               if (squareMatrix[i][j] > squareMatrix[i][j+1]) {
               temp = squareMatrix[i][j];
               squareMatrix[i][j] = squareMatrix[i][j+1];
               squareMatrix[i][j+1] = temp;
               sorted = false;
           }
                 System.out.print(squareMatrix[i][j] + "  ");
           }}}
       //TODO

   }

   private void task11(int firstParameter, int secondParameter){

       int[][] multidimensionalArray = new int[firstParameter]
               [secondParameter];

       for (int i = 0; i<firstParameter; i++){
           System.out.println();
           int count = 0;
           for (int j = 0; j<secondParameter; j++){
               if (count == 5){
                   System.out.print("  This line " + i + "  consist of 5th fives!)   ");
               }
               multidimensionalArray[i][j] = random.nextInt(15);
               if (multidimensionalArray[i][j] == 5){
                   count++;
               }
               System.out.print(multidimensionalArray[i][j] + "  ");
           }

       }

   }

   private void task10(int n){
       int [][] squareMatrix = new int[n][n];
       for (int i = 0; i<n; i++){
           System.out.println();
           for (int j = 0; j<n; j++){
               squareMatrix[i][j] = (int) (Math.random()*200 - 100);
               System.out.print(squareMatrix[i][j] + "  ");
           }}
       int count = 0;
       for (int i = 0; i<n; i++){
           if (squareMatrix[i][count] > 0){
           System.out.println("This " + i + " diagonal pozitive element = " + squareMatrix[i][count]);

       }
       count++;
   }}

   private void task9(int firstParameter, int secondParameter){
       int[][] multidimensionalArray = new int[firstParameter]
               [secondParameter];

       for (int i = 0; i<firstParameter; i++){
           System.out.println();
           for (int j = 0; j<secondParameter; j++){
               multidimensionalArray[i][j] = random.nextInt(100);
               System.out.print(multidimensionalArray[i][j] + "  ");
           }

       }
int sumInColumn = 0;
       int indicatorANewLine = -1;

       for (int i = 0; i<firstParameter; i++){
           System.out.println();
           int count = 0;
           int countLoop = 0;
           indicatorANewLine++;
           for (int j = 0; j<secondParameter; j++){
               if (indicatorANewLine == i & countLoop == i){
                  sumInColumn += multidimensionalArray[i][count];

               }
               count++;
           }
           System.out.println("Sum in" + i + "column = " + sumInColumn);

indicatorANewLine++;
   }
//TODO
   }

   private void task8(int firstParameter, int secondParameter){
       int[][] multidimensionalArray = new int[firstParameter]
               [secondParameter];

       for (int i = 0; i<firstParameter; i++){
           System.out.println();
           for (int j = 0; j<secondParameter; j++){
               multidimensionalArray[i][j] = random.nextInt(100);
               System.out.print(multidimensionalArray[i][j] + "  ");
           }

       }
       Scanner scanner = new Scanner(System.in);
       int firstColumn = scanner.nextInt();
       int secondColumn = scanner.nextInt();
       int countForFirst = 0;
       int countForSecond = 0;
       int [] secondChangeArray = new int[firstParameter + secondParameter];
       int [] arrayForChanges = new int[firstParameter + secondParameter];
       for (int i = 0; i<firstParameter; i++){
           System.out.println();
       for (int j = 0; j<secondParameter; j++){
          if (j == firstColumn){
              arrayForChanges[countForFirst] = multidimensionalArray[i][j];
             countForFirst++;
             if (countForSecond>0){
             multidimensionalArray[i][j] = secondChangeArray[countForSecond-1];
          }}
          else if (j == secondColumn){
              secondChangeArray[countForSecond] = multidimensionalArray[i][j];
              countForSecond++;
              if (countForFirst>0){
              multidimensionalArray[i][j] = arrayForChanges[countForFirst-1];
          }}
       }
   }

       for (int i = 0; i<firstParameter; i++){
           System.out.println();
           for (int j = 0; j<secondParameter; j++){
              System.out.print(multidimensionalArray[i][j] + "  ");
           }

       }

//TODO
   }

   private void task7(int n){
       int count = 0;
       int [][] squareMatrix = new int[n][n];
       System.out.println();
       for (int i = 0; i<n; i++){
           System.out.println();
           for (int j = 0; j<n; j++){
               squareMatrix[i][j] = (int) Math.sin((Math.pow(i,2)- Math.pow(j, 2))/n);
               if (squareMatrix[i][j] >= 0){
                   count++;
               }
               System.out.print(squareMatrix[i][j] + "  ");
           }}
       System.out.println("Count of pozitive numbers = " + count);
   }

   private void task6(int n){
       if (n%2 == 0){
           int count = 0;

           int [][] squareMatrix = new int[n][n];
           System.out.println();
           for (int i = 0; i<n; i++){
               count++;
               System.out.println();
               for (int j = count-1; j<n-count+1; j++){
                   squareMatrix[i][j] = 1;
                   System.out.print(squareMatrix[i][j] + "  ");

               }
               int countForWhile = 0;
               while (countForWhile<count-1){
                   squareMatrix[i][countForWhile] = 0;
                   System.out.print(squareMatrix[i][countForWhile] + "  ");
                   squareMatrix[i][n-countForWhile-1] = 0;
                   System.out.print(squareMatrix[i][n-countForWhile-1] + "  ");
                   countForWhile++;
               }
           }
       }
       else System.out.println("Enter a even number!");
       //TODO
   }

   private void task5(int n){
       if (n%2 == 0){
       int count = n+1;

       int [][] squareMatrix = new int[n][n];
       System.out.println();
       for (int i = 0; i<n; i++){
           count--;
           System.out.println();
           for (int j = 0; j<count; j++){
                   squareMatrix[i][j] = i+1;
                 System.out.print(squareMatrix[i][j] + "  ");

           }
           int countForWhile = count;
           while (countForWhile<n){
               squareMatrix[i][count] = 0;
               System.out.print(squareMatrix[i][count] + "  ");
               countForWhile++;
           }
       }
   }
       else System.out.println("Enter a even number!");

   }

   private void task4(int sizeOfMatrix) {
       if (sizeOfMatrix % 2 == 0) {
           int[][] squareMatrix = new int[sizeOfMatrix][sizeOfMatrix];
           for (int i = 0; i < sizeOfMatrix; i++) {
               System.out.println();
               int countForColumn = 1;
               int countForStrings = sizeOfMatrix;
               for (int j = 0; j < sizeOfMatrix; j++) {
                   if (i % 2 == 0) {
                       squareMatrix[i][j] = countForColumn;
                       System.out.print(squareMatrix[i][j] + "  ");
                       countForColumn++;
                   } else {
                       squareMatrix[i][j] = countForStrings;
                       System.out.print(squareMatrix[i][j] + "  ");
                       countForStrings--;
                   }
               }
           }
       }
else System.out.println("Enter a even number!");
   }

   private void task3(int sizeOfMatrix, int k, int p){
       int [][] squareMatrix = new int[sizeOfMatrix][sizeOfMatrix];
       for (int i = 0; i<sizeOfMatrix; i++){
           System.out.println();
           for (int j = 0; j<sizeOfMatrix; j++){
               squareMatrix[i][j] = random.nextInt(50);
               System.out.print(squareMatrix[i][j] + "  ");
           }}

            if (k<sizeOfMatrix & p<sizeOfMatrix){
                System.out.println();
                for (int j = 0; j<sizeOfMatrix; j++){
                    System.out.print("This = " + squareMatrix[k][j] + "  ");
                }
                System.out.println();
                for (int i = 0; i<sizeOfMatrix; i++){
                    System.out.println("What = " + squareMatrix[i][p]);
                }
            }
           }


    private void task2(int n){
        int [][] squareMatrix = new int[n][n];
               for (int i = 0; i<n; i++){
                   System.out.println();
                   for (int j = 0; j<n; j++){
                       squareMatrix[i][j] = random.nextInt(30);
                       System.out.print(squareMatrix[i][j] + "  ");
                   }}
int count = n-1;
               for (int i = 0; i<n; i++){
                   System.out.println("This" + i + "element = " + squareMatrix[i][count]);
               count--;
                   }}



    private void maxAndMinElementsInOddColumn(int firstElementInMultidimensionalArray,
                                              int secondElementInMultidimensionalArray){

        int[][] multidimensionalArray = new int[firstElementInMultidimensionalArray]
                [secondElementInMultidimensionalArray];

        for (int i = 0; i<firstElementInMultidimensionalArray; i++){
            System.out.println();
           for (int j = 0; j<secondElementInMultidimensionalArray; j++){

                   multidimensionalArray[i][j] = random.nextInt(100);
                    System.out.print(multidimensionalArray[i][j] + "  ");
                }

    }
        int count = firstElementInMultidimensionalArray-1;
        for (int i = 0; i<firstElementInMultidimensionalArray; i++){
            for (int j = 0; j<secondElementInMultidimensionalArray; j++)
                if (j%2 != 0 & multidimensionalArray[0][j] >
                        multidimensionalArray[firstElementInMultidimensionalArray-1][j]){
                    System.out.println("True column number = " + multidimensionalArray[i][j]);
                }
        }

    }

    public static void main(String[] args) {
        ArraysOfArray arraysOfArray = new ArraysOfArray();
        arraysOfArray.maxAndMinElementsInOddColumn(5, 4);
        arraysOfArray.task2(3);
        arraysOfArray.task3(4, 3, 2);
        arraysOfArray.task4(4);
        arraysOfArray.task5(6);
        arraysOfArray.task6(4);
        arraysOfArray.task7(9);
   //     arraysOfArray.task8(3,5);
        arraysOfArray.task9(3,4);
        arraysOfArray.task10(4);
        arraysOfArray.task11(10,20);
        arraysOfArray.task12(3);
        arraysOfArray.task13(5);
        arraysOfArray.task14(4,3);
        arraysOfArray.task15(4);
    }

}
