package com.webcloud.pattern.principle.srp;

/**
 * Description : X product factory.
 *
 * @author : LiangCL
 * @version : 2019/8/3
 */
public class XFactory extends AbstractFactory {

    @Override
    protected String preProcess(String material) {
        return String.format("PreProcess: ### %s ###", material);
    }

    @Override
    public String process(String material) {
        return String.format("%s to product X", preProcess(material));
    }
}
