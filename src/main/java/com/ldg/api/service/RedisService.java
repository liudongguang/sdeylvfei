package com.ldg.api.service;

public interface RedisService {
	/**
	 * 设置字符串的key与val
	 * 
	 * @param key
	 * @param val
	 */
	void setData(String key, String val);

	/**
	 * 
	 * @param key
	 * @param val
	 * @param milliseconds
	 *            有效时间
	 */
	void setDataByExpiration(String key, String val, Long milliseconds);

	/**
	 * 根据key获取数据
	 * 
	 * @param key
	 * @return
	 */
	String getDataByKey(String key);

	/**
	 * 根据key删除
	 * 
	 * @param key
	 * @return
	 */
	Long delDataByKey(String key);
}
