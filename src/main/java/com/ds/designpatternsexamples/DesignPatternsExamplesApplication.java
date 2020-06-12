package com.ds.designpatternsexamples;

import com.ds.designpatternsexamples.builders.DefaultFactory;
import com.ds.designpatternsexamples.builders.complexObject.MealBuilder;
import com.ds.designpatternsexamples.builders.myOwnBuilder.Person;
import com.ds.designpatternsexamples.builders.ownComplexObject.Box;
import com.ds.designpatternsexamples.builders.ownComplexObjectV2.Family;
import com.ds.designpatternsexamples.chainOfResponsability.atmExample.ATMDispenserChain;
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

	@Autowired
	private DefaultFactory defaultFactory;

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsExamplesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//User user = new User.UserBuilder("Divanio", "Silva").age(39).phone("933096636").address("Tv. Santa Marta, 15").build();
		Box box = new Box.BoxBuilder().azeitonas(10).pao(2).build();
		box.print();
		System.out.println();

		Family family = new Family.FamilyBuilder("Arianna", "Marianna")
				.filhoAge(1).maeAge(34).paiAge(38).paiName("Divanio").build();

		Person pai = new Person.PersonBuilder("Divanio").age(34).apelido("Pai").apelido("Amorzinho").build();

		Person annina = new Person.PersonBuilder("Marianna").apelido("Pequenina").apelido("Tetezinha").apelido("Cocozona").age(1).build();

		Person mae = new Person.PersonBuilder("Arianna").apelido("Amorzinha").apelido("Pequenina").build();

		Person personFactory = this.defaultFactory.person("Manuel").apelido("Manu").age(33).build();

		Family familyFactory = this.defaultFactory.family("Arianna", "Annina").filhoAge(1).maeAge(34).build();

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
