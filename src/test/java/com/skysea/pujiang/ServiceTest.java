package com.skysea.pujiang;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.skysea.pujiang.domain.Boat;
import com.skysea.pujiang.service.BaseService;
import com.skysea.pujiang.service.BoatService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-context.xml")
public class ServiceTest {

	@Autowired  
    private BaseService<Boat> baseService;
	
	@Test
	public void test(){
		Boat entity = new Boat();
		entity.setBoatName("test11111111");
		entity.setBoatDesc("fffffffff");
		entity.setCreateTime(new Date());
		entity.setUpdateTime(new Date());
		this.baseService.insert(entity);
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
		BoatService boatsService = ctx.getBean(BoatService.class);
		Boat entity = new Boat();
		entity.setBoatName("test11111111");
		entity.setBoatDesc("fffffffff");
		entity.setCreateTime(new Date());
		entity.setUpdateTime(new Date());
		boatsService.insert(entity);
		while(true){
			
		}
	}
}
