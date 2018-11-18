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

	@Override
	public List<TbItem> queryItemList(long id) {
		 List<TbItem> contentList = itemMapper.queryItemList(id );
		 if(contentList == null || contentList.size() == 0){
			 return new ArrayList<>();
		 }
		 return contentList;
	}
	
	@Override
	public int updateByPrimaryKey(TbItem record) {
	int contentList=	itemMapper.updateByPrimaryKey(record);
		return contentList;
	}

	@Override
	public int deleteItemById(long id) {
		int  contentList=itemMapper.delete(id);
		return contentList;
	}

	@Override
	public int addItem(TbItem  record) {
		//创建一个pojo
		TbItem item=new TbItem();
		//item.setId(id);
		item.setId(0);
		item.setName("name");
		item.setTitleDesc("titleDesc");
		item.setCreated(new Date());
		item.setUpdated(new Date());
		//向表中插入数据
		int ItemList=itemMapper.insert(item);
		return  ItemList;
	}


}
