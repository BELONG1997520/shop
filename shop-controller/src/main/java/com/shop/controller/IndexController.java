package com.shop.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.common.MyTag;
import com.shop.pojo.Content;
import com.shop.service.ItemService;

@Controller
public class IndexController {

    //TODO 使用LOGGER
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    //TODO 这里名字错误 如果使用Resource注解会失败
    private ItemService itemServcie;

    @RequestMapping("/index")
    public String showIndex(Model model) {
//        System.out.println("123456");
        //TODO 工作时代码不应该用System输出，应该使用Logger 打印，以后可以很方便去集成一些其他的配置，比如每次打印日志，都在日志前面加一个ip
        LOGGER.info("123456");
        return "index";

    }

    @RequestMapping("/queryItemList")
    public String queryItemList() {
        System.out.println("1234567");
        //TODO 配合@ResponseBody 把代码输入json格式
        List<Content> itemList = itemServcie.queryItemList();
        System.out.println("123456");
        return null;
    }

    @RequestMapping("/updateByPrimaryKeyt")
    @MyTag()//TODO 注解配置不生效 没有配置实际
    public String updateByPrimaryKeyt() {
        int itemList = itemServcie.updateByPrimaryKey();
        System.out.println("123456");
        return null;
    }

    @RequestMapping("/deleteItemById")
    @MyTag()
    public String deleteItemById() {
        //TODO 使用@RequstParam注解接收id删除 真正删除商品
        int itemList = itemServcie.deleteItemById();
        System.out.println("123456");
        return null;
    }

    @RequestMapping("/addItem")
    @MyTag()
    public String addItem() {
        //TODO 使用RequestBody 接收参数，实现商品添加功能
        int itemList = itemServcie.addItem();
        System.out.println("123456");
        return null;
    }
}
