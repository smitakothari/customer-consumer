package com.jlabs.poc.customer.consumer.kafka.listener;

import com.jlabs.poc.customer.consumer.kafka.model.CustomerNotification;
import com.jlabs.poc.customer.consumer.kafka.stream.CustomerNotificationStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@EnableBinding(CustomerNotificationStream.class)
public class CustomerListener {

    @StreamListener(CustomerNotificationStream.INPUT)
    public void handleCustomerNotification(Message<?> message) throws Exception{
        log.info("Received notification: {}", message);
    }
}
