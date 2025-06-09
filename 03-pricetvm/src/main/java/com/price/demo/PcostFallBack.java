package com.price.demo;

public class PcostFallBack  implements PcostClient{
	  @Override
	    public Double getPriceByProductId(Integer productId) {
	        return Double.NaN;  // Return NaN if price service fails
	    }
}
