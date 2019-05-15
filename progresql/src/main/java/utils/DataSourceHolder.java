package utils;

/**
 * Created by JSKJ on 2019/5/13.
 * DynamicDataSourceHolder用于持有当前线程中使用的数据源标识
 */
public class DataSourceHolder {

    private static final ThreadLocal<String> dataSources = new ThreadLocal<String>();

    public static void setDataSources(String dataSource) {
        dataSources.set(dataSource);
    }

    public static String getDataSources() {
        return dataSources.get();
    }

}
