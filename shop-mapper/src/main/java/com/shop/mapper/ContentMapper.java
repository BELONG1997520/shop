package com.shop.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shop.pojo.Content;
@Repository
public interface ContentMapper {

int insert(Content record);
int delete(Content record);
int updateByPrimaryKey(Content record);
List<Content> queryItemList(Content record);
  
}