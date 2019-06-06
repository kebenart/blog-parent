package org.meiling.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.meiling.entity.Page;
import org.meiling.entity.PageExample;

public interface PageMapper {
    int countByExample(PageExample example);

    int deleteByExample(PageExample example);

    int deleteByPrimaryKey(String pId);

    int insert(Page record);

    int insertSelective(Page record);

    List<Page> selectByExampleWithBLOBs(PageExample example);

    List<Page> selectByExample(PageExample example);

    Page selectByPrimaryKey(String pId);

    int updateByExampleSelective(@Param("record") Page record, @Param("example") PageExample example);

    int updateByExampleWithBLOBs(@Param("record") Page record, @Param("example") PageExample example);

    int updateByExample(@Param("record") Page record, @Param("example") PageExample example);

    int updateByPrimaryKeySelective(Page record);

    int updateByPrimaryKeyWithBLOBs(Page record);

    int updateByPrimaryKey(Page record);
}