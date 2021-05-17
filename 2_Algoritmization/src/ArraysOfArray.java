import java.util.Random;

public class ArraysOfArray {

   private Random random = new Random(100);

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
    }

}
