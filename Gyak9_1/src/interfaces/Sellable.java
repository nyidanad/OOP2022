package interfaces;

public interface Sellable {
	public static int defaultprice = 1;
	public static String defaultcurrency = "Ft";
	
	public default int getDefaultPrice() {
		return defaultprice;
	}
	
	public void setDefaultPrice();
	
	public default String getDefaultCurrency() {
		return defaultcurrency;
	}
	
	public void setDefaultCurrency();
}
