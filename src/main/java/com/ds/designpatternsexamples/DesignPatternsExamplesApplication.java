package com.ds.designpatternsexamples;

import com.ds.designpatternsexamples.builders.complexObject.MealBuilder;
import com.ds.designpatternsexamples.builders.entity.User;
import com.ds.designpatternsexamples.builders.ownComplectObject.Box;
import com.ds.designpatternsexamples.chainOfResponsability.ATMDispenserChain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsExamplesApplication implements CommandLineRunner {

	@Autowired
	private ATMDispenserChain atmDispenserChain;

	@Autowired
	private MealBuilder mealBuilder;

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsExamplesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//User user = new User.UserBuilder("Divanio", "Silva").age(39).phone("933096636").address("Tv. Santa Marta, 15").build();
		Box box = new Box.BoxBuilder().azeitonas(10).pao(2).build();
		box.print();
		System.out.println();
		//atmDispenserChain.getDispenserChain().dispense(new Currency(80));

		/*
		Meal vegMeal = mealBuilder.prepareNonVegMeal();
		vegMeal.showAllItens();
		System.out.println("Total coast: " + vegMeal.getCost());

		Meal chickenMeal = mealBuilder.prepareNonVegMeal();
		chickenMeal.showAllItens();
		System.out.println("Total coast: " + chickenMeal.getCost());

		 */
	}
}
