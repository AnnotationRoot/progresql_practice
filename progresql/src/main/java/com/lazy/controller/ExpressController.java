package com.lazy.controller;

import com.express.JuheDemo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import utils.BaseMsg;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JSKJ on 2019/5/17.
 */
@Controller
@Slf4j
@RequestMapping("/expres")
@Api(tags = "/expres",description = "物流查询")
public class ExpressController {

    @ResponseBody
    @ApiOperation(value = "查询所有的物流公司编码")
    @RequestMapping(value = "api/getNum",produces = "application/json; charset=utf-8",method = RequestMethod.GET)
    public String readAllExpressNum(){

        String s = JuheDemo.getRequest2();
        System.out.println("s========"+s);
        return s;
    }

    @ResponseBody
    @ApiOperation(value = "查询快递信息")
    @RequestMapping(value = "api/readExpress",produces = "application/json; charset=utf-8",method = RequestMethod.GET)
    @ApiImplicitParam(paramType = "query", name = "name,expressnum", value = "快递公司编号,快递单号", required = true, dataType = "String")
    public String readMyExpress(@RequestParam(value = "name", required = true) String name,
                                @RequestParam(value = "expressnum", required = true) String expressnum){

        String s = JuheDemo.getRequest1(name, expressnum);
        log.debug(s);
        return s;
    }

}
