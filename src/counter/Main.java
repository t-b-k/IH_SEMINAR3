package counter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
//        Counter counter = new Counter();
//        try {
//            System.out.println(counter.getCount());
//            counter.add();
//            System.out.println(counter.getCount());
//            counter.close();
//            System.out.println(counter.getCount());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            counter.add();
//        }
        try (Counter counter = new Counter();) {
            System.out.println(counter.getCount());
            counter.add();
            System.out.println(counter.getCount());
        }
    }
}
