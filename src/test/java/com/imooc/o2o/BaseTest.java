package com.imooc.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * 初始化整合spring和junit，junit启动时加载spring IOC容器
 * @author yct
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit配置文件所在的位置
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {

}
