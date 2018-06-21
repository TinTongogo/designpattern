package com.designpattern.producerandconsumer;

import java.util.List;

/**
 * 消费者
 *
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
        synchronized (list) {
            if (list.size() == 0) {
                try {
                    System.out.println("产品被全部消费，等待生产者生产！");
                    list.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                list.remove(0);
                System.out.println("消费者消费一个产品");
                list.notifyAll();
            }
        }
    }
}
