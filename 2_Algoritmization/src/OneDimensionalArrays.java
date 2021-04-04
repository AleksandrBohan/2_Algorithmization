import java.util.Arrays;
import java.util.Random;

public class OneDimensionalArrays {
    private int sumOfMultiples;

    private void maxAndMinElements(int sizeOfArray){
        Random random = new Random();
        int [] arrayForSort = new int[sizeOfArray];
        System.out.println("Array for sort: ");
        for (int k = 0; k<sizeOfArray-1; k++){
            arrayForSort[k] = random.nextInt(10);
            System.out.println(arrayForSort[k] + "  ");
        }
        boolean isSorted = false;
        int buffer;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrayForSort.length-1; i++) {
                if(arrayForSort[i] > arrayForSort[i+1]){
                    isSorted = false;
                    buffer = arrayForSort[i];
                    arrayForSort[i] = arrayForSort[i+1];
                    arrayForSort[i+1] = buffer;
                }
            }
        }
        System.out.println(Arrays.toString(arrayForSort));
        int bufferForExchange = arrayForSort[0];
        arrayForSort[0] = arrayForSort[sizeOfArray-1];
        arrayForSort[sizeOfArray-1] = bufferForExchange;
        System.out.println(Arrays.toString(arrayForSort));

    }


    private void arrayOfRealNumbers(int sizeOfArrayN){
        int zeroElement = 0;
        int pozitiveElement = 0;
        int negativeElement = 0;
        Random random = new Random();
        int [] arrayForRealNumber = new int[sizeOfArrayN];
        for (int i = 0; i<arrayForRealNumber.length-1; i++){
            arrayForRealNumber[i] = random.nextInt(100);
            if (arrayForRealNumber[i] == 0){
                zeroElement++;
            }
            if (arrayForRealNumber[i]>0){
                pozitiveElement++;
            }
            if (arrayForRealNumber[i]<0){
                negativeElement++;
            }
            System.out.println(arrayForRealNumber[i] + "\n");
        }

        System.out.println("Zero elements in array = " + zeroElement + "\nPozitive elements in array = " + pozitiveElement
        + "\nNegative elements in array = " + negativeElement);
    }

private void replacingElementsInAnArray(int minimumNumberInSequence, int maximumNumberInSequence, int numberZ){
int [] arrayOfNumbersInSequence = new int[maximumNumberInSequence-minimumNumberInSequence];
int j = 0;
int counter = 0;
for (int i = minimumNumberInSequence; i<maximumNumberInSequence-1; i++){
       arrayOfNumbersInSequence[j] = i;
    if (arrayOfNumbersInSequence[j]>numberZ){
        arrayOfNumbersInSequence[j] = numberZ;
        counter++;
    }
    System.out.println("Element of array: " + arrayOfNumbersInSequence[j]);
    j++;
}
    System.out.println("Count of elements = numberZ are  " + counter);
}

    private void multiples(int numberK, int minNumberInArray, int maxNumberInArray){
        int[] A = new int[maxNumberInArray-minNumberInArray];
        int j = 0;
        for (int i = minNumberInArray; i<maxNumberInArray-1; i++){

            A[j] = i;

            if (numberK % A[j] == 0 & A[j]!=0){
                sumOfMultiples += A[j];
                System.out.println("Multiple number: " + i);
                System.out.println("Sum of multiples =  " + sumOfMultiples);
            }
            j++;
        }

    }



    public static void main(String[] args) {
        OneDimensionalArrays oneDimensionalArrays = new OneDimensionalArrays();
        oneDimensionalArrays.multiples(45, 1, 20);
        oneDimensionalArrays.replacingElementsInAnArray(10, 34, 19);
        oneDimensionalArrays.arrayOfRealNumbers(10);
        oneDimensionalArrays.maxAndMinElements(10);
    }

}
