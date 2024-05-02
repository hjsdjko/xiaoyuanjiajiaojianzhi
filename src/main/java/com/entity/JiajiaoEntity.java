package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 家教
 *
 * @author 
 * @email
 * @date 2021-05-06
 */
@TableName("jiajiao")
public class JiajiaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiajiaoEntity() {

	}

	public JiajiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 家教姓名
     */
    @TableField(value = "jiajiao_name")

    private String jiajiaoName;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 家教类型
     */
    @TableField(value = "xuqiu_types")

    private Integer xuqiuTypes;


    /**
     * 身份证号
     */
    @TableField(value = "jiajiao_id_number")

    private String jiajiaoIdNumber;


    /**
     * 手机号
     */
    @TableField(value = "jiajiao_phone")

    private String jiajiaoPhone;


    /**
     * 邮箱
     */
    @TableField(value = "jiajiao_email")

    private String jiajiaoEmail;


    /**
     * 照片
     */
    @TableField(value = "jiajiao_photo")

    private String jiajiaoPhoto;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：家教姓名
	 */
    public String getJiajiaoName() {
        return jiajiaoName;
    }


    /**
	 * 获取：家教姓名
	 */

    public void setJiajiaoName(String jiajiaoName) {
        this.jiajiaoName = jiajiaoName;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
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
	 * 设置：身份证号
	 */
    public String getJiajiaoIdNumber() {
        return jiajiaoIdNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setJiajiaoIdNumber(String jiajiaoIdNumber) {
        this.jiajiaoIdNumber = jiajiaoIdNumber;
    }
    /**
	 * 设置：手机号
	 */
    public String getJiajiaoPhone() {
        return jiajiaoPhone;
    }


    /**
	 * 获取：手机号
	 */

    public void setJiajiaoPhone(String jiajiaoPhone) {
        this.jiajiaoPhone = jiajiaoPhone;
    }
    /**
	 * 设置：邮箱
	 */
    public String getJiajiaoEmail() {
        return jiajiaoEmail;
    }


    /**
	 * 获取：邮箱
	 */

    public void setJiajiaoEmail(String jiajiaoEmail) {
        this.jiajiaoEmail = jiajiaoEmail;
    }
    /**
	 * 设置：照片
	 */
    public String getJiajiaoPhoto() {
        return jiajiaoPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setJiajiaoPhoto(String jiajiaoPhoto) {
        this.jiajiaoPhoto = jiajiaoPhoto;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jiajiao{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", jiajiaoName=" + jiajiaoName +
            ", sexTypes=" + sexTypes +
            ", xuqiuTypes=" + xuqiuTypes +
            ", jiajiaoIdNumber=" + jiajiaoIdNumber +
            ", jiajiaoPhone=" + jiajiaoPhone +
            ", jiajiaoEmail=" + jiajiaoEmail +
            ", jiajiaoPhoto=" + jiajiaoPhoto +
            ", createTime=" + createTime +
        "}";
    }
}
