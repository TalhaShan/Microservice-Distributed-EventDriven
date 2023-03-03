package com.bootcamp4.notificationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

import java.util.function.Consumer;

@SpringBootApplication
public class NotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationServiceApplication.class, args);
	}
  //consuming rabbit mq as we have binder depencdey spring will auto get it
    @Bean
    public Consumer<Message<String>> notificationEventSupplier() {
        return message -> new EmailSender().sendEmail(message.getPayload());
    }
}
