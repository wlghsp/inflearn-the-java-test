package me.wlghsp.inflearnthejavatest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName("스터디 만들기")
    void create_new_study() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println("create");
    }

    @Test
    @DisplayName("스터디 다시 만들기")
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