package am;

public class Demo5 {
    /**
     * 数据类型强转
     * 小类型向大类型转换
     * @param args
     */
    public static void main(String[] args) {
        byte b1 = 11;
        byte b2 = 22;
        int i1 = 333;
        int i2 = 44;
        i1 = b1;
        b2 = (byte) i2;
        System.out.println(i1);
        System.out.println(b2);
    }
}
