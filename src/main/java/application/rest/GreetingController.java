package application.rest;

import java.util.concurrent.atomic.AtomicLong;

import hello.Car;
import net.sargue.mailgun.Configuration;
import net.sargue.mailgun.Mail;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping(value = "/car", method = RequestMethod.POST)
    public Greeting update(@RequestBody Car car) {
        Configuration configuration = new Configuration()
                .domain("sandbox84f18e68139b47b5a326c912cb4b3c38.mailgun.org")
                .apiKey("key-7fcc1bc67e3bb8cbae048b6e872904be")
                .from("Test", "mailgun@sandbox84f18e68139b47b5a326c912cb4b3c38.mailgun.org");
        Mail.using(configuration)
                .to("jan.merta.90@gmail.com")
                .subject("predmet")
                .text("cau kamo")
                .build()
                .send();
        return new Greeting(counter.incrementAndGet(),
                String.format(template, car.getVIN()));
    }
}