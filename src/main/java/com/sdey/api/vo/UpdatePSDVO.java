package com.sdey.api.vo;

public class UpdatePSDVO {
	private String oldPSD;
	private String newPSD;
	private Integer managerID;

	public String getOldPSD() {
		return oldPSD;
	}

	public void setOldPSD(String oldPSD) {
		this.oldPSD = oldPSD;
	}

	public String getNewPSD() {
		return newPSD;
	}

	public void setNewPSD(String newPSD) {
		this.newPSD = newPSD;
	}

	public Integer getManagerID() {
		return managerID;
	}

	public void setManagerID(Integer managerID) {
		this.managerID = managerID;
	}

}
