package me.jisu.javatest;

import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName("스터디 만들기 ╯°□°）╯")
    void create_new_study() {
        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            new Study(10);
            Thread.sleep(300);
        });

//        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Study(-10));
//        String message = exception.getMessage();
//        assertEquals("limit은 0보다 커야 한다.", exception.getMessage());
//        Study study = new Study(-10);
//        assertNotNull(study);
        //기대 값 왼쪽 나오는 값 오른 쪽이긴하나 상관없다.
//        assertEquals(StudyStatus.DRAFT, study.getStatus(), () -> "스터디를 처음 만들면 상태값이 DRAFT여야 한다.");
//        assertEquals(StudyStatus.DRAFT, study.getStatus(),
//                "스터디를 처음 만들면 상태값이 "+ StudyStatus.DRAFT + "여야 한다.");
//                이런상태면 실패를 하든 성공을 하든 DRAFT연산을 하기 때문에 실패했을때만 연산을 하도록 람다식을 적용한다
//        assertTrue(study.getLimit() > 0, "스터디 최대 참석 가능 인원은 0보다 커야한다.");

//        assertAll(
//                () -> assertNotNull(study),
//                () -> assertEquals(StudyStatus.DRAFT, study.getStatus(), () -> "스터디를 처음 만들면 상태값이 DRAFT여야 한다."),
//                () -> assertTrue(study.getLimit() > 0, "스터디 최대 참석 가능 인원은 0보다 커야한다.")
//        );
    }

    @DisplayName("스터디 만들기 \uD83D\uDe31")
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