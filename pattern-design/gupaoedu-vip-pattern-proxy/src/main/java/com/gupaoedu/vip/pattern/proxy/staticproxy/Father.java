package com.gupaoedu.vip.pattern.proxy.staticproxy;

import com.gupaoedu.vip.pattern.proxy.Person;

/**
 * Created by Tom on 2019/3/10.
 */
public class Father {
    private Person person;

    public Father(Person person){
        this.person = person;
    }

    public void findLove(){
        System.out.println("父亲物色对象");
        this.person.findLove();
        System.out.println("双方父母同意，确立关系");

    }

}
