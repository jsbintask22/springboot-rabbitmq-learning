package cn.jsbintask.springbootrabbitmqlearning;

import cn.jsbintask.springbootrabbitmqlearning.config.RabbitmqConfig;
import lombok.extern.java.Log;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@Log
public class SpringbootRabbitmqLearningApplication {

    public static void main(String[] args) throws Exception{
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootRabbitmqLearningApplication.class, args);
        CountDownLatch countDownLatch = context.getBean(CountDownLatch.class);
        RabbitTemplate rabbitTemplate = context.getBean(RabbitTemplate.class);

        log.info("Sending msg....");
        rabbitTemplate.convertAndSend(RabbitmqConfig.TOPIC_EXCHANGE_NAME, RabbitmqConfig.ROUTE_KEY, "hello from jsbintask.");
        countDownLatch.await();

        System.exit(-1);
    }

}

