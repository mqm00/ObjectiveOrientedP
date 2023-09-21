package Week11;

public class Calculator implements ComplexNumberCalculator, RealNumberCalculator{
    public static void main(String[] args){
        Calculator calc = new Calculator();
        ComplexNumber c1 = new ComplexNumber(new ComplexNumber.RealNumber(4, 10), new ComplexNumber.RealNumber(3, 2));
        ComplexNumber c2 = new ComplexNumber(new ComplexNumber.RealNumber(3, 10), new ComplexNumber.RealNumber(-4, 2));

        calc.printResult(calc.sub(c1, c2));
    }


    @Override
    public ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber.RealNumber real_sum = add(c1.real, c2.real);
        ComplexNumber.RealNumber imaginary_sum = add(c1.imaginary, c2.imaginary);
        return new ComplexNumber(real_sum, imaginary_sum);
    }

    @Override
    public ComplexNumber sub(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber.RealNumber real_sub = sub(c1.real, c2.real);
        ComplexNumber.RealNumber imaginary_sub = sub(c1.imaginary, c2.imaginary);
        return new ComplexNumber(real_sub, imaginary_sub);
    }

    @Override
    public ComplexNumber mul(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber.RealNumber real_mul = sub(mul(c1.real, c2.real), mul(c1.imaginary, c2.imaginary));
        ComplexNumber.RealNumber imaginary_mul = add(mul(c1.real, c2.imaginary), mul(c1.imaginary, c2.real));
        return new ComplexNumber(real_mul, imaginary_mul);
    }

    @Override
    public void printResult(ComplexNumber c) {
        System.out.println("Real : " + c.real + " Imaginary : " + c.imaginary);
    }

    @Override
    public ComplexNumber.RealNumber add(ComplexNumber.RealNumber r1, ComplexNumber.RealNumber r2) {
        int sum_divisor = r1.divisor * r2.divisor;
        int sum_dividend = (r1.dividend*r2.divisor)+(r2.dividend*r1.divisor);
        return new ComplexNumber.RealNumber(sum_dividend, sum_divisor);
    }

    @Override
    public ComplexNumber.RealNumber sub(ComplexNumber.RealNumber r1, ComplexNumber.RealNumber r2) {
        int sub_divisor = r1.divisor * r2.divisor;
        int sub_dividend = (r1.dividend*r2.divisor)-(r2.dividend*r1.divisor);
        return new ComplexNumber.RealNumber(sub_dividend, sub_divisor);
    }

    @Override
    public ComplexNumber.RealNumber mul(ComplexNumber.RealNumber r1, ComplexNumber.RealNumber r2) {
        int mul_divisor = r1.divisor*r2.divisor;
        int mul_dividend = r1.dividend*r2.dividend;
        return new ComplexNumber.RealNumber(mul_dividend, mul_divisor);
    }
}
