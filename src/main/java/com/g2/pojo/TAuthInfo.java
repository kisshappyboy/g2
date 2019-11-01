package com.g2.pojo;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-11-01
 */
public class TAuthInfo {
    private Integer id;

    /**
     * 资源ID
     */
    private String resouId;

    /**
     * 模块ID
     */
    private String modelId;

    /**
     * bean名称
     */
    private String bean;

    /**
     * 放法名
     */
    private String method;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResouId() {
        return resouId;
    }

    public void setResouId(String resouId) {
        this.resouId = resouId == null ? null : resouId.trim();
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId == null ? null : modelId.trim();
    }

    public String getBean() {
        return bean;
    }

    public void setBean(String bean) {
        this.bean = bean == null ? null : bean.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }
}