package com.dev.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic akTopic() {
        return TopicBuilder.name("ak").build();
    }

    @Bean
    public NewTopic akJsonTopic() {
        return TopicBuilder.name("ak_json").build();
    }
}
