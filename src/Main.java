import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Integer arrays
        Integer[] integerArray1 = {1, 2, 3};
        Integer[] integerArray2 = {4, 5, 6};

  //This shows how the same mergeArrays() method works for different data types.

        Integer[] mergedIntegers = GenericArrayUtility.mergeArrays(integerArray1, integerArray2);
        System.out.println("Merged Integer Array: " + Arrays.toString(mergedIntegers));

        // String arrays
        String[] stringArray1 = {"Apple", "Banana"};
        String[] stringArray2 = {"Cherry", "Date"};

        String[] mergedStrings = GenericArrayUtility.mergeArrays(stringArray1, stringArray2);
        System.out.println("Merged String Array: " + Arrays.toString(mergedStrings));
    }
}