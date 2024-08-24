
public class pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 11; j++) {
                if (i == 1 && j == 6) {
                    System.out.print("*");
                } else if (i == 2 && (j == 5 || j == 7)) {
                    System.out.print("*");
                } else if (i == 3 && (j == 4 || j == 8)) {
                    System.out.print("*");
                } else if (i == 4 && (j == 3 || j == 9)) {
                    System.out.print("*");
                } else if (i == 5 && (j == 2 || j == 10)) {
                    System.out.print("*");
                } else if (i == 6 && (j == 1 || j == 11)) {
                    System.out.print("*");
                } else if (i == 7) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}