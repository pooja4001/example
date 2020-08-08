package com.cg.iter.bookorder.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.cg.iter.bookorder.entity.BookOrderEntity;



public interface BookOrderService {

public Iterable<BookOrderEntity> viewAllOrder();
	
	public Optional<BookOrderEntity> viewOrderById(long orderId);
	
	public void addOrder(BookOrderEntity order);
	
	public BookOrderEntity modifyOrder(BookOrderEntity order);
	
	public String removeOrder(long orderId);
	
	
}
