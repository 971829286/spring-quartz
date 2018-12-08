package org.hsiang.free.config.datasource;

/**
 * @ClassName DatabaseContextHolder
 * @Description 构建一个DatabaseType容器，并提供了向其中设置和获取DatabaseType的方法
 * @Author hsiangcn@sina.com
 * @Date 2018/12/7 13:23
 * @Version 1.0
 */
public class DatabaseContextHolder {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setDatabaseType(String type){
        contextHolder.set(type);
    }

    public static String getDatabaseType(){
        return contextHolder.get();
    }

    /**
     * 清除数据源
     */
    public static void clearDataSource() {
        contextHolder.remove();
    }
}