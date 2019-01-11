package adapterdesignpattern.implementation;

import adapterdesignpattern.VendorA.VendorA;
import adapterdesignpattern.VendorB.VendorB;

/**
 *
 * @author jecihjoy
 */
public class VendorBToAImplementation implements VendorA{

	private String custCardNo;
	private String cardOwnerName;
	private String cardExpMonthDate;
	private Integer cVVNo;
	private Double totalAmount;
	
	private final VendorB vendorB;
	
	public VendorBToAImplementation(VendorB xpay){
		this.vendorB = xpay;
		setProp(this.vendorB);
	}

	@Override
	public String getCustCardNo() {
		return custCardNo;
	}

	@Override
	public String getCardOwnerName() {
		return cardOwnerName;
	}

	@Override
	public String getCardExpMonthDate() {
		return cardExpMonthDate;
	}

	@Override
	public Integer getCVVNo() {
		return cVVNo;
	}

	@Override
	public Double getTotalAmount() {
		return totalAmount;
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		this.custCardNo = custCardNo;
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;
	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		this.cardExpMonthDate = cardExpMonthDate;
	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		this.cVVNo = cVVNo;
	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	private void setProp(VendorB vendorB){
		setCardOwnerName(vendorB.getCustomerName());
		setCustCardNo(vendorB.getCreditCardNo());
		setCardExpMonthDate(vendorB.getCardExpMonth()+"/"+vendorB.getCardExpYear());
		setCVVNo(vendorB.getCardCVVNo().intValue());
		setTotalAmount(vendorB.getAmount());
	}

}

