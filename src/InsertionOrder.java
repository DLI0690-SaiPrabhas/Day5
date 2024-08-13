import java.util.*;

public class InsertionOrder {
    public static Set<String> removeDuplicatesAndPreserveOrder(List<String> inputList) {
        Set<String> uniqueElements = new LinkedHashSet<>();
        for (String item : inputList) {
            uniqueElements.add(item);
        }
        return uniqueElements;
    }

    public static void main(String[] args) {
        List<String> inputStrings = Arrays.asList("apple", "banana", "apple", "orange");
        Set<String> uniqueElements = removeDuplicatesAndPreserveOrder(inputStrings);
        System.out.println(uniqueElements);
    }
}
