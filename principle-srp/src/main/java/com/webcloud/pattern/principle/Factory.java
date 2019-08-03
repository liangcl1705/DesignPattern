package com.webcloud.pattern.principle;

/**
 * Description : The factory to product.
 *
 * @author : LiangCL
 * @version : 2019/8/3
 */
public class Factory {

    private String preProcess(String material) {
        return String.format("PreProcess: ### %s ###", material);
    }

    public String processX(String material) {
        return String.format("%s to product X", preProcess(material));
    }

    public String processY(String material) {
        return String.format("%s to product Y", preProcess(material));
    }
}
