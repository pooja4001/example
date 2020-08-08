package com.cg.iter.bookorder.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iter.bookorder.entity.BookOrderEntity;
import com.cg.iter.bookorder.exception.OrderAlreadyPresentException;
import com.cg.iter.bookorder.exception.OrderNotPresentException;
import com.cg.iter.bookorder.service.BookOrderService;



@RestController
@RequestMapping("/Order")

public class BookOrderController {

	@Autowired
	BookOrderService orderService;
	
	
	@GetMapping("/viewAllOrder")
	public Iterable<BookOrderEntity> viewAllOrder()
	{
		return orderService.viewAllOrder();
	}
	
	@GetMapping("/viewAllOrder/{orderId}")
	public Optional<BookOrderEntity> viewOrderById(@PathVariable("orderId") long orderId)
	{
		return orderService.viewOrderById(orderId);
		
	}
	
	@PostMapping("/addOrder")
//	@ExceptionHandler(OrderAlreadyPresentException.class)
	public void addOrder(@RequestBody BookOrderEntity order)
	{
		orderService.addOrder(order);
		
	}
	
	
	@DeleteMapping("/deleteOrder/{orderId}")
//	@ExceptionHandler(OrderNotPresentException.class)
	public void removeOrder(@PathVariable("orderId") long orderId)
	{
	 orderService.removeOrder(orderId);
	}
	
	
	@PutMapping("/modifyOrder")
//	@ExceptionHandler(OrderAlreadyPresentException.class)
	public void modifyBook(@RequestBody BookOrderEntity order)
	{
		orderService.modifyOrder(order);
	}
		
}

