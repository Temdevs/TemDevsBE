package be.temtem.temtemapi.Controllers.TemtemWorld;

import be.temtem.temtemapi.Entities.TemtemWorld.Temtem;
import be.temtem.temtemapi.Entities.TemtemWorld.Type;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class TemtemController {
    @PostMapping("/temtem/create}")
    public Temtem createTemtem(@RequestBody String info) {
        JSONObject temtemData = new JSONObject(info);
        return new Temtem((ArrayList<Type>)temtemData.get("types"), (String)temtemData.get("name"), (String)temtemData.get("image_uri"), (Temtem)temtemData.get("evolves_to"), (Temtem)temtemData.get("evolves_from"));
    }
}
