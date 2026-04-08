package com.lmh.coverage;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class CoverageApplicationTest {

    @Test
    void SCREG() {
        String regex = "(a*ba*b)*a*ba*";
        SCREG SCREG = new SCREG();
        SCREG.generate(regex);

        System.out.println("Regex: " + regex );
        System.out.println("Positive Strings: " + SCREG.getPositiveStrings());
        System.out.println("Negative Strings: " + SCREG.getNegativeStrings());

    }


}
