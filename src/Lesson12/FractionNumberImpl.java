package Lesson12;

public class FractionNumberImpl implements FractionNumber {

    private int dividend;  //Числитель
    private int divisor;   // Знаменатель

    public FractionNumberImpl() {
    }

    public FractionNumberImpl(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    @Override
    public void setDividend(int dividend) {

    }

    @Override
    public int getDividend() {
        return dividend;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
        this.divisor = divisor;
    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public double value() {
        return 0;
    }
}
