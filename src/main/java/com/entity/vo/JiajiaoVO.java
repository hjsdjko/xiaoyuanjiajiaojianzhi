package com.entity.vo;

import com.entity.JiajiaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 家教
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-05-06
 */
@TableName("jiajiao")
public class JiajiaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
