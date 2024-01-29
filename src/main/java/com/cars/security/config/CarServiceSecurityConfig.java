package com.cars.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class CarServiceSecurityConfig {
	
	  @Bean
	  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	    http.csrf().disable().authorizeHttpRequests()
	        .requestMatchers("/*").permitAll()
	        .anyRequest().authenticated()
	        .and()
	        .httpBasic()
	        .and()
	        .sessionManagement()
	        .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	    return http.build();
	  }
	
	  /*  
	@Bean
	public InMemoryUserDetailsManager userDetailsService1() {
		
		UserDetails userDetails = User.withDefaultPasswordEncoder()
				.username("sree")
				.password("eers")
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(userDetails);
		
	} */
	
	 @Bean
	  public InMemoryUserDetailsManager userDetailsService() {
	    UserDetails user = User
	        .withUsername("chandu")
	        .password(passwordEncoder().encode("12345"))
	        .roles("USER_ROLE")
	        .build();
	    return new InMemoryUserDetailsManager(user);
	  }
	
	@Bean
	  public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder(8);
	  }

}
