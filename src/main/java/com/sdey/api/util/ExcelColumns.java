package com.sdey.api.util;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExcelColumns {
	private static final Map<String, String> basic_columns = new LinkedHashMap<String, String>();
	static {
		basic_columns.put("username", "姓名");
		basic_columns.put("sexStr", "性别");//
		basic_columns.put("age", "年龄");
		basic_columns.put("birthday", "出生日期");
		basic_columns.put("idcardnum", "身份证号码");
		basic_columns.put("homeaddressXiangxi", "家庭住址");
		basic_columns.put("phone", "电话");
		basic_columns.put("xiyanstateStr", "是否吸烟");//
		basic_columns.put("xiyandaycount", "每天吸烟支数");
		basic_columns.put("xiyanyearcount", "吸烟年数");
		basic_columns.put("xiyanshi", "吸烟史-包/年（每天吸烟支数/20*吸烟年数）");
		basic_columns.put("jieyanstateStr", "是否已戒烟");//
		basic_columns.put("jieyanyears", "已戒烟年数");
		basic_columns.put("ershouyanStr", "是否接触二手烟");
		basic_columns.put("jiechuesyear", "接触年数");
		basic_columns.put("jiechuhuanjingStr", "接触环境");
		///////////////////////

		basic_columns.put("zhiyestateStr", "曾长期从事接触粉尘、石棉、化工等职业");
		basic_columns.put("zhiyems", "曾经职业");
		basic_columns.put("zhiyeyears", "任职年数");
		basic_columns.put("wrystateStr", "近10年居住环境周围500米是否有污染源（冶炼、化工、焦化等）");
		basic_columns.put("wryxiangxiStr", "近10年居住环境周围500米是否有污染源（冶炼、化工、焦化等）");
		basic_columns.put("wryjuzhuyears", "居住年数");
		/////
		basic_columns.put("chufangsateStr", "长期在厨房做饭");
		basic_columns.put("cfyyqkStr", "厨房油烟情况");
		///
		basic_columns.put("bingshistateStr", "慢性肺部疾病病史");
		basic_columns.put("bingshijbStr", "具体疾病");
		basic_columns.put("bingshijbqt", "其他");
		///
		basic_columns.put("aizhengStr", "曾被诊断过癌症");
		basic_columns.put("azjuti", "具体情况");
		/////
		basic_columns.put("jiazushiStr", "直系亲属（父母、子女、兄弟姐妹）是否有癌症病史");
		basic_columns.put("jzsjuti", "具体情况");
	}

	public static Map<String, String> getBasicColumns() {
		return basic_columns;
	}

}
