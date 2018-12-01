package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.shop.pojo.TbItem;

@Repository
public interface TbItemMapper {

	int insert(TbItem record);

	int delete(long id);

	int updateByPrimaryKey(@Param(value="record")TbItem record);

	List<TbItem> queryItemList( );

}