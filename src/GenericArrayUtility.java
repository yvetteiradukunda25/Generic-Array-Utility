import java.lang.reflect.Array;

public class GenericArrayUtility {
       //<T> — This declares a generic type.
    //T[] a, T[] b — The method accepts two arrays of type T.
    public static <T> T[] mergeArrays(T[] a, T[] b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Do not enter Null inputs");//exception handling
        }

        // Creating a Generic Array
        @SuppressWarnings("unchecked")

        //a.getClass().getComponentType(): figures out what kind of array a is (e.g., Integer, String).
        //a.length + b.length: creates enough space for both arrays.

        T[] merged = (T[]) Array.newInstance(a.getClass().getComponentType(), a.length + b.length);

        //Merging the Arrays

        // Copy elements from a

        //Copy all elements from array a starting at position 0 in the new array
        System.arraycopy(a, 0, merged, 0, a.length);

        // Copy elements from b

        //copy elements from array b, starting after the end of a in the new array
        System.arraycopy(b, 0, merged, a.length, b.length);

        return merged;
    }
}