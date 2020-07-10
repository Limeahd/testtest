package pm.a;

public class Demo2 {
    public static void main(String[] args) {
        /**
         * 短路与
         * 如果第一个判断表达式为false，则第二个表达式不参与运算
         */
        /*
        int i = 1;
        boolean flag = 3>5 && i++>3;
        System.out.println(flag);
        System.out.println(i);

         */
        /**
         * 短路或
         * 如果第一个判断表达式为true，则第二个表达式不参与运算
         */
        int i = 1;
        boolean flag = 3<5 || i++>3;
        System.out.println(flag);
        System.out.println(i);
    }
}
