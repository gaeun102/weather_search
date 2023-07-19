package com.example.weather.service;

import java.util.List;

import com.example.weather.model.weatherVO;

public interface InterWeatherService {
	// 모든 날씨 보여주기 
	List<weatherVO> WeatherList();

	// 도시별 날씨
	List<weatherVO> getWeatherByCity(String city);

	// 날짜별 날씨
	List<weatherVO> getWeatherByDay(String day);
	

}
