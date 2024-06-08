package com.kdk.app.temp.mapper;

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

}
