package cn.qphone.spring.factory;

import cn.qphone.spring.Chinese;

public class BeanFactory {
    public  Chinese createChina(){
        return new Chinese();
    }
}
