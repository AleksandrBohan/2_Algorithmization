import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class One_dimensionalArraysAndSorting {
    private Random random = new Random();

private void task6(int sizeOfArray){
    System.out.println();
    int [] arrayForSorting = new int[sizeOfArray];
    int valueInStack = 0;
    System.out.println();
    for (int i = 0; i<sizeOfArray; i++){
        arrayForSorting[i] =random.nextInt(100);
        System.out.print(arrayForSorting[i] + "  ");
    }
    int h = 1;
    int n = sizeOfArray;
    while (h < n / 3)
        h = 3 * h + 1;

    while (h >= 1) {
        for (int i = h; i < sizeOfArray; i++) {
            for (int j = i; j >= h && arrayForSorting[j] > arrayForSorting[j - h]; j -= h) {
                int temp = arrayForSorting[j];
                arrayForSorting[j] = arrayForSorting[j - h];
                arrayForSorting[j - h] = temp;
            }
        }
        h = h / 3;
    }
    System.out.println();
    for (int i = 0; i<sizeOfArray; i++){
       System.out.print(arrayForSorting[i] + "  ");
    }
}

    public int binarySearch(int arr[], int firstElement, int lastElement, int elementToSearch){
        // условие прекращения
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;

            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[mid] == elementToSearch)
                return mid;

            // если средний элемент больше целевого
            // вызываем метод рекурсивно по суженным данным
            if (arr[mid] > elementToSearch)
                return binarySearch(arr, firstElement, mid - 1, elementToSearch);

            // также, вызываем метод рекурсивно по суженным данным
            return binarySearch(arr, mid + 1, lastElement, elementToSearch);
        }

        return -1;
    }


    private void task5(int sizeOfArray){
        System.out.println();
        int [] arrayForSorting = new int[sizeOfArray];
        int valueInStack = 0;
        System.out.println();
        for (int i = 0; i<sizeOfArray; i++){
            arrayForSorting[i] =random.nextInt(100);
            System.out.print(arrayForSorting[i] + "  ");
        }
        int key;
        for (int i = 1; i < sizeOfArray; i++) {
            key = arrayForSorting[i];
            int j = i - 1;
            while (j >= 0 && arrayForSorting[j] < key) {
                arrayForSorting[j + 1] = arrayForSorting[j];
                j = j - 1;
            }
            arrayForSorting[j + 1] = key;
        }
        System.out.println();
        for (int i = 0; i<sizeOfArray; i++){
            System.out.print(arrayForSorting[i] + "  ");
        }

        //TODO разобраться с алгоритмом и связать с двоичным поиском!!!

    }

    private void task4(int sizeOfArray){
        System.out.println();
        int [] arrayForSorting = new int[sizeOfArray];
        int valueInStack = 0;
        System.out.println();
        for (int i = 0; i<sizeOfArray; i++){
            arrayForSorting[i] =random.nextInt(100);
            System.out.print(arrayForSorting[i] + "  ");
        }

        for (int i = 0; i < sizeOfArray; i++)
            for (int j = i+1; j<sizeOfArray; j++){
                valueInStack = arrayForSorting[j];
                if (arrayForSorting[i]>valueInStack){
                    valueInStack = arrayForSorting[i];
                    arrayForSorting[i] = arrayForSorting[j];
                    arrayForSorting[j] = valueInStack;
                }
            }
        System.out.println();
        for (int i = 0; i<sizeOfArray; i++){
             System.out.print(arrayForSorting[i] + "  ");
        }
    }

    private void task3(int sizeOfArray){
        int [] arrayForSorting = new int[sizeOfArray];
        int maxValue = 0;
        int valueInArray = 0;
        System.out.println();
        for (int i = 0; i<sizeOfArray; i++){
            arrayForSorting[i] = valueInArray;
            valueInArray++;
            System.out.print(arrayForSorting[i] + "  ");
        }

        for (int i = 0; i<sizeOfArray; i++){
            for (int j = sizeOfArray-1; j>0; j--){
                maxValue = arrayForSorting[i];
                if (maxValue < arrayForSorting[j] & j>i){
                    maxValue = arrayForSorting[j];
                    arrayForSorting[j] = arrayForSorting[i];
                    arrayForSorting[i] = maxValue;
                }
            }
        }
        System.out.println();
        for (int i = 0; i<sizeOfArray; i++){
          System.out.print(arrayForSorting[i] + "  ");
        }
    }

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
        //TODO
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
        one_dimensionalArraysAndSorting.task3(4);
        one_dimensionalArraysAndSorting.task4(5);
        one_dimensionalArraysAndSorting.task5(4);
       one_dimensionalArraysAndSorting.task6(5);
    }
}
