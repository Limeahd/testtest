package workjob;

/**
 * 3、写出判断一个数是否能够被3或者7整除，但是不能同时被3或者7整除
 */
public class Demo3 {
    public static void main(String[] args) {
        int num = 28;
        if(num%3!=0 && num%7!=0){
            System.out.println(num+"不能被3或者7整除");
        }else if(num%3==0 && num%7==0){
            System.out.println(num+"能被3和7同时整除");
        }else{
            System.out.println(num+"能够被3或者7整除，但不能同时被3和7整除");
        }
    }
}
