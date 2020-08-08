package com.cg.iter.bookorder.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name = "order_info")
public class BookOrderEntity {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderId;
@DateTimeFormat(pattern = "yyyy/MM/dd")
private LocalDate OrderDate;

	private String orderBy;
	private String orderbookcopies;
	
	private Float TotalAmount;
	private String PaymentMethod;
	private String orderStatus;
	
	
	public BookOrderEntity(Long orderId, LocalDate orderDate, String orderBy, String orderbookcopies, Float totalAmount,
			String paymentMethod, String orderStatus) {
		super();
		this.orderId = orderId;
		this.OrderDate = orderDate;
		this.orderBy = orderBy;
		this.orderbookcopies = orderbookcopies;
		this.TotalAmount = totalAmount;
		this.PaymentMethod = paymentMethod;
		this.orderStatus = orderStatus;
	}
	public BookOrderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public LocalDate getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.OrderDate = orderDate;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public String getOrderbookcopies() {
		return orderbookcopies;
	}
	public void setOrderbookcopies(String orderbookcopies) {
		this.orderbookcopies = orderbookcopies;
	}
	public Float getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(Float totalAmount) {
		this.TotalAmount = totalAmount;
	}
	public String getPaymentMethod() {
		return PaymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.PaymentMethod = paymentMethod;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	@Override
	public String toString() {
		return "BookOrderEntity [orderId=" + orderId + ", OrderDate=" + OrderDate + ", orderBy=" + orderBy
				+ ", orderbookcopies=" + orderbookcopies + ", TotalAmount=" + TotalAmount + ", PaymentMethod="
				+ PaymentMethod + ", orderStatus=" + orderStatus + "]";
	}
	  
	
	
	
	
}

