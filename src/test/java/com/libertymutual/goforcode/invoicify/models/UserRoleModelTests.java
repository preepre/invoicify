package com.libertymutual.goforcode.invoicify.models;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.meanbean.test.BeanTester;

public class UserRoleModelTests {

	@Test
	public void test_all_getters_and_setters() {
		new BeanTester().testBean(UserRole.class);
	}
	
	

}
