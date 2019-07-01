package com.amazonaws.serverless.manager;

import java.util.HashMap;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;

public class Handler {
    public Object handler(Object event) {
        System.out.println(event);

        return new HashMap();
    }
}
