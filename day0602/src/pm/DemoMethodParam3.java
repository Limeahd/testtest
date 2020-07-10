package pm;

public class DemoMethodParam3 {
    /**
     * 引用数据类型传值
     */
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        change(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void change(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 2;
        }
    }

}
