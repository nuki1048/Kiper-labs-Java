public class CheckCalculator {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        Range range1 = new Range(0, 10);
        Range range2 = new Range(new double[]{1,2,3,5,8});

        try {
            System.out.println(calc.divide(5, 0));
        }
        catch (CalculatorException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        try {
            System.out.println(calc.sqrt(-4));
        }
        catch (CalculatorException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        try {
            System.out.println(calc.factorial(-2));
        }
        catch (CalculatorException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        try {
            System.out.println(calc.log(0));
        }
        catch (CalculatorException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        try {
            System.out.println(calc.restrictedOp(11, range1));
        }
        catch (CalculatorException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        try {
            System.out.println(calc.restrictedOp(4, range2));
        }
        catch (CalculatorException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
    }
}
