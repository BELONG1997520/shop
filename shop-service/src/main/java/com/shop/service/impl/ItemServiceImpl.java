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

	// 查询
	@Override
	public List<TbItem> queryItemList() {
		List<TbItem> ItemList = itemMapper.queryItemList();
		if (ItemList == null || ItemList.size() == 0) {
			return new ArrayList<>();
		}
		return ItemList;
	}

	// 修改
	@Override
	public int updateByPrimaryKey(long id, String name) {
		TbItem item = new TbItem();
		item.setId(id);
		item.setName(name);

		// ItemList命名不规范
		int itemCount = itemMapper.updateByPrimaryKey(item);
		return itemCount;
	}

	// 删除
	@Override
	public int deleteItemById(long id) {
		int ItemList = itemMapper.delete(id);
		return ItemList;
	}

	// 添加
	@Override
	public int addItem(TbItem item) {
		int count = itemMapper.insert(item);
		return count;
	}

}
