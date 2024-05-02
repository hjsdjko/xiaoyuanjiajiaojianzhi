package com.entity.model;

import com.entity.JiajiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 家教
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-05-06
 */
public class JiajiaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 家教姓名
     */
    private String jiajiaoName;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 家教类型
     */
    private Integer xuqiuTypes;


    /**
     * 身份证号
     */
    private String jiajiaoIdNumber;


    /**
     * 手机号
     */
    private String jiajiaoPhone;


    /**
     * 邮箱
     */
    private String jiajiaoEmail;


    /**
     * 照片
     */
    private String jiajiaoPhoto;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：家教姓名
	 */
    public String getJiajiaoName() {
        return jiajiaoName;
    }


    /**
	 * 设置：家教姓名
	 */
    public void setJiajiaoName(String jiajiaoName) {
        this.jiajiaoName = jiajiaoName;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
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
	 * 获取：身份证号
	 */
    public String getJiajiaoIdNumber() {
        return jiajiaoIdNumber;
    }


    /**
	 * 设置：身份证号
	 */
    public void setJiajiaoIdNumber(String jiajiaoIdNumber) {
        this.jiajiaoIdNumber = jiajiaoIdNumber;
    }
    /**
	 * 获取：手机号
	 */
    public String getJiajiaoPhone() {
        return jiajiaoPhone;
    }


    /**
	 * 设置：手机号
	 */
    public void setJiajiaoPhone(String jiajiaoPhone) {
        this.jiajiaoPhone = jiajiaoPhone;
    }
    /**
	 * 获取：邮箱
	 */
    public String getJiajiaoEmail() {
        return jiajiaoEmail;
    }


    /**
	 * 设置：邮箱
	 */
    public void setJiajiaoEmail(String jiajiaoEmail) {
        this.jiajiaoEmail = jiajiaoEmail;
    }
    /**
	 * 获取：照片
	 */
    public String getJiajiaoPhoto() {
        return jiajiaoPhoto;
    }


    /**
	 * 设置：照片
	 */
    public void setJiajiaoPhoto(String jiajiaoPhoto) {
        this.jiajiaoPhoto = jiajiaoPhoto;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
