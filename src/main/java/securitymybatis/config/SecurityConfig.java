package securitymybatis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import securitymybatis.mapper.UserMapper;

/*To do this, you must create a class that extends AbstractHttpConfigurer and then create a file in the classpath at "META-INF/spring.factories" that looks something like:
<pre>
org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer = sample.MyClassThatExtendsAbstractHttpConfigurer
</pre>*/
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    UserMapper userMapper;
     //授权
     @Override
     protected void configure(HttpSecurity http) throws Exception {
         http.authorizeRequests().antMatchers("/index","/").permitAll()
                 .antMatchers("/album","/about","/details").hasRole("look")
                 .antMatchers("/whisper","/mComment").hasRole("edit")
                 .antMatchers("/whisper").hasRole("upload").and().formLogin().loginPage("/toLogin").permitAll();
         //注销
//         http.logout().logoutSuccessUrl("/");
//         //记住我
//         http.rememberMe().rememberMeParameter("remember");
     }

    //认证
     @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
         auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                 .withUser("wxc").password(new BCryptPasswordEncoder().encode("123")).roles("look","edit")
                 .and()
                 .withUser("root")
                 .password(new BCryptPasswordEncoder().encode("123")).roles("upload","look","edit");
    }

 }
