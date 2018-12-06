package org.hsiang.free.modular.model;

import java.io.Serializable;
import java.util.Date;

public class TaskExecutorConfigs implements Serializable {
    private Long id;

    private String cron;

    private String jobMethod;

    private String project;

    private String describe;

    private String lazyLoad;

    private Long lazyTime;

    private Integer executeNumber;

    private Date executeTime;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron == null ? null : cron.trim();
    }

    public String getJobMethod() {
        return jobMethod;
    }

    public void setJobMethod(String jobMethod) {
        this.jobMethod = jobMethod == null ? null : jobMethod.trim();
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public String getLazyLoad() {
        return lazyLoad;
    }

    public void setLazyLoad(String lazyLoad) {
        this.lazyLoad = lazyLoad == null ? null : lazyLoad.trim();
    }

    public Long getLazyTime() {
        return lazyTime;
    }

    public void setLazyTime(Long lazyTime) {
        this.lazyTime = lazyTime;
    }

    public Integer getExecuteNumber() {
        return executeNumber;
    }

    public void setExecuteNumber(Integer executeNumber) {
        this.executeNumber = executeNumber;
    }

    public Date getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Date executeTime) {
        this.executeTime = executeTime;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cron=").append(cron);
        sb.append(", jobMethod=").append(jobMethod);
        sb.append(", project=").append(project);
        sb.append(", describe=").append(describe);
        sb.append(", lazyLoad=").append(lazyLoad);
        sb.append(", lazyTime=").append(lazyTime);
        sb.append(", executeNumber=").append(executeNumber);
        sb.append(", executeTime=").append(executeTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}