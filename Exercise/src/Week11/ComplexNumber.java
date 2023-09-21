package Week11;

public class ComplexNumber {
    public ComplexNumber(){}
    public ComplexNumber(RealNumber real, RealNumber imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public static class RealNumber{
        public RealNumber(){}
        public RealNumber(int dividend, int divisor){
            this.dividend = dividend;
            this.divisor = divisor;
        }
        protected int dividend;
        protected int divisor;
        public String toString(){
            return dividend+"/"+divisor;
        }
    }

    protected RealNumber real;
    protected RealNumber imaginary;
}
