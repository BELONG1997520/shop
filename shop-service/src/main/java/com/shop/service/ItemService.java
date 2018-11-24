package com.shop.service;

import java.util.List;

import com.shop.pojo.TbItem;

public interface ItemService {
	/**
	 * 查询商品列表
	 * @return
	 */
	List<TbItem>  queryItemList();
	/**
	 * 更新商品列表信息
	 * @param record
	 * @return
	 */
	int updateByPrimaryKey(long id,String name);
	/**
	 * 商品的删除
	 * @return
	 */
	int deleteItemById(long id);
	/**
	 * 商品的增加
	 * @return
	 */
	int addItem(TbItem record);
	
}
