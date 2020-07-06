package com.yh.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * 多线程 ： 1 创建线程数量为5的线程池。 2 同时运行5个卖票窗口。 3 总票数为100，每隔一秒钟卖一张票
 *
 * 程序分析：
 * 1.线程池类的使用，限制线程的个数
 * 2.静态变量的定义
 * 3.代码块锁的使用
 * */
public class ThreadTest {

    public static void main(String[] args) {

        // 1.调用Executors类的静态方法来创建一个ExecutorService对象，该对象代表一个线程池。
        ExecutorService pool=Executors.newFixedThreadPool(6);//创建5或5以上都可以

        // 2.调用Runnable实现类的示例，作为线程执行任务。
        //实例化站台对象，并为每一个站台取名字
        Station station1=new Station("窗口1");
        Station station2=new Station("窗口2");
        Station station3=new Station("窗口3");
        Station station4=new Station("窗口4");
        Station station5=new Station("窗口5");

        // 3.调用ExecutorService对象的submit方法来提交Runnable示例。
        // 让每一个站台对象各自开始工作
        pool.submit(station1);
        pool.submit(station2);
        pool.submit(station3);
        pool.submit(station4);
        pool.submit(station5);

        // 4.当不想提交任务时，调用ExecutorService对象的shutdown方法来关闭线程。
        pool.shutdown();

		/*
		 *如果没有线程池，直接启动线程也能实现效果，但是效率低一点
		 *station1.start();
		 station2.start();
		 station3.start();
		 station4.start();
		 station5.start();
		 */
    }

    static class Station extends Thread {

        // 通过构造方法给线程名字赋值
        public Station(String name) {
            super(name);// 给线程名字赋值
        }

        // 为了保持票数的一致，票数要静态
        static int tick = 5;

        // 创建一个静态钥匙
        static Object ob = " aa";

        // 重写run方法
        @Override
        public void run() {
            while (tick > 0) {
                synchronized (ob) {// 这个很重要，必须使用一个锁，
                    // 进去的人会把钥匙拿在手上，出来后才把钥匙拿出来
                    if (tick > 0) {
                        System.out.println(getName() + "卖出了第" + tick + "张票");
                        tick--;
                    } else {
                        System.out.println("票卖完了");
                    }
                }
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
