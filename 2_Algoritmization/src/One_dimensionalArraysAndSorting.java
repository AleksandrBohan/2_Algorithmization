import java.util.Random;

public class One_dimensionalArraysAndSorting {
    private Random random = new Random();
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
    }
}
