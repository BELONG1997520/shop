package com.shop.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.common.IpInterception;
import com.shop.pojo.TbItem;
import com.shop.service.ItemService;

@Controller
public class IndexController {

	private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

	@Autowired
	private ItemService itemService;

	@RequestMapping("/index")
	@ResponseBody
	public String showIndex(Model model) {
		LOGGER.info("123456");
		return "index";
	}

	@RequestMapping("/queryItemList")
	@ResponseBody
	public List<TbItem> queryItemList() {
		List<TbItem> itemList = itemService.queryItemList();
		LOGGER.info("123456");

		return itemList;
	}

	// 根据id查询
	@RequestMapping("/updateById")
	@ResponseBody
	public int updateById(@RequestParam long id, String name) {
		int count = itemService.updateByPrimaryKey(id, name);
		LOGGER.info("123456");
		return count;
	}

	@RequestMapping("/deleteItemById")
	@ResponseBody
	@IpInterception
	public int deleteItemById(@RequestParam long id) {
		int count = itemService.deleteItemById(id);
		LOGGER.info("123456");
		return count;
	}

	@RequestMapping("/addItem")
	@IpInterception()
	@ResponseBody
	public void addItem(@RequestBody TbItem tbItem) {
		itemService.addItem(tbItem);
		LOGGER.info("123456");
	}
}
