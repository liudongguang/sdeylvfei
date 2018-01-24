package com.sdey.impl.mapper;

import java.util.List;

import com.sdey.api.po.HatCity;

public interface HatCityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hat_city
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hat_city
     *
     * @mbg.generated
     */
    int insert(HatCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hat_city
     *
     * @mbg.generated
     */
    int insertSelective(HatCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hat_city
     *
     * @mbg.generated
     */
    HatCity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hat_city
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(HatCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hat_city
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HatCity record);

	List<HatCity> getCityByProvinceID(String provinceID);
}