package pm.bTCP;

public class Demo3 {
    /**
     * 三元运算符
     *    语法： 表达式？结果值1：结果值2
     *          当表达式为true时返回结果值1，否则返回结果值2
     */
    public static void main(String[] args) {
        int age = 18;
        String flag = age >= 18 ? "已成年" : "未成年";
        System.out.println(flag);

        int a = 5;
        int b = 3;
        int c = 1;
        int d = a>b || b<c ? c++ : ++c;
        System.out.println(d);
        System.out.println(c);
    }
}
