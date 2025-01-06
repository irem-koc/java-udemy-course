package CollectionApi;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //CollectionAPI -concept, collection -interface, collections -class

        Collection<Integer> collection = new ArrayList<Integer>();//we can use List(ArrayList, LinkedList), Queue(DeQueue), Set(HashSet, LinkedHashSet)
        collection.add(1);
        collection.add(1);
        collection.add(1);
        collection.add(1); //we don't have any index issue while using collection
        System.out.println(collection);
        for (int o : collection) {
            System.out.println(o);
        }
//        System.out.println(collection.get(index)); we can use List
        List<Integer> collection2 = new ArrayList<Integer>();//we can use List(ArrayList, LinkedList), Queue(DeQueue), Set(HashSet, LinkedHashSet)
        collection2.add(1);
        collection2.add(1);
        collection2.add(1);
        collection2.add(1);
        System.out.println(collection2.get(3));

        //for unique values we should use Set, there is no way to use get
        Set<Integer> collection3 = new HashSet<Integer>();//we can use List(ArrayList, LinkedList), Queue(DeQueue), Set(HashSet, LinkedHashSet)
        collection3.add(2);
        collection3.add(99);
        collection3.add(6);
        collection3.add(6);
        System.out.println(collection3);

        //in a sorted way for unique values we should use Set, there is no way to use get
        Collection<Integer> collection4 = new TreeSet<Integer>();//we can use List(ArrayList, LinkedList), Queue(DeQueue), Set(HashSet, LinkedHashSet)
        collection4.add(2);
        collection4.add(99);
        collection4.add(6);
        collection4.add(6);
        System.out.println(collection4);

        Iterator<Integer> iterator = collection4.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        iterator.next();
    }
}
