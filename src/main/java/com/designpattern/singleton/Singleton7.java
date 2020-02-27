package com.designpattern.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 有上限的多例模式
 *
 * @author YYC
 * @date 2018/6/7
 */
public class Singleton7 {
    private String name;
    private Singleton7() {}
    private Singleton7(String name ) {
        this.name = name;
        System.out.println("生成对象：" + name + "》》》》》》》》》》》");
    }
    private static List<Singleton7> list = new ArrayList<>();
    /**
     * 葫芦娃总数
     */
    private static int max = 7;
    /**
     * 当前葫芦娃
     */
    private static int num = 7;

    //添加葫芦七兄弟
    static {
        for (int i = 1; i <= max; i++) {
            list.add( new Singleton7(i + "娃"));
        }
    }

    public static Singleton7 getSingleton() {
        try {
            //线程暂停10毫秒,复现高并发下单例问题
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Random random = new Random();
        num = random.nextInt(max);
        return list.get(num);
    }

    public void say() {
        System.out.println("Singleton7.say : hello singleton" + list.get(num).name + " !");
    }
}