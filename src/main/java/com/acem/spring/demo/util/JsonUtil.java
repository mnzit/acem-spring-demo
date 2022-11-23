package com.acem.spring.demo.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;

public class JsonUtil {
    public static ObjectMapper objectMapper;

    static {
        objectMapper = new ObjectMapper();
    }

    public static String toJson(Object object) {
        try {
            return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
            return null;
        }

    }

    public static <T> T toObject(InputStream inputStream, Class<T> clazz) {
        try {
            return objectMapper.readValue(inputStream, clazz);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
            return null;
        }
    }
}
