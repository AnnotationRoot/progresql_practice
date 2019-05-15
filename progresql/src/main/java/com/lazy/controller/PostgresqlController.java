package com.lazy.controller;

import com.lazy.service.mysql.MysqlService;
import com.lazy.service.product.PostgresqlService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import utils.BaseMsg;
import utils.SuccessMsg;

import java.util.List;

/**
 * Created by JSKJ on 2019/5/10.
 */
@Controller
@RequestMapping("/aa")
@Api(tags = "aa",description = "测试")
public class PostgresqlController {

    @Autowired
    private PostgresqlService service;

    @Autowired
    private MysqlService mysqlService;

    //  http://localhost:8081/swagger-ui.html#/
    @ResponseBody
    @RequestMapping(value = "api/Postgrestest",method = RequestMethod.GET)
    @ApiOperation(value = "测试列表")
 //   @ApiImplicitParam(paramType = "query", name = "", value = "", required = true, dataType = "")
    public BaseMsg readAll1(){

        List list = service.selectAll();
        return new SuccessMsg(list);
    }

    @ResponseBody
    @RequestMapping(value = "api/Mysqltest",method = RequestMethod.GET)
    @ApiOperation(value = "测试列表")
    //   @ApiImplicitParam(paramType = "query", name = "", value = "", required = true, dataType = "")
    public BaseMsg readAll2(){

        List list = mysqlService.selectAll();
        return new SuccessMsg(list);
    }

}
