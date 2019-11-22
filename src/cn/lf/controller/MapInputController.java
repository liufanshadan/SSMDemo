package cn.lf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lf.pojo.TbContent;
import cn.lf.pojo.TbContentCategory;
import cn.lf.service.TestService;

@Controller
public class MapInputController {
	@Autowired
	private TestService testService;

	@RequestMapping("mapInput")
	public void  mapInputTest(){
		List<TbContent> result = testService.mapInput();
		System.out.println("111");
	}
	@RequestMapping("dulpTest")
	public void dulpSelect(){
		TbContent tbContent = testService.dulpSelect();
		System.out.println("111");
	}
	@RequestMapping("OneToManey")
	public void OneToManey(){
		TbContentCategory tbContentCategory = testService.OneToManey();
		System.out.println("222");
	}
}
