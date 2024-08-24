public class Even {
    public static void main(String[] args) {
        int sum = 0;
        int n;
        int i = 0;

        System.out.print("Enter number: ");
        n = Integer.parseInt(System.console().readLine());

        for (i = 1; i <= n; i++) {

            if (i % 2 == 0) {

                sum += i;
                System.out.println(i);
            }
        }
    }
}