package Triangle_pattern;

public class Right_tringl {
        public static void main(String[] args) {
            int n = 3;

            for (int i = 0; i < n; i++) {
                for (int j = i; j < n-1; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();

            }}}
