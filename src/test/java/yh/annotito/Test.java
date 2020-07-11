package yh.annotito;
//取消警告
@SuppressWarnings("all")
public class Test {
    public static void main(String[] args) {
        AnnotationDemo3 demo3 = new AnnotationDemo3();
        demo3.add();
        demo3.add(1,3);
    }
}
