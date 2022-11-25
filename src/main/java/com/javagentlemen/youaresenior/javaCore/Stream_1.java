package com.javagentlemen.youaresenior.javaCore;

import java.util.stream.Stream;

public class Stream_1 {

    /**
     * Вопрос 1: Какой будет результат? = aass
     * Как это работает ? - тут нужно рассказать как именно обрабатывается стрим. Ну т.е
     * 1) Берется первывый элемент из стрима("abcd") проходит через фильтр(SS) -> отбрасывается
     * 2) Берется второй элемент из стрима("ss") проходит через первый фильтр(s.contains("ss")) -> НЕ проходит через фильр s.length() > 2
     * 3) Берется третий элемент (aass) проходит через оба фильтра -> все ок -> стрим завершается ->возвращает этот элемент
     * ps. Если подзабыл то можно между фильтрами воткунуть .peek(System.out::println) для наглядности
     */
    public static void main(String[] args) {
        var res= Stream.of("abcd", "ss", "aass", "ccss")
                .filter(s -> s.contains("ss"))
                .filter(s -> s.length() > 2)
                .findFirst()
                .get();

        System.out.println(res);
    }
}


