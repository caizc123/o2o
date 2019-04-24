package com.imooc.o2o.entity;

import java.sql.Date;

public class Area {
	private Integer areaId;//在这里用引用类型是因为基础类型在没有被赋值的情况下会默认为0，我们是希望在默认的情况下空就是空，故用引用类型。
	private String areaName;
    private Integer priority;//权重
    private Date createTime;
    private Date lastEditTime;
    
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastEditTime() {
		return lastEditTime;
	}
	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
    
}
