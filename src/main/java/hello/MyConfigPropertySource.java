package hello;

import org.springframework.core.env.PropertySource;

import java.time.Duration;

public class MyConfigPropertySource extends PropertySource {

    MyConfigPropertySource(String name) {
        super(name);
    }

    @Override
    public Object getProperty(String path) {
        return "mykey".equals(path) ? Duration.ofMinutes(1) : null;
    }
}
