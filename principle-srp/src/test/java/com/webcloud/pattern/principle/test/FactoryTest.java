package com.webcloud.pattern.principle.test;

import com.webcloud.pattern.principle.Factory;
import com.webcloud.pattern.principle.srp.AbstractFactory;
import com.webcloud.pattern.principle.srp.XFactory;
import com.webcloud.pattern.principle.srp.YFactory;
import org.junit.Test;

/**
 * Description : Test cases for Factory.
 *
 * @author : LiangCL
 * @version : 2019/8/3
 */
public class FactoryTest {

    @Test
    public void testFactory() {
        Factory factory = new Factory();
        String xProduct = factory.processX("material");
        String yProduct = factory.processY("material");

        System.out.println(xProduct);
        System.out.println(yProduct);
    }

    @Test
    public void testAbstractFactory() {
        AbstractFactory xFactory = new XFactory();
        AbstractFactory yFactory = new YFactory();

        System.out.println(xFactory.process("material"));
        System.out.println(yFactory.process("material"));
    }
}
