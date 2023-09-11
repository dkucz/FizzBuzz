public class Multiples {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            boolean divisibleByThree = i % 3 == 0;
            boolean divisibleByFive = i % 5 == 0;

            if (divisibleByThree) {
                System.out.println(i);
            } else if (divisibleByFive) {
                System.out.println(i);
            }
        }
    }
}
