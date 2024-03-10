package SpringDIwithSetterMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetter {

	public static void main(String[] args) {
		// using bean factory
//		Resource resource = new ClassPathResource("applicationContext.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		Student student = (Student) factory.getBean("studbean");
//		student.displayInfo();

		// using application context
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Student stud = (Student) context.getBean("studbean");
//		stud.displayInfo();
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car = (Car) context.getBean("carbean");
		car.displayInfo();

	}
}
