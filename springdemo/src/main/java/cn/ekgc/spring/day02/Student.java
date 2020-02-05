package cn.ekgc.spring.day02;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private Double score;
	private List<String> cityList;
	private Map<String, String> courseMap;
	
	public void show() {
		System.out.println("name = " + name);
		System.out.println("score = " + score);
		System.out.println(cityList);
		Set<String> keySet = courseMap.keySet();
		for (String key : keySet) {
			System.out.println(key + "\t" + courseMap.get(key));
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public List<String> getCityList() {
		return cityList;
	}
	public void setCityList(List<String> cityList) {
		this.cityList = cityList;
	}
	public Map<String, String> getCourseMap() {
		return courseMap;
	}
	public void setCourseMap(Map<String, String> courseMap) {
		this.courseMap = courseMap;
	}
}
