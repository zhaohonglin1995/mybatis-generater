package com.github.zhaohonglin1995.ssm.dal.mapper;

import com.github.zhaohonglin1995.ssm.dal.domain.WorkersInfo;
import java.util.List;

public interface WorkersInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkersInfo record);

    WorkersInfo selectByPrimaryKey(Integer id);

    List<WorkersInfo> selectAll();

    int updateByPrimaryKey(WorkersInfo record);
}