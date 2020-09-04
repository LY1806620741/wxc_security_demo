package securitymybatis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SecurityMybatisApplication {
    private static final Logger log = LoggerFactory.getLogger(SecurityMybatisApplication.class);
    public static void main(String[] args) {
        Environment env= SpringApplication.run(SecurityMybatisApplication.class, args).getEnvironment();
       log.info("click to login http://localhost:{}/toLogin\n\tu:root\n\tp:123 ",env.getProperty("server.port","8080"));
    }

}
