package anra.mojaapka;

/**
 * @author Andrzej Radziejewski
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("anra.mojaapka")
public class MojaapkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MojaapkaApplication.class, args);
	}
}
