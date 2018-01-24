package com.sdey.impl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdey.api.po.HatArea;
import com.sdey.api.po.HatCity;
import com.sdey.api.po.HatProvince;
import com.sdey.api.service.AreaService;
import com.sdey.impl.mapper.HatAreaMapper;
import com.sdey.impl.mapper.HatCityMapper;
import com.sdey.impl.mapper.HatProvinceMapper;

@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	private HatProvinceMapper hatProvinceDao;
	@Autowired
	private HatCityMapper hatCityDao;
	@Autowired
	private HatAreaMapper hatAreaDao;

	@Override
	public List<HatProvince> getAllProvinces() {
		return hatProvinceDao.getAllProvinces();
	}

	@Override
	public List<HatCity> getCityByProvinceID(String provinceID) {
		return hatCityDao.getCityByProvinceID(provinceID);
	}

	@Override
	public List<HatArea> getAreasByCityID(String cityID) {
		return hatAreaDao.getAreasByCityID(cityID);
	}

}
