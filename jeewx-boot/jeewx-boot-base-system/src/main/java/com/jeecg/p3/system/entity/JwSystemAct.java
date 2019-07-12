package com.jeecg.p3.system.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>平台活动表<br>
 * @author Alex
 * @since：2017年09月30日 10时05分08秒 星期六 
 * @version:1.0
 */
public class JwSystemAct implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	//update-begin--Author:zhangweijian  Date: 20180914 for：添加最大最小参与人数引用
	
	public Integer getJoinMinNum() {
		return joinMinNum;
	}
	public void setJoinMinNum(Integer joinMinNum) {
		this.joinMinNum = joinMinNum;
	}
	/**
	
		return joinMaxNum;
	}
	public void setJoinMaxNum(Integer joinMaxNum) {
		this.joinMaxNum = joinMaxNum;
	}
	/**
	//update-end--Author:zhangweijian  Date: 20180914 for：添加最大最小参与人数引用
	/**
	 *活动类型名称
	 */
	private String projectName;
	/**
	 *公众号名称
	 */
	private String jwName;
	//update-begin--Author:zhangweijian  Date: 20180910 for：添加是否为热门活动字段
	/**
	 *是否为热门活动：'0'：否，'1'是
	 */
	private String isHotAct;
	public String getIsHotAct() {
		return isHotAct;
	}
	public void setIsHotAct(String isHotAct) {
		this.isHotAct = isHotAct;
	}
	//update-end--Author:zhangweijian  Date: 20180910 for：添加是否为热门活动字段
	public String getId() {
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setJwName(String jwName) {
		this.jwName = jwName;
	}
	public String getJwName() {
		return jwName;
	}
	public void setCreateTimeFrom(Date createTimeFrom) {
		this.createTimeFrom = createTimeFrom;
	}
	public Date getCreateTimeFrom() {
		return createTimeFrom;
	}
	public void setCreateTimeTo(Date createTimeTo) {
		this.createTimeTo = createTimeTo;
	}
	public Date getCreateTimeTo() {
		return createTimeTo;
	}
}
