package com.zbss.junit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author zhaobing
 * @Date 2017年4月12日 下午3:43:19
 */
public class TestUnit {
	
	@Before
	public void before(){
		System.out.println("before");
	}
	
	@After
	public void after(){
		System.out.println("after");
	}
	
	@Test
	public void test(){
		System.out.println("hello world");
	}
}
