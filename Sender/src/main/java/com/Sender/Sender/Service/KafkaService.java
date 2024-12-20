package com.Sender.Sender.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void updateLocation(String location) {
        this.kafkaTemplate.send("new-topic", location);
    }

}
