package com.techlabs.shoppingcart;

public class LineItem {
	private int lid;
	private int qty;
	private Product product;
	
	public LineItem(){
		
	}
	
	public LineItem(int lid,int qty,Product product){
		this.lid=lid;
		this.qty=qty;
		this.product=product;
	}
	
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double totalLineCost(){
		return (product.calculateCostAfterDiscount()*qty);
	}

}
