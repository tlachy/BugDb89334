package com.erabanq;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import static org.springframework.http.HttpMethod.PATCH;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.http.HttpMethod.PUT;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Bean
    InMemoryUserDetailsManager userDetailsManager() {

        User.UserBuilder builder = User.withDefaultPasswordEncoder();

        UserDetails greg = builder.username("greg").password("turnquist").roles("USER").build();
        UserDetails ollie = builder.username("ollie").password("gierke").roles("USER", "ADMIN").build();

        return new InMemoryUserDetailsManager(greg, ollie);
    }

    /**
     * This section defines the security policy for the app.
     * <p>
     * <ul>
     * <li>BASIC authentication is supported (enough for this REST-based demo).</li>
     * <li>/employees is secured using URL security shown below.</li>
     * <li>CSRF headers are disabled since we are only testing the REST interface, not a web one.</li>
     * </ul>
     * NOTE: GET is not shown which defaults to permitted.
     *
     * @param http
     * @throws Exception
     * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.HttpSecurity)
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.httpBasic().and().authorizeRequests().//
                antMatchers(POST, "/employees").hasRole("ADMIN").//
                antMatchers(PUT, "/employees/**").hasRole("ADMIN").//
                antMatchers(PATCH, "/employees/**").hasRole("ADMIN").and().//
                csrf().disable();
    }
}