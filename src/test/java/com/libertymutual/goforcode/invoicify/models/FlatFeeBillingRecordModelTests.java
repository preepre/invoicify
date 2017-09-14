package com.libertymutual.goforcode.invoicify.models;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;
import org.meanbean.test.BeanTester;
import org.meanbean.test.Configuration;
import org.meanbean.test.ConfigurationBuilder;

public class FlatFeeBillingRecordModelTests {

	@Test
    public void test_all_getters_and_setters() {
         BeanTester tester = new BeanTester();
         Configuration configuration = new ConfigurationBuilder()
                 .ignoreProperty("createdOn")
                 .build();
          tester.testBean(FlatFeeBillingRecord.class, configuration);
    }
	
	@Test
	public void test_getTotal() {
		//arrange
		FlatFeeBillingRecord flatBill = new FlatFeeBillingRecord();
		flatBill.setAmount(10);
		
		//act
		double amount = flatBill.getTotal();
		
		//assert
		assertThat(amount).isEqualTo(10);
	}


	

}
