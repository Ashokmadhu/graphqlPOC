/*
 * package com.learning.pace.poc.listener;
 * 
 * import java.time.Duration; import java.time.LocalDateTime;
 * 
 * import org.springframework.stereotype.Component;
 * 
 * import graphql.kickstart.servlet.core.GraphQLServletListener; import
 * jakarta.servlet.http.HttpServletRequest; import
 * jakarta.servlet.http.HttpServletResponse; import lombok.extern.slf4j.Slf4j;
 * 
 * @Component
 * 
 * @Slf4j public class LoggingListener implements GraphQLServletListener {
 * 
 * @Override public RequestCallback onRequest(HttpServletRequest request,
 * HttpServletResponse response) { LocalDateTime date = LocalDateTime.now();
 * log.info("Received GraphQl Request from the client");
 * log.info("Received GraphQL Request from the client. URI: {}",
 * request.getRequestURI()); return new RequestCallback() {
 * 
 * @Override public void onError(HttpServletRequest request, HttpServletResponse
 * response, Throwable throwable) { RequestCallback.super.onError(request,
 * response, throwable); }
 * 
 * @Override public void onSuccess(HttpServletRequest request,
 * HttpServletResponse response) { RequestCallback.super.onSuccess(request,
 * response); }
 * 
 * @Override public void onFinally(HttpServletRequest request,
 * HttpServletResponse response) { LocalDateTime date2 = LocalDateTime.now();
 * log.info("Completed Request : Time Taken : {}", Duration.between(date,
 * date2)); RequestCallback.super.onFinally(request, response); }
 * 
 * }; }
 * 
 * }
 */