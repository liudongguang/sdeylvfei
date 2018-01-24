package com.sdey.api.util;

import java.util.Date;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

public class StringUtil {

	/**
	 * 获取uuid
	 * 
	 * @return
	 */
	public static String getUUID() {
		UUID u = UUID.randomUUID();
		return u.toString().replace("-", "");
	}

	/**
	 * 获取radis的key
	 * 
	 * @param methodName
	 * @param dynamicStr
	 * @return
	 */
	public static String getCacheKey(String methodName, String dynamicStr) {
		StringBuilder sb = new StringBuilder();
		return sb.append(methodName).append(dynamicStr).toString();
	}

	/**
	 * 生成订单号
	 * 
	 * @return
	 */
	public static String getOrderNumber() {
		StringBuilder sbd = new StringBuilder();
		sbd.append(DateFormatUtils.format(new Date(), CommConstant.DATE_FORMAT_ORDER))
				.append(RandomStringUtils.randomNumeric(3));
		return sbd.toString();
	}

	/**
	 * 格式化时间
	 * 
	 * @param date
	 * @return
	 */
	public final static String getFormatDate(Date date) {
		return date != null ? DateFormatUtils.format(date, CommConstant.DATE_FORMAT) : null;
	}

	/**
	 * 格式化时间
	 * 
	 * @param date
	 * @return
	 */
	public final static String getFormatDateYYYYMMDD(Date date) {
		return date != null ? DateFormatUtils.format(date, CommConstant.DATE_FORMAT_YYYYMMDD) : null;
	}

	/**
	 * 格式化时间
	 * 
	 * @param date
	 * @return
	 */
	public final static String getFormatDateYYYYMMDDForExcel(Date date) {
		return date != null ? DateFormatUtils.format(date, CommConstant.DATE_FORMAT_YYYYMMDDEXCEL) : null;
	}

	/**
	 * 格式化时间,带毫秒
	 * 
	 * @param date
	 * @return
	 */
	public final static String getFormatDateSSS(Date date) {
		return date != null ? DateFormatUtils.format(date, CommConstant.DATE_FORMATSSS) : null;
	}

	/**
	 * 格式化时间,到秒
	 * 
	 * @param date
	 * @return
	 */
	public final static String getFormatDateSS(Date date) {
		return date != null ? DateFormatUtils.format(date, CommConstant.DATE_FORMATSS) : null;
	}

	/**
	 * 手机号验证
	 * 
	 * @param str
	 * @return 验证通过返回true
	 */
	public final static boolean isMobile(String str) {
		Pattern p = null;
		Matcher m = null;
		boolean b = false;
		p = Pattern.compile("^[1][3,4,5,8][0-9]{9}$"); // 验证手机号
		m = p.matcher(str);
		b = m.matches();
		return b;
	}

	public final static String getExcelFileNameByDate(String fileName, Date start, Date end) {
		StringBuilder sbd = new StringBuilder();
		String[] fileNameArr = fileName.split("\\.");
		sbd.append(fileNameArr[0]).append(getFormatDateYYYYMMDDForExcel(start)).append("-")
				.append(getFormatDateYYYYMMDDForExcel(end)).append(".").append(fileNameArr[1]);
		return sbd.toString();
	}

	public static void main(String[] args) {
		String[] sa = "患者基础信息导出.xlsx".split("\\.");
		System.out.println(sa);
	}

}
