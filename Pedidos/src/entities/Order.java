package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
		
	private Date moment;
	private OrderStatus status;
	
	private Client client = new Client();
	
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		double sum = 0;
		for(OrderItem item: items) {
			sum += item.subTotal();
		}
		
		return sum;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();	
		
		sb.append("Order moment: " + getMoment() + "\n");
		sb.append("Order Status: " + getStatus() + "\n");
		sb.append(client + "\n");
		sb.append("Order Items: " + "\n");
		
		for(OrderItem item : items) {
			sb.append(item.getProduct().getName() + ", ");
			sb.append(item.getPrice() + ", ");
			sb.append(item.getQuantity() + ", ");
			sb.append("Subtotal: " + item.subTotal() + "\n");
		}
		
		sb.append("Total: " + total());
		return sb.toString();
	}
}
