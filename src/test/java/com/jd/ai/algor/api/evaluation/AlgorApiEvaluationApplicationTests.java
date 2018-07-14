package com.jd.ai.algor.api.evaluation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RBucket;
import org.redisson.api.RStream;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlgorApiEvaluationApplicationTests {

    @Autowired
    private RedissonClient redissonClient;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testRedission() {
        RBucket<String> bucket = redissonClient.getBucket("1111");
        bucket.set("nihao");
        String o = bucket.get();
        System.out.println(o);
    }

}
