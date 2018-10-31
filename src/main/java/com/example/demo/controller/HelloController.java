package com.example.demo.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logging")
public class HelloController {
	@RequestMapping("/getBar")
	public Map getBar(){
		Map<String,Object> map = new LinkedHashMap<String,Object>();
		map.put("code", "200");
		map.put("msg", "请求成功");
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		for(int i = 1 ; i <= 5 ; i++){
			Map<String,Object> map_temp = new LinkedHashMap<String,Object>();
			map_temp.put("name", "61式");
			map_temp.put("type", "bar");
			map_temp.put("stack", "总量");
			Map<String,Object> map_normal = new LinkedHashMap<String,Object>();
			map_normal.put("show", true);
			map_normal.put("position", "insideRight");
			map_temp.put("label", map_normal);
			int[] a = {1,2,3,4,5,5};
			map_temp.put("data",a);
			list.add(map_temp);
		}
		map.put("data", list);
		return map;
	}
}
