import java.util.Arrays;
import java.util.Random;

//Task 8 continue

public class OneDimensionalArrays {
    private int sumOfMultiples;
    Random random = new Random();
    private double sumOfPrimeNumbers;

    private void minVariable(int sizeOfArray){
        int minElement = 0;
        int countOfMinElements = 0;
        int indexOfMin = 0;
        int i;
        int [] arrayOfIntegers = new int[sizeOfArray];
        int[]thisIsNewArrayOfElements = new int[sizeOfArray-1];
        for ( i = 0; i<sizeOfArray; i++){
            arrayOfIntegers[i] = random.nextInt(10);
            if (i==0) minElement = arrayOfIntegers[i];
            if (minElement>arrayOfIntegers[i]){
                minElement = arrayOfIntegers[i];
                indexOfMin = i;
                System.out.println("Index of min element = " + indexOfMin);
            }
            System.out.println(i + " index = " + arrayOfIntegers[i]);
            System.out.println();
        }
        for (int j = 0; j<sizeOfArray-1; j++){
            int k = j;
            if(j == indexOfMin){
            k++;
        }
        thisIsNewArrayOfElements[j] = arrayOfIntegers[k];
            System.out.println("thisIsNewArrayOfElements[" + j + "] = " + thisIsNewArrayOfElements[j]);

        }


        System.out.println("minElement = " + minElement + "\nIndex = " + indexOfMin);
    }

    private void maxVariables(int sizeOfArray){
        int maxElement = 0;
        int sizeOfComputedArray = sizeOfArray;
        int []arrayForVariables = new int[sizeOfArray];
        int [] arrayForComputed = new int[sizeOfArray];
        int i;
        for (i = 0; i<sizeOfArray; i++){
            arrayForVariables[i] = i;

            System.out.println("arrayForVariables [" + i + "] = " + arrayForVariables[i]);

        }
        for (int j = 0; j<sizeOfArray; j++){

            sizeOfComputedArray--;
            arrayForComputed[j] = arrayForVariables[j]+ arrayForVariables[sizeOfComputedArray];
            if (arrayForComputed[j]>maxElement){
                maxElement = arrayForComputed[j];
            }
            System.out.println("arrayForComputed [" + j + "] = " + arrayForComputed[j]);
        }
        System.out.println("maxElement is:  " + maxElement);


    }

    private void primeNumberForIndex(int countOfMembersInThisArray){
        double [] arrayOfRealNumbers = new double[countOfMembersInThisArray];

        for (int i = 0; i<countOfMembersInThisArray; i++){
            boolean A = ((i==2) | (i%2!=0));
            boolean B = ((i==3) | (i%3!=0));
            boolean C = ((i==5) | (i%5!=0));
            boolean D = ((i==7) | (i%7!=0));
            arrayOfRealNumbers[i] = random.nextInt();
            if (A & B & C & D){
                sumOfPrimeNumbers += arrayOfRealNumbers[i];
                System.out.println(sumOfPrimeNumbers);
            }
        }
    }

    private void rangeFromTheIntegerList(int countOfNumbers){
        int []arrayOfIntegerNumber = new int[countOfNumbers];

        for (int i = 0; i<countOfNumbers-1; i++){
            arrayOfIntegerNumber[i] = random.nextInt();

            if (arrayOfIntegerNumber[i]>i){
                System.out.println();
                System.out.println(arrayOfIntegerNumber[i]);
                System.out.println();
            }
            else {System.out.println("Theese number < then " + i);
                System.out.println();}
        }
    }

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
        oneDimensionalArrays.rangeFromTheIntegerList(15);
        oneDimensionalArrays.primeNumberForIndex(20);
        oneDimensionalArrays.maxVariables(15);
        oneDimensionalArrays.minVariable(5);
    }

}
