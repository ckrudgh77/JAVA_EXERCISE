package icehs.science.chapter09;

public class Product {

	private String name;
	private int price;
	private int discountRate;
	
	
	public Product(String name, int price, int discountRate) {
		this.name = name;
		this.price = price;
		this.discountRate = discountRate;
	}


	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}


	public int getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	public void printProductInfo() {
		System.out.println("제품명 : " + name);
		System.out.println("정가 : " + price + "(할인율 : " + discountRate + "%)");
		System.out.println("판매가 : " + this.calculateDiscountPrice());
	}
	
	public int calculateDiscountPrice() {
		return price - (price * discountRate / 100);
	}
	
	
}
