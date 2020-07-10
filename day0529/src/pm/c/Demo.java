package pm.c;

public class Demo {
    /**
     * if流程控制语句
     *      单if分支结构
     *          语法：
     *          if(as表达式){
     *
     *          }
     *      完整体if结构
     *          语法：
     *          if(表达式){
     *
     *          }else{
     *
     *          }
     *      多if结构
     *      if(){
     *
     *      }else if(){
     *
     *      }else if(){
     *
     *      }else{
     *
     *      }
     */
    public static void main(String[] args) {
//        int age = 17;
//        if(age>=18){
//            System.out.println("已成年");
//        }
//
//        if(age>=18){
//            System.out.println("已成年");
//        }else{
//            System.out.println("未成年");
//        }

       int source = 79;
////        if(source>=90){
////            System.out.println("优秀");
////        }else if(source>=80){
////            System.out.println("良好");
////        }else if(source>=60){
////            System.out.println("及格");
////        }else{
////            System.out.println("不及格");
////        }

        //单if加上运算符进行区间分割
        if(source>=90){
            System.out.println("优秀");
        }
        if(source>=60 && source<80){
            System.out.println("及格");
        }

    }
}
