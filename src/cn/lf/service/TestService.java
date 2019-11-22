package cn.lf.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lf.dao.TestDao;
import cn.lf.pojo.TbContent;
import cn.lf.pojo.TbContentCategory;
import cn.lf.pojo.Tb_Item;

@Service
public class TestService {
	@Autowired
	private TestDao testDao;
	
	public List<Tb_Item> test(){
		return testDao.test();
	}
	public List<TbContent> mapInput(){
		Map<String,Object> map = new HashMap<String, Object>();
		List<Integer> list1 = new ArrayList<>();
		list1.add(28);
		list1.add(29);
		list1.add(32);
		map.put("id",list1);
		map.put("category_id",89);
		
		return testDao.mapInput(map);
	}
	
	public TbContent dulpSelect(){
		return testDao.dulpSelect(29);
	}
	public TbContentCategory OneToManey(){
		return testDao.OneToManey(89);
	}
}
