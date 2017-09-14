package com.libertymutual.goforcode.invoicify.models;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.meanbean.test.BeanTester;

public class UserModelTests {
	
	@Test
	public void test_all_getters_and_setters() {
		new BeanTester().testBean(User.class);
	}
	
	@Test
	public void test_isAccountNonExpired_returns_true() {
		//arrange
		User user = new User();		
		
		//act
		user.isAccountNonExpired();
		
		//assert
		assertThat(user.isAccountNonExpired()).isEqualTo(true);
		
	}
	
	@Test
	public void test_isAccountNonLocked_returns_true() {
		//arrange
		User user = new User();		
		
		//act
		user.isAccountNonLocked();
		
		//assert
		assertThat(user.isAccountNonLocked()).isEqualTo(true);
		
	}
	
	@Test
	public void test_isCredentialsNonExpired_returns_true() {
		//arrange
		User user = new User();		
		
		//act
		user.isCredentialsNonExpired();
		
		//assert
		assertThat(user.isCredentialsNonExpired()).isEqualTo(true);
		
	}
	
	@Test
	public void test_isEnabled_returns_true() {
		//arrange
		User user = new User();		
		
		//act
		user.isEnabled();
		
		//assert
		assertThat(user.isEnabled()).isEqualTo(true);
		
	}
	
	//Add the collection piece
	
	
	
	
	
	

}
