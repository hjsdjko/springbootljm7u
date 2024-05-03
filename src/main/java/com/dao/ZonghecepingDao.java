package com.dao;

import com.entity.ZonghecepingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZonghecepingVO;
import com.entity.view.ZonghecepingView;


/**
 * 综合测评
 * 
 * @author 
 * @email 
 * @date 2022-03-12 09:54:29
 */
public interface ZonghecepingDao extends BaseMapper<ZonghecepingEntity> {
	
	List<ZonghecepingVO> selectListVO(@Param("ew") Wrapper<ZonghecepingEntity> wrapper);
	
	ZonghecepingVO selectVO(@Param("ew") Wrapper<ZonghecepingEntity> wrapper);
	
	List<ZonghecepingView> selectListView(@Param("ew") Wrapper<ZonghecepingEntity> wrapper);

	List<ZonghecepingView> selectListView(Pagination page,@Param("ew") Wrapper<ZonghecepingEntity> wrapper);
	
	ZonghecepingView selectView(@Param("ew") Wrapper<ZonghecepingEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZonghecepingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZonghecepingEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZonghecepingEntity> wrapper);
}
