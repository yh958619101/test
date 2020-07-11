package yh;

public class EnumDemo1 {
//一
    public  static  void  printGrade(Grade grade){
        System.out.println(grade.name());
        System.out.println(grade.getScore());
        System.out.println(grade.ordinal());
grade.getInfo();
    }
    //二
    /*public  static  void  printGrade(Grades Grades){

    }*/
    public static void main(String[] args) {
    printGrade(Grade.C);
    Grade  grade=Grade.valueOf("A");
        System.out.println(grade.ordinal());
        Grade[] values = Grade.values();
        for (Grade value : values) {
            System.out.print(value.name());
        }
        //printGrade(Grades.A);
    }
}
//一
/*class  Grade{
    public static  Grade  A=new Grade();
    public static  Grade  B=new Grade();
    public static  Grade  C=new Grade();
    public static  Grade  D=new Grade();
    public static  Grade  E=new Grade();
   private   Grade(){};
}*/
//二

enum Grade{
    A(90){
        @Override
        public void getInfo() {
            System.out.println("成绩是90分以上是该等级");
        }
    },B(80) {
        @Override
        public void getInfo() {
            System.out.println("成绩是80分以上是该等级");
        }
    },C(70) {
        @Override
        public void getInfo() {
            System.out.println("成绩是70分以上是该等级");
        }
    },D(60) {
        @Override
        public void getInfo() {
            System.out.println("成绩是60分以上是该等级");
        }
    },E(50) {
        @Override
        public void getInfo() {
            System.out.println("成绩是60分以下是该等级");
        }
    };
    private int score;
    private Grade(int score){
        this.score=score;

    }

    private Grade(){}

    public int getScore(){

        return score;
    }

    public  abstract void getInfo();}