import java.util.LinkedList;

class RecentCounter {
    private LinkedList<Integer> list;

    public RecentCounter() {
        list = new LinkedList<Integer>();
    }

    public int ping(int t) {
        list.add(t);

        while (list.getFirst() < t - 3000) {
            list.removeFirst();
        }
        return list.size();
    }
}

public class Id933_Number_of_Recent_Calls {
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(1));
        System.out.println(recentCounter.ping(100));
        System.out.println(recentCounter.ping(3001));
        System.out.println(recentCounter.ping(3002));

    }
}
