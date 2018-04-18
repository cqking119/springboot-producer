package springboot;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@Service
public class TestController {

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name")  String name ) {
        return "hello"+","+name+",this is first message";
    }
}
