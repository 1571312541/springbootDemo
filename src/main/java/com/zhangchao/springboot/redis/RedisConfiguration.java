package com.zhangchao.springboot.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedisPool;

import java.util.ArrayList;
import java.util.List;


/**
 * 〈〉
 *
 * @author 22902
 * @create 2018/12/5
 */
@Configuration
@PropertySource("classpath:redis/redis.properties")
public class RedisConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(RedisConfiguration.class);

    @Value("${redis.maxTotal}")
    private Integer redisMaxTotal;
    @Value("${redis.node1.host}")
    private String redisNode1Host;
    @Value("${redis.node1.port}")
    private Integer redisNode1Port;


    private JedisPoolConfig jedisPoolConfig(){
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(redisMaxTotal);
        return jedisPoolConfig;
    }
    @Bean
    public ShardedJedisPool shardedJedisPool(){
        List<JedisShardInfo> jedisShardInfos = new ArrayList<>();
        jedisShardInfos.add(new JedisShardInfo(redisNode1Host,redisNode1Port));
        logger.warn("-------------------------连接redis--------------------------");
        return new ShardedJedisPool(jedisPoolConfig(),jedisShardInfos);

    }


}
