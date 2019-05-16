package com.lazy.controller;

import com.weather.PureNetUtil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by JSKJ on 2019/5/16.
 */
@Controller
public class WeatherTest {

    @RequestMapping(value = "api/weather",method = RequestMethod.GET)
    @ResponseBody
    public String readWeather(){
        Map requestMap = new HashMap();
        String cityname = "郑州";
        String dtype = "json";
        int format = 1;
        requestMap.put("cityname",cityname);
        requestMap.put("dtype",dtype);
        //   requestMap.put("format",format);
        String url = "http://v.juhe.cn/weather/index";
        String key = "6900383c3fc1fc52640330d89133fc58";
        requestMap.put("key",key);
        return PureNetUtil.post(url, requestMap);
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        Map requestMap = new HashMap();
        String name = URLEncoder.encode("郑州","utf-8");
        String dtype = "json";
        int format = 1;
        requestMap.put("cityname",name);
        requestMap.put("dtype",dtype);
        //   requestMap.put("format",format);
        String url = "http://v.juhe.cn/weather/index";
        String key = "6900383c3fc1fc52640330d89133fc58";
        requestMap.put("key",key);
        System.out.println(name);       //%E9%83%91%E5%B7%9E
        System.out.println(PureNetUtil.post(url, requestMap));
    }

}
