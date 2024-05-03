package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZonghecepingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZonghecepingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZonghecepingView;


/**
 * 综合测评
 *
 * @author 
 * @email 
 * @date 2022-03-12 09:54:29
 */
public interface ZonghecepingService extends IService<ZonghecepingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZonghecepingVO> selectListVO(Wrapper<ZonghecepingEntity> wrapper);
   	
   	ZonghecepingVO selectVO(@Param("ew") Wrapper<ZonghecepingEntity> wrapper);
   	
   	List<ZonghecepingView> selectListView(Wrapper<ZonghecepingEntity> wrapper);
   	
   	ZonghecepingView selectView(@Param("ew") Wrapper<ZonghecepingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZonghecepingEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZonghecepingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZonghecepingEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZonghecepingEntity> wrapper);
}

