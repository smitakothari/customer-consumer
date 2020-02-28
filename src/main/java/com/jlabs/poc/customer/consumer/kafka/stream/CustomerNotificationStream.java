package com.jlabs.poc.customer.consumer.kafka.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface CustomerNotificationStream {

    String INPUT = "notification-in";

    @Input(INPUT)
    SubscribableChannel inboundGwrRegistrationEvent();
}
