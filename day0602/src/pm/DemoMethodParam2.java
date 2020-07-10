package pm;

public class DemoMethodParam2 {
    public static void main(String[] args) {
        int a = 1;
        a= change(a);
        System.out.println(a);
    }

    public static int change(int a){
        a = 10;
        return a;
    }
}
