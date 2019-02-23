package practice;

public class Series {
    public static void main(String[] args) {
        System.out.println(getFibonacci(4));
        System.out.println(getFactorial(3));
    }

    public static int getFibonacci(int index) {
        return (index == 0 || index == 1) ? index :
                (getFibonacci(index - 1) + getFibonacci(index - 2));
    }

    public static int getFactorial(int number) {
        return (number == 1 || number == 0) ? 1 : getFactorial(number - 1) * number;
    }
}