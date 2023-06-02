package com.JwtAuthentications.SpringsecurityJwt.Config;

import com.JwtAuthentications.SpringsecurityJwt.SpringServiceImpl.CustomdetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.stereotype.Controller;
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class Springconfig extends WebSecurityConfigurerAdapter {
    @Autowired
  public  CustomdetailService customdetailService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                .and()
                .authorizeRequests()
                .antMatchers("/head/**").hasRole("NORMAL")
                .antMatchers("/Home/**").hasRole("ADMIN")
                .antMatchers("/enter").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/enter")
                .loginProcessingUrl("/dologin")
                .defaultSuccessUrl("/head/");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customdetailService).passwordEncoder(passwordEncoder());
//        auth.inMemoryAuthentication().withUser("shenky").password(this.passwordEncoder().encode("jain")).roles("NORMAL");
//        auth.inMemoryAuthentication().withUser("oshin").password(this.passwordEncoder().encode("jain")).roles("ADMIN");

    }
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return  new BCryptPasswordEncoder(10);
    }
}
