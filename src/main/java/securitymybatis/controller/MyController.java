package securitymybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "/limits/login";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }


    @RequestMapping("/album")
    public String album(){
        return "album";
    }

    @RequestMapping("/details")
    public String details(){
        return "details";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/mcomment")
    public String mComment(){
        return "mcomment";
    }

    @RequestMapping("/whisper")
    public String whisper(){
        return "whisper";
    }

}
