package com.entity.model;

import com.entity.XuqiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 家教需求
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-05-06
 */
public class XuqiuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 家教需求
     */
    private String xuqiuName;


    /**
     * 发布用户
     */
    private Integer yonghuId;


    /**
     * 家教类型
     */
    private Integer xuqiuTypes;


    /**
     * 图片
     */
    private String xuqiuPhoto;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 详情信息
     */
    private String xuqiuContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：家教需求
	 */
    public String getXuqiuName() {
        return xuqiuName;
    }


    /**
	 * 设置：家教需求
	 */
    public void setXuqiuName(String xuqiuName) {
        this.xuqiuName = xuqiuName;
    }
    /**
	 * 获取：发布用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：发布用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：家教类型
	 */
    public Integer getXuqiuTypes() {
        return xuqiuTypes;
    }


    /**
	 * 设置：家教类型
	 */
    public void setXuqiuTypes(Integer xuqiuTypes) {
        this.xuqiuTypes = xuqiuTypes;
    }
    /**
	 * 获取：图片
	 */
    public String getXuqiuPhoto() {
        return xuqiuPhoto;
    }


    /**
	 * 设置：图片
	 */
    public void setXuqiuPhoto(String xuqiuPhoto) {
        this.xuqiuPhoto = xuqiuPhoto;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：详情信息
	 */
    public String getXuqiuContent() {
        return xuqiuContent;
    }


    /**
	 * 设置：详情信息
	 */
    public void setXuqiuContent(String xuqiuContent) {
        this.xuqiuContent = xuqiuContent;
    }
    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
