package practice;

public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println(winCalc(1, 0, 0, 1)); //0
        System.out.println(winCalc(3, 1, 2, 0)); //1
        System.out.println(winCalc(1, 0, 1, 0)); //2
    }

    private static int winCalc(int team1, int team2, int bet1, int bet2) {
        return (team1 == bet1) && (team2 == bet2)
                ? 2 : ((team1 > team2) && (bet1 > bet2))
                || ((team1 < team2) && (bet1 < bet2)) ? 1 : 0;
    }
}
