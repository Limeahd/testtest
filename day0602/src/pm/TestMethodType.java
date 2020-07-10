package pm;

public class TestMethodType {
    public static void main(String[] args) {
//        DemoMethodType.method1();
//        DemoMethodType.method2();

//        int[] a = {1,2,3,4,5,6,4,3,2};
////        DemoMethodType.method3(a);
////        DemoMethodType.method4(a);
////        int sum = DemoMethodType.method5();
////        System.out.println("偶数和为："+sum);
//
////        String str = DemoMethodType.arrToStr(a);
////        System.out.println(str);
//        boolean ageAdu = DemoMethodType.isAgeAdu(19);
//        System.out.println(ageAdu);

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
        salary[2][2] = 424.56;
        salary[2][3] = 224.22;
        double salarySum = DemoMethodType.getSalarySum(salary);
        System.out.println(salarySum);
    }
}
