package Practice.Web.controller;

import Practice.Web.domain.item.Glasses;
import Practice.Web.service.GlassesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class GlassesController {

    private final GlassesService glassesService;

    @GetMapping("/glasses")
    public String list(Model model){
        List<Glasses> items = glassesService.findAll();
        model.addAttribute("items", items);
        return "/glasses/glassList";
    }
}
