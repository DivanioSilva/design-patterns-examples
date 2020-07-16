package com.ds;

import com.ds.builders.myOwnBuilder.Person;
import com.ds.chainOfResponsability.atmExample.ATMDispenserChain;
import com.ds.builders.ownComplexObjectV2.DefaultFactory;
import com.ds.builders.complexObject.MealBuilder;
import com.ds.stream.Reducer;
import com.ds.observable.ObservableFactory;
import com.ds.pluralSight.factory.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;


@SpringBootApplication
public class DesignPatternsExamplesApplication implements CommandLineRunner {

	@Autowired
	private ATMDispenserChain atmDispenserChain;

	@Autowired
	private MealBuilder mealBuilder;

	@Autowired
	private DefaultFactory defaultFactory;

	@Autowired
	private ObservableFactory observableFactory;

	@Autowired
	private Dictionary d;

	@Autowired
	private Reducer reducer;

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsExamplesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//User user = new User.UserBuilder("Divanio", "Silva").age(39).phone("933096636").address("Tv. Santa Marta, 15").build();
		/*
		Box box = new Box.BoxBuilder().azeitonas(10).pao(2).build();
		box.print();
		System.out.println();


		 */

		/*
		Family family = new Family.FamilyBuilder("Arianna", "Marianna")
				.filhoAge(1).maeAge(34).paiAge(38).paiName("Divanio").build();

		Person pai = new Person.PersonBuilder("Divanio").age(34).apelido("Pai").apelido("Amorzinho").build();

		Person annina = new Person.PersonBuilder("Marianna").apelido("Pequenina").apelido("Tetezinha").apelido("Cocozona").age(1).build();

		Person mae = new Person.PersonBuilder("Arianna").apelido("Amorzinha").apelido("Pequenina").build();

		Person personFactory = this.defaultFactory.person("Manuel").apelido("Manu").age(33).build();

		Family familyFactory = this.defaultFactory.family("Arianna", "Annina").filhoAge(1).maeAge(34).build();

		System.out.println();
		 */

/*
		AbstractLogger logger = Logger.getChainOfLogger();

		logger.logMessage(AbstractLogger.INFO, "This is an information");

		logger.logMessage(AbstractLogger.DEBUG, "This is a debugger log");

		logger.logMessage(AbstractLogger.ERROR, "This is a disaster log");


 */
/*
		Subject subject = observableFactory.observer();

		subject.setState(8);

		List<BaseException> exceptions = new ArrayList<>();

		Carro carro = new CarroBuilder("MT-43-54").cor("AZUL").build();

		Carro carro1 = Carro.createCarro("MT-DF-DF");


		exceptions.add(new DBException.BadExecution());
		exceptions.add(new DBException.NoData());
		exceptions.add(new DBException.MoreData());
		exceptions.add(new DBException.InvalidParam());
		System.out.println();


 */

		//atmDispenserChain.getDispenserChain().dispense(new Currency(80));

		/*
		Meal vegMeal = mealBuilder.prepareNonVegMeal();
		vegMeal.showAllItens();
		System.out.println("Total coast: " + vegMeal.getCost());

		Meal chickenMeal = mealBuilder.prepareNonVegMeal();
		chickenMeal.showAllItens();
		System.out.println("Total coast: " + chickenMeal.getCost());

		 */
		/*
		//too many if else solution
		final float addResult = Calculator.calculateUsingFactory(OperationsEnum.ADICAO, 2, 2);
		final float subResult = Calculator.calculateUsingFactory(OperationsEnum.SUBTRACAO, 3, 5);

		 */

/*
		Definitions def = d.getDefinitions("car");
		System.out.println();

 */

		/*
		Family family = StaticFactory.familyWithMotherAndChild("Arianna", "Marianna");
		Family fullFamily = StaticFactory.familyWithFatherAndMotherAndChild("Arianna", "Marianna", "Divanio");
		System.out.println();
		 */
		/*
		// Abstract Factory example

		Animal duck = (Animal) FactoryProvider.getAbstractFactoryByType("Animal").create("Duck");
		Shape triangle = (Shape) FactoryProvider.getAbstractFactoryByType("Shape").create("Triangle");
		Animal duck1 = (Animal) FactoryProvider.getAbstractFactoryByInterface(Animal.class).create("Duck");
		Animal dog = (Animal) FactoryProvider.getAbstractFactoryByInterface(Animal.class).create("Dog");
		System.out.println();
		*/

		/* aop tests
		BigDecimal result = Reducer.sum(BigDecimal.TEN);
		Reducer reducer = new Reducer();
		BigDecimal response = reducer.justReturn(BigDecimal.TEN);
		//System.out.println(employeeManager.getEmployeeById(1L));
*/
		//employeeManager.getEmployeeById(1L);
		//employeeManager.getEmployeeByName("Alex");
		//AOPTest result = new AOPTest(new Person.PersonBuilder("Divanio").build());

		//reducer.operationAsString("Divanio Silva");

		reducer.person(new Person.PersonBuilder("Divanio").apelido("Silva").age(32).build());

		reducer.justReturn(BigDecimal.TEN);
	}
}
