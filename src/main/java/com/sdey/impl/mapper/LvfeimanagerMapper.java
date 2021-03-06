package com.sdey.impl.mapper;

import com.github.pagehelper.Page;
import com.sdey.api.po.Lvfeibaseinfo;
import com.sdey.api.po.Lvfeimanager;
import com.sdey.api.vo.UpdatePSDVO;

public interface LvfeimanagerMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table lvfeimanager
	 *
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer uid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table lvfeimanager
	 *
	 * @mbg.generated
	 */
	int insert(Lvfeimanager record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table lvfeimanager
	 *
	 * @mbg.generated
	 */
	int insertSelective(Lvfeimanager record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table lvfeimanager
	 *
	 * @mbg.generated
	 */
	Lvfeimanager selectByPrimaryKey(Integer uid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table lvfeimanager
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Lvfeimanager record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table lvfeimanager
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Lvfeimanager record);

	Lvfeimanager login(Lvfeimanager manager);

	int updatepsd(UpdatePSDVO upd);

	int selectBypsd(UpdatePSDVO upd);
}