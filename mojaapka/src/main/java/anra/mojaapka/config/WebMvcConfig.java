package anra.mojaapka.config;

/**
 * @author Andrzej Radziejewski
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	
	@Bean
	public BCryptPasswordEncoder pwdEnc() {
		BCryptPasswordEncoder bcp = new BCryptPasswordEncoder();
		
		return bcp;
	}

}
