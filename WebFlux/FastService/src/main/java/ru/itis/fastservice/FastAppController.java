package ru.itis.fastservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/text")
public class FastAppController {

    @GetMapping()
    public List<Entity> fast() {
        return List.of( new Entity("Fast App"));
    }
}

