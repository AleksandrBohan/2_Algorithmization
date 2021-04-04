public class OneDimensionalArrays {
    private int sumOfMultiples;

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
    }

}
