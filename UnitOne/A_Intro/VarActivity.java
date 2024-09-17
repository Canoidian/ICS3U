package UnitOne.A_Intro;
import java.text.NumberFormat;

public class VarActivity {
    public static void main(String[] args) {
        
        //* Variables
        double myWage = 13.50, totalPay;
        int myAge = 16, hours = 40;
        char firstInitial = 'W';
        String surname = "Isaak";

        //! Print Variables
        //System.out.println("My first initial is, " + firstInitial);
        //System.out.println("My last name is, " + surname);
        //System.out.println("My name is " + firstInitial + "." + surname);
        //System.out.println("I am " + myAge + " years of age");
        //System.out.println("I get paid $" + myWage);
        //System.out.println("I worked " + hours + " last week");

        //& Calculations
        totalPay = myWage * hours;

        // Formater
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        //^ Output
        System.out.println("Employee:\t" + firstInitial + "." + surname);
        System.out.println("Hours worked:\t" + hours);
        System.out.println("Rate of pay:\t" + myWage);
        System.out.println("Total Pay:\t" + currency.format(totalPay));



    }
}
