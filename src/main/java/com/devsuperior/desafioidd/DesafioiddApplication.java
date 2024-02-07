package com.devsuperior.desafioidd;

import com.devsuperior.desafioidd.entities.entities.Order;
import com.devsuperior.desafioidd.services.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DesafioiddApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesafioiddApplication.class, args);
	}

	@Autowired
	private OrderService orderService;

	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("=============================");
		System.out.println("Dados do pedido");
		System.out.println("=============================");
		System.out.print("Código: ");
		int code = sc.nextInt();
		System.out.print("Valor básico: ");
		double basic = sc.nextDouble();
		System.out.print("Porcentagem de desconto: ");
		double discount = sc.nextDouble();
		System.out.println("=============================");

		Order order = new Order(code, basic, discount);

		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor total: "+ String.format("%.2f", orderService.total(order)));

		sc.close();
	}
}
