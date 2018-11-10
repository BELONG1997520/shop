package com.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.common.MyTag;
import com.shop.pojo.Content;
import com.shop.service.ItemService;

@Controller
public class IndexController {
    @Autowired
    private ItemService itemServcie;
    
	@RequestMapping("/index")
	public String showIndex(Model model){
		System.out.println("123456");
	return "index";
	}
	 
	@RequestMapping("/queryItemList")
	public String queryItemList(){
		System.out.println("1234567");
		List<Content> itemList=itemServcie.queryItemList();
		System.out.println("123456");
		return null;
	}
	
	@RequestMapping("/updateByPrimaryKeyt")
	@MyTag()
	public String updateByPrimaryKeyt(){
		int itemList=itemServcie.updateByPrimaryKey();
		System.out.println("123456");
		return null;
	}
	@RequestMapping("/deleteItemById")
	@MyTag()
	public String deleteItemById(){
		int  itemList=itemServcie.deleteItemById();
		System.out.println("123456");
		return null;
	}
	@RequestMapping("/addItem")
	@MyTag()
	public String addItem(){
		int itemList=itemServcie.addItem();
		System.out.println("123456");
		return null;
	}
}
