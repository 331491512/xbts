/**
 * <b>项目名：</b>易随诊<br/>  
 * <b>包名：</b>package com.esuizhen.cloudservice.business.model.business;<br/>  
 * <b>文件名：</b>RegisteringDoctors.java<br/>  
 * <b>版本信息：</b><br/>  
 * <b>日期：</b>2015年12月12日下午4:22:13<br/>  
 * <b>Copyright (c)</b> 2015西部天使公司-版权所有<br/>  
 *   
 */
package com.esuizhen.cloudservice.business.model.business;

import java.util.Date;

/** 
* @ClassName: RegisteringDoctors.java
* @Description: 可预约挂号医生
* @author lichenghao
* @date 2015年12月12日 下午4:22:13  
*/
public class RegisteringDoctors {
	
	/**
	 * 可预约挂号编号
	 */
	private Long id;
	
	/**
	 * 医生编号
	 */
	private Long doctorId;
	
	/**
	 * 医生userId
	 */
	private Long doctorUserId;
	/**
	 * 医院编号
	 */
	private Long hospitalId;
	
	/**
	 * 可预约标识 0否 1是
	 */
	private Integer registeringFlag;
	
	/**
	 * 记录创建时间
	 */
	private Date createTime;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}
	public Long getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(Long hospitalId) {
		this.hospitalId = hospitalId;
	}
	public Integer getRegisteringFlag() {
		return registeringFlag;
	}
	public void setRegisteringFlag(Integer registeringFlag) {
		this.registeringFlag = registeringFlag;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Long getDoctorUserId() {
		return doctorUserId;
	}
	public void setDoctorUserId(Long doctorUserId) {
		this.doctorUserId = doctorUserId;
	}
	
}
