package pm.c;

public class DemoSwitch {
    /**
     * switch控制语句
     * switch(表达式的值){
     *     case 比对值:
     *          执行内容（break跳出流程）
     *     case 比对值:
     *          执行内容
     *     ......
     *     default： //当case都没有比对成功时执行
     *          执行内容
     * }
     */
    public static void main(String[] args) {
        int num = 1;
        switch (num){
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            case 7:
                System.out.println("周日");
                break;
            default:
                System.out.println("非法");
        }
    }
}
