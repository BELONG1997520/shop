package com.shop.service.impl;

import com.shop.mapper.ContentMapper;
import com.shop.pojo.Content;
import com.shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ContentMapper contentMapper;
	@Override
	public List<Content> queryItemList() {
		 List<Content> contentList = contentMapper.queryItemList(null);
		 if(contentList == null || contentList.size() == 0){
			 return new ArrayList<>();
		 }
		 return contentList;
	}
	
	@Override
	public int updateByPrimaryKey() {
	int contentList=	contentMapper.updateByPrimaryKey(null);
		return contentList;
	}

	@Override
	public int deleteItemById() {
		int contentList=contentMapper.delete(null);
		return contentList;
	}

	@Override
	public int addItem() {
		int contentList=contentMapper.insert(null);
		return  contentList;
	}

}
