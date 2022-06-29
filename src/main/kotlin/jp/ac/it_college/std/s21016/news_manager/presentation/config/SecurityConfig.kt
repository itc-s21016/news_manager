package jp.ac.it_college.std.s21016.news_manager.presentation.config

import jp.ac.it_college.std.s21016.news_manager.application.service.AuthenticationService
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

class SecurityConfig(private val authenticationService: AuthenticationService) : WebSecurityConfigurerAdapter() {

}