package com.algorithm.programmers.sort;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
class No42747Test {

    @Autowired
    No42747 no42747;

    @Test
    void 테케1() {
        int[] citations = new int[]{3, 0, 6, 1, 5};
        int result = no42747.solution(citations);
        assertThat(result).isEqualTo(3);
        log.info("result = {}", result);
    }
}