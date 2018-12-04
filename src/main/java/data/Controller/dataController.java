package data.Controller;


import data.Service.dataService;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Service
@CrossOrigin("*")
@RestController()
@RequestMapping(value = "/Temp")
public class dataController {


    @Autowired
    dataService dataService;

    @GetMapping("/{medida}/{valor}")
    public Float getConvercion(@PathVariable("medida") String medida, @PathVariable("valor") String valor) {
        System.out.println(medida);
        System.out.println(valor);
        return dataService.temp(medida, valor);
    }
}