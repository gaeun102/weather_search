package com.example.weather.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.weather.dao.WeatherDAO;
import com.example.weather.model.weatherVO;

@Service
public class WeatherService implements InterWeatherService {
	 
	
	 
	 @Autowired
	 WeatherDAO  weatherDAO;
	 
	
	// 모든 날씨 보여주기 
	@Override
	public List<weatherVO> WeatherList() {
		List<weatherVO> WeatherList = weatherDAO.WeatherList();
		
		return WeatherList;
	}

	// 도시별 날씨 조회하기 
	@Override
	public List<weatherVO> getWeatherByCity(String city) {
		List<weatherVO> weatherByCity = weatherDAO.getWeatherByCity(city);
		return weatherByCity;
	}

	// 날짜별 날씨 조회하기 
	@Override
	public List<weatherVO> getWeatherByDay(String day) {
		List<weatherVO> weatherByDay = weatherDAO.getWeatherByDay(day);
		return weatherByDay;
	}

	


	

}
 