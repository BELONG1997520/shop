package com.shop.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.Log4jNestedDiagnosticContextFilter;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.shop.mapper.TbItemMapper;
import com.shop.pojo.TbItem;
import com.shop.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;

	//查询
	@Override
	public List<TbItem> queryItemList(long id) {
		 List<TbItem> ItemList = itemMapper.queryItemList(id );
		 if(ItemList == null || ItemList.size() == 0){
			 return new ArrayList<>();
		 }
		 return ItemList;
	}
	
	//修改
	@Override
	public int updateByPrimaryKey(TbItem record) {
	int ItemList=	itemMapper.updateByPrimaryKey(record);
		return ItemList;
	}

	//删除
	@Override
	public int deleteItemById(long id) {
		int  ItemList=itemMapper.delete(id);
		return ItemList;
	}

	//添加
	@Override
	public int addItem(TbItem  record) {
		//创建一个pojo
		TbItem item=new TbItem();
		//item.setId(id);
		item.setId(0);
		item.setName("手机");
		item.setTitleDesc("性价比");
		item.setCreated(new Date());
		item.setUpdated(new Date());
		//向表中插入数据
		int ItemList=itemMapper.insert(item);
		return  ItemList;
	}


}
