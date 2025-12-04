import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        
        HelloWorld HelloWorldbean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld HelloWorldbean2 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat CatBean1 = (Cat) applicationContext.getBean("cat");
        Cat CatBean2 = (Cat) applicationContext.getBean("cat");

        // Сравнение бинов HelloWorld
        System.out.println("Сравнение бинов HelloWorld: " + (HelloWorldbean1 == HelloWorldbean2));
        // Сравнение бинов Cat
        System.out.println("Сравнение бинов Cat: " + (CatBean1 == CatBean2));
    }
}