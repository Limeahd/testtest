package workjob;

/**
 * 4、定义两个变量保存一个人的身高和体重，编程实现判断这个人的身材是否正常!
 * 	公式: 体重(kg)/身高(m)的平方值在18.5 ~ 24.9之间属于正常。
 */
public class Demo4 {
    public static void main(String[] args) {
        double high = 1.76;
        double weight = 65;
        double temp = 0;
        temp = weight/(high*high);
        if(temp>=18.5 && temp<=24.9) {
            System.out.println("身材正常");
        }else {
            System.out.println("身材不正常");
        }
    }
}
