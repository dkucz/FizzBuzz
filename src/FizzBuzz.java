/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {

            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        boolean divisibleByThree = i % 3 == 0;
        boolean divisibleByFive = i % 5 == 0;

        if (divisibleByFive && divisibleByThree) {
            System.out.println("Fizz Buzz");

        } else if (divisibleByThree) {
            System.out.println("Fizz");

        } else if (divisibleByFive) {
            System.out.println("Buzz");

        } else {
            System.out.println(i);
        }
        i++;
        return i;
    }
}
