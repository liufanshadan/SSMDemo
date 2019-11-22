package cn.lf.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.lf.pojo.Tb_Item;
import cn.lf.service.TestService;

@Controller
public class TestController {
	@Autowired
	private TestService testService;
	@RequestMapping(value="/test.action")
	public  List<Tb_Item> test(){
		List<Tb_Item> list = testService.test();
		return list;
	}
	@RequestMapping(value="/test1.action")
	public Tb_Item test1(){
		Tb_Item  item = new Tb_Item();
		item.setTitle("jjk");
		return item;
	}
	@RequestMapping(value="upload")
	public void test1131(MultipartFile uploadFile) throws IllegalStateException, IOException{
		//取文件扩展名
		/*if(uploadFiles!=null&&uploadFiles.length>0){
			for (MultipartFile uploadFile : uploadFiles) {*/
				String originalFilename = uploadFile.getOriginalFilename();
				String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
				String contentType = uploadFile.getContentType();
				
				uploadFile.transferTo(new File("d://girl"+Math.random()+".jpg"));
	/*		}
		}*/
		
	}
}
