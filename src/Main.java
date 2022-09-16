import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0;i < 10000000;i++){
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.currentTimeMillis();
        for(int i = 0;i< arrayList.size();i++)
            arrayList.get(i);
        long end = System.currentTimeMillis();
        System.out.println("Перебор составил: " + (end - start) + " миллисекунд");

        start = System.currentTimeMillis();
        for (int x : linkedList) {
        }
        end = System.currentTimeMillis();
        System.out.println("Перебор составил: " + (end - start) + " миллисекунд");
/*
* удаление
* */
        start = System.currentTimeMillis();
        arrayList.remove(0);
        end = System.currentTimeMillis();
        System.out.println("Удалил за : " + (end - start) + " миллисекунд");

        start = System.currentTimeMillis();
        linkedList.remove(0);
        end = System.currentTimeMillis();
        System.out.println("Удалил за : " + (end - start) + " миллисекунд");
    }
}
