public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        while (n != 0){
            n = step(n);
        }
    }

    private static int step(int n) {
        boolean divisibleBy2 = n % 2 == 0;
        if (divisibleBy2){
            n = n /2;
            System.out.println(n);
        } else {
            n -= 1;
            System.out.println(n);
        }
        return n;
    }
}
