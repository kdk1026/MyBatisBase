package com.kdk.unitTest;

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
public class TempTest {

	@Autowired
	private TempService tempService;

	@Test
	public void test() {
		System.out.println( tempService.selectCityAll() );
	}

}
