package com.springboot.jasypt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JasyptPasswordDecryptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(JasyptPasswordDecryptionApplication.class, args);
	}


	@Value("${encrypt.value}")
	String encryptValue;

	@GetMapping("/decrypt")
	String decrypt(){
		return encryptValue;
	}
}
