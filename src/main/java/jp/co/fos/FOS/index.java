package jp.co.fos.FOS;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class index {
    @RequestMapping(value="/darli")
    public String DarliMethod() {
        return "index";
    }
}
