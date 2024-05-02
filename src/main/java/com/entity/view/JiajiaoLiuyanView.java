package com.entity.view;

import com.entity.JiajiaoLiuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 家教评价
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-05-06
 */
@TableName("jiajiao_liuyan")
public class JiajiaoLiuyanView extends JiajiaoLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 jiajiao
			/**
			* 家教姓名
			*/
			private String jiajiaoName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 家教类型
			*/
			private Integer xuqiuTypes;
				/**
				* 家教类型的值
				*/
				private String xuqiuValue;
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

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public JiajiaoLiuyanView() {

	}

	public JiajiaoLiuyanView(JiajiaoLiuyanEntity jiajiaoLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, jiajiaoLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}










				//级联表的get和set jiajiao
					/**
					* 获取： 家教姓名
					*/
					public String getJiajiaoName() {
						return jiajiaoName;
					}
					/**
					* 设置： 家教姓名
					*/
					public void setJiajiaoName(String jiajiaoName) {
						this.jiajiaoName = jiajiaoName;
					}
					/**
					* 获取： 家教类型
					*/
					public Integer getXuqiuTypes() {
						return xuqiuTypes;
					}
					/**
					* 设置： 家教类型
					*/
					public void setXuqiuTypes(Integer xuqiuTypes) {
						this.xuqiuTypes = xuqiuTypes;
					}


						/**
						* 获取： 家教类型的值
						*/
						public String getXuqiuValue() {
							return xuqiuValue;
						}
						/**
						* 设置： 家教类型的值
						*/
						public void setXuqiuValue(String xuqiuValue) {
							this.xuqiuValue = xuqiuValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getJiajiaoIdNumber() {
						return jiajiaoIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setJiajiaoIdNumber(String jiajiaoIdNumber) {
						this.jiajiaoIdNumber = jiajiaoIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getJiajiaoPhone() {
						return jiajiaoPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setJiajiaoPhone(String jiajiaoPhone) {
						this.jiajiaoPhone = jiajiaoPhone;
					}
					/**
					* 获取： 邮箱
					*/
					public String getJiajiaoEmail() {
						return jiajiaoEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setJiajiaoEmail(String jiajiaoEmail) {
						this.jiajiaoEmail = jiajiaoEmail;
					}
					/**
					* 获取： 照片
					*/
					public String getJiajiaoPhoto() {
						return jiajiaoPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setJiajiaoPhoto(String jiajiaoPhoto) {
						this.jiajiaoPhoto = jiajiaoPhoto;
					}



















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}



}
