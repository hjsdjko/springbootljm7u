package com.entity.view;

import com.entity.ZonghecepingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 综合测评
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-12 09:54:29
 */
@TableName("zongheceping")
public class ZonghecepingView  extends ZonghecepingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZonghecepingView(){
	}
 
 	public ZonghecepingView(ZonghecepingEntity zonghecepingEntity){
 	try {
			BeanUtils.copyProperties(this, zonghecepingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
