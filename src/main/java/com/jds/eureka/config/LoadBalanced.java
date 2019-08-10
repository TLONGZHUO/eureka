package com.jds.eureka.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangzhuo
 */
@Configuration
public class LoadBalanced {
    @Bean
    public IRule ribbonRule() {
        //轮询
        return new RoundRobinRule();
        //加权权重
//        return new WeightedResponseTimeRule();
        //带有重试机制的轮训
//        return new RetryRule();
        //随机
//        return new RandomRule();
        //自定义规则
//        return new TestRule();
    }
}