package com.sdey.api.po;

public class HatArea {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hat_area.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hat_area.areaID
     *
     * @mbg.generated
     */
    private String areaid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hat_area.area
     *
     * @mbg.generated
     */
    private String area;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hat_area.father
     *
     * @mbg.generated
     */
    private String father;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hat_area.id
     *
     * @return the value of hat_area.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hat_area.id
     *
     * @param id the value for hat_area.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hat_area.areaID
     *
     * @return the value of hat_area.areaID
     *
     * @mbg.generated
     */
    public String getAreaid() {
        return areaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hat_area.areaID
     *
     * @param areaid the value for hat_area.areaID
     *
     * @mbg.generated
     */
    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hat_area.area
     *
     * @return the value of hat_area.area
     *
     * @mbg.generated
     */
    public String getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hat_area.area
     *
     * @param area the value for hat_area.area
     *
     * @mbg.generated
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hat_area.father
     *
     * @return the value of hat_area.father
     *
     * @mbg.generated
     */
    public String getFather() {
        return father;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hat_area.father
     *
     * @param father the value for hat_area.father
     *
     * @mbg.generated
     */
    public void setFather(String father) {
        this.father = father == null ? null : father.trim();
    }
}