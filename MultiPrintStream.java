package src;

import java.io.PrintStream;

/**
 * Clase MultiPrintStream, que extiende PrintStream. Se encarga del archivo.
 * 

 * 
 * @version 1.0
 */
public class MultiPrintStream extends PrintStream {
    private PrintStream second;

    /**
     * Constructor del MultiPrintStream
     * 
     * @param main
     * @param second
     */
    public MultiPrintStream(PrintStream main, PrintStream second) {
        super(main);
        this.second = second;
    }

    @Override
    public void write(byte[] buf, int off, int len) {
        super.write(buf, off, len); // Write to console
        second.write(buf, off, len); // Write to file
    }

    @Override
    public void flush() {
        super.flush();
        second.flush();
    }
}
