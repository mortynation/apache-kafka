package com.dev.springbootkafka.kafka;


import com.dev.springbootkafka.payload.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {
     public static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

     private KafkaTemplate<String, Users> kafkaTemplate;

     public JsonKafkaProducer(KafkaTemplate<String, Users> kafkaTemplate) {
         this.kafkaTemplate = this.kafkaTemplate;

     }

     public void sendMessage(Users data) {

         LOGGER.info(String.format("Message sent -> %s", data.toString()));

         Message<Users> message = MessageBuilder.withPayload(data).setHeader(KafkaHeaders.TOPIC, "ak").build();

         kafkaTemplate.send(message);
     }




}
