package com.sdey.api.service;

import java.util.List;

import com.sdey.api.po.HatArea;
import com.sdey.api.po.HatCity;
import com.sdey.api.po.HatProvince;

public interface AreaService {
	
	
	public List<HatProvince> getAllProvinces();

	public List<HatCity> getCityByProvinceID(String provinceID);

	public List<HatArea> getAreasByCityID(String cityID);

}
