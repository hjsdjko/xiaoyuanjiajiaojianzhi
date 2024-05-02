package com.entity.view;

import com.entity.JiajiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 家教
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-05-06
 */
@TableName("jiajiao")
public class JiajiaoView extends JiajiaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 性别的值
		*/
		private String sexValue;
		/**
		* 家教类型的值
		*/
		private String xuqiuValue;



	public JiajiaoView() {

	}

	public JiajiaoView(JiajiaoEntity jiajiaoEntity) {
		try {
			BeanUtils.copyProperties(this, jiajiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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











}
