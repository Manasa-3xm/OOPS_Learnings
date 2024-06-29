package org.example.java8;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalExample {

    private Map<String, String> configMap;

    public OptionalExample() {
        configMap = new HashMap<>();
        configMap.put("key1", "value1");
        configMap.put("key2", "value2");
        configMap.put("key3", null); // Simulate a key with null value
    }

    public static void main(String[] args) {
        OptionalExample configManager = new OptionalExample();

        Optional<String> configValue1 = configManager.getConfigValue("key1");
        configValue1.ifPresent(value -> System.out.println("Config value for key1: " + value));

        Optional<String> configValue2 = configManager.getConfigValue("key2");
        configValue2.ifPresent(value -> System.out.println("Config value for key2: " + value));

        Optional<String> configValue3 = configManager.getConfigValue("key3");
        configValue3.ifPresent(value -> System.out.println("Config value for key3: " + value));
        //DateTime API -> which are immutable and thread-safe, overcoming many issues with the legacy Date and Calendar classes.
        LocalDate today = LocalDate.now();
        System.out.println(today);

    }

    public Optional<String> getConfigValue(String key) {
        String value = configMap.get(key);
        return Optional.ofNullable(value);
    }
}
