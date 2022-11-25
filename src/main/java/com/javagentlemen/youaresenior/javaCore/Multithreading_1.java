package com.javagentlemen.youaresenior.javaCore;

import java.util.HashMap;

public class Multithreading_1 {
    /**
     * Что в этом коде не так ?
     */
    static class Runner {
        // 1) char[] плохая идея для ключа (Меняем на String)
        private HashMap<char[], char[]> hashMap = new HashMap<>();

        // 2) synchronized - не нужен. Меняем  на synchronized increaseElement
        public synchronized void method1() {
            try {
                // тут что делаем
                increaseElement();
                // тут что делаем
            } catch (Throwable e) {
            }
        }

        public void increaseElement() {

        }
    }
}
