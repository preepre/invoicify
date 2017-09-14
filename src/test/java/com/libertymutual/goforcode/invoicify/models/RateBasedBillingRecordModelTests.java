package com.libertymutual.goforcode.invoicify.models;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.meanbean.test.BeanTester;
import org.meanbean.test.Configuration;
import org.meanbean.test.ConfigurationBuilder;

public class RateBasedBillingRecordModelTests {

	@Test
    public void test_all_getters_and_setters() {
         BeanTester tester = new BeanTester();
         Configuration configuration = new ConfigurationBuilder()
                 .ignoreProperty("createdOn")
                 .build();
          tester.testBean(RateBasedBillingRecord.class, configuration);
    }
	
	@Test
	public void test_getTotal() {
		//arrange
		RateBasedBillingRecord rateBill = new RateBasedBillingRecord();
		rateBill.setRate(5);
		rateBill.setQuantity(20);
		
		//act
		double amount = rateBill.getTotal();
		
		//assert
		assertThat(amount).isEqualTo(100);
	}


	

}




