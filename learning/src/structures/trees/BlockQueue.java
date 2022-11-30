package data_structure.trees;

import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockQueue {

    public static void main(String[] args) throws InterruptedException {

//        new Test().priorityBlockingQueue();
        new BlockQueue().linkedBlockQueue();
    }

    void priorityBlockingQueue() throws InterruptedException {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        Thread thread = new Thread(() -> {
            System.out.println("Polling...");
            while (true) {
                try {
                    Integer poll = queue.take();
                    System.out.println("Polled: " + poll);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();

        Thread.sleep(TimeUnit.SECONDS.toMillis(5));
        System.out.println("Adding to queue");

        queue.addAll(Arrays.asList(1, 5, 6, 1, 2, 6, 7));
        Thread.sleep(TimeUnit.SECONDS.toMillis(1));
    }

    void linkedBlockQueue() {
        // define capacity of LinkedBlockingQueue
        int capacity = 15;

        // create object of LinkedBlockingQueue
        LinkedBlockingQueue<Integer> lbq
                = new LinkedBlockingQueue<Integer>(capacity);

        // add  numbers
        lbq.add(1);
        lbq.add(2);
        lbq.add(3);

        // print queue
        System.out.println("LinkedBlockingQueue:" + lbq);

        // remove all the elements
        lbq.clear();

        // print queue
        System.out.println("LinkedBlockingQueue:" + lbq);
    }
}

