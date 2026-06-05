package com.example.wfinance_notification.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class SubscribeService {


    @RabbitListener(queues = "${rabbitmq.queuename}")
    public void reiceveSubscribe(Message message) {
        System.out.println("Received message: " + message);
    }

    @Bean
    public Queue registerUserQueue() {
        return new Queue("REGISTER_USER_QUEUE", true);
    }

}
