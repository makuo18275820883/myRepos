package com.icis.Test1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

public class Test1 {
    private Jedis jedis;
    //初始化
    @Before
    public void intoJedis(){
        jedis=new Jedis("127.0.0.1");
    }
    @Test
    public void setJedis(){
        //存储 key value
        jedis.set("username","mk");
        jedis.set("password","123");
        //获取
        System.out.println("名字："+jedis.get("username"));
        System.out.println("密码："+jedis.get("password"));
    }





    @After
    public void close(){
        jedis.close();
    }
}
