package io.github.maikkatko.crm;

import io.github.maikkatko.crm.model.customer.CustomerEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RestController
public class CrmIntegrationPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmIntegrationPipelineApplication.class, args);
	}

	@GetMapping
	public List<CustomerEntity> hello() {
		return List.of(
				new CustomerEntity(
						1L,
						"Mariam",
						"mariam.jama@gmail.com",
						"111-111-1111",
						"11 Cool Drive",
						"Cool City",
						"Cool State",
						"11111",
						"Cool Country"
				)
		);
	}
}
