package yh;
public class TestSwitch {
    public static void main(String[] args) {
       int a=3;
       switch (a){
           case 3:
               System.out.println(3);
               break;
           case 1:
               System.out.println(1);
               break;
               default:
                   System.out.println(0);
       }
        char c='A';
        switch (c){
            case'A':
                System.out.println('A');
                break;
            case 'B':
                System.out.println('B');
                break;
            default:
                System.out.println(0);
        }
       //jdk1.5后支持枚举
//jdk1.7后表达式类型 支持String//不支持lang
        String b="优秀";
        switch (b){
            case"优秀":
                System.out.println("优秀");
                break;
            default:
                System.out.println(0);
        }




    }
}
