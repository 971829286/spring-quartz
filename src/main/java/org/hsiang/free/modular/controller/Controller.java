package org.hsiang.free.modular.controller;

import org.hsiang.free.modular.model.TaskExecutorConfigs;
import org.hsiang.free.modular.model.TaskExecutorConfigsExample;
import org.hsiang.free.modular.service.TaskExecutorConfigsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Controller
 * @Description TODO
 * @Author hsiangcn@sina.com
 * @Date 2018/12/4 13:52
 * @Version 1.0
 */
@RestController
@RequestMapping("/configs")
public class Controller {

    @Autowired(required = false)
    private TaskExecutorConfigsService taskExecutorConfigsService;

    @RequestMapping(value = "getConfigs", method = RequestMethod.GET)
    public String getConfig() {
        TaskExecutorConfigs taskExecutorConfigs = taskExecutorConfigsService.queryById(Long.valueOf(1));

        return taskExecutorConfigs.getCron() + "473025984738093";
    }
}
