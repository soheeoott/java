package com.example.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// @FixMethodOrder(MethodSorters.DEFAULT) // 메소드 이름의 해시코드로 정렬 (기본값)
// @FixMethodOrder(MethodSorters.NAME_ASCENDING) // 메소드 이름으로 정렬 (JUnit5부터 없어짐)
// @FixMethodOrder(MethodSorters.JVM) // Reflection API의 get 메소드 호출 순서 (랜덤)
public class CallOrderTest {

	@Test
	public void testA() {
		System.out.println("A");
	}

	@Test
	public void testB() {
		System.out.println("B");
	}

	@Test
	public void testC() {
		System.out.println("C");
	}
}
