package com.sdey.api.vo;

import java.util.Date;


public class PatientBasicInfo {
	private String yyIdentity;
	/**
	 * 
	 * database column patient_basic_info.id
	 *
	 * @mbggenerated
	 */
	private String id;

	/**
	 * ��Ŀ��� database column patient_basic_info.item_no
	 *
	 * @mbggenerated
	 */
	private String itemNo;

	/**
	 * �������� database column patient_basic_info.username
	 *
	 * @mbggenerated
	 */
	private String username;

	/**
	 * �Ա� 1�� 2 Ů database column patient_basic_info.sex
	 *
	 * @mbggenerated
	 */
	private String sex;

	/**
	 * ����� database column patient_basic_info.outpatient_no
	 *
	 * @mbggenerated
	 */
	private String outpatientNo;

	/**
	 * סԺ���� database column patient_basic_info.in_hospital_no
	 *
	 * @mbggenerated
	 */
	private String inHospitalNo;

	/**
	 * 
	 * database column patient_basic_info.birth_date
	 *
	 * @mbggenerated
	 */
	private Date birthDate;

	/**
	 * ���� database column patient_basic_info.age
	 *
	 * @mbggenerated
	 */
	private Integer age;

	/**
	 * ���֤�� database column patient_basic_info.id_number
	 *
	 * @mbggenerated
	 */
	private String idNumber;

	/**
	 * �������� database column patient_basic_info.first_diagnosis_date
	 *
	 * @mbggenerated
	 */
	private Date firstDiagnosisDate;

	/**
	 * ʡ�� database column patient_basic_info.province
	 *
	 * @mbggenerated
	 */
	private String province;

	/**
	 * ���� database column patient_basic_info.city
	 *
	 * @mbggenerated
	 */
	private String city;

	/**
	 * ������� database column patient_basic_info.fee_type
	 *
	 * @mbggenerated
	 */
	private String feeType;

	/**
	 * ����״�� database column patient_basic_info.marital_type
	 *
	 * @mbggenerated
	 */
	private String maritalType;

	/**
	 * �Ļ��̶� database column patient_basic_info.wenhua_chengdu
	 *
	 * @mbggenerated
	 */
	private String wenhuaChengdu;

	/**
	 * ְҵ database column patient_basic_info.professional
	 *
	 * @mbggenerated
	 */
	private String professional;

	/**
	 * ���� database column patient_basic_info.nation
	 *
	 * @mbggenerated
	 */
	private String nation;

	/**
	 * ��ַ database column patient_basic_info.addr
	 *
	 * @mbggenerated
	 */
	private String addr;

	/**
	 * �������� database column patient_basic_info.zip_code
	 *
	 * @mbggenerated
	 */
	private String zipCode;

	/**
	 * ��ͥ�绰 database column patient_basic_info.home_tel
	 *
	 * @mbggenerated
	 */
	private String homeTel;

	/**
	 * �ֻ�����1 database column patient_basic_info.tel_phone
	 *
	 * @mbggenerated
	 */
	private String telPhone;

	/**
	 * �Ƿ����� database column patient_basic_info.is_die
	 *
	 * @mbggenerated
	 */
	private String isDie;

	/**
	 * ����ԭ�� database column patient_basic_info.die_remark
	 *
	 * @mbggenerated
	 */
	private String dieRemark;

	/**
	 * ����ʱ�� database column patient_basic_info.die_time
	 *
	 * @mbggenerated
	 */
	private Date dieTime;

	/**
	 * ��������ԭ�� database column patient_basic_info.other_remark
	 *
	 * @mbggenerated
	 */
	private String otherRemark;

	/**
	 * ��ϵ������ database column patient_basic_info.contact_name
	 *
	 * @mbggenerated
	 */
	private String contactName;

	/**
	 * ��ϵ���뻼�߹�ϵ���� database column patient_basic_info.contact_type
	 *
	 * @mbggenerated
	 */
	private String contactType;

	/**
	 * ��ϵ�˵�ַ database column patient_basic_info.contact_addr
	 *
	 * @mbggenerated
	 */
	private String contactAddr;

	/**
	 * ��ϵ���ʱ� database column patient_basic_info.contact_zip_code
	 *
	 * @mbggenerated
	 */
	private String contactZipCode;

	/**
	 * ��ϵ�˵绰 database column patient_basic_info.contact_tel
	 *
	 * @mbggenerated
	 */
	private String contactTel;

	/**
	 * ��ϵ���ֻ� database column patient_basic_info.contact_phone
	 *
	 * @mbggenerated
	 */
	private String contactPhone;

	/**
	 * ���߷��� database column patient_basic_info.patient_item_no
	 *
	 * @mbggenerated
	 */
	private String patientItemNo;

	/**
	 * �Ƿ���� 1 �� 2�� database column patient_basic_info.is_follow
	 *
	 * @mbggenerated
	 */
	private String isFollow;

	/**
	 * �Ƿ���Ժ 1 �� 2�� database column patient_basic_info.is_outside_hospital
	 *
	 * @mbggenerated
	 */
	private String isOutsideHospital;

	/**
	 * ¼������ database column patient_basic_info.record_date
	 *
	 * @mbggenerated
	 */
	private Date recordDate = new Date();

	/**
	 * �Ƿ���Ч ��Ч����ɾ�� database column patient_basic_info.is_valid
	 *
	 * @mbggenerated
	 */
	private String isValid;

	/**
	 * . database column patient_basic_info.id
	 *
	 * @return the value of patient_basic_info.id
	 *
	 * @mbggenerated
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * database column patient_basic_info.id
	 *
	 * @param id
	 *            the value for patient_basic_info.id
	 *
	 * @mbggenerated
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * .��Ŀ��� database column patient_basic_info.item_no
	 *
	 * @return the value of patient_basic_info.item_no
	 *
	 * @mbggenerated
	 */
	public String getItemNo() {
		return itemNo;
	}

	/**
	 * ��Ŀ��� database column patient_basic_info.item_no
	 *
	 * @param itemNo
	 *            the value for patient_basic_info.item_no
	 *
	 * @mbggenerated
	 */
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo == null ? null : itemNo.trim();
	}

	/**
	 * .�������� database column patient_basic_info.username
	 *
	 * @return the value of patient_basic_info.username
	 *
	 * @mbggenerated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * �������� database column patient_basic_info.username
	 *
	 * @param username
	 *            the value for patient_basic_info.username
	 *
	 * @mbggenerated
	 */
	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	/**
	 * .�Ա� 1�� 2 Ů database column patient_basic_info.sex
	 *
	 * @return the value of patient_basic_info.sex
	 *
	 * @mbggenerated
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * �Ա� 1�� 2 Ů database column patient_basic_info.sex
	 *
	 * @param sex
	 *            the value for patient_basic_info.sex
	 *
	 * @mbggenerated
	 */
	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	/**
	 * .����� database column patient_basic_info.outpatient_no
	 *
	 * @return the value of patient_basic_info.outpatient_no
	 *
	 * @mbggenerated
	 */
	public String getOutpatientNo() {
		return outpatientNo;
	}

	/**
	 * ����� database column patient_basic_info.outpatient_no
	 *
	 * @param outpatientNo
	 *            the value for patient_basic_info.outpatient_no
	 *
	 * @mbggenerated
	 */
	public void setOutpatientNo(String outpatientNo) {
		this.outpatientNo = outpatientNo == null ? null : outpatientNo.trim();
	}

	/**
	 * .סԺ���� database column patient_basic_info.in_hospital_no
	 *
	 * @return the value of patient_basic_info.in_hospital_no
	 *
	 * @mbggenerated
	 */
	public String getInHospitalNo() {
		return inHospitalNo;
	}

	/**
	 * סԺ���� database column patient_basic_info.in_hospital_no
	 *
	 * @param inHospitalNo
	 *            the value for patient_basic_info.in_hospital_no
	 *
	 * @mbggenerated
	 */
	public void setInHospitalNo(String inHospitalNo) {
		this.inHospitalNo = inHospitalNo == null ? null : inHospitalNo.trim();
	}

	/**
	 * . database column patient_basic_info.birth_date
	 *
	 * @return the value of patient_basic_info.birth_date
	 *
	 * @mbggenerated
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * 
	 * database column patient_basic_info.birth_date
	 *
	 * @param birthDate
	 *            the value for patient_basic_info.birth_date
	 *
	 * @mbggenerated
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * .���� database column patient_basic_info.age
	 *
	 * @return the value of patient_basic_info.age
	 *
	 * @mbggenerated
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * ���� database column patient_basic_info.age
	 *
	 * @param age
	 *            the value for patient_basic_info.age
	 *
	 * @mbggenerated
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * .���֤�� database column patient_basic_info.id_number
	 *
	 * @return the value of patient_basic_info.id_number
	 *
	 * @mbggenerated
	 */
	public String getIdNumber() {
		return idNumber;
	}

	/**
	 * ���֤�� database column patient_basic_info.id_number
	 *
	 * @param idNumber
	 *            the value for patient_basic_info.id_number
	 *
	 * @mbggenerated
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber == null ? null : idNumber.trim();
	}

	/**
	 * .�������� database column patient_basic_info.first_diagnosis_date
	 *
	 * @return the value of patient_basic_info.first_diagnosis_date
	 *
	 * @mbggenerated
	 */
	public Date getFirstDiagnosisDate() {
		return firstDiagnosisDate;
	}

	/**
	 * �������� database column patient_basic_info.first_diagnosis_date
	 *
	 * @param firstDiagnosisDate
	 *            the value for patient_basic_info.first_diagnosis_date
	 *
	 * @mbggenerated
	 */
	public void setFirstDiagnosisDate(Date firstDiagnosisDate) {
		this.firstDiagnosisDate = firstDiagnosisDate;
	}

	/**
	 * .ʡ�� database column patient_basic_info.province
	 *
	 * @return the value of patient_basic_info.province
	 *
	 * @mbggenerated
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * ʡ�� database column patient_basic_info.province
	 *
	 * @param province
	 *            the value for patient_basic_info.province
	 *
	 * @mbggenerated
	 */
	public void setProvince(String province) {
		this.province = province == null ? null : province.trim();
	}

	/**
	 * .���� database column patient_basic_info.city
	 *
	 * @return the value of patient_basic_info.city
	 *
	 * @mbggenerated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * ���� database column patient_basic_info.city
	 *
	 * @param city
	 *            the value for patient_basic_info.city
	 *
	 * @mbggenerated
	 */
	public void setCity(String city) {
		this.city = city == null ? null : city.trim();
	}

	/**
	 * .������� database column patient_basic_info.fee_type
	 *
	 * @return the value of patient_basic_info.fee_type
	 *
	 * @mbggenerated
	 */
	public String getFeeType() {
		return feeType;
	}

	/**
	 * ������� database column patient_basic_info.fee_type
	 *
	 * @param feeType
	 *            the value for patient_basic_info.fee_type
	 *
	 * @mbggenerated
	 */
	public void setFeeType(String feeType) {
		this.feeType = feeType == null ? null : feeType.trim();
	}

	/**
	 * .����״�� database column patient_basic_info.marital_type
	 *
	 * @return the value of patient_basic_info.marital_type
	 *
	 * @mbggenerated
	 */
	public String getMaritalType() {
		return maritalType;
	}

	/**
	 * ����״�� database column patient_basic_info.marital_type
	 *
	 * @param maritalType
	 *            the value for patient_basic_info.marital_type
	 *
	 * @mbggenerated
	 */
	public void setMaritalType(String maritalType) {
		this.maritalType = maritalType == null ? null : maritalType.trim();
	}

	/**
	 * .�Ļ��̶� database column patient_basic_info.wenhua_chengdu
	 *
	 * @return the value of patient_basic_info.wenhua_chengdu
	 *
	 * @mbggenerated
	 */
	public String getWenhuaChengdu() {
		return wenhuaChengdu;
	}

	/**
	 * �Ļ��̶� database column patient_basic_info.wenhua_chengdu
	 *
	 * @param wenhuaChengdu
	 *            the value for patient_basic_info.wenhua_chengdu
	 *
	 * @mbggenerated
	 */
	public void setWenhuaChengdu(String wenhuaChengdu) {
		this.wenhuaChengdu = wenhuaChengdu == null ? null : wenhuaChengdu.trim();
	}

	/**
	 * .ְҵ database column patient_basic_info.professional
	 *
	 * @return the value of patient_basic_info.professional
	 *
	 * @mbggenerated
	 */
	public String getProfessional() {
		return professional;
	}

	/**
	 * ְҵ database column patient_basic_info.professional
	 *
	 * @param professional
	 *            the value for patient_basic_info.professional
	 *
	 * @mbggenerated
	 */
	public void setProfessional(String professional) {
		this.professional = professional == null ? null : professional.trim();
	}

	/**
	 * .���� database column patient_basic_info.nation
	 *
	 * @return the value of patient_basic_info.nation
	 *
	 * @mbggenerated
	 */
	public String getNation() {
		return nation;
	}

	/**
	 * ���� database column patient_basic_info.nation
	 *
	 * @param nation
	 *            the value for patient_basic_info.nation
	 *
	 * @mbggenerated
	 */
	public void setNation(String nation) {
		this.nation = nation == null ? null : nation.trim();
	}

	/**
	 * .��ַ database column patient_basic_info.addr
	 *
	 * @return the value of patient_basic_info.addr
	 *
	 * @mbggenerated
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * ��ַ database column patient_basic_info.addr
	 *
	 * @param addr
	 *            the value for patient_basic_info.addr
	 *
	 * @mbggenerated
	 */
	public void setAddr(String addr) {
		this.addr = addr == null ? null : addr.trim();
	}

	/**
	 * .�������� database column patient_basic_info.zip_code
	 *
	 * @return the value of patient_basic_info.zip_code
	 *
	 * @mbggenerated
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * �������� database column patient_basic_info.zip_code
	 *
	 * @param zipCode
	 *            the value for patient_basic_info.zip_code
	 *
	 * @mbggenerated
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode == null ? null : zipCode.trim();
	}

	/**
	 * .��ͥ�绰 database column patient_basic_info.home_tel
	 *
	 * @return the value of patient_basic_info.home_tel
	 *
	 * @mbggenerated
	 */
	public String getHomeTel() {
		return homeTel;
	}

	/**
	 * ��ͥ�绰 database column patient_basic_info.home_tel
	 *
	 * @param homeTel
	 *            the value for patient_basic_info.home_tel
	 *
	 * @mbggenerated
	 */
	public void setHomeTel(String homeTel) {
		this.homeTel = homeTel == null ? null : homeTel.trim();
	}

	/**
	 * .�ֻ�����1 database column patient_basic_info.tel_phone
	 *
	 * @return the value of patient_basic_info.tel_phone
	 *
	 * @mbggenerated
	 */
	public String getTelPhone() {
		return telPhone;
	}

	/**
	 * �ֻ�����1 database column patient_basic_info.tel_phone
	 *
	 * @param telPhone
	 *            the value for patient_basic_info.tel_phone
	 *
	 * @mbggenerated
	 */
	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone == null ? null : telPhone.trim();
	}

	/**
	 * .�Ƿ����� database column patient_basic_info.is_die
	 *
	 * @return the value of patient_basic_info.is_die
	 *
	 * @mbggenerated
	 */
	public String getIsDie() {
		return isDie;
	}

	/**
	 * �Ƿ����� database column patient_basic_info.is_die
	 *
	 * @param isDie
	 *            the value for patient_basic_info.is_die
	 *
	 * @mbggenerated
	 */
	public void setIsDie(String isDie) {
		this.isDie = isDie == null ? null : isDie.trim();
	}

	/**
	 * .����ԭ�� database column patient_basic_info.die_remark
	 *
	 * @return the value of patient_basic_info.die_remark
	 *
	 * @mbggenerated
	 */
	public String getDieRemark() {
		return dieRemark;
	}

	/**
	 * ����ԭ�� database column patient_basic_info.die_remark
	 *
	 * @param dieRemark
	 *            the value for patient_basic_info.die_remark
	 *
	 * @mbggenerated
	 */
	public void setDieRemark(String dieRemark) {
		this.dieRemark = dieRemark == null ? null : dieRemark.trim();
	}

	/**
	 * .����ʱ�� database column patient_basic_info.die_time
	 *
	 * @return the value of patient_basic_info.die_time
	 *
	 * @mbggenerated
	 */
	public Date getDieTime() {
		return dieTime;
	}

	/**
	 * ����ʱ�� database column patient_basic_info.die_time
	 *
	 * @param dieTime
	 *            the value for patient_basic_info.die_time
	 *
	 * @mbggenerated
	 */
	public void setDieTime(Date dieTime) {
		this.dieTime = dieTime;
	}

	/**
	 * .��������ԭ�� database column patient_basic_info.other_remark
	 *
	 * @return the value of patient_basic_info.other_remark
	 *
	 * @mbggenerated
	 */
	public String getOtherRemark() {
		return otherRemark;
	}

	/**
	 * ��������ԭ�� database column patient_basic_info.other_remark
	 *
	 * @param otherRemark
	 *            the value for patient_basic_info.other_remark
	 *
	 * @mbggenerated
	 */
	public void setOtherRemark(String otherRemark) {
		this.otherRemark = otherRemark == null ? null : otherRemark.trim();
	}

	/**
	 * .��ϵ������ database column patient_basic_info.contact_name
	 *
	 * @return the value of patient_basic_info.contact_name
	 *
	 * @mbggenerated
	 */
	public String getContactName() {
		return contactName;
	}

	/**
	 * ��ϵ������ database column patient_basic_info.contact_name
	 *
	 * @param contactName
	 *            the value for patient_basic_info.contact_name
	 *
	 * @mbggenerated
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName == null ? null : contactName.trim();
	}

	/**
	 * .��ϵ���뻼�߹�ϵ���� database column patient_basic_info.contact_type
	 *
	 * @return the value of patient_basic_info.contact_type
	 *
	 * @mbggenerated
	 */
	public String getContactType() {
		return contactType;
	}

	/**
	 * ��ϵ���뻼�߹�ϵ���� database column patient_basic_info.contact_type
	 *
	 * @param contactType
	 *            the value for patient_basic_info.contact_type
	 *
	 * @mbggenerated
	 */
	public void setContactType(String contactType) {
		this.contactType = contactType == null ? null : contactType.trim();
	}

	/**
	 * .��ϵ�˵�ַ database column patient_basic_info.contact_addr
	 *
	 * @return the value of patient_basic_info.contact_addr
	 *
	 * @mbggenerated
	 */
	public String getContactAddr() {
		return contactAddr;
	}

	/**
	 * ��ϵ�˵�ַ database column patient_basic_info.contact_addr
	 *
	 * @param contactAddr
	 *            the value for patient_basic_info.contact_addr
	 *
	 * @mbggenerated
	 */
	public void setContactAddr(String contactAddr) {
		this.contactAddr = contactAddr == null ? null : contactAddr.trim();
	}

	/**
	 * .��ϵ���ʱ� database column patient_basic_info.contact_zip_code
	 *
	 * @return the value of patient_basic_info.contact_zip_code
	 *
	 * @mbggenerated
	 */
	public String getContactZipCode() {
		return contactZipCode;
	}

	/**
	 * ��ϵ���ʱ� database column patient_basic_info.contact_zip_code
	 *
	 * @param contactZipCode
	 *            the value for patient_basic_info.contact_zip_code
	 *
	 * @mbggenerated
	 */
	public void setContactZipCode(String contactZipCode) {
		this.contactZipCode = contactZipCode == null ? null : contactZipCode.trim();
	}

	/**
	 * .��ϵ�˵绰 database column patient_basic_info.contact_tel
	 *
	 * @return the value of patient_basic_info.contact_tel
	 *
	 * @mbggenerated
	 */
	public String getContactTel() {
		return contactTel;
	}

	/**
	 * ��ϵ�˵绰 database column patient_basic_info.contact_tel
	 *
	 * @param contactTel
	 *            the value for patient_basic_info.contact_tel
	 *
	 * @mbggenerated
	 */
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel == null ? null : contactTel.trim();
	}

	/**
	 * .��ϵ���ֻ� database column patient_basic_info.contact_phone
	 *
	 * @return the value of patient_basic_info.contact_phone
	 *
	 * @mbggenerated
	 */
	public String getContactPhone() {
		return contactPhone;
	}

	/**
	 * ��ϵ���ֻ� database column patient_basic_info.contact_phone
	 *
	 * @param contactPhone
	 *            the value for patient_basic_info.contact_phone
	 *
	 * @mbggenerated
	 */
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone == null ? null : contactPhone.trim();
	}

	/**
	 * .���߷��� database column patient_basic_info.patient_item_no
	 *
	 * @return the value of patient_basic_info.patient_item_no
	 *
	 * @mbggenerated
	 */
	public String getPatientItemNo() {
		return patientItemNo;
	}

	/**
	 * ���߷��� database column patient_basic_info.patient_item_no
	 *
	 * @param patientItemNo
	 *            the value for patient_basic_info.patient_item_no
	 *
	 * @mbggenerated
	 */
	public void setPatientItemNo(String patientItemNo) {
		this.patientItemNo = patientItemNo == null ? null : patientItemNo.trim();
	}

	/**
	 * .�Ƿ���� 1 �� 2�� database column patient_basic_info.is_follow
	 *
	 * @return the value of patient_basic_info.is_follow
	 *
	 * @mbggenerated
	 */
	public String getIsFollow() {
		return isFollow;
	}

	/**
	 * �Ƿ���� 1 �� 2�� database column patient_basic_info.is_follow
	 *
	 * @param isFollow
	 *            the value for patient_basic_info.is_follow
	 *
	 * @mbggenerated
	 */
	public void setIsFollow(String isFollow) {
		this.isFollow = isFollow == null ? null : isFollow.trim();
	}

	/**
	 * .�Ƿ���Ժ 1 �� 2�� database column patient_basic_info.is_outside_hospital
	 *
	 * @return the value of patient_basic_info.is_outside_hospital
	 *
	 * @mbggenerated
	 */
	public String getIsOutsideHospital() {
		return isOutsideHospital;
	}

	/**
	 * �Ƿ���Ժ 1 �� 2�� database column patient_basic_info.is_outside_hospital
	 *
	 * @param isOutsideHospital
	 *            the value for patient_basic_info.is_outside_hospital
	 *
	 * @mbggenerated
	 */
	public void setIsOutsideHospital(String isOutsideHospital) {
		this.isOutsideHospital = isOutsideHospital == null ? null : isOutsideHospital.trim();
	}

	/**
	 * .¼������ database column patient_basic_info.record_date
	 *
	 * @return the value of patient_basic_info.record_date
	 *
	 * @mbggenerated
	 */
	public Date getRecordDate() {
		return recordDate;
	}

	/**
	 * ¼������ database column patient_basic_info.record_date
	 *
	 * @param recordDate
	 *            the value for patient_basic_info.record_date
	 *
	 * @mbggenerated
	 */
	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

	/**
	 * .�Ƿ���Ч ��Ч����ɾ�� database column patient_basic_info.is_valid
	 *
	 * @return the value of patient_basic_info.is_valid
	 *
	 * @mbggenerated
	 */
	public String getIsValid() {
		return isValid;
	}

	/**
	 * �Ƿ���Ч ��Ч����ɾ�� database column patient_basic_info.is_valid
	 *
	 * @param isValid
	 *            the value for patient_basic_info.is_valid
	 *
	 * @mbggenerated
	 */
	public void setIsValid(String isValid) {
		this.isValid = isValid == null ? null : isValid.trim();
	}

	public String getYyIdentity() {
		return yyIdentity;
	}

	public void setYyIdentity(String yyIdentity) {
		this.yyIdentity = yyIdentity;
	}

	@Override
	public String toString() {
		return "{\"id\":\"" + id + "\",\"itemNo\":\"" + itemNo + "\",\"username\":\"" + username + "\",\"sex\":\"" + sex
				+ "\",\"outpatientNo\":\"" + outpatientNo + "\",\"inHospitalNo\":\"" + inHospitalNo
				+ "\",\"birthDate\":\"" + birthDate + "\",\"age\":\"" + age + "\",\"idNumber\":\"" + idNumber
				+ "\",\"firstDiagnosisDate\":\"" + firstDiagnosisDate + "\",\"province\":\"" + province
				+ "\",\"city\":\"" + city + "\",\"feeType\":\"" + feeType + "\",\"maritalType\":\"" + maritalType
				+ "\",\"wenhuaChengdu\":\"" + wenhuaChengdu + "\",\"professional\":\"" + professional
				+ "\",\"nation\":\"" + nation + "\",\"addr\":\"" + addr + "\",\"zipCode\":\"" + zipCode
				+ "\",\"homeTel\":\"" + homeTel + "\",\"telPhone\":\"" + telPhone + "\",\"isDie\":\"" + isDie
				+ "\",\"dieRemark\":\"" + dieRemark + "\",\"dieTime\":\"" + dieTime + "\",\"otherRemark\":\""
				+ otherRemark + "\",\"contactName\":\"" + contactName + "\",\"contactType\":\"" + contactType
				+ "\",\"contactAddr\":\"" + contactAddr + "\",\"contactZipCode\":\"" + contactZipCode
				+ "\",\"contactTel\":\"" + contactTel + "\",\"contactPhone\":\"" + contactPhone
				+ "\",\"patientItemNo\":\"" + patientItemNo + "\",\"isFollow\":\"" + isFollow
				+ "\",\"isOutsideHospital\":\"" + isOutsideHospital + "\",\"recordDate\":\"" + recordDate
				+ "\",\"isValid\":\"" + isValid + "\"}";
	}


}