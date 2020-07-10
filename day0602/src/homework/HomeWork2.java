package homework;

public class HomeWork2 {
    /**
     * 2、定义一个方法将旧数组int[] oldArr ={1,2,3,4,4,4,4,4,4,4,4,4,3,2,1};
     * 中的4去掉,保存到一个新的数组中，新数组打印的结果为：[1,2,3,3,2,1]
     */
    public static void main(String[] args) {
        int[] oldArr = {1,2,3,4,4,4,4,4,4,4,4,4,3,2,1};
        int[] newArr = new int[10];
        int k = 0;
        delArr(oldArr,newArr);
        for (int i = 0; i < newArr.length; i++) {
            if(newArr[i] == 0){
                k = i;
                break;
            }
        }
        for (int j = 0; j < k; j++) {
            System.out.print(newArr[j]+",");
        }
    }

    public static void delArr(int[] arr,int[] newArr){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 4){
                newArr[j] = arr[i];
                j++;
            }
        }
    }
}
