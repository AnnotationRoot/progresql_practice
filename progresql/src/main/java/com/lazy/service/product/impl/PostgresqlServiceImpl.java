package com.lazy.service.product.impl;

import com.lazy.dao.PostgresqlDao;
import com.lazy.service.product.PostgresqlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.DataSourceEnum;
import utils.DataSourceHolder;

import java.util.List;

/**
 * Created by JSKJ on 2019/5/10.
 */
@Service
@Slf4j
public class PostgresqlServiceImpl implements PostgresqlService {
    @Autowired
    private PostgresqlDao dao;


    public List selectAll() {

     //   DataSourceHolder.setDataSources(DataSourceEnum.DSMYSQL.getKey()); // 若需手动指定数据源用这个
        log.debug("PostgresqlDao=====dao=========="+dao);
        return dao.selectAll();
    }
}
