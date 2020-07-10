package pm;

public class DemoMethod2 {
    //定义一个方法抽取数组遍历方式
    public static void iterArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"");
        }
    }

    public static void iterArr2(int[][] arr2){
        for (int i = 0; i < arr2.length; i++) {
            for (int i1 = 0; i1 < arr2[i].length; i1++) {
                System.out.print(arr2[i][i1]);
            }
            System.out.println();
        }
    }
}
