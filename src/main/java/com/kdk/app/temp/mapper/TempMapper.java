package com.kdk.app.temp.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

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
@Mapper
public interface TempMapper {

	public String selectNow();

	public List<Map<String, Object>> selectCityAll();

}
