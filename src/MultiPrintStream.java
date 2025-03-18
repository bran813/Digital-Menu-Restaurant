package src;

import java.io.PrintStream;

public class MultiPrintStream extends PrintStream {
    private PrintStream second;

    public MultiPrintStream(PrintStream main, PrintStream second) {
        super(main);
        this.second = second;
    }

    @Override
    public void write(byte[] buf, int off, int len) {
        super.write(buf, off, len);    // Write to console
        second.write(buf, off, len);   // Write to file
    }

    @Override
    public void flush() {
        super.flush();
        second.flush();
    }
}
