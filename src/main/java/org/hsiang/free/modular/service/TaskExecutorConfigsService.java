package org.hsiang.free.modular.service;

import org.hsiang.free.modular.model.TaskExecutorConfigs;
import org.hsiang.free.modular.model.TaskExecutorConfigsExample;

import java.util.List;

public interface TaskExecutorConfigsService {

    public List<TaskExecutorConfigs> queryByExample(TaskExecutorConfigsExample example);

    public TaskExecutorConfigsExample queryById(Integer id);

    public Boolean saveTaskExecutorConfigs(TaskExecutorConfigsExample example);

}
