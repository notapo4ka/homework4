public class RecursionFirstLevel {

    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);
    }

    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }

        if (bunnies % 2 == 0) {
            return 3 + bunnyEars2(bunnies - 1);
        } else {
            return 2 + bunnyEars2(bunnies - 1);
        }
    }

    public int triangle(int rows) {
        if (rows == 0 || rows == 1) {
            return rows;
        }
        return rows + triangle(rows - 1);
    }

    public int sumDigits(int n) {
        if (n < 10) return n;
        return (n % 10) + sumDigits(n/10);
    }

    public int count7(int n) {
        int count = 0;

        if (7 > n) {
            return 0;
        } else {
            if (n % 10 == 7) {
                count++;
            }
        }
        return count + count7(n / 10);
    }

    public int count8(int n) {
        int count = 0;

        if (8 > n) {
            return 0;
        }

        if (n % 10 == 8 && n % 100 == 88) {
            return count = 2 + count8(n / 10);
        }

        if (n % 10 == 8) {
            return count = 1 + count8(n / 10);
        }
        return count8(n / 10);
    }

    public int powerN(int base, int n) {
        if (n == 0) {
            return 1;
        }
        return base * powerN(base, n - 1);
    }

    public int countX(String str) {
        if (str.equals("")) {
            return 0;
        }

        if (str.charAt(0) == 'x') {
            return 1 + countX(str.substring(1));
        } else {
            return countX(str.substring(1));
        }
    }
}
