import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
////        System.out.println("你好");
//        Scanner in = new Scanner(System.in);
////        System.out.println("echo:"+in.nextLine());
////        System.out.println(2+3+"=2+3="+(2+3));
//        int price = 0;
//        System.out.print("请输入票面:");
//        price = in.nextInt();
//        int amount = 0;
//        System.out.print("请输入金额:");
//        amount = in.nextInt();
//        System.out.print("该找"+(price-amount)+"元100");
//
//
//        }
//    }
//public class Main {
//    public static void main(String[] args){
//        int foot;
//        int height;
//        Scanner in = new Scanner(System.in);
//        System.out.println("请输入:");
//        foot = in.nextInt();
//        System.out.println("请输入:");
//        height = in.nextInt();
//        System.out.println((foot+height/12.0)*0.3048);
//
//    }
//}


//public class Main{
//    public static void main(String[] args){
//        int balance = 0;
//        while (true)
//        {
//            System.out.println("请投币:");
//            Scanner in = new Scanner(System.in);
//            int a = in.nextInt();
//            balance = balance + a;
//            if (balance >= 10) {
//                System.out.println("**************");
//                System.out.println("  城际列车票价");
//                System.out.println("  票价：10元");
//                System.out.println("  注意乘车时间");
//                System.out.println("**************");
//                System.out.println("找零:" + (balance - 10) + "元");
//                balance = 0;
//            }
//            else {
//                System.out.println("钱不够,请继续投入直到其到10元");
//            }
//        }
//    }
//}


//public class Main {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        switch (a){
//            case 1:
//                System.out.println("你好吗");
//                break;
//            case 2:
//                System.out.println("你好呀");
//                break;
//            case 3:
//                System.out.println("你是谁");
//                break;
//            case 4:
//                System.out.println("我是谁");
//                break;
//            default:
//                System.out.println("没有该选项");
//                break;
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        int a = 5;
//        Scanner in = new Scanner(System.in);
//        int amount = in.nextInt();
//        if (amount == a){
//            System.out.println("它们相等");
//        } else if (amount > a) {
//            System.out.println(amount+"大于"+a);
//        }
//        else{
//            System.out.println(a+"大于"+amount);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = 0;
//        while ( a > 0)
//        {
//                a = a / 10 ;
//                b = b + 1;
//        }
//        System.out.println(b);
//    }
//}

//do while循环

//public class Main{
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = 0;
//        do
//        {
//            a = a / 10;
//            b = b + 1;
//        }while (a > 0);
//
//        System.out.println(b);
//    }
//}

//猜数游戏

//    public class Main{
//        public static void main(String[] args){
//            Scanner in = new Scanner(System.in);
//            int a;
//            int number = (int)(Math.random()*100+1);
//            int count  = 0;
//            do{
//                a = in.nextInt();
//                count = count + 1;
//                if (number > a){
//                    System.out.println("你猜的数值小于正确答案");
//                }
//                else if(number < a){
//                    System.out.println("你猜的数值大于正确答案");
//                }
//            }while (number != a);
//            System.out.println("你猜对了用了"+count+"次");
//        }
//    }
//

        //整数划分
//    public class Main{
//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            int number;
//            number = in.nextInt();
//            int result = 0;
//            while ( number > 0) {
//                int digit = number % 10;
//                result = result*10 + digit;
//                number = number / 10;
//            }
//            System.out.println(result);
//        }
//}

      //for循环 与 while循环

     //for 循环
//      for(初始动作;循环条件;每轮动作){
//
//        }
//      for中的每一个表达式都是可以省略的
//        for(;条件;)  ==  while(条件)
      // for == while
//    for( int i = 1; i<= n; i=i+1 )
//        {
//            factor = factor * i;
//        }
//                    =
//                    =
//    int i = 1;
//    while(i <= n)
//        {
//            factor = factor * i;
//            i = i * 1;
//        }

   //最大公约数
//    public class Main{
//        public static void main(String[] args){
//            Scanner in = new Scanner(System.in);
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int gac = 1;
//            for (int i = 2;a >= i && b >= i;i++){
//                if (a % i == 0 && b % i == 0){
//                    gac = i;
//                }
//            }
//            System.out.println("这两个数的公约数为"+gac);
//        }
//   }


//   //辗转相除法
//   public class Main {
//       public static void main(String[] args) {
//           Scanner in = new Scanner(System.in);
//           int a = in.nextInt();
//           int b = in.nextInt();
//           while (b != 0) {
//               int r = a % b;
//               a = b;
//               b = r;
//           }
//           System.out.println(a);
//       }
//   }

    //数组 求平均数以及输出平均数大的输入的数字   //有安全漏洞
//    public class Main{
//        public static void main(String[] args){
//            Scanner in = new Scanner(System.in);
//            int[] numbers = new int[100];           //定义数组
//            double sum = 0;
//            int cnt = 0;
//            int x;
//            x  = in.nextInt();
//            while ( x != -1){
//                numbers[cnt] = x;                   //对数组中的元素赋值
//                sum += x;
//                cnt ++;
//                x = in.nextInt();
//            }
//            if ( cnt > 0){
//                double average = sum/cnt;
//                for (int i = 0;i<cnt;i++)               //遍历数组{
//                {
//                    if (numbers[i] > average)           //使用数值中的元素{
//                    {
//                        System.out.println(numbers[i]);
//                    }                                           // }
//                }                                      // }
//                System.out.println(sum/cnt);
//            }
//        }
//    }



    //安全的方式
//    public class Main {
//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            double sum = 0;
//            int cnt = 0;
//            cnt = in.nextInt();
//
//            if (cnt > 0) {
//                int[] numbers = new int[cnt];
//                for (int i = 0; i<cnt; i++) {
//                    numbers[i] = in.nextInt();
//                    sum += numbers[i];
//                }
//                double average = sum / cnt;
//                for (int i = 0; i < cnt; i++) {
//                    if (numbers[i] > average) {
//                        System.out.println(numbers[i]);
//                    }
//                }
//                System.out.println(sum / cnt);
//                }
//            }
//        }


    //投票统计     写一个程序输入数量不确定的【0，9】范围内的整数，统计每一种数字出现的次数，输入-1用来结束;
//    public class Main{
//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            int x;
//            int [] numbers = new int[10];
//            x = in.nextInt();
//
//            while (x != -1){
//                if (x>=0 && x<=9){
//                    numbers[x] ++;
//                }
//                x = in.nextInt();
//            }
//            for (int i = 0; i<numbers.length; i++){
//                System.out.println(i + ":" + numbers[i]);
//            }
//
//        }
//    }


    // 遍历数组 线性搜索
//    public class Main{
//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            int [] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
//            int x;
//            int loc = -1;
//            x = in.nextInt();
//            for (int i = 0; i < data.length; i++) {
//                if (x == data[i]) {
//                    loc = i;
//                    break;
//                }
//            }
//            if (loc > -1) {
//                 System.out.println("有"+x+"在第"+(loc + 1)+"个");
//            }
//            else {
//                System.out.println("没有"+x);
//            }
//
//        }
//    }

    //for-each
//    public class Main {
//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//            int x = in.nextInt();
//            boolean found = false;
//            for (int k : data) {
//                if (k == x) {
//                    found = true;
//                    break;
//                }
//            }
//            if (found) {
//                System.out.println(x + "在其中");
//            } else {
//                System.out.println(x + "不在其中");
//            }
//        }
//    }

//    public class Main{
//        public static void main(String []args){
//            Scanner in =new Scanner(System.in);
//            int [] numbers = {1,2,3,4,5,6,7,8,9,10};
//            int x = in.nextInt();
//            boolean found  = false;
//            for(int k : numbers){
//                if(k == x){
//                    found = true;
//                    break;
//                }
//            }
//            if(found){
//                System.out.println("YES");
//            }
//            else{
//                System.out.println("NO");
//            }
//        }
//    }


        //字符串变量
//    public class Main {
//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            String s = new String("hello");
//            System.out.println(s+(12+24));
//
//        }
//        }

//      public class Main {
//          public static void main(String[] args) {
//              Scanner in = new Scanner(System.in);
//              String s;
//              s = in.nextLine();
//              System.out.println(s);
//          }
//}


        //比较两个string类型 不能用==  应该用equals

        //if（input == “bey”）{}  无法比较     == 是否是同一个东西
        //if（input.equals（“bey”））{}   正确方法   equals  内容是否相同
//        public class Main {
//            public static void main(String[] args) {
//                Scanner in = new Scanner(System.in);
//                String s;
//                s = in.nextLine();
//                System.out.println(s);
//                System.out.println(s.equals("bey"));  //看s 是不是等于bey;
//            }
//        }



//        public class Main {
//            public static void main(String[] args) {
//                Scanner in = new Scanner(System.in);
//                String s1 = "123456789";
//                System.out.println(s1);
//                System.out.println(s1.length());
//                System.out.println(s1.charAt(0));
//                System.out.println(s1.charAt(s1.length()-1));
//                System.out.println(s1.substring(1,5));
//                System.out.println(s1.indexOf('3'));
//            }
//        }


        // tolowerCase 无法改变字符串的内容 如下
//        public class Main{
//            public static void main(String[] args){
//                Scanner in = new Scanner(System.in);
//                String s = "ABC";
//                s.toLowerCase();
//                System.out.println(s);
//            }
//        }

        // 读取以上例子
//        public class Main{
//           public static void main(String[] args) {
//               Scanner in = new Scanner(System.in);
//               String s = "ABC";
//               String c = s.toLowerCase();
//               System.out.println(c);
//           }
//        }


        //Math 的作用      函数
//        public class Main {
//            public static void main(String[] args) {
//                Scanner in = new Scanner(System.in);
//                System.out.println(Math.random()*100);  //给出一个零到一百的随机数字
//                System.out.println(Math.abs(-12));  //给出该数字的绝对值
//                System.out.println(Math.pow(2,3)); //给出2的3次方的结果
//                System.out.println(Math.round(10.532)); // 给出该数字的四舍五入的结果
//            }
//        }
        //函数定义   求和  没有返回值的函数
//        public class Main {
//            public static void sum(int a , int b){
//                int i;
//                int sum = 0;
//                for( i = a; i <= b ;i++)
//                {
//                    sum += i;
//                }
//                System.out.println("和为："+(a+b));
//            }
//            public static void main(String[] args) {
//                Scanner in = new Scanner(System.in);
//                sum(1, 8);
//                sum(2, 3);
//                sum(3, 4);
//            }
//
//        }

//        参数调用  需要返回值的函数    如果函数需要返回值 就必须用带返回值的return
//        public class Main {
//            public static int max(int a , int b){
//                int ret;
//                if(a>b)
//                {
//                    ret=a;
//                }
//                else
//                {
//                    ret=b;
//                }
//                return ret;
//            }
//            public static void main(String[] args) {
//                int a = 5;
//                int b = 6;
//                int c;
//                c = max(10,12);
//                c = max(a , b);
//                c = max(a ,23);
//                c = max(c ,23);
//                c = max(max(c , a),max(a , b));
//                System.out.println(max(a , b));
//                max(22,23);
//            }
//        }

        //函数内的变量 - 本地变量
        public class Main{
            public static int factor(int i) {

                if (i == 1) {
                    return i;
                }
                return i * factor(i - 1);

            }

            public static void main(String[] args){
                Scanner in = new Scanner(System.in);
                int k = factor(3);
                System.out.println(k);


//本地变量规则
        //本地变量是定义在块内的
        //它也可以是定义在函数的块内
        //也可以定义在语句的块内
        //甚至可以随便拉一对大括号来定义
                {
                    int hh = 0;
                    System.out.println(hh);
                }
                //快外面定义的变量在里面依然有效
                //不能在同一个块内定义同名的变量，也不能定义块外面定义过的变量
                //本地变量不会被默认初始化
//程序运行进入这个快之前，其中的变量不存在，离开这个块，其中的变量就消失了
                }
                }







//      入门基础就此结束

