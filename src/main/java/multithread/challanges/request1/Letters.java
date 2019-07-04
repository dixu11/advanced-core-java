package multithread.challanges.request1;

import java.util.ArrayList;
import java.util.List;

public class Letters {

    private List<Character> letters;
    private List<Thread> threads;

    private volatile boolean threadsRunning;

    public Letters(String letters) {
        this.letters = new ArrayList<>();
        threads = new ArrayList<>();

        for (int i = 0; i < letters.length(); i++) {
            this.letters.add(letters.charAt(i));
        }

        buildThreads();
    }

    private void buildThreads() {
        for (Character letter : letters) {
            Thread newThread = buildThreadForLetter(letter);
            threads.add(newThread);
        }
    }




    private Thread buildThreadForLetter(Character letter) {
        Thread thread = new Thread(() -> {
            while (threadsRunning) {
                System.out.print(letter);
                try {
                    Thread.sleep(1001);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        , "THREAD " + letter);
        return thread;
    }



    public void runAll() {
        threadsRunning = true;
        for (Thread thread : threads) {
            thread.start();
        }

    }

    public void stopAll() throws InterruptedException {
        threadsRunning = false;
       /* for (Thread thread : threads) {
            thread.join();
        }*/

    }

    public List<Thread> getThreads() {
        return threads;
    }


}
