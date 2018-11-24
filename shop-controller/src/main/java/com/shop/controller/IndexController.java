package com.shop.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.common.IpInterception;
import com.shop.pojo.TbItem;
import com.shop.service.ItemService;

import net.sf.jsqlparser.expression.operators.relational.ItemsList;

@Controller
public class IndexController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);
    
    @Autowired
    private ItemService itemServcie;
    @RequestMapping("/index")
    @ResponseBody
    public String showIndex(Model model) {
        LOGGER.info("123456");
        return "index";
    }

    @RequestMapping("/queryItemList")
    @ResponseBody
    public String queryItemList() {
        List<TbItem> itemList = itemServcie.queryItemList(0);
        LOGGER.info("123456");
        return "queryItemList";
    }

    @RequestMapping("/updateByPrimaryKey")
    @ResponseBody
    public String updateByPrimaryKeyt() {
        int itemList = itemServcie.updateByPrimaryKey(null);
        LOGGER.info("123456");
        return "updateByPrimaryKey";
    }

    @RequestMapping("/deleteItemById")
    @ResponseBody
    @IpInterception()
    public String deleteItemById(@RequestParam long id) {
        int itemList = itemServcie.deleteItemById(id);
        LOGGER.info("123456");
        return "deleteItemById";
    }

    @RequestMapping("/addItem")
    @IpInterception()
    @ResponseBody
    public String addItem() {
        int itemList = itemServcie.addItem(null);
        LOGGER.info("123456");
        return "addItem";
    }
}
