package com.sdey.api.vo;

import com.sdey.api.po.Lvfeibaseinfo;
import com.sdey.api.util.LocalDictionaryForExport;

public class LvfeibaseinfoExport extends Lvfeibaseinfo {
	private String sexStr;
	private String xiyanstateStr;
	private String jieyanstateStr;
	private String ershouyanStr;// 二手烟
	private String jiechuhuanjingStr;

	private String zhiyestateStr;// 曾长期从事接触粉尘、石棉、化工等职业

	private String wrystateStr;
	private String wryxiangxiStr;// 污染源
	private String chufangsateStr;
	private String cfyyqkStr;// 有眼情况
	private String bingshistateStr;
	private String bingshijbStr;// 具体疾病
	private String aizhengStr;
	private String jiazushiStr;

	public void initData() {
		this.sexStr = LocalDictionaryForExport.getSex().get(this.getSex());
		this.xiyanstateStr = LocalDictionaryForExport.getShifou().get(this.getXiyanstate());
		this.jieyanstateStr = LocalDictionaryForExport.getShifou().get(this.getJieyanstate());
		this.ershouyanStr = LocalDictionaryForExport.getShifou().get(this.getErshouyan());
		this.jiechuhuanjingStr = LocalDictionaryForExport.getJiechuhuanjing().get(this.getJiechuhuanjing());
		this.zhiyestateStr = LocalDictionaryForExport.getShifou().get(this.getZhiyestate());
		this.wrystateStr = LocalDictionaryForExport.getShifou().get(this.getWrystate());
		this.wryxiangxiStr = LocalDictionaryForExport.getWryxiangxi().get(this.getWryxiangxi());
		this.chufangsateStr = LocalDictionaryForExport.getShifou().get(this.getChufangsate());
		this.cfyyqkStr = LocalDictionaryForExport.getCfyyqk().get(this.getCfyyqk());
		this.bingshistateStr=LocalDictionaryForExport.getShifou().get(this.getBingshistate());
		this.bingshijbStr=LocalDictionaryForExport.getBingshijb().get(this.getBingshijb());
	    this.aizhengStr=LocalDictionaryForExport.getShifou().get(this.getAizheng());
	    this.jiazushiStr=LocalDictionaryForExport.getShifou().get(this.getJiazushi());
	}

	public String getSexStr() {
		return sexStr;
	}

	public void setSexStr(String sexStr) {
		this.sexStr = sexStr;
	}

	public String getXiyanstateStr() {
		return xiyanstateStr;
	}

	public void setXiyanstateStr(String xiyanstateStr) {
		this.xiyanstateStr = xiyanstateStr;
	}

	public String getJieyanstateStr() {
		return jieyanstateStr;
	}

	public void setJieyanstateStr(String jieyanstateStr) {
		this.jieyanstateStr = jieyanstateStr;
	}

	public String getErshouyanStr() {
		return ershouyanStr;
	}

	public void setErshouyanStr(String ershouyanStr) {
		this.ershouyanStr = ershouyanStr;
	}

	public String getJiechuhuanjingStr() {
		return jiechuhuanjingStr;
	}

	public void setJiechuhuanjingStr(String jiechuhuanjingStr) {
		this.jiechuhuanjingStr = jiechuhuanjingStr;
	}

	public String getWryxiangxiStr() {
		return wryxiangxiStr;
	}

	public void setWryxiangxiStr(String wryxiangxiStr) {
		this.wryxiangxiStr = wryxiangxiStr;
	}

	public String getZhiyestateStr() {
		return zhiyestateStr;
	}

	public void setZhiyestateStr(String zhiyestateStr) {
		this.zhiyestateStr = zhiyestateStr;
	}

	public String getWrystateStr() {
		return wrystateStr;
	}

	public void setWrystateStr(String wrystateStr) {
		this.wrystateStr = wrystateStr;
	}

	public String getChufangsateStr() {
		return chufangsateStr;
	}

	public void setChufangsateStr(String chufangsateStr) {
		this.chufangsateStr = chufangsateStr;
	}

	public String getCfyyqkStr() {
		return cfyyqkStr;
	}

	public void setCfyyqkStr(String cfyyqkStr) {
		this.cfyyqkStr = cfyyqkStr;
	}

	public String getBingshistateStr() {
		return bingshistateStr;
	}

	public void setBingshistateStr(String bingshistateStr) {
		this.bingshistateStr = bingshistateStr;
	}

	public String getBingshijbStr() {
		return bingshijbStr;
	}

	public void setBingshijbStr(String bingshijbStr) {
		this.bingshijbStr = bingshijbStr;
	}

	public String getAizhengStr() {
		return aizhengStr;
	}

	public void setAizhengStr(String aizhengStr) {
		this.aizhengStr = aizhengStr;
	}

	public String getJiazushiStr() {
		return jiazushiStr;
	}

	public void setJiazushiStr(String jiazushiStr) {
		this.jiazushiStr = jiazushiStr;
	}

}
