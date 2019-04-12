package com.gupaoedu.vip.pattern.proxy.dynamicproxy.gpproxy;

import com.gupaoedu.vip.pattern.proxy.Person;
import com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy.Girl;
import com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy.JDKMeipo;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * Created by Tom on 2019/3/10.
 */
public class GPProxyTest {

    public static void main(String[] args) {
        try {

            Person obj = (Person) new GPMeipo().getInstance(new Girl());
            obj.findLove();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
