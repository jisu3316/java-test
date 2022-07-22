package me.jisu.javatest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @FastTest
    @Test
    @DisplayName("스터디 만들기 ╯°□°）╯ fast")
    void create_new_study() {
        Study actual = new Study(10);
        assertEquals(actual.getLimit(), 10);
        assertThat(actual.getLimit()).isGreaterThan(0);
    }

    @SlowTest
    @DisplayName("스터디 만들기 \uD83D\uDe31 slow")
    @Test
    void create_new_study_again() {
        System.out.println("create1");
    }

    @DisplayName("테스트 반복")
    @RepeatedTest(value = 10, name = "{displayName}, {currentRepetition}/{totalRepetitions}")
    void repeatTest(RepetitionInfo repetitionInfo) {
        System.out.println("test" + repetitionInfo.getCurrentRepetition() + "/"+
                repetitionInfo.getTotalRepetitions());
    }

    @DisplayName("테스트 파라미너 넣기")
    @ParameterizedTest(name = "{index} {displayName} message={0}")
    @ValueSource(strings = {"날씨가", "많이", "더워지고", "있네요."})
    void parameterizeTest(String message) {
        System.out.println(message);
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