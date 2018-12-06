package org.hsiang.free.modular.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.hsiang.free.modular.model.TaskExecutorConfigs;
import org.hsiang.free.modular.model.TaskExecutorConfigsExample;

public interface TaskExecutorConfigsMapper {
    int countByExample(TaskExecutorConfigsExample example);

    int deleteByExample(TaskExecutorConfigsExample example);

    int insert(TaskExecutorConfigs record);

    int insertSelective(TaskExecutorConfigs record);

    List<TaskExecutorConfigs> selectByExample(TaskExecutorConfigsExample example);

    int updateByExampleSelective(@Param("record") TaskExecutorConfigs record, @Param("example") TaskExecutorConfigsExample example);

    int updateByExample(@Param("record") TaskExecutorConfigs record, @Param("example") TaskExecutorConfigsExample example);
}