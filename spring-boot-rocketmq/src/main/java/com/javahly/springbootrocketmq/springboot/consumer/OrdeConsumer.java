package com.javahly.springbootrocketmq.springboot.consumer;

import com.javahly.springbootrocketmq.springboot.entity.OrderEntity;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;


@Service
@RocketMQMessageListener(topic = "MyTopic", consumerGroup = "MyConsumerGroup")
public class OrdeConsumer implements RocketMQListener<OrderEntity> {
    @Override
    public void onMessage(OrderEntity o) {
        System.out.println("o:" + o.toString());
    }
}
