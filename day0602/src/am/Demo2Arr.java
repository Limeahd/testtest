package am;

public class Demo2Arr {
    public static void main(String[] args) {
        //第二种方式： int[][] Arr = {{1},{2},{3},{4},....{n}}
        //学生的分数 三个班，每个班三四个人
        int[][] scourceArr = {{67,56,88,66},{77,89,99,65},{56,44,88,44}};

        //遍历
//        for (int i = 0; i < scourceArr.length; i++) {
//            int[] scource = scourceArr[i];
//            for(int j=0;j<scource.length;j++){
//                System.out.println(scource[j]);
//            }
//        }
        for (int i = 0; i < scourceArr.length; i++) {
            for (int i1 = 0; i1 < scourceArr[i].length; i1++) {
                System.out.println(scourceArr[i][i1]);
            }
        }
        System.out.println(scourceArr.length);
    }
}
