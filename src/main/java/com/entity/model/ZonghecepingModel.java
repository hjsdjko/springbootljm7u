package com.entity.model;

import com.entity.ZonghecepingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 综合测评
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-12 09:54:29
 */
public class ZonghecepingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 德育
	 */
	
	private Float deyu;
		
	/**
	 * 智育
	 */
	
	private Float zhiyu;
		
	/**
	 * 体育
	 */
	
	private Float tiyu;
		
	/**
	 * 综合成绩
	 */
	
	private Float zonghechengji;
		
	/**
	 * 录入时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date lurushijian;
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：德育
	 */
	 
	public void setDeyu(Float deyu) {
		this.deyu = deyu;
	}
	
	/**
	 * 获取：德育
	 */
	public Float getDeyu() {
		return deyu;
	}
				
	
	/**
	 * 设置：智育
	 */
	 
	public void setZhiyu(Float zhiyu) {
		this.zhiyu = zhiyu;
	}
	
	/**
	 * 获取：智育
	 */
	public Float getZhiyu() {
		return zhiyu;
	}
				
	
	/**
	 * 设置：体育
	 */
	 
	public void setTiyu(Float tiyu) {
		this.tiyu = tiyu;
	}
	
	/**
	 * 获取：体育
	 */
	public Float getTiyu() {
		return tiyu;
	}
				
	
	/**
	 * 设置：综合成绩
	 */
	 
	public void setZonghechengji(Float zonghechengji) {
		this.zonghechengji = zonghechengji;
	}
	
	/**
	 * 获取：综合成绩
	 */
	public Float getZonghechengji() {
		return zonghechengji;
	}
				
	
	/**
	 * 设置：录入时间
	 */
	 
	public void setLurushijian(Date lurushijian) {
		this.lurushijian = lurushijian;
	}
	
	/**
	 * 获取：录入时间
	 */
	public Date getLurushijian() {
		return lurushijian;
	}
			
}
