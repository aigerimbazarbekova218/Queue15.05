import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(3);
        queue.add(-4);
        queue.add(20);
        queue.add(500);
        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        int a = queue.size();
        for (Integer integer : queue) {
            System.out.println(integer);
        }
        for (int i = a; i++) {
            System.out.println(queue.poll());
        }


        Map<Integer,String> map=new HashMap<>();
        map.put(1, "Azamat");
        System.out.println(map);
        



    }
}