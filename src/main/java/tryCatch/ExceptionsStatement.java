package tryCatch;

import org.w3c.dom.ranges.RangeException;

public class ExceptionsStatement {
    public ExceptionsStatement(){
        System.out.println("\n\nTry Catch Statements.\n");

        byte b= 0;

        try {
            byte a = 99;
            b = (byte) (a * a);
            System.out.println("\n99 X 99 equals: " + b);
            throw new RuntimeException("Out of the range for number" + b);

        }catch (Exception e){
            System.out.println("Exeption thrown " + e.getMessage());

        }

        System.out.println("\n99 X 99 equals: " + b);
    }
}
