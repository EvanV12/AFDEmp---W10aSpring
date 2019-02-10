import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cb.beans.Car;


public class TestCar {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Car car = (Car) context.getBean("car_obj");
		System.out.println(car.toString());
		
		System.out.println();
		
		Car car2 = (Car) context.getBean("car_const");
		System.out.println(car2.toString());
	}

}
