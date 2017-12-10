package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Duration;

@RestController
public class HelloController {

    @Value("${mykey}")
    Duration value;

    @RequestMapping("/")
    public String index() {
        return "Greetings at " + value;
    }

}
