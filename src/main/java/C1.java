import yh.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yh
 * @version 1.0
 * @date 2020/7/10 0010 14:43
 */
public class C1 {
    public int stuid; // 学生学号
    public int courseid; // 课程编号
    public int score; // 分数
    @Override
    public String toString() {
        return "C1{" +
                "stuid=" + stuid +
                ", courseid=" + courseid +
                ", score=" + score +
                '}';
    }

    public static void main(String[] args) {
        String  a="123";  String  b="123";
        System.out.println(a==b);
        C1 c1 = new C1();
        c1.courseid = 90;
        c1.score = 01;
        c1.stuid = 1111;
        C1 c2 = new C1();
        c2.courseid = 95;
        c2.score = 02;
        c2.stuid = 1111;
        C1 c3 = new C1();
        c3.courseid = 91;
        c3.score = 02;
        c3.stuid = 1112;
        List<C1> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        System.out.println(toMaps(list));
        System.out.println(toMap(list));
        System.out.println(list);
    }

    /*方法2*/
    public static Map<Integer, Map<Integer, Integer>> toMaps(List<C1> list) {
        Map<Integer, Map<Integer, Integer>> stuMap = new HashMap<Integer, Map<Integer, Integer>>();
        for(C1 c1: list) {
            Map<Integer, Integer> scoreMap = new HashMap<Integer, Integer>();
            scoreMap.put(c1.courseid, c1.score);
            stuMap.put(c1.stuid, scoreMap);
        }
        return stuMap;
    }
    /*方法3*/
    public static Map<Integer, Map<Integer, Integer>> toMap(List<C1> list) {
        Map<Integer, Map<Integer, Integer>> stuMap = new HashMap<Integer, Map<Integer, Integer>>();// 需要返回的对象
        HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>(); // 课程和成绩
        list.forEach(c1 -> { // 获取所有的学员，类似分组
            temp.put(c1.stuid, c1.stuid);
        });
        temp.forEach((key, value) -> {
            HashMap<Integer, Integer> courseMap = new HashMap<Integer, Integer>(); // 课程和成绩
            list.forEach(c1 -> {
                System.out.println("学生编号：" + c1.stuid + "| 学生课程编号：" + c1.courseid + " | 学生成绩：" + c1.score);
                if (key == c1.stuid) {
                    courseMap.put(c1.score, c1.courseid);
                }
            });
            stuMap.put(key, courseMap);
        });
        return stuMap;
    }
}
