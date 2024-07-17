package CollectionFrameworkExamples;
/* agenda:-- This Program basically states that Object datatype can take objects of any data type */
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create a collection, for example, another ArrayList
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");

//        ArrayList is obvio
        // Initialize a new ArrayList using the elements from the originalList
        ArrayList<Object> arrayListFromCollection = new ArrayList<>(originalList);
        arrayListFromCollection.add(12);

        // Display the contents of the new ArrayList
        System.out.println("Contents of arrayListFromCollection:");
        for (Object fruit : arrayListFromCollection) {
            System.out.println(fruit);
        }
    }
}
