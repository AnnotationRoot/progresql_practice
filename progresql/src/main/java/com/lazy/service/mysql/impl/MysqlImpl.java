package com.lazy.service.mysql.impl;

import com.lazy.dao.PostgresqlDao;
import com.lazy.service.mysql.MysqlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by JSKJ on 2019/5/14.
 */
@Service
@Slf4j
public class MysqlImpl implements MysqlService {

    @Autowired
    private PostgresqlDao dao;

    public List selectAll() {
        return dao.selectAll();
    }
}
