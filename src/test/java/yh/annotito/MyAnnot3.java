package yh.annotito;

import yh.WeekDay;
//default设置默认值  value
public @interface MyAnnot3 {
    int value() default 1; //基本类型
    int age() default 2;

}
