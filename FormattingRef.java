import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FormattingRef {

    public static void main(String[] args) {

        //! custom formatting
        double number = 135912.3465;
        DecimalFormat myDec = new DecimalFormat(".##");
        System.out.println(myDec.format(number));


        /*format for currency, decimal, non-decimal, and percent
        run a method from NumberFormat class (method returns object,
        so no need for 'new')*/
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat dec = NumberFormat.getNumberInstance();
        NumberFormat noDec = NumberFormat.getIntegerInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();

        System.out.println("**********************");

        /* now print in various formatting styles
            note that when formatting, a string representation of the
            number is returned
        */

        //^ Print Satments
        System.out.println("CURRENCY:\t" + currency.format(number));
        System.out.println("DECIMAL:\t" + dec.format(number));
        System.out.println("PERCENT:\t" + percent.format(number));
        System.out.println("PERCENT:\t" + percent.format(number));
    }
}
