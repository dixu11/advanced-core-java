package loggers.practise;

public interface MessagePrintable {
    default void printMessage(){
        System.out.println("Hello World");
    }
}
