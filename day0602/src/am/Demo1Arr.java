package am;

/**
 * 创建数组
 * 第一种方式： int[][] Arr = new int[4][3];
 * 第二种方式： int[][] Arr = {{1},{2},{3},{4},....{n}}
 */
public class Demo1Arr {
    public static void main(String[] args) {
        double[][] salary = new double[3][4];

        //第一个部门的4个人
        salary[0][0] = 123.43;
        salary[0][1] = 423.76;
        salary[0][2] = 324.56;
        salary[0][3] = 224.22;

        //第二个部门
        salary[1][0] = 123.43;
        salary[1][1] = 423.76;
        salary[1][2] = 324.56;
        salary[1][3] = 224.22;

        //第三个部门
        salary[2][0] = 123.43;
        salary[2][1] = 423.76;
        salary[2][2] = 324.56;
        salary[2][3] = 224.22;

        double salary2 = salary[1][2];
        System.out.println(salary2);
        System.out.println(salary.length);
    }
}
