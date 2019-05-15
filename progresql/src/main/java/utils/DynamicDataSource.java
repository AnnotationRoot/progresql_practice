package utils;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by JSKJ on 2019/5/13.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    protected Object determineCurrentLookupKey() {
        return DataSourceHolder.getDataSources();
    }
}
