package com.cg.iter.bookorder.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.iter.bookorder.entity.BookOrderEntity;
import com.cg.iter.bookorder.exception.OrderAlreadyPresentException;
//import com.cg.iter.bookorder.exception.OrderNotPresentException;
import com.cg.iter.bookorder.repository.BookOrderRepo;

@Service
public class BookOrderServiceImpl implements BookOrderService {

	@Autowired
	BookOrderRepo OrderRepo;
	
	@Override
	public Iterable<BookOrderEntity> viewAllOrder() {
		// TODO Auto-generated method stub
		return OrderRepo.findAll();
	}

	@Override
	public Optional<BookOrderEntity> viewOrderById(long orderId) {
		// TODO Auto-generated method stub
		return OrderRepo.findById(orderId) ;
	}

	@Override
	public void addOrder(BookOrderEntity order) {
		// TODO Auto-generated method stub
//		if(OrderRepo.findById(order.getOrderId()).isPresent())
//		{
//			throw new OrderAlreadyPresentException("Order with orderCode: "+order.getOrderId()+" is already there!!!!");
//		}
//		else
//		{
			OrderRepo.save(order);
			
//		}
//		return ("Order with orderCode: "+order.getOrderId()+" is added!!!!");
	}
	@Override
	public BookOrderEntity modifyOrder(BookOrderEntity order) {
		// TODO Auto-generated method stub
		if(OrderRepo.findById(order.getOrderId()).isPresent())
		{
			throw new OrderAlreadyPresentException("Order with orderCode: "+order.getOrderId()+" is already there!!!!");
		}
		
		 OrderRepo.save(order);
		 return order;
	}

	@Override
	public String removeOrder(long orderId) {
		 
		OrderRepo.deleteById(orderId);
		
		return "Order got deleted";
	}

}