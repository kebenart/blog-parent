package org.meiling.service.impl;

import java.util.List;

import org.meiling.dao.AdminMapper;
import org.meiling.entity.Admin;
import org.meiling.entity.AdminExample;
import org.meiling.entity.AdminExample.Criteria;
import org.meiling.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminMapper adminMapper;

	@Override
	public Admin login(Admin admin) {
		AdminExample adminExample = new AdminExample();
		Criteria createCriteria = adminExample.createCriteria();
		createCriteria.andAccountEqualTo(admin.getAccount());
		createCriteria.andPasswordEqualTo(admin.getPassword());
		List<Admin> list = adminMapper.selectByExample(adminExample);
		if (list!=null&&list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public void reviseName(Admin admin) {
		adminMapper.updateByPrimaryKeySelective(admin);
	}

	@Override
	public void revisePwd(Admin admin) {
		adminMapper.updateByPrimaryKeySelective(admin);
	}

}
