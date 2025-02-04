package com.kdk.app.temp.service;

import java.util.List;
import java.util.Map;

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
public interface TempService {

	public String selectNow();

	public List<Map<String, Object>> selectCityAll();

}
