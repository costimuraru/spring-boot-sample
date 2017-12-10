package hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(factory= MyPropertySourceFactory.class, value="test.conf")
public class PropertyLoader {
    // Nothing needed here
}
