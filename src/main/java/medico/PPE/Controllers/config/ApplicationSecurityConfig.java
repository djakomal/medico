//package medico.PPE.Controllers.config;
//
//import com.example.Demo.Basic.Authentication.service.impl.UserServiceImpl;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
//@Configuration
//@EnableWebSecurity
//public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    private final BCryptPasswordEncoder bCryptPasswordEncoder;
//    private final UserServiceImpl userService;
//
//
//    @Override
//    protected void configure(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.csrf().disable()
//                .cors().and() // Enable CORS
//                .formLogin().disable()
//                .logout().disable()
//                .authorizeRequests().antMatchers("/user/register").permitAll()
//                .anyRequest().authenticated()
//                .and().httpBasic();
//
//    }
//    @Bean
//    public CorsFilter corsFilter() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials(true);
//        config.addAllowedOrigin("http://localhost:4200");
//        config.addAllowedHeader("*");
//        config.addAllowedMethod("*");
//        source.registerCorsConfiguration("/**", config);
//        return new CorsFilter(source);
//    }
//
//*
//     *  if you want more complex configuration with login, logout, remember me, and more complex authorization user.
//     *  for login page, you can use thymeleaf to create your owen login page, or you can use default login page.
//     *
//     *      @Override
//     *     protected void configure(HttpSecurity http) throws Exception {
//     *         http
//     *                 .authorizeRequests()
//     *                 .antMatchers("/index.html").permitAll()
//     *                 .antMatchers("/profile/**").authenticated()
//     *                 .antMatchers("/admin/**").hasRole("ADMIN")
//     *                 .antMatchers("/management/**").hasAnyRole("ADMIN", "MANAGER")
//     *                 .antMatchers("/api/public/test1").hasAuthority("ACCESS_TEST1")
//     *                 .antMatchers("/api/public/test2").hasAuthority("ACCESS_TEST2")
//     *                 .antMatchers("/api/public/users").hasRole("ADMIN")
//     *                 .and()
//     *                 .formLogin()
//     *                 .loginProcessingUrl("/signin")
//     *                 .loginPage("/login").permitAll()
//     *                 .usernameParameter("txtUsername")
//     *                 .passwordParameter("txtPassword")
//     *                 .and()
//     *                 .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login")
//     *                 .and()
//     *                 .rememberMe().tokenValiditySeconds(2592000).key("mySecret!").rememberMeParameter("checkRememberMe");
//     *     }
//     *
//
//
//    @Autowired
//    public void config(AuthenticationManagerBuilder authentication)
//            throws Exception
//    {
//        authentication.authenticationProvider(daoAuthenticationProvider());
//    }
//
//    @Bean
//    public DaoAuthenticationProvider daoAuthenticationProvider(){
//        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//        provider.setPasswordEncoder(bCryptPasswordEncoder);
//        provider.setUserDetailsService(userService);
//        return provider;
//    }
//
//    @Bean
//    @Override
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean();
//    }
//
//}
