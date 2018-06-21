package com.designpattern.producerandconsumer;

import java.util.List;

/**
 * 消费者
 * @author YYC
 * @date 2018/6/21
 */
public class Consumer implements Runnable {
    private List<Product> list;

    public Consumer(List<Product> list) {
        this.list = list;
    }

    @Override
    public void run() {
        if (list.size() == 0) {
            try {
                System.out.println("产品被全部消费，等待生产者生产！");
                synchronized (list) {
                    list.wait();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            synchronized (list) {
                list.remove(0);
                System.out.println("消费者消费一个产品");
                list.notifyAll();
            }
        }
    }
}
