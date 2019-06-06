package org.meiling.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.meiling.entity.EssayLabelExample;
import org.meiling.entity.EssayLabelKey;

public interface EssayLabelMapper {
    int countByExample(EssayLabelExample example);

    int deleteByExample(EssayLabelExample example);

    int deleteByPrimaryKey(EssayLabelKey key);

    int insert(EssayLabelKey record);

    int insertSelective(EssayLabelKey record);

    List<EssayLabelKey> selectByExample(EssayLabelExample example);

    int updateByExampleSelective(@Param("record") EssayLabelKey record, @Param("example") EssayLabelExample example);

    int updateByExample(@Param("record") EssayLabelKey record, @Param("example") EssayLabelExample example);
}