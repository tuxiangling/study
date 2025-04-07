import java.util.Scanner;

//public class fourseven {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int factor = 1;
//        for (int i = 1; i<=n; i = i+1)   //(初始动作;条件;每轮的动作)
//        {
//            factor = factor * i;
//        }
//        System.out.println(factor);
//    }
//}


//素数
public class fourseven{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int isPrime = 1;
        for(int i = 2; i<n; i++)
        {
            if (n % i == 0)
            {
                isPrime = 0;
                System.out.println(n+"这个数不是素数");
                break;
            }
        }

        if (isPrime == 1)
        {
            System.out.println(n+"是素数");
        }
        else
        {
            System.out.println(n+"不是素数");
        }
    }
}


