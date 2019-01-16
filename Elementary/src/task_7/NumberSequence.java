package task_7;

public class NumberSequence {
    private int n;
    private int m;

    public NumberSequence(int n, int m) {
        this.n = n;
        this.m = m;
    }

    protected String print() {
        String s = "";
        for (int i = m; i <= (m + n); i++) {
            if (power(m) < power(i)){
                s += i + ", ";
            }
        }
        return s;
    }

    protected int power(int temp){
        return (int)Math.pow(temp, 2);
    }
}
