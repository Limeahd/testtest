package pm.c;

public class DemoSwitch2 {
    /**
     *
     */
    public static void main(String[] args) {
        int source = 55;
        switch (source / 10){
            case 10:
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("良好");
                break;
            case 7:
                System.out.println("中等");
                break;
            case 6:
                System.out.println("及格");
                break;
                default:
                    System.out.println("不及格");
        }
    }
}
