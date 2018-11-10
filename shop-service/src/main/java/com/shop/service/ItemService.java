package com.shop.service;

import java.util.List;

import com.shop.pojo.Content;

public interface ItemService {
	/**
	 * 查询商品列表
	 * @return
	 */
	List<Content>  queryItemList();
	/**
	 * 更新商品列表信息
	 * @param record
	 * @return
	 */
	int updateByPrimaryKey();
	/**
	 * 商品的删除
	 * @return
	 */
	int deleteItemById();
	/**
	 * 商品的增加
	 * @return
	 */
	int addItem();
	
}
