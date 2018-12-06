package org.hsiang.free.modular.service.impl;

import org.hsiang.free.modular.dao.TaskExecutorConfigsMapper;
import org.hsiang.free.modular.model.TaskExecutorConfigs;
import org.hsiang.free.modular.model.TaskExecutorConfigsExample;
import org.hsiang.free.modular.service.TaskExecutorConfigsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName TaskExecutorConfigsServerImpl
 * @Description TODO
 * @Author hsiangcn@sina.com
 * @Date 2018/12/6 15:14
 * @Version 1.0
 */
@Service
public class TaskExecutorConfigsServiceImpl implements TaskExecutorConfigsService {

    private static final Logger logger = LoggerFactory.getLogger(TaskExecutorConfigsServiceImpl.class);

    @Autowired(required = false)
    private TaskExecutorConfigsMapper taskExecutorConfigsMapper;

    @Override
    public List<TaskExecutorConfigs> queryByExample(TaskExecutorConfigsExample example) {
        return null;
    }

    @Override
    public TaskExecutorConfigsExample queryById(Integer id) {
        return null;
    }

    @Override
    public Boolean saveTaskExecutorConfigs(TaskExecutorConfigsExample example) {
        return null;
    }
}
