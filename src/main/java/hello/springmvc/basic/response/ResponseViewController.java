package hello.springmvc.basic.response;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class ResponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1(){
        ModelAndView modelAndView = new ModelAndView("response/hello")
                .addObject("data", "hello");

        log.info("responseViewV1 modelAndView info={}", modelAndView);

        return modelAndView;

    }

    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model){

        model.addAttribute("data", "hello");
        log.info("responseViewV2 model info={}", model);

        return "response/hello";

    }

    @RequestMapping("response/hello")
    public void responseViewV3(Model model){

        model.addAttribute("data", "hello");
        log.info("responseViewV3 model info={}", model);

    }
}
