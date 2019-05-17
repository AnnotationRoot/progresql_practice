package com.lazy.controller;

import com.weather.GetCityList;
import com.weather.PureNetUtil;

import com.weather.WeatherReportByCity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
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
       return "aa";
    }

    public static void main(String[] args) throws UnsupportedEncodingException {

        String name = GetCityList.getIDBycityName("郑州");
    //    System.out.println("调用获取城市列表接口,返回所有数据==="+GetCityList.excute());
        System.out.println("");

        System.out.println("调用根据城市名/id查询天气===="+WeatherReportByCity.excute(name));
        System.out.println("");

    }




}
