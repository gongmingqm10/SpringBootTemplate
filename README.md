# SpringBootTemplate
The template demo for SpringBoot

## Requirements

* Java 8
* Intellij (with Lombok plugin installed)

## Step by step to build it

### Step 1

Download the initial spring boot sketch from [Spring Boot Starter](https://start.spring.io/)

And add `apply plugin: 'idea'` to support intellij importing.

Run `./gradlew build idea` to build the project

Finally, run `./gradlew bootRun`. You should found the success log if everything is fine.

### Step 2

Although we finished the sketch in Step 1. But if you run it, you found it exit immediately. Cause the Application is empty,
you need more things to make it more like an `application`.

We follow the [instruction](https://spring.io/guides/gs/spring-boot/) to build the hello world project.

So please replace the dependencies block inside `build.gradle`.

```
dependencies {
    compile("org.springframework.boot:spring-boot-starter-web") {
        exclude module: "spring-boot-starter-tomcat"
    }
    compile("org.springframework.boot:spring-boot-starter-jetty")
    compile("org.springframework.boot:spring-boot-starter-actuator")

    testCompile('org.springframework.boot:spring-boot-starter-test')
    testCompile("junit:junit")
}
```

After updating the gradle, run `./gradlew build` again to download the new dependencies.

### Step 3

Add the `HelloController.java`, just follow the instruction.

```
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

}
```

### Step 4

Now you have added the Controller, try to run the Application again via intellij or by gradle `./gradlew bootRun`.

We added the Controller in Step 3. And Spring Boot will automatically find the controller with annotation `@RestController`.

The application will hang up till you close it. Now you can see the `Hello World` message when you visit `localhost:8080`

### Step 5

We have added the dev-tools dependency. Means you can hot-run the application when you updated files.

More details or configurations, find [here](http://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-devtools.html)

Each time you updated something, and want to see it. Please rebuild it via `Build -> Make Projects`. You can find the shortcut to do it very quickly.