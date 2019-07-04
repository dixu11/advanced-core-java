package multithread.challanges.request1;

public class MojRunable implements Runnable {
    @Override
    public void run() {
        System.out.println("Tu jest kod na innym watku");
    }
}
