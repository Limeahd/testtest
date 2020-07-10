package am;

public class Demo6 {
    /**
     * String 引用数据类型 数组、接口、抽象类
     * 作用：用来表示文本
     * 1、它会原样输出文本
     * 2、拼接方式 + 进行拼接，拼接内容会自动转换为字符串
     * 3、拼接的内容在前的先参与运算
     * 定义方式：
     * String 变量名 = “文本内容”;
     * @param args
     */
    public static void main(String[] args) {
//        String str = "fhduifhdso\nfjiovdhh";
//        System.out.println(str);
        System.out.println("10+10"+"="+10+10);
        System.out.println(10+10+"=10"+"10");
        System.out.println("10+10"+"="+(10+10));
    }
}
