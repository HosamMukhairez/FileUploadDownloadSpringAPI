package spring.api;

import spring.api.upload.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class FileUploadDownloadSpringApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUploadDownloadSpringApiApplication.class, args);
	}

}
