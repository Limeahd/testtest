package workjob;

/**
 * 2、写出一个条件判断语句判断一个数是否能同时被3和7整除。
 */
public class Demo2 {
    public static void main(String[] args) {
        int num = 49;
        if(num%3==0 && num%7==0){
            System.out.println(num+"能同时被3和7整除");
        }else{
            System.out.println(num+"不能同时被3和7整除");
        }
    }
}
