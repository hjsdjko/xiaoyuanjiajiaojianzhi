package com.entity.vo;

import com.entity.XuqiuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 家教需求
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-05-06
 */
@TableName("xuqiu")
public class XuqiuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 家教需求
     */

    @TableField(value = "xuqiu_name")
    private String xuqiuName;


    /**
     * 发布用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 家教类型
     */

    @TableField(value = "xuqiu_types")
    private Integer xuqiuTypes;


    /**
     * 图片
     */

    @TableField(value = "xuqiu_photo")
    private String xuqiuPhoto;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 详情信息
     */

    @TableField(value = "xuqiu_content")
    private String xuqiuContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：家教需求
	 */
    public String getXuqiuName() {
        return xuqiuName;
    }


    /**
	 * 获取：家教需求
	 */

    public void setXuqiuName(String xuqiuName) {
        this.xuqiuName = xuqiuName;
    }
    /**
	 * 设置：发布用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：发布用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：家教类型
	 */
    public Integer getXuqiuTypes() {
        return xuqiuTypes;
    }


    /**
	 * 获取：家教类型
	 */

    public void setXuqiuTypes(Integer xuqiuTypes) {
        this.xuqiuTypes = xuqiuTypes;
    }
    /**
	 * 设置：图片
	 */
    public String getXuqiuPhoto() {
        return xuqiuPhoto;
    }


    /**
	 * 获取：图片
	 */

    public void setXuqiuPhoto(String xuqiuPhoto) {
        this.xuqiuPhoto = xuqiuPhoto;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：详情信息
	 */
    public String getXuqiuContent() {
        return xuqiuContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setXuqiuContent(String xuqiuContent) {
        this.xuqiuContent = xuqiuContent;
    }
    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
