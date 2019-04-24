package com.imooc.o2o.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.json.Json;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;

public class AreaDaoTest extends BaseTest{

	@Autowired
	private AreaDao areaDao;
	
	@Test
	public void testQueryArea() {
		List<Area> areas = new ArrayList<Area>();
		areas = areaDao.queryArea();
		for (Area area : areas) {
			System.out.println(area);
		}
	}

}
