package yh;

public class demo2 {
    public static void main(String[] args) {
        //加载类
        try {
            //方式1
            Class<?> aClass = Class.forName("com.yh.demo1");
            System.out.println(aClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //方式2

        Class<demo1> demo1Class = demo1.class;
        System.out.println(demo1Class);
        //方式3
        demo1 demo1 = new demo1();
        Class<? extends demo1> aClass2 = demo1.getClass();
        System.out.println(aClass2);
    }


}
