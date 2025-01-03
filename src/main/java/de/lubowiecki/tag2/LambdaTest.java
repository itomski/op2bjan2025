package de.lubowiecki.tag2;

public class LambdaTest {

    public static void main(String[] args) {


        final int zahl = 5;

        // int exec(int v);
        // zahl muss final oder effektiv final sein
        MathOp op1 = (a) -> a + zahl;
        // zahl = 17;

        System.out.println(op1.exec(100));

        op1 = a -> a - 200; // Überschreiben/Implementieren der Methode aus dem Interface
        System.out.println(op1.exec(100));

        MathOp2 op2 = (a,b) -> a + b;
        System.out.println(op2.exec(10, 20));
        System.out.println(op2.exec(10, 50));
        System.out.println(op2.exec(70, -20));
        System.out.println(op2.exec(100, -99));

        System.out.println();

        // double exec(double a, double b);
        // a und b MÜSSEN vom typ double sein
        // return MUSS ein double sein
        op2 = (a,b) -> a / b;
        // op2 = (a,b) -> (a / b) + ""; // Error:  Datentypen werden gem. FunctionalInterface geprüft
        System.out.println(op2.exec(10, 20));
        System.out.println(op2.exec(10, 50));
        System.out.println(op2.exec(70, -20));
        System.out.println(op2.exec(100, -99));

        op2 = (x, y) -> {
            x = (x > 0) ? x : 0;
            y = (y > 0) ? y : 0;
            return x + y;
        };

        System.out.println(op2.exec(100, -99));

        System.out.println();

        // Lambda implementiert nur den Body der Methode!
        // Alles andere ist nicht interessant
        // int roll();
        final RandGen W6 = () -> (int)(Math.random() * 6) + 1;
        final RandGen W10 = () -> (int)(Math.random() * 10) + 1;

        System.out.println(W6.roll());
        System.out.println(W6.roll());
        System.out.println(W6.roll());
        System.out.println(W6.roll());
        System.out.println(W6.roll());
        System.out.println(W6.roll());
        System.out.println(W10.roll());
        System.out.println(W10.roll());
        System.out.println(W10.roll());

    }
}

// Lambdas basieren IMMER auf einem FunctionalInterface
// SAM = Single Abstract Method
// Darf 0...* statische Methoden haben
// Darf 0...* default Methoden haben
// Darf nur eine einzige abstrakte Methode haben!!!
@FunctionalInterface
interface MathOp {

    int exec(int v);

    // int exec(int v1, int v2);
}

interface MathOp2 {

    double exec(double a, double b);
}

@FunctionalInterface
interface RandGen {

    int roll();
}

class W6RandGen implements RandGen {

    @Override
    public int roll() {
        return (int)(Math.random() * 6) + 1;
    }
}


/*

let func1 = function() {
    console.log('func1');
}

let func2 = function(fn) {
    console.log('func2');
    fn();
}
func2(func1);

func2(function() {
    console.log('bla bla bla');
});

 */
