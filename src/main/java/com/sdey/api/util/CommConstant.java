package com.sdey.api.util;

public interface CommConstant {
	String USER_SESSION="userInfo";
	/**
	 * 成功
	 */
	int ERRCODE_SUCCESS = 0;
	/**
	 * 失败
	 */
	int ERRCODE_FAIL = 1;
	/**
	 * 成功msg
	 */
	String ERRCODE_SUCCESS_MSG = "ok";
	/**
	 * 请求错误
	 */
	int ERRCODE_REQUEST_ERR = 100;
	/**
	 * 登陆失效
	 */
	int ERRCODE_LOGIN_ERR = 101;
	/**
	 * 缺少参数
	 */
	int ERRCODE_PARAMS_ERR = 102;
	String ERRCODE_PARAMS_ERR_MSG = "缺少参数";
	/**
	 * 手机号错误
	 */
	int ERRCODE_PHONE_ERR = 103;
	String ERRCODE_PHONE_ERR_MSG = "错误手机号";
	/**
	 * 插入数据库错误
	 */
	public static final int ERRCODE_DB_INSERT_ERR = 104;
	public static final String ERRCODE_DB_INSERT_ERR_MSG = "插入信息失败";
	/**
	 * 修改数据库错误
	 */
	public static final int ERRCODE_DB_UPDATE_ERR = 105;
	public static final String ERRCODE_DB_UPDATE_ERR_MSG = "修改信息失败";
	/**
	 * 删除信息错误
	 */
	public static final int ERRCODE_DB_DELETE_ERR = 106;
	public static final String ERRCODE_DB_DELETE_ERR_MSG = "删除信息失败";
	/**
	 * 会话超时
	 */
	String ERRCODE_SESSION_TIMEOUT = "300";
	/**
	 * 服务器错误
	 */
	int ERRCODE_SERVER_ERR = 500;

	/**
	 * 日期格式化 yyyy-MM-dd HH:mm:ss
	 */
	public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_FORMAT_YYYYMMDD = "yyyy-MM-dd";
	public static final String DATE_FORMAT_YYYYMMDDEXCEL = "yyyyMMdd";
	public static final String DATE_FORMAT_ORDER = "yyyyMMddHHmmss";
	public static final String DATE_FORMATSSS = "yyyy-MM-dd HH:mm:ss SSS";
	public static final String DATE_FORMATSS = "yyyy-MM-dd HH:mm:ss";
}
