package com.Receiver.Receiver.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = "new-topic", groupId = "group-1")
    public void update(String value) {
        System.out.println(value);
    }
}
