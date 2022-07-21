package me.jisu.javatest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName("스터디 만들기 ╯°□°）╯")
    @EnabledIfEnvironmentVariable(named = "TEST_ENV", matches = "LOCAL")
    void create_new_study() {
        String test_env = System.getenv("TEST_ENV");
        System.out.println("test_env = " + test_env);
        Assumptions.assumeTrue("LOCAL".equalsIgnoreCase(test_env));

        Assumptions.assumingThat("LOCAL".equalsIgnoreCase(test_env), () -> {
            System.out.println("loccal");
            Study actual = new Study(10);
            assertEquals(actual.getLimit(), 10);
        });

        Assumptions.assumingThat("TEST".equalsIgnoreCase(test_env), () -> {
            System.out.println("test");
            Study actual = new Study(10);
            assertEquals(actual.getLimit(), 10);
        });

        System.out.println("loccal");
        Study actual = new Study(10);
        assertEquals(actual.getLimit(), 10);
    }

    @DisplayName("스터디 만들기 \uD83D\uDe31")
    @Test
    @EnabledIfEnvironmentVariable(named = "TEST_ENV", matches = "local")
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