import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class pz4 {

    public static final int SIZE = 5_000_000;

    public static void main(String[] args) {
        Integer[] data = createInitialArray(SIZE);

        ArrayList<Integer> arrayList = createArrayList(data);
        LinkedList<Integer> linkedList = createLinkedList(data);


      
    }

    private static Integer[] createInitialArray(int size) {
        Integer[] data = new Integer[size];
        for (int i = 0; i < data.length; i++) {
            data[i] = ThreadLocalRandom.current().nextInt(1000);
        }
        return data;
    }


    static ArrayList<Integer> createArrayList(Integer[] data) {
        return new ArrayList<>(List.of(data));
    }

    static LinkedList<Integer> createLinkedList(Integer[] data) {
        return new LinkedList<>(List.of(data));
    }

}