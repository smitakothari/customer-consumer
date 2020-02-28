package com.jlabs.poc.customer.consumer.kafka.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface CustomerNotificationStream {

    String INPUT = "notifications-in";

    @Input(INPUT)
    SubscribableChannel inboundNotification();
}
