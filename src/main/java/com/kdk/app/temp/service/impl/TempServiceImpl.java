package com.kdk.app.temp.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.kdk.app.temp.mapper.TempMapper;
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
@Service
public class TempServiceImpl implements TempService {

	private final TempMapper tempMapper;

	public TempServiceImpl(TempMapper tempMapper) {
		this.tempMapper = tempMapper;
	}

	@Override
	public String selectNow() {
		return tempMapper.selectNow();
	}

	@Override
	public List<Map<String, Object>> selectCityAll() {
		return tempMapper.selectCityAll();
	}

}
