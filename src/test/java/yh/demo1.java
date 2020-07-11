package yh;

public class demo1 {
    public static void main(String[] args) {

        try {
            //解耦
            Class<?> aClass = Class.forName("com.yh.demo2");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
