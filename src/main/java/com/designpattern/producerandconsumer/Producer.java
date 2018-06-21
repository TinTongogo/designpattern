package com.designpattern.producerandconsumer;

import java.util.List;

/**
 * 生产者
 * @author YYC
 * @date 2018/6/21
 */
public class Producer implements Runnable {
    private List<Product> list;

    public Producer(List<Product> list) {
        this.list = list;
    }

    @Override
    public void run() {
        if (list.size() >= 10) {
            try {
                System.out.println("库存已满，等待消费者消费");
                synchronized (list) {
                    list.wait();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            list.add(new Product());
            System.out.println("生产者生产一个产品");
            synchronized (list) {
                list.notifyAll();
            }
        }
    }
}
