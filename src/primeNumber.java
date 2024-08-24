//public class primeNumber {
//
//    //WAP TO SORT ARRAY IN ASCENDING(LOW TO HIGH) ORDER IN JAVA.
//    int []array1 = new int[]{30,20,10,60,70,69,62};
//    int temp=0;
//        System.out.println("");
//
//        for (int i= 0;i<array1.length;i++)
//    {
//        System.out.println(array1[i] + "");
//
//    }
//        for (int i=0;i<array1.length;i++)
//    {
//        for(int j=i+1;j<array1.length;j++)
//        {
//            if(array1[i]>array1[j])
//            {
//                temp=array1[i];
//                array1[i]=array1[j];
//                array1[j]=temp;
//
//            }
//        }
//    }
//        System.out.println("Ascending order : ");
//        for (int i=0;i<array1.length;i++)
//    {
//        System.out.println(array1[i]+ " ");
//    }
//}
import java.util.Arrays;

class primeNumber {

    static int addPrimes(int n)
    {
        boolean prime[]=new boolean[n + 1];

        Arrays.fill(prime, true);

        for (int p = 2; p * p <= n; p++) {

            if (prime[p]) {

                for (int i = p * 2; i <= n; i += p)
                    prime[i] = false;
            }
        }

        int sum = 0;
        for (int i = 2; i <= n; i++)
            if (prime[i])
                sum += i;
        return sum;
    }

    public static void main(String args[])
    {
        int n = 25;
        System.out.print(addPrimes(n));
    }
}