package br.com.jojo.microusuarioAppMeme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "br.com.jojo.microusuarioAppMeme.repositories")
@EnableDiscoveryClient
public class MicroUsuarioAppMemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroUsuarioAppMemeApplication.class, args);
	}

}
