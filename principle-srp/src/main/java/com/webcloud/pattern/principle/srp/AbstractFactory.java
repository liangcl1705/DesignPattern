package com.webcloud.pattern.principle.srp;

/**
 * Description : The abstract factory.
 *
 * @author : LiangCL
 * @version : 2019/8/3
 */
public abstract class AbstractFactory {

    /**
     * Prepare process.
     *
     * @param material - The material.
     * @return - Material that after preprocess.
     */
    protected abstract String preProcess(String material);

    /**
     * Process material.
     *
     * @param material - The material.
     * @return - Material after process.
     */
    public abstract String process(String material);
}
