package pm.a;

public class Demo1 {
    public static void main(String[] args) {
        //与运算
        /*
        boolean flag1 = 5>3 & 1>0;
        System.out.println(flag1);
        */

/*
        //或运算：表达式两边只要有一个为true则结果为true，一真即真
        boolean flag1 = 5>3 & 1>0;
        boolean flag2 = true || true;
        boolean flag3 = false || true;
        boolean flag4 = false || false;
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);
*/
        /**
         * 亦或
         * 两边一致为false，否则为true
         */
        /*
        boolean flag1 = 5>3 ^ 1>0;
        boolean flag2 = true ^ true;
        boolean flag3 = false ^ true;
        boolean flag4 = false ^ false;
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);

         */

        /**
         * 非运算
         * 取反
         */
        boolean flag1 = !true;
        boolean flag2 = !false;
        boolean flag3 = !(3>5);
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

    }
}
