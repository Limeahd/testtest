package workjob;

/**
 * 5、某公司每月标准上班时间是160小时，每小时工资是30元。如果上班时间超出了160小时，
 * 	超出部分每小时按1.5倍工资发放。请编写程序计算员工月工资。
 */
public class Demo5 {
    public static void main(String[] args) {
        int jioTime = 200;
        double salary = 0;
        if(jioTime <= 160){
            salary = jioTime*30;
            System.out.println("员工本月工资为："+salary);
        }else{
            salary = 160*30+(jioTime-160)*30*1.5;
            System.out.println("员工本月工资为："+(salary));
        }
    }
}
