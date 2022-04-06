package classes.product;

import interfaces.Sellable;

public class Product implements Sellable{
	private String name;
	private int price;
	private String currency;
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = getDefaultPrice();
		this.currency = getDefaultCurrency();
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", currency=" + currency + "]";
	}

	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		changeCurrency(this.currency, currency);
		this.currency = currency;
	}
	
	//interface implementation
	public void setDefaultPrice() {
		this.price = getDefaultPrice();
	}
	
	public void setDefaultCurrency() {
		changeCurrency(this.currency, "Ft");
		this.currency = getDefaultCurrency();
	}
	
	public void changeCurrency(String source, String target) {
		if (source == "Ft" && target == "EUR")
			this.price /= 300;
		
		else if (source == "EUR" && target == "Ft")
			this.price *= 300;
	}
}
