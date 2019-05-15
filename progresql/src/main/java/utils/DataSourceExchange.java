package utils;

import org.aspectj.lang.JoinPoint;

/**
 * Created by JSKJ on 2019/5/13.
 */
public class DataSourceExchange {

    public void before(JoinPoint point) {

        //获取目标对象的类类型
        Class<?> aClass = point.getTarget().getClass();
        String c = aClass.getName();
        String[] ss = c.split("\\.");
        //获取包名用于区分不同数据源
        String packageName = ss[3];

        if ("product".equals(packageName)) {
            DataSourceHolder.setDataSources(DataSourceEnum.DSPG.getKey());
            System.out.println("数据源："+DataSourceEnum.DSPG.getKey());
        } else {
            DataSourceHolder.setDataSources(DataSourceEnum.DSMYSQL.getKey());
            System.out.println("数据源："+DataSourceEnum.DSMYSQL.getKey());
        }
    }

    /**
     * 执行后将数据源置为空
     */
    public void after() {
        DataSourceHolder.setDataSources(null);
    }

}
