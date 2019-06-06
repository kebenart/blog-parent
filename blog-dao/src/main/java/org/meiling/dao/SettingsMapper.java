package org.meiling.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.meiling.entity.Settings;
import org.meiling.entity.SettingsExample;

public interface SettingsMapper {
    int countByExample(SettingsExample example);

    int deleteByExample(SettingsExample example);

    int deleteByPrimaryKey(String sId);

    int insert(Settings record);

    int insertSelective(Settings record);

    List<Settings> selectByExampleWithBLOBs(SettingsExample example);

    List<Settings> selectByExample(SettingsExample example);

    Settings selectByPrimaryKey(String sId);

    int updateByExampleSelective(@Param("record") Settings record, @Param("example") SettingsExample example);

    int updateByExampleWithBLOBs(@Param("record") Settings record, @Param("example") SettingsExample example);

    int updateByExample(@Param("record") Settings record, @Param("example") SettingsExample example);

    int updateByPrimaryKeySelective(Settings record);

    int updateByPrimaryKeyWithBLOBs(Settings record);

    int updateByPrimaryKey(Settings record);
}