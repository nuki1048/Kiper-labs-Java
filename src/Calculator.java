class Calculator {

    private void checkRange(double x, Range r, String op)
            throws CalculatorException {
        if (!r.contains(x)) {
            throw new CalculatorException(
                    "Число не входить у дозволений діапазон!",
                    op, x, r
            );
        }
    }

    double divide(double a, double b)
            throws CalculatorException {

        if (b == 0)
            throw new CalculatorException(
                    "Ділення на нуль!",
                    "divide",
                    b
            );
        return a / b;
    }

    double sqrt(double x)
            throws CalculatorException {
        if (x < 0)
            throw new CalculatorException(
                    "Корінь з від’ємного числа!",
                    "sqrt",
                    x
            );
        return Math.sqrt(x);
    }

    long factorial(int n)
            throws CalculatorException {
        if (n < 0)
            throw new CalculatorException(
                    "Факторіал від’ємного числа!",
                    "factorial",
                    (double)n
            );
        long r = 1;
        for (int i = 1; i <= n; i++) r *= i;
        return r;
    }

    double log(double x)
            throws CalculatorException {
        if (x == 0)
            throw new CalculatorException(
                    "Логарифм нуля не визначений!",
                    "log",
                    x
            );
        if (x < 0)
            throw new CalculatorException(
                    "Логарифм від’ємного числа!",
                    "log",
                    x
            );
        return Math.log(x);
    }

    double restrictedOp(double x, Range r)
            throws CalculatorException {
        checkRange(x, r, "restrictedOp");
        return x * 2; // умовна операція
    }
}
