package me.jisu.javatest;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // 어디에쓸수있는지 메서드
@Retention(RetentionPolicy.RUNTIME) //런타임 까지 유지해야된다.
@Test
@Tag("fast")
public @interface FastTest {
}
