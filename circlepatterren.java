public class circlepatterren {
    public static void main(String[] args) {

        int n = 11;
        int center = n / 2;
        int radius = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int x = i - center;
                int y = j - center;

                if (x*x + y*y <= radius*radius) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}