package com.jlabs.poc.customer.consumer.kafka.listener;

import com.jlabs.poc.customer.consumer.kafka.model.CustomerNotification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomerListener {

    public void handleCustomerNotification(@Payload CustomerNotification customerNotification){
        log.info("Received notification: {}", customerNotification);
    }
}
