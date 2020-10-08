package com.yc.springcloude81.misconsumer.service;


import com.yc.springcloude81.misconsumer.bean.Book;
import org.springframework.stereotype.Service;

public interface BookService {

  public Book getBook(Integer id);
}
