package com.designpattern.producerandconsumer;

import java.io.Serializable;

/**
 * 产品
 * @author YYC
 * @date 2018/6/21
 */
public class Product implements Serializable{
    private static final long serialVersionUID = 3829560676644801352L;

    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
