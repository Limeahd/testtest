package homework;

public class HomeWork3 {
    /**
     * 3、定义一个方法将旧数组 int[] oldArr ={1,2,3,4,5,2,1};
     * 倒序保存到一个新的数组中，新数组打印的结果为：[1,2,5,4,3,2,1]
     */
    public static void main(String[] args) {
        int[] oldArr = {1,2,3,4,5,2,1};
        int[] newArr = new int[7];
        changeOrder(oldArr,newArr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }

    public static void changeOrder(int[] oldArr,int[] newArr){
        int j = 0;
        for (int i = oldArr.length - 1; i >= 0; i--) {
            newArr[j] = oldArr[i];
            j++;
        }
    }
}
