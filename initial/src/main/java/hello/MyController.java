package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by akhodzinsky on 17.01.2017.
 */
@Controller
@RequestMapping("/test")
public class MyController {
    private static final String template ="Test, %s";
    private final AtomicLong counter =new AtomicLong();

    @RequestMapping(method = RequestMethod.GET)
    public  @ResponseBody Greeting sayTest(@RequestParam(value="name",required = false,defaultValue = "default") String  name){
        Draw.replaceColor();
        Draw.make();
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }
}
