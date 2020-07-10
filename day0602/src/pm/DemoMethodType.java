package pm;

public class DemoMethodType {
    /**
     *
     *     方法的分类：
     *     1、没有参数、没有返回值
     *     2、有参数，没有返回值
     *     3、有返回值，没有参数
     *     4、有参数和返回值
     *  返回值：方法完成后，发回给调用者的结果
     *
     */

    //无参数，无返回值
    //求1-100奇数的和
    public static void method1(){
        int sum = 0;
        for(int i=1;i<100;i++){
            if(i%2 != 0){
                sum +=i;
            }
        }
        System.out.println("奇数和为："+sum);
    }

    //创建一个方法，打印main方法启动成功
    public static void method2(){
        System.out.println("main方法启动成功.....");
    }

    //有参数，没有返回值
    //给定一个变量，求。。。。
    //遍历一个数组，打印出数组中的元素
    public static void method3(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //求一个数组中的一个最大值
    public static void method4(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("最大值为"+max);
    }

    //有返回值没有参数
    //求1-100的偶数和，并返回结果
    public static int method5(){
        int sum = 0;
        for(int i = 0; i<=100; i++){
            if(i%2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    //有参数有返回值
    //需求范围没有，要求有返回结果
    //遍历一个数组，将遍历后的数组以字符串的格式返回
    public static String arrToStr(int[] arr){
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length-1){
                str +=arr[i]+",";
            }else{
                str += "]";
            }
        }
        return str;
    }

    //需求：输入一个年龄判断该是否成年，并返回结果
    public static boolean isAgeAdu(int age){
        if(age >= 18){
            return true;
        }else{
            return false;
        }
    }

    //需求：求二维数组的和，并将结果返回
    public static double getSalarySum(double[][] salary){
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            for (int i1 = 0; i1 < salary[i].length; i1++) {
                sum += salary[i][i1];
            }
        }
        return sum;
    }



}
