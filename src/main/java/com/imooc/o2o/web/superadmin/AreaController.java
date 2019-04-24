package com.imooc.o2o.web.superadmin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imooc.o2o.entity.Area;
import com.imooc.o2o.service.AreaService;

@Controller
@RequestMapping("/superadmin")
public class AreaController {
	
	private final Logger logger = LoggerFactory.getLogger(AreaController.class);
	
	@Autowired
	private AreaService areaService;
	
	@RequestMapping(value="/listarea",method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> listArea() {
		logger.info("===start===");
		long startTime = System.currentTimeMillis();
		Map<String, Object> modelMap = new HashMap<String, Object>();//这里要保证key唯一，所以用了hashmap
		List<Area> aList = new ArrayList<Area>();
		
		try {
			aList = areaService.getAreaList();
			modelMap.put("rows", aList);//这里的key为rows（不一定是rows，可以为其他自己写的string），因为前段使用的框架easyUi的分页插件字段里是rows，为了方便统一，就用rows
			modelMap.put("total", aList.size());//这里aList.size()表示rows里面有多少个
			
		} catch (Exception e) {
			e.printStackTrace();
			modelMap.put("sussess", false);
			modelMap.put("errMsg", e.toString());
		}
		logger.error("testerror");
		long endTime = System.currentTimeMillis();
		logger.debug("costTime:[{}ms]",endTime-startTime);
		logger.info("===end===");
		return modelMap;
	}
	

}
