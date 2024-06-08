package com.kdk.app.temp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	private TempMapper tempMapper;

	@Override
	public String selectNow() {
		return tempMapper.selectNow();
	}

}
