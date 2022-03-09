package com.usbootcamp.stockapi.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	
	private long orderId;
	private String orderDate;
	private long orderAmount;
    private long productId;
}
