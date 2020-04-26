package com.eCommerce.jewelrystore.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    MyUserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }

//    @Bean
//    public PasswordEncoder getPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }

    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable().formLogin().and().logout();

//        http.csrf().disable().authorizeRequests()
//                .antMatchers("/products/*").hasRole("ADMIN")
//                .antMatchers("/orders/*").hasAnyRole("ADMIN", "USER")
//                .antMatchers("/customers/*").authenticated();

//        http.authorizeRequests().antMatchers("/products/getAll/**").authenticated().
////                antMatchers("/customers/**").authenticated().
//                and().httpBasic().and().csrf().disable();

//       http.anonymous().disable().authorizeRequests().antMatchers("/products/getAll/**").hasAuthority("ADMIN");
//        http.addFilterAfter(new CustomFilter(),
//                BasicAuthenticationFilter.class);
    }




    //InMemory -- for test
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("user").password("password").roles("ADMIN").and().
//        withUser("ravan").password("ravan123").roles("USER").and().
//        withUser("kans").password("kans123").roles("USER");
//    }

}
