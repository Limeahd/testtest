package homework;

public class HomeWork1 {
    /**
     *1、使用两种方式分别定义方法打印26个大写字母A-Z和小写字母a-z
     */
    public static void main(String[] args) {
        //打印大写字母
        printing1();
        System.out.println();
        //打印小写字母
        String str = printing2();
        System.out.println(str);
    }

    public static void printing1(){
        for(int i=1;i<=26;i++){
            System.out.print((char)(64+i)+" ");
        }
    }

    public static String printing2(){
        String str = "";
        for(int i=1;i<=26;i++){
            str += (char)(96+i)+" ";
        }
        return str;
    }
}
