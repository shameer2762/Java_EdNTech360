package Java_EdNTech360;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> l1 = new ArrayList<>(List.of(45,24,11,7,4,45,32,90));
        ArrayList<Integer> l2 = new ArrayList<>(List.of(89,99,19,29,7,5));

        // 1. size()
        System.out.println("Size of l1: "+l1.size());
        // 2. get(int index)
        System.out.println("element at index 2 is :"+l1.get(2));
        // 3. add(<value>)
        System.out.println("Element added at the end : "+l1.add(100));
        // 4. addAll(<arrList_2>)
        l1.addAll(l2);
        System.out.println("combined arraylist is : "+l1);
        // 5. contains(value)
        System.out.println("Is the element available: "+l1.contains(100));
        // 6. indexOf(value)
        System.out.println("Index of element is : "+l1.indexOf(7));
        // 7. lastIndexOf(value)
        System.out.println("Last index of element is : "+l1.lastIndexOf(7));
        // 8. remove(int index)
        System.out.println("Removed element in the index(8) from the list1 : "+l1.remove(8));
        // 9. set(index, value)
        System.out.println("Replaces the particular value at particular index : "+l1.set(8,100));
        //10. sublist(start index, end index)
        System.out.println("sub list : "+l1.subList(5,9));
        //11. removeIf(<condition>)
        l1.removeIf(n -> (n%2==0));
        System.out.println("Removed list if even : "+l1);

        //12. retainAll(<list_2>)

        l1.retainAll(l2);
        System.out.println("Retained list : "+l1);

        //13.  removeFirst()

        l1.removeFirst();
        System.out.println("List after removing first element : "+l1);

        //14.  removeLast()

        l1.removeLast();
        System.out.println("List after removing last element : "+l1);

        //15. clear()

        l1.clear();
        System.out.println("list after removing all elements : "+l1);

        //16. isEmpty()

        System.out.println("Check List is empty ? :"+l1.isEmpty());


    }
}
