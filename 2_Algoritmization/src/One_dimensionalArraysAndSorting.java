import java.util.Random;

public class One_dimensionalArraysAndSorting {
    private Random random = new Random();

    private void task2(int sizeOfFirstArr, int sizeOfSecondArr,
                       int firstNumberOfFirstArr, int firstNumberOfSecondArr) {

        int[] firstArray = new int[sizeOfFirstArr + sizeOfSecondArr];
        int[] secondArray = new int[sizeOfSecondArr];

        for (int i = 0; i < sizeOfFirstArr; i++) {
            firstArray[i] = firstNumberOfFirstArr;
            firstNumberOfFirstArr++;
        }

        for (int j = 0; j < sizeOfSecondArr; j++) {
            secondArray[j] = firstNumberOfSecondArr;
            firstNumberOfSecondArr++;
        }
        System.out.println();
        for (int i = 0; i < sizeOfSecondArr; i++) {

            for (int j = 0; j < sizeOfFirstArr; j++) {
                if (firstArray[i] >= secondArray[j]) {
                    for (int k = i; k < sizeOfFirstArr + sizeOfSecondArr; k++) {
                        firstArray[k] = secondArray[j];
                        System.out.print(firstArray[k] + "  ");
                    }
                } else System.out.print(firstArray[i] + "  ");


            }
        }
    }

    private void task1(int sizeOfFirstArr, int sizeOfSecondArr, int naturalNumberK){

        int count = 0;

     int [] firstArray = new int[sizeOfFirstArr + sizeOfSecondArr];
     int [] secondArray = new int[sizeOfSecondArr];

        for (int j = 0; j<sizeOfSecondArr; j++){
            secondArray[j] = random.nextInt(100);
        }

     for (int i = 0; i<sizeOfFirstArr + sizeOfSecondArr; i++){
         firstArray[i] = random.nextInt(100);
         if (i == naturalNumberK){
             for (int j = naturalNumberK ; j<sizeOfSecondArr; j++){
                 firstArray[j+1] = secondArray[count];
                 count++;
                 System.out.print(firstArray[j+1]  + "  ");
             }
         }
         System.out.print(firstArray[i] + "   ");

         i += count;
     }


//TODO

    }

    public static void main(String[] args) {
        One_dimensionalArraysAndSorting one_dimensionalArraysAndSorting = new One_dimensionalArraysAndSorting();
        one_dimensionalArraysAndSorting.task1(3,4,2);
        one_dimensionalArraysAndSorting.task2(3,4,4,2);
    }
}
