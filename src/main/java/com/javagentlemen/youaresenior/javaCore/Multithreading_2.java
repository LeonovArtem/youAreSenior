package com.javagentlemen.youaresenior.javaCore;

import java.util.HashMap;

public class Multithreading_2 {
    // Вопрос что тут не так. Я сказал а зачем тут volatile и дальше мы скатились примерно к этому
    // https://habr.com/ru/post/129494/
    public static class Singleton {
        private volatile HashMap<String, String> cache;

        // Тут код не точноый но смысл в том что это типо метод который что то из кеша достает
        public String getCachedElements(String element) {
            if (cache.containsKey(element)) {
                return cache.get(element);
            } else {
                return "";
            }
        }

    }
}