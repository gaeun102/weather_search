package com.example.weather.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.example.weather.model.weatherVO;
import com.example.weather.service.InterWeatherService;
import com.example.weather.service.WeatherService;


@RestController
public class WeatherController {
	
	 @Autowired
	 //WeatherDAO weatherDAO;
	 InterWeatherService weatherService;  
	 
	   
	 private Logger log = LoggerFactory.getLogger(getClass());
	 
	 // 모든 날씨 데이터 가져오기 
	 @GetMapping("/")
      public List<weatherVO> main()  {
    	  
		 List<weatherVO> List = weatherService.WeatherList(); 
		 log.info("main 실행"); // 로그 저장 

        return List;
	 }
      
     //도시별 
      @GetMapping("/weatherCity/{city}")
       public List<weatherVO> searchByCity(@PathVariable("city") String city)  {
    	   
    	  List<weatherVO> cityWeather = weatherService.getWeatherByCity(city);
    	  log.info(city + "searchByCity 실행");
    	  
         return cityWeather;
        
	 }
      
     // 날짜별
      @GetMapping("/weatherDay/{day}")
       public List<weatherVO> searchByDay(@PathVariable("day") String day)  {
    	   
    	   List<weatherVO> dayWeather = weatherService.getWeatherByDay(day);
    	   log.info("searchByDay 실행");
    	   
         return dayWeather;
        
	 }
      
}