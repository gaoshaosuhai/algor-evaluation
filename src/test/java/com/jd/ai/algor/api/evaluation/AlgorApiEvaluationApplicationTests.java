package com.jd.ai.algor.api.evaluation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RBucket;
import org.redisson.api.RStream;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlgorApiEvaluationApplicationTests {

//    @Autowired
//    private RedissonClient redissonClient;

    @Autowired
    private JdbcTemplate template;

    @Test
    public void contextLoads() {
    }

//    @Test
//    public void testRedission() {
//        RBucket<String> bucket = redissonClient.getBucket("1111");
//        String o = bucket.get();
//        System.out.println(o);
//    }

    @Test
    public void testMysql() {
        List<com.jd.ai.algor.api.evaluation.entity.Test> query = template.query("select * from test", new BeanPropertyRowMapper<>(com.jd.ai.algor.api.evaluation.entity.Test.class));
        System.out.println(query.size());
    }

}
