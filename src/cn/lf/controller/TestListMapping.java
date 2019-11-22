package cn.lf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.lf.pojo.ConvertVO;
import cn.lf.pojo.MapVo;
import cn.lf.pojo.Tb_Item;
import cn.lf.pojo.TestVO;

@Controller
public class TestListMapping {
	@RequestMapping("/listMapping")
	public String test1(Model model){
		TestVO testvo = new TestVO();
		List<Tb_Item> list = new ArrayList<>();
		Tb_Item item1 = new Tb_Item();
		item1.setTitle("liufan");
		item1.setBarcode("ffffffffff1");
		Tb_Item item2 = new Tb_Item();
		item2.setTitle("liukang");
		item2.setBarcode("kkkkkkkkkk1");
		Tb_Item item3 = new Tb_Item();
		item3.setTitle("liuping");
		item3.setBarcode("pppppppppp1");
		list.add(item1);
		list.add(item2);
		list.add(item3);
		model.addAttribute("list",list);
		return "index";
	}
	
	@RequestMapping("/edit")
	public void test2(TestVO testvo){
		System.out.println(1);
	}
	
	@RequestMapping("/listMapping1")
	public String test11(Model model){
		model.addAttribute("name","liufan");
		model.addAttribute("title","father");
		return "index1";
	}
	
	@RequestMapping("/edit1")
	public void test21(MapVo mapvo){
		System.out.println(1);
	}
	@RequestMapping("/convert")
	public void test211(ConvertVO vo){
		System.out.println("111");
	}
}
