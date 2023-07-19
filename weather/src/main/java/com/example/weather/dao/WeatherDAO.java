package com.example.weather.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.weather.model.weatherVO;

@Mapper
public interface WeatherDAO {

	// 모든 도시 날짜 날씨 조회
	public List<weatherVO> WeatherList();

	// 도시별 날씨 조회
	public List<weatherVO> getWeatherByCity(String city);

	// 날짜별 날씨 조회
	public List<weatherVO> getWeatherByDay(String day);
}
