package cn.lf.dao;

import java.util.List;
import java.util.Map;

import cn.lf.pojo.TbContent;
import cn.lf.pojo.TbContentCategory;
import cn.lf.pojo.Tb_Item;

public interface TestDao {
	public List<Tb_Item> test();
	public List<TbContent> mapInput(Map<String,Object> map);
	public TbContent dulpSelect(int id);
	public TbContentCategory OneToManey(int id);
}
