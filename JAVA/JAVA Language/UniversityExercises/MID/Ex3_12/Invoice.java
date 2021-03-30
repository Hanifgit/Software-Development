package Ex3_12;

public class Invoice {
	String APartNumber;
	String APartDescription;
	int  purchasedQuantity;
	double  PricePerItem;
	
	public Invoice(String APartNumber,String APartDescription,int purchasedQuantity,double PricePerItem) {
		this.APartDescription = APartDescription;
		this.APartNumber = APartNumber;
		if(purchasedQuantity>0) this.purchasedQuantity = purchasedQuantity;
		else this.purchasedQuantity = 0;
		if(PricePerItem>0) this.PricePerItem = PricePerItem;
		else this.PricePerItem = 0.0;
	}
	
	public double getInvoiceAmount(int purchasedQuantity,double PricePerItem) {
		double InvoiceAmount = purchasedQuantity*PricePerItem;
		return InvoiceAmount;
		
	}

	public String getAPartNumber() {
		return APartNumber;
	}

	public void setAPartNumber(String aPartNumber) {
		APartNumber = aPartNumber;
	}

	public String getAPartDescription() {
		return APartDescription;
	}

	public void setAPartDescription(String aPartDescription) {
		APartDescription = aPartDescription;
	}

	public int getPurchasedQuantity() {
		return purchasedQuantity;
	}

	public void setPurchasedQuantity(int purchasedQuantity) {
		this.purchasedQuantity = purchasedQuantity;
	}

	public double getPricePerItem() {
		return PricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		PricePerItem = pricePerItem;
	}
	
}
