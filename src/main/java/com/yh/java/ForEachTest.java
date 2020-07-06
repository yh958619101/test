package  com.yh.java;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class  ForEachTest{
    public static void main(String[] args) {
        List<String>  list=new ArrayList<>();
        list.add("wupx");
        list.add("love");
        list.add("huxy");

       /* for (String  temp:list){
            if("wupx".equals(temp)){
                list.remove(temp);
            }

        }*/
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            if(it.next().equals("wupx")){
                it.remove();
            }

        }
        System.out.println(list);






















        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
    }
}