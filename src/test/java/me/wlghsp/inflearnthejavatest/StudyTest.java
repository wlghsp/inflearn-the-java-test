package me.wlghsp.inflearnthejavatest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName("스터디 만들기")
    @EnabledIfEnvironmentVariable(named = "TEST_ENV", matches = "WLGHSP")
    void create_new_study() {
        Study actual = new Study(10);
        assertThat(actual.getLimit()).isGreaterThan(0);
    }

    @Test
    @DisplayName("스터디 다시 만들기")
    @EnabledIfEnvironmentVariable(named = "TEST_ENV", matches = "LOCAL")
    void create_new_study_again() {
        System.out.println("create1");
    }

    // 모든 테스트의 시작 전 한번
    @BeforeAll // 반드시 static 사용해야함
    static void beforeAll() {
        System.out.println("before all");
    }

    // 모든 테스트 종료 후 한번
    @AfterAll // 반드시 static 사용해야함
    static void afterAll() {
        System.out.println("after all");
    }

    // 각 테스트 시작 전
    @BeforeEach
    void beforeEach() {
        System.out.println("Before Each");
    }

    // 각 테스트 종료 후
    @AfterEach
    void afterEach() {
        System.out.println("After Each");
    }


}