package com.jlabs.poc.customer.consumer.kafka.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerNotification {

    private long timestamp;
    private String message;
}
