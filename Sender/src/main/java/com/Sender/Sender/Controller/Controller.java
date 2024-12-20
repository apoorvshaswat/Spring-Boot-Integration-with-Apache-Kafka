package com.Sender.Sender.Controller;

import com.Sender.Sender.Service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update")
    public String update() {
        this.kafkaService.updateLocation("( " + Math.round(Math.random() * 100) + " , " + Math.round(Math.random() * 100) + " " + ")");

        return "Updated Successfully";
    }


}
