//package com.luv2code.ecommerce.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//public class SecurityConfoguration extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // protect endpoint /api/orders
//        http.authorizeRequests()
//                .antMatchers("/api/orders/**")
//                .authenticated()
//                .and()
//                .oauth2ResourceServer()
//                .jwt();
//
//        // add CORS filters
//        http.cors();
//
//
//
//        // disable CSRF since we are not using Cookies for session tracking
//        http.csrf().disable();
//    }
//}
//
