package multithread.challanges.request2;

public class StringTask implements Runnable {

    private volatile String text;
    private volatile int amount;
    private volatile String concatinatedString;
    private volatile TaskState state;
    private volatile boolean done;


    public StringTask(String text, int amount) {
        this.text = text;
        this.amount = amount;
        concatinatedString = "";
        state = TaskState.CREATED;
    }


    @Override
    public void run() {
        String concatinatedString = "";
        for (int i = 0; i < amount; i++) {
            if (state.equals(TaskState.ABORTED)) {
                break;
            }
            concatinatedString += text;
        }
        this.concatinatedString = concatinatedString;
        done = true;
        if (!state.equals(TaskState.ABORTED)) {
            state = TaskState.READY;
        }
    }

    public String getResult() {
        return concatinatedString;
    }


    public TaskState getState() {
        return state;
    }

    public void start() {
        new Thread(this).start();
        state = TaskState.RUNNING;
    }

    public void abort() {
        state = TaskState.ABORTED;
    }

    public boolean isDone() {
        return done;
    }

}
