import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        var bean1 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean == bean1);

        var cat = applicationContext.getBean("cat", Cat.class);
        var cat1 = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat == cat1);

    }
}