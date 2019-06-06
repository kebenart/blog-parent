package org.meiling.service;

import org.meiling.entity.Admin;

public interface AdminService {
	
	//登录
	public Admin login(Admin admin);
	
	//修改用户名
	public void reviseName(Admin admin);
	
	//修改密码
	public void revisePwd(Admin admin);

}
