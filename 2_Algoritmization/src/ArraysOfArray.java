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
        int j;
        for (int i = 0; i<firstElementInMultidimensionalArray; i++){
            System.out.println();
           for ( j = 0; j<secondElementInMultidimensionalArray; j++){

                   multidimensionalArray[i][j] = random.nextInt(100);
                    System.out.print(multidimensionalArray[i][j] + "  ");
                }

    }

        if (firstElementInMultidimensionalArray == secondElementInMultidimensionalArray){
        System.out.println("This is element  " + multidimensionalArray[firstElementInMultidimensionalArray-1]
        [firstElementInMultidimensionalArray-1]);
    }}

    public static void main(String[] args) {
        ArraysOfArray arraysOfArray = new ArraysOfArray();
        arraysOfArray.maxAndMinElementsInOddColumn(4, 4);
        arraysOfArray.task2(3);
    }

}
