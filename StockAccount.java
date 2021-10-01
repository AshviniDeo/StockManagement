package bridgeLabz;

public interface StockAccount {
	
	 void stockAcoount(String fileName);
	
	 double valueOf();

	void buy(int amount,String symbol);
	
	void sell(int amount,String symbol);
	
	void save(String fileName);
	
	void printReport();
}
