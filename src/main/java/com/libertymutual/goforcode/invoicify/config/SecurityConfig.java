package com.libertymutual.goforcode.invoicify.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
//		.csrf().disable()
		
		.authorizeRequests()
				.antMatchers("/", "/login", "/css/**", "/js/**").permitAll()
				.antMatchers("/admin/**").hasRole("ADMIN")
				.antMatchers("/invoices/**").hasAnyRole("ADMIN", "ACCOUNTANT")
				.antMatchers("/billing-records/**").hasAnyRole("ADMIN", "CLERK")
				
				.anyRequest().authenticated()
			.and()
			.formLogin();
		

	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		
		//Build admin user
		UserDetails user = User
				.withUsername("admin")
				.password("admin")
				.roles("ADMIN")
				.build();
		
		manager.createUser(user);
		
		//Build clerk user		
		user = User
				.withUsername("clerk")
				.password("clerk")
				.roles("CLERK")
				.build();
		
		manager.createUser(user);
		
		
		//Build accountant user
		user = User
				.withUsername("accountant")
				.password("accountant")
				.roles("ACCOUNTANT")
				.build();
		
		manager.createUser(user);
		
		return manager;	
		
	}
	
	
}
