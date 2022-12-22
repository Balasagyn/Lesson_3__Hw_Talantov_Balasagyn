public class Main {
    public static void main(String[] args) {
        double[] numbers = {-4.2, 3.3, 1.6, -8.8, 2.3, 4.2, -16.7, 2.2, -14.1, 6.2, 2.1, -48.3, 5.6, -66.2, -88, 4};
        double l = 0;
        int r = 0;
        boolean bool = false;
        for (double f : numbers) {
            if (f < 0) {
                bool = true;
            } else if (bool) {
                r++;
                l += f;
            }
        }
        System.out.println(l / r);

    }
}