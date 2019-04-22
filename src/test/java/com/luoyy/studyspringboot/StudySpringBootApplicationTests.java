package com.luoyy.studyspringboot;

import com.mysql.jdbc.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudySpringBootApplicationTests {

	@Test
	public void contextLoads() {
		String a = null;
		String b = "    ";
		System.out.println(StringUtils.isNullOrEmpty(b));
	}

}
