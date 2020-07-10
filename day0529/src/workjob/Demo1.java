package workjob;
/**
 * 1、给定一个千位数，求各个位数上的数之和。如千位数1234，结果为1+2+3+4=10
 */
public class Demo1 {
    public static void main(String[] args) {
        int num = 3746;
        int sum = 0;
        //取千位数
        sum = num / 1000;
        //取百位数，并与千位数相加
        num %= 1000;
        sum += num / 100;
        //取十位数，并相加
        num %= 100;
        sum += num /10;
        //取个位数，并相加
        num %= 10;
        sum += num /1;
        System.out.println("结果为："+sum);
    }
}
