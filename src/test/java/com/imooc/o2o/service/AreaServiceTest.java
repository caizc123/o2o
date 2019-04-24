package com.imooc.o2o.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.dao.AreaDao;
import com.imooc.o2o.entity.Area;

public class AreaServiceTest extends BaseTest {

	@Autowired
	private AreaService areaService;
	
	@Test
	public void test02() {
		List<Area> areas = new ArrayList<Area>();
		areas = areaService.getAreaList();
		for (Area area : areas) {
			System.out.println(area);
		}
		
	}
	
}
