package com.algorithm.programmers.sort;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class No42746Test {

    @Autowired
    No42746 no42746;

    @Test
    void 테케1() {
        //given
        int[] testCase1 = new int[]{6, 10, 2};
        //when
        String result = no42746.comparatorSort(testCase1);
        //then
        Assertions.assertThat(result).isEqualTo("6210");
        System.out.println("result = " + result);
        log.info("result = {}", result);
    }

    @Test
    void 테케2() {
        //given
        int[] testCase2 = {3, 30, 34, 5, 9};
        //when
        String result = no42746.comparatorSort(testCase2);
        //then
        Assertions.assertThat(result).isEqualTo("9534330");
        System.out.println("result = " + result);
        log.info("result = {}", result);
    }
}