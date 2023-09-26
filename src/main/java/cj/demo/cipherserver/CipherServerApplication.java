package cj.demo.cipherserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class CipherServerApplication {

	/*
		Access path examples
		/{application}/{profile}[/{label}
		/{application}-{profile}.yml
		/{label}/{application}-{profile}.yml
		/{application}-{profile}.properties
		/{label}/{application}-{profile}.properties
	*/
	public static void main(String[] args) {
		SpringApplication.run(CipherServerApplication.class, args);
	}

}
