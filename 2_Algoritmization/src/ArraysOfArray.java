import java.util.Random;

public class ArraysOfArray {

   private Random random = new Random(100);

   private void task5(int n){
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

   private void task4(int sizeOfMatrix){

       int [][] squareMatrix = new int[sizeOfMatrix][sizeOfMatrix];
       for (int i = 0; i<sizeOfMatrix; i++){
           System.out.println();
           int countForColumn = 1;
           int countForStrings = sizeOfMatrix;
           for (int j = 0; j<sizeOfMatrix; j++){
               if (i % 2 == 0){
               squareMatrix[i][j] = countForColumn;
               System.out.print(squareMatrix[i][j] + "  ");
               countForColumn++;
           }
               else {squareMatrix[i][j] = countForStrings;
               System.out.print(squareMatrix[i][j] + "  ");
               countForStrings--;
           }
   }}}

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
    }

}
