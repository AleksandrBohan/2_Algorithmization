public class OneDimensionalArrays {
    private int sumOfMultiples;
    private void multiples(int numberK, int minNumberInArray, int maxNumberInArray){
        int[] A = new int[maxNumberInArray-minNumberInArray];
        for (int i = minNumberInArray; i<maxNumberInArray; i++){
            if (numberK % i == 0){
                sumOfMultiples += i;
                System.out.println("Multiple number: " + i);
                System.out.println("Sum of multiples =  " + sumOfMultiples);
            }
        }

    }

    public static void main(String[] args) {
        OneDimensionalArrays oneDimensionalArrays = new OneDimensionalArrays();
        oneDimensionalArrays.multiples(45, 1, 20);
    }

}
