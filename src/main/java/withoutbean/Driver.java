package withoutbean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
public static void main(String[] args) {
	Resource resource=new ClassPathResource("withoutbean.xml");
	BeanFactory beanFactory=new XmlBeanFactory(resource);
	Mobile mobile=beanFactory.getBean("mobile",Mobile.class);
	mobile.used();
	Charger charger=beanFactory.getBean("charger",Charger.class);
	charger.used();
}
}
