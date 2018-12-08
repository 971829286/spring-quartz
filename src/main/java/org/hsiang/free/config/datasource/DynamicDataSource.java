package org.hsiang.free.config.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @ClassName DynamicDataSource
 * @Description  动态数据源（需要继承AbstractRoutingDataSource）
 * @Author hsiangcn@sina.com
 * @Date 2018/12/7 13:25
 * @Version 1.0
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DatabaseContextHolder.getDatabaseType();
    }

    /**
     * 设置数据源
     *
     * @param databaseType
     */
    public static void setDataSource(String databaseType) {
        DatabaseContextHolder.setDatabaseType(databaseType);
    }

    /**
     * 获取数据源
     *
     * @return
     */
    public static String getDataSource() {
        String dataSource = DatabaseContextHolder.getDatabaseType();
        // 如果没有指定数据源，使用默认数据源
        if (null == dataSource) {
            DynamicDataSource.setDataSource(DataSourceEnum.MASTER.getDefault());
        }
        return DatabaseContextHolder.getDatabaseType();
    }

    /**
     * 清除数据源
     */
    public static void clearDataSource() {
        DatabaseContextHolder.clearDataSource();
    }

}
