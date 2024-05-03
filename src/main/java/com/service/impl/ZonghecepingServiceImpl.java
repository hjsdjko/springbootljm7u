package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZonghecepingDao;
import com.entity.ZonghecepingEntity;
import com.service.ZonghecepingService;
import com.entity.vo.ZonghecepingVO;
import com.entity.view.ZonghecepingView;

@Service("zonghecepingService")
public class ZonghecepingServiceImpl extends ServiceImpl<ZonghecepingDao, ZonghecepingEntity> implements ZonghecepingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZonghecepingEntity> page = this.selectPage(
                new Query<ZonghecepingEntity>(params).getPage(),
                new EntityWrapper<ZonghecepingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZonghecepingEntity> wrapper) {
		  Page<ZonghecepingView> page =new Query<ZonghecepingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZonghecepingVO> selectListVO(Wrapper<ZonghecepingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZonghecepingVO selectVO(Wrapper<ZonghecepingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZonghecepingView> selectListView(Wrapper<ZonghecepingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZonghecepingView selectView(Wrapper<ZonghecepingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ZonghecepingEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ZonghecepingEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ZonghecepingEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
