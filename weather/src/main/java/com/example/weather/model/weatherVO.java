package com.example.weather.model;

public class weatherVO {
	
	private int weather_info_num;
	private String day;
	private String city;    
	private String weather;
	private String avg_degree;
	
	public weatherVO(int weather_info_num, String day, String city, String weather, String avg_degree) {
		super();
		this.weather_info_num = weather_info_num;
		this.day = day;
		this.city = city;
		this.weather = weather;
		this.avg_degree = avg_degree;
	}
	public int getWeather_info_num() {
		return weather_info_num;
	}
	public void setWeather_info_num(int weather_info_num) {
		this.weather_info_num = weather_info_num;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getAvg_degree() {
		return avg_degree;
	}
	public void setAvg_degree(String avg_degree) {
		this.avg_degree = avg_degree;
	}
	
	
	
}
