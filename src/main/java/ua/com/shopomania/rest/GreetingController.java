package ua.com.shopomania.rest;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//TODO: try to use @RestController annotation
@Controller
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/greeting", method=RequestMethod.GET)
    @ResponseBody
    public Greeting greeting(
            @RequestParam (value="name", required=false, defaultValue="World") 
            String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}
