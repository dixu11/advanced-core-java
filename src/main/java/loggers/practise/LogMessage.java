package loggers.practise;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogMessage implements MessagePrintable {
    @Override
    public void printMessage() {
        Logger lg = Logger.getLogger(LogMessage.class.getName());
        lg.setLevel(Level.INFO);
        lg.info("Hello World");
        lg.warning("Hello World :<");
    }
}
