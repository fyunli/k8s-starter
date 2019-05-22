package li.fyun.k8s;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.k8s.greeting}")
    private String greeting;

    @GetMapping("/hello")
    public String hello() {
        return greeting;
    }

}
