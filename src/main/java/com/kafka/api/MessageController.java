package com.kafka.api;


import com.kafka.api.services.impl.ServiceImpl;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/kafka")
public class MessageController {


    private ServiceImpl kafkaProducer;

    public MessageController(ServiceImpl kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    // http:localhost:8080/api/v1/kafka/publish?message=hello world
    @GetMapping("/publish")
    public void publish(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);


    }

    // http:localhost:8080/api/v1/kafka/publish2?message=hello world
    @GetMapping("/publish2")
    public ResponseEntity<String> publish2(@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message Sent to the topic");
    }


}

