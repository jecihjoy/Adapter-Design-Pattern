package adapterdesignpattern;

import adapterdesignpattern.VendorA.VendorA;
import adapterdesignpattern.VendorB.VendorB;
import adapterdesignpattern.implementation.VendorBImplementation;
import adapterdesignpattern.implementation.VendorBToAImplementation;

/**
 *
 * @author jecihjoy
 */
public class AdapterDesignpattern {

	public static void main(String[] args) {
		
		VendorB vendorB = new VendorBImplementation();
		vendorB.setCreditCardNo("4789565874102365");
		vendorB.setCustomerName("Max Warner");
		vendorB.setCardExpMonth("09");
		vendorB.setCardExpYear("25");
		vendorB.setCardCVVNo((short)235);
		vendorB.setAmount(2565.23);
		
		VendorA vendorA = new VendorBToAImplementation(vendorB);
                main(vendorA);
	}
	
    public static void main(VendorA vendorA) {
        	System.out.println(vendorA.getCardOwnerName());
		System.out.println(vendorA.getCustCardNo());
		System.out.println(vendorA.getCardExpMonthDate());
		System.out.println(vendorA.getCVVNo());
		System.out.println(vendorA.getTotalAmount());
    }

}
