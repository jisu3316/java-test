package me.jisu.javatest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    void create_new_study() {
        Study study = new Study();
        assertNotNull(study);
        System.out.println("create");
    }

    @DisplayName("테스트 메소드 \uD83D\uDe31")
    @Test
    void create_new_study_again() {
        System.out.println("create1");
    }

    /**
     *@BeforeAll  : 전체 테스트가 실행 되기 전
     *@AfterAll   : 전체 테스트가 실행된 후
     *@BeforeEach : 각각의 테스트 시작 전
     *@AfterEach  : 각각의 테스트 시작 후
     * 테스트들이 실행 될때 한번만 실행 된다.
     * 반드시 static void로 작성하면된다.
     */

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("before Each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after Each");
    }
}