package com.devsuperior.desafio1;

import com.devsuperior.desafio1.Services.OrderService;
import com.devsuperior.desafio1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;


@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	OrderService orderService;
	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Order order = new Order();

		Integer code = sc.nextInt();
		order.setCode(code);

		Double basic = sc.nextDouble();
		order.setBasic(basic);

		Double discount = sc.nextDouble();
		order.setDiscount(discount);

		System.out.println("Pedido código " + code);
		System.out.printf("Valor total: R$ %.2f",orderService.total(order));

		sc.close();


	}
}
