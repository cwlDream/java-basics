package com.java.basics.pattern.simple;

import com.java.basics.pattern.simple.BaoMa;
import com.java.basics.pattern.simple.BenChi;

/**
 * 简单工厂
 */
public class SimpleFactory {

    /**
     * 简单工厂的创建
     * @param name
     * @return
     */
    public void factoryCreate(String name){
        if("baoma".equals(name)){
             new BaoMa().run(name);
        }else if("benchi".equals(name)){
            new BenChi().run(name);
        }

    }

}
