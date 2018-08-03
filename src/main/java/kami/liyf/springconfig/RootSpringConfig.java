package kami.liyf.springconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(value = "kami.liyf",
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = WebSpringConfig.class),
                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class)})
public class RootSpringConfig {

}
