package com.imooc.o2o.dao;



import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.PersonInfo;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.entity.ShopCategory;

public class ShopDaoTest extends BaseTest {

	@Autowired
	private ShopDao shopDao;
	
	@Test
	public void testInsertShop() {
		Shop shop = new Shop();
		Area area = new Area();
		PersonInfo owner = new PersonInfo();
		ShopCategory shopCategory = new ShopCategory();
		
		owner.setUserId(1L);
		area.setAreaId(7);
		shopCategory.setShopCategoryId(1L);
		shop.setArea(area);
		shop.setShopCategory(shopCategory);
		shop.setOwner(owner);
		shop.setShopName("test");
		shop.setShopImg("test");
		shop.setShopDesc("test");
		shop.setPhone("12546");
		shop.setShopAddr("廣州");
		shop.setPriority(1);
		shop.setEnableStatus(1);
		shop.setAdvice("审核中");
		shop.setCreateTime(new Date());
		//影响行数
		int effectNum = shopDao.insertShop(shop);
		assertEquals(1, effectNum);
	}
	
}
