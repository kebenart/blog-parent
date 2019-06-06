package org.meiling.service;

import org.meiling.entity.Settings;
import org.meiling.entity.Total;

public interface SettingsService {
	//保存设置
	public void save(Settings settings);
	
	//统计该网站的各项参数
	public Total totalSurvey();
	
	public Settings findFirst();
}
