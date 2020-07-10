package pm;

public class DemoMethodParam {
    /**
     * 基本数据类型传值
     * 关键看有没有返回值
     */
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        change(a,b);
        System.out.println("a="+a+",bTCP="+b);
    }

    public static void change(int a,int b){
        a = 10;
        b = 20;
    }
}
