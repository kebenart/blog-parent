package org.meiling.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.meiling.dao.DiscussMapper;
import org.meiling.entity.Discuss;
import org.meiling.entity.DiscussExample;
import org.meiling.entity.DiscussExample.Criteria;
import org.meiling.service.DiscussService;
import org.meiling.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class DiscussServiceImpl implements DiscussService{
	@Autowired
	private DiscussMapper discussMapper;
	
	@Override
	public List<Discuss> findAllDiscuss(String essayId) {
		DiscussExample de = new DiscussExample();
		Criteria createCriteria = de.createCriteria();
		createCriteria.andEIdEqualTo(essayId);
		de.setOrderByClause("d_time ASC");
		List<Discuss> discusss = discussMapper.selectByExample(de);
		if (discusss!=null&&discusss.size()>0) {
			return discusss;
		}
		return null;
	}

	@Override
	public List<Discuss> findAll() {
		DiscussExample de = new DiscussExample();
		de.setOrderByClause("d_time  DESC");
		List<Discuss> discusss = discussMapper.selectByExample(de);
		if (discusss!=null&&discusss.size()>0) {
			return discusss;
		}
		return null;
	}



	@Override
	public void deleteDiscussById(String discussId) {
		discussMapper.deleteByPrimaryKey(discussId);
	}

	@Override
	public void replyDiscuss(Discuss discuss) {
		discussMapper.insert(discuss);
	}

	@Override
	public void addDiscuss(Discuss discuss) {
		discussMapper.insert(discuss);
	}

	@Override
	public List<Discuss> findTopNew() {
		PageHelper.startPage(1,5);
		DiscussExample de = new DiscussExample();
		de.setOrderByClause("d_time DESC");
		List<Discuss> selectByExample = discussMapper.selectByExample(de);
		return selectByExample;
	}
	
	@Override
	public PageResult findPaginationAll(int thisPage,int pageSize) {
		PageHelper.startPage(thisPage, pageSize);
		DiscussExample discussExample = new DiscussExample();
		List<Discuss> discusss = discussMapper.selectByExample(discussExample);
		PageResult result = new PageResult();
		result.setRows(discusss);
		int countByExample = discussMapper.countByExample(discussExample);
		result.setTotal(countByExample);
		result.setPage(thisPage);
		result.setPageSize(pageSize);
		result.setTotalPage(result.getTotal()%result.getPageSize() == 0 ? result.getTotal()/result.getPageSize():result.getTotal()/result.getPageSize()+1);
		return result;
	}

	@Override
	public Discuss findDiscussById(String discussId) {
		return discussMapper.selectByPrimaryKey(discussId);
	}

	@Override
	public List<Discuss> findDiscussByParentId(String pId) {
		DiscussExample example = new DiscussExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andDPidEqualTo(pId);
		List<Discuss> childDiscusss = discussMapper.selectByExample(example);
		if (childDiscusss!=null&&childDiscusss.size()>0) {
			return childDiscusss;
		}
		return null;
	}

	@Override
	public void deleteDiscusss(String essayId) {
		DiscussExample example = new DiscussExample();
		example.createCriteria().andEIdEqualTo(essayId);
		discussMapper.deleteByExample(example);
		
	}

}
