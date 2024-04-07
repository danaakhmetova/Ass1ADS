import java.util.Scanner;

public class Main {

    //Complexity: O(n)
    public static int findMinimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    //Complexity: O(n)
    //
    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    //Complexity: O(sqrt(n))

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //Complexity: O(n)
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    //Complexity: O(2^n)

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //Complexity: O(n)

    public static double power(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return a * power(a, n - 1);
        } else {
            return 1 / power(a, -n);
        }
    }

    //Complexity: O(n!)
    public static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public static String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    //Complexity: O(n)
    public static boolean allDigits(String s) {
        return s.matches("\\d+");
    }
    //Complexity: O(2^n)

    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    //Complexity: O(log(min(a, b)))
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Problem 1
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Minimum: " + findMinimum(arr));

        // Problem 2
        System.out.println("Average: " + findAverage(arr));

        // Problem 3
        System.out.print("Enter a number to check if its prime: ");
        int numToCheck = scanner.nextInt();
        System.out.println(numToCheck + " is " + (isPrime(numToCheck) ? "Prime" : "Composite"));

        // Problem 4
        System.out.print("Enter a number to find factorial: ");
        int factorialNum = scanner.nextInt();
        System.out.println(factorialNum + "! = " + factorial(factorialNum));

        // Problem 5
        System.out.print("Enter n to find n Fibonacci : ");
        int fibonacciN = scanner.nextInt();
        System.out.println("Fibonacci(" + fibonacciN + ") = " + fibonacci(fibonacciN));

        // Problem 6
        System.out.print("Enter a and n to find a^n: ");
        double a = scanner.nextDouble();
        int powN = scanner.nextInt();
        System.out.println(a + "^" + powN + " = " + power(a, powN));

        // Problem 7
        System.out.print("Enter string to find all permutations: ");
        String str = scanner.next();
        System.out.println("Permutations:");
        permute(str, 0, str.length() - 1);

        // Problem 8
        System.out.print("Enter string to check if it consists only of digits: ");
        String digitsString = scanner.next();
        System.out.println(allDigits(digitsString) ? digitsString + " Yes" : digitsString + " No");

        // Problem 9
        System.out.print("Enter n and k to find C(n, k): ");
        int nChooseK_n = scanner.nextInt();
        int nChooseK_k = scanner.nextInt();
        System.out.println("C(" + nChooseK_n + ", " + nChooseK_k + ") = " + binomialCoefficient(nChooseK_n, nChooseK_k));

        // Problem 10
        System.out.print("Enter a and b to find GCD: ");
        int gcd_a = scanner.nextInt();
        int gcd_b = scanner.nextInt();
        System.out.println("GCD(" + gcd_a + ", " + gcd_b + ") = " + gcd(gcd_a, gcd_b));

        scanner.close();
    }
}



