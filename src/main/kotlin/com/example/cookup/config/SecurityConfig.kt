package com.example.cookup.config

import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.core.Ordered
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import org.springframework.web.filter.CorsFilter
import kotlin.jvm.Throws


@EnableWebSecurity
class SecurityConfig : WebSecurityConfigurerAdapter() {
//    override fun configure(auth: AuthenticationManagerBuilder?) {
//
//    }

    override fun configure(http: HttpSecurity?){
        if (http != null) {
            http
                    .authorizeRequests().antMatchers("/").permitAll().and().csrf().disable()
//                    .authorizeRequests().anyRequest().authenticated()
//                    .and()
//                    .oauth2Login()
//                    .and()
//                    .oauth2ResourceServer().jwt()
        }
    }

//    @Bean
//    fun simpleCorsFilter(): FilterRegistrationBean<CorsFilter>? {
//        val source = UrlBasedCorsConfigurationSource()
//        val config = CorsConfiguration()
//        config.allowCredentials = true
//        config.allowedOrigins = listOf("*")
//        config.allowedMethods = listOf("*")
//        config.allowedHeaders = listOf("*")
//        source.registerCorsConfiguration("/**", config)
//        val bean: FilterRegistrationBean<CorsFilter> = FilterRegistrationBean<CorsFilter>(CorsFilter(source))
//        bean.setOrder(Ordered.HIGHEST_PRECEDENCE)
//        return bean
//    }
}