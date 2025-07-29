package gr.aueb.cf.ch10;

import javax.imageio.IIOException;
import java.io.IOException;

public class MethodExceptionApp {

    public static void main(String[] args) {
        char ch = ' ';

        try {
            ch = readOneChar();
        } catch (IOException e ) {
            System.out.println("error. cannot read a char");
        }

    }

    public static char readOneChar() throws IOException {
        try {
            return (char) System.in.read();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }

}
