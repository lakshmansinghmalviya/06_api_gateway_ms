package com.lakshman.apigateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class ApiGatewayFilter implements GlobalFilter {

	private static final Logger logger = LoggerFactory.getLogger(ApiGatewayFilter.class);

	@Override
	public Mono<Void> filter(ServerWebExchange exchange,
			org.springframework.cloud.gateway.filter.GatewayFilterChain chain) {
		logger.info("Request path: {}", exchange.getRequest().getPath());
		return chain.filter(exchange);
	}
}
