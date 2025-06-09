package snippet;

public class Snippet {
	server:
	  port: 8080
	
	spring:
	  application:
	    name: api-gateway
	  cloud:
	    gateway:
	      routes:
	        - id: product-service
	          uri: lb://PRODUCT-SERVICE
	          predicates:
	            - Path=/products/**
	        - id: category-service
	          uri: lb://CATEGORY-SERVICE
	          predicates:
	            - Path=/categories/**
	        - id: price-service
	          uri: lb://PRICE-SERVICE
	          predicates:
	            - Path=/prices/**
	        - id: inventory-service
	          uri: lb://INVENTORY-SERVICE
	          predicates:
	            - Path=/inventory/**
	
	eureka:
	  client:
	    serviceUrl:
	      defaultZone: http://localhost:8761/eureka/
	
}

