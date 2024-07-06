import java.util.Stack;

public class PrimeNumbers {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        int number = 2;

        while (count < 50) {
            if (isPrime(number)) {
                stack.push(number);
                count++;
            }
            number++;
        }

        System.out.println("First 50 prime numbers in descending order:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
