package zoo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);

	Zoo zoo=context.getBean("zoo",Zoo.class);
	zoo.zooSound();
}
}
