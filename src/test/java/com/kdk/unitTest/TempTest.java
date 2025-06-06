package com.kdk.unitTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kdk.app.temp.service.TempService;

/**
 * <pre>
 * -----------------------------------
 * 개정이력
 * -----------------------------------
 * 2024. 6. 8. 김대광	최초작성
 * </pre>
 *
 *
 * @author 김대광
 */
@SpringBootTest
class TempTest {

	@Autowired
	private TempService tempService;

	@Test
	void test() {
		System.out.println( tempService.selectCityAll() );
		assertTrue(true);
	}

}
