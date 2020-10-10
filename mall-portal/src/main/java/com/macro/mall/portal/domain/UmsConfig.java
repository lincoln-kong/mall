package com.macro.mall.portal.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 品牌配置信息列表(UmsConfig)表实体类
 *
 * @author makejava
 * @since 2020-10-10 21:38:59
 */

public class UmsConfig implements Serializable {
    //品牌代码
    private String sudDomain;
    //配置标签
    private String key;
    //配置值
    private String value;
    //配置文字
    private String remark;
    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;


    public String getSudDomain() {
        return sudDomain;
    }

    public void setSudDomain(String sudDomain) {
        this.sudDomain = sudDomain;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

}
