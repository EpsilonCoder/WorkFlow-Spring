package sn.gainde2000.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableJpaRepositories
public class DemoApplication {
	static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		logger.info("Starting app....");
		SpringApplication.run(DemoApplication.class, args);
	}

	/*
	 * @Bean
	 * public FilterRegistrationBean<CorsFilter> simpleCorsFilter() {
	 * UrlBasedCorsConfigurationSource source = new
	 * UrlBasedCorsConfigurationSource();
	 * CorsConfiguration config = new CorsConfiguration();
	 * config.setAllowCredentials(true);
	 * config.setAllowedOrigins(Collections.singletonList("*"));
	 * config.setAllowedMethods(Collections.singletonList("*"));
	 * config.setAllowedHeaders(Collections.singletonList("*"));
	 * source.registerCorsConfiguration("/**", config);
	 * FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>(new
	 * CorsFilter(source));
	 * bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
	 * return bean;
	 * }
	 */

	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      package sn.gainde2000.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableJpaRepositories
public class DemoApplication {
	static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		logger.info("Starting app....");
		SpringApplication.run(DemoApplication.class, args);
	}

	/*
	 * @Bean
	 * public FilterRegistrationBean<CorsFilter> simpleCorsFilter() {
	 * UrlBasedCorsConfigurationSource source = new
	 * UrlBasedCorsConfigurationSource();
	 * CorsConfiguration config = new CorsConfiguration();
	 * config.setAllowCredentials(true);
	 * config.setAllowedOrigins(Collections.singletonList("*"));
	 * config.setAllowedMethods(Collections.singletonList("*"));
	 * config.setAllowedHeaders(Collections.singletonList("*"));
	 * source.registerCorsConfiguration("/**", config);
	 * FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>(new
	 * CorsFilter(source));
	 * bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
	 * return bean;
	 * }
	 */

	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}

}
