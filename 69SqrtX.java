public class SqrtX {

    public static int mySqrt(int x) {
        long i = 1;

        while (i * i <= x) {
            i = i + 1;
        }

        return (int) (i - 1);
    }

    public static void main(String[] args) {
        int x = 16;
        int answer = mySqrt(x);
        System.out.println("Output: " + answer);
    }
}