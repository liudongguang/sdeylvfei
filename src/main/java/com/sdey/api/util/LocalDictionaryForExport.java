package com.sdey.api.util;

import java.util.HashMap;
import java.util.Map;

public class LocalDictionaryForExport {
	private static final Map<Integer, String> shifou = new HashMap<Integer, String>();// 是否
	private static final Map<Integer, String> sex = new HashMap<Integer, String>();// 性别
	private static final Map<Integer, String> jiechuhuanjing = new HashMap<Integer, String>();// 接触环境
	private static final Map<Integer, String> wryxiangxi = new HashMap<Integer, String>();// 周围污染源为
	private static final Map<Integer, String> cfyyqk = new HashMap<Integer, String>();// 厨房油烟情况
	private static final Map<Integer, String> bingshijb = new HashMap<Integer, String>();// 具体疾病
	static {
		shifou.put(1, "是");
		shifou.put(2, "否");
		/////
		sex.put(1, "男");
		sex.put(2, "女");
		////
		jiechuhuanjing.put(1, "家");
		jiechuhuanjing.put(2, "公司");
		jiechuhuanjing.put(3, "公共场所");
		/////
		wryxiangxi.put(1, "冶炼");
		wryxiangxi.put(2, "化工");
		wryxiangxi.put(3, "焦化");
		wryxiangxi.put(4, "其他");
		/////
		cfyyqk.put(1, "很多");
		cfyyqk.put(2, "多");
		cfyyqk.put(3, "一般");
		cfyyqk.put(4, "无");
		///
		bingshijb.put(1,"哮喘");
		bingshijb.put(2,"慢性支气管炎");
		bingshijb.put(3,"肺气肿");
		bingshijb.put(4,"矽肺");
		bingshijb.put(5,"肺结核");
		bingshijb.put(6,"肺纤维化");
		bingshijb.put(7,"支气管扩张");
		bingshijb.put(8,"其他");
	}
	public static Map<Integer, String> getShifou() {
		return shifou;
	}
	public static Map<Integer, String> getSex() {
		return sex;
	}
	public static Map<Integer, String> getJiechuhuanjing() {
		return jiechuhuanjing;
	}
	public static Map<Integer, String> getWryxiangxi() {
		return wryxiangxi;
	}
	public static Map<Integer, String> getCfyyqk() {
		return cfyyqk;
	}
	public static Map<Integer, String> getBingshijb() {
		return bingshijb;
	}
	
}
