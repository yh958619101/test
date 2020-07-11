package yh.annotito;

import yh.WeekDay;

public @interface MyAnnot2 {
    int test() default 1; //基本类型

    String test2() default "zs"; //String类型

    WeekDay test3() default WeekDay.FRI; //枚举类型

    MyAnnot test4() default @MyAnnot; //注解类型

    int[] test5() default {1, 2, 3};

    WeekDay[] test6() default WeekDay.FRI;

    MyAnnot[] test7() default {@MyAnnot, @MyAnnot};
}
