package org.meiling.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.meiling.entity.Essay;
import org.meiling.entity.EssayExample;

public interface EssayMapper {
    int countByExample(EssayExample example);

    int deleteByExample(EssayExample example);

    int deleteByPrimaryKey(String eId);

    int insert(Essay record);

    int insertSelective(Essay record);

    List<Essay> selectByExampleWithBLOBs(EssayExample example);

    List<Essay> selectByExample(EssayExample example);

    Essay selectByPrimaryKey(String eId);

    int updateByExampleSelective(@Param("record") Essay record, @Param("example") EssayExample example);

    int updateByExampleWithBLOBs(@Param("record") Essay record, @Param("example") EssayExample example);

    int updateByExample(@Param("record") Essay record, @Param("example") EssayExample example);

    int updateByPrimaryKeySelective(Essay record);

    int updateByPrimaryKeyWithBLOBs(Essay record);

    int updateByPrimaryKey(Essay record);
}