package com.sdey.api.vo;

public class AddressInfo {
	private String provinceID;
	private String provinceName;
	private String cityID;
	private String cityName;
	private String areaID;
	private String areaName;

	public String getProvinceID() {
		return provinceID;
	}

	public void setProvinceID(String provinceID) {
		this.provinceID = provinceID;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityID() {
		return cityID;
	}

	public void setCityID(String cityID) {
		this.cityID = cityID;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getAreaID() {
		return areaID;
	}

	public void setAreaID(String areaID) {
		this.areaID = areaID;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	@Override
	public String toString() {
		return "AddressInfo [provinceID=" + provinceID + ", provinceName=" + provinceName + ", cityID=" + cityID
				+ ", cityName=" + cityName + ", areaID=" + areaID + ", areaName=" + areaName + "]";
	}

}
