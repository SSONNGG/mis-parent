package com.yc.springcloud81.misprovide.dao;


import com.yc.springcloud81.misprovide.bean.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper //tk.mybatis 根据接口自动生成实现类
public interface BookMapper extends MisBaseMapper<Book>{
}
