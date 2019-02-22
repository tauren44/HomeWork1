package practice;

public class Series {
    public static void main(String[] args) {
        System.out.println(getFibonacci(7));
        System.out.println(getFactorial(5));
    }

    public static int getFibonacci(int index) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return getFibonacci(index - 1) + getFibonacci(index - 2);
        }
    }

    public static int getFactorial(int number) {
            int result;
            if (number == 1) {
                return 1;
            }
            result = getFactorial(number - 1) * number;
            return result;
        }
    }

