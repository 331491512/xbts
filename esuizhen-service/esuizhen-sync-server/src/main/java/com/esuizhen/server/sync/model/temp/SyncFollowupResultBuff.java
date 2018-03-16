package com.esuizhen.server.sync.model.temp;

import java.io.Serializable;
import java.util.Date;

/**
 * 随访BUffbean
 * @author LHY
 */
public class SyncFollowupResultBuff implements Serializable { 
	
	private static final long serialVersionUID = 1L;
	private String followupResultBuffId;   
	private Integer tempId;   
	private String followupTaskId;   
	private String followupAssignId;   
	private Long patientId;   
	private String patientUuid;   
	private Integer hospitalId;   
	private Long operator;  
	private String operatorUuid;   
	private Integer followupResultValue;   
	private String relapseParts;  
	private Date relapseDate;   
	private String transferParts; 
	private Date transferDate;   
	private Date deathDate;   
	private Integer isInHospitalDeath;  
	private Integer isTumourDeath;  
	private String deathCause;   
	private String otherCause;   
	private Integer followupWay;  
	private Integer contentTemplateId;  
	private String followupResultPhone;   
	private Date followupTime;   
	private String phoneRecordUrl;  
	private String remark;   
	private String replyContent;   
	private String replyTime;   
	private Integer sourceFlag;   
	private String followupResultId;   
	private Date createTime;  
	private Date updateTime;  
	private Integer mergeFlag;   
	private Long mergeFrom;  
	private String mergeFromUuid;   
	private Long mergeTarget;   
	private String mergeTargetUuid;   
	private Date mergeTime;   
	private Long updateOperator;   
	private String updateOperatorUuid;   
	private String updateOperatorName;
	private String batchId;
	
	public String getFollowupResultBuffId() {
		return followupResultBuffId;
	}
	public void setFollowupResultBuffId(String followupResultBuffId) {
		this.followupResultBuffId = followupResultBuffId;
	}
	public Integer getTempId() {
		return tempId;
	}
	public void setTempId(Integer tempId) {
		this.tempId = tempId;
	}
	public String getFollowupTaskId() {
		return followupTaskId;
	}
	public void setFollowupTaskId(String followupTaskId) {
		this.followupTaskId = followupTaskId;
	}
	public String getFollowupAssignId() {
		return followupAssignId;
	}
	public void setFollowupAssignId(String followupAssignId) {
		this.followupAssignId = followupAssignId;
	}
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public String getPatientUuid() {
		return patientUuid;
	}
	public void setPatientUuid(String patientUuid) {
		this.patientUuid = patientUuid;
	}
	public Integer getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}
	public Long getOperator() {
		return operator;
	}
	public void setOperator(Long operator) {
		this.operator = operator;
	}
	public String getOperatorUuid() {
		return operatorUuid;
	}
	public void setOperatorUuid(String operatorUuid) {
		this.operatorUuid = operatorUuid;
	}
	public Integer getFollowupResultValue() {
		return followupResultValue;
	}
	public void setFollowupResultValue(Integer followupResultValue) {
		this.followupResultValue = followupResultValue;
	}
	public String getRelapseParts() {
		return relapseParts;
	}
	public void setRelapseParts(String relapseParts) {
		this.relapseParts = relapseParts;
	}
	public Date getRelapseDate() {
		return relapseDate;
	}
	public void setRelapseDate(Date relapseDate) {
		this.relapseDate = relapseDate;
	}
	public String getTransferParts() {
		return transferParts;
	}
	public void setTransferParts(String transferParts) {
		this.transferParts = transferParts;
	}
	public Date getTransferDate() {
		return transferDate;
	}
	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}
	public Date getDeathDate() {
		return deathDate;
	}
	public void setDeathDate(Date deathDate) {
		this.deathDate = deathDate;
	}
	public Integer getIsInHospitalDeath() {
		return isInHospitalDeath;
	}
	public void setIsInHospitalDeath(Integer isInHospitalDeath) {
		this.isInHospitalDeath = isInHospitalDeath;
	}
	public Integer getIsTumourDeath() {
		return isTumourDeath;
	}
	public void setIsTumourDeath(Integer isTumourDeath) {
		this.isTumourDeath = isTumourDeath;
	}
	public String getDeathCause() {
		return deathCause;
	}
	public void setDeathCause(String deathCause) {
		this.deathCause = deathCause;
	}
	public String getOtherCause() {
		return otherCause;
	}
	public void setOtherCause(String otherCause) {
		this.otherCause = otherCause;
	}
	
	public Integer getFollowupWay() {
		return followupWay;
	}
	public void setFollowupWay(Integer followupWay) {
		this.followupWay = followupWay;
	}
	public Integer getContentTemplateId() {
		return contentTemplateId;
	}
	public void setContentTemplateId(Integer contentTemplateId) {
		this.contentTemplateId = contentTemplateId;
	}
	public String getFollowupResultPhone() {
		return followupResultPhone;
	}
	public void setFollowupResultPhone(String followupResultPhone) {
		this.followupResultPhone = followupResultPhone;
	}
	public Date getFollowupTime() {
		return followupTime;
	}
	public void setFollowupTime(Date followupTime) {
		this.followupTime = followupTime;
	}
	public String getPhoneRecordUrl() {
		return phoneRecordUrl;
	}
	public void setPhoneRecordUrl(String phoneRecordUrl) {
		this.phoneRecordUrl = phoneRecordUrl;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public String getReplyTime() {
		return replyTime;
	}
	public void setReplyTime(String replyTime) {
		this.replyTime = replyTime;
	}
	public Integer getSourceFlag() {
		return sourceFlag;
	}
	public void setSourceFlag(Integer sourceFlag) {
		this.sourceFlag = sourceFlag;
	}
	public String getFollowupResultId() {
		return followupResultId;
	}
	public void setFollowupResultId(String followupResultId) {
		this.followupResultId = followupResultId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getMergeFlag() {
		return mergeFlag;
	}
	public void setMergeFlag(Integer mergeFlag) {
		this.mergeFlag = mergeFlag;
	}
	public Long getMergeFrom() {
		return mergeFrom;
	}
	public void setMergeFrom(Long mergeFrom) {
		this.mergeFrom = mergeFrom;
	}
	public String getMergeFromUuid() {
		return mergeFromUuid;
	}
	public void setMergeFromUuid(String mergeFromUuid) {
		this.mergeFromUuid = mergeFromUuid;
	}
	public Long getMergeTarget() {
		return mergeTarget;
	}
	public void setMergeTarget(Long mergeTarget) {
		this.mergeTarget = mergeTarget;
	}
	public String getMergeTargetUuid() {
		return mergeTargetUuid;
	}
	public void setMergeTargetUuid(String mergeTargetUuid) {
		this.mergeTargetUuid = mergeTargetUuid;
	}
	public Date getMergeTime() {
		return mergeTime;
	}
	public void setMergeTime(Date mergeTime) {
		this.mergeTime = mergeTime;
	}
	public Long getUpdateOperator() {
		return updateOperator;
	}
	public void setUpdateOperator(Long updateOperator) {
		this.updateOperator = updateOperator;
	}
	public String getUpdateOperatorUuid() {
		return updateOperatorUuid;
	}
	public void setUpdateOperatorUuid(String updateOperatorUuid) {
		this.updateOperatorUuid = updateOperatorUuid;
	}
	public String getUpdateOperatorName() {
		return updateOperatorName;
	}
	public void setUpdateOperatorName(String updateOperatorName) {
		this.updateOperatorName = updateOperatorName;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
}