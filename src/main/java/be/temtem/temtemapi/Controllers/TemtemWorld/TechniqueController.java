package be.temtem.temtemapi.Controllers.TemtemWorld;

import be.temtem.temtemapi.Entities.TemtemWorld.Furniture;
import be.temtem.temtemapi.Entities.TemtemWorld.Technique;
import be.temtem.temtemapi.Entities.TemtemWorld.Type;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TechniqueController {
    @PostMapping("/temtem/create/")
    public Technique createFurniture(@RequestBody String techniqueInfo) {
        JSONObject techniqueData = new JSONObject(techniqueInfo);

        return new Technique((Type)techniqueData.get("type"), (String)techniqueData.get("name"),
                (String)techniqueData.get("category"), (String)techniqueData.get("damage"),
                (Number)techniqueData.get("stamina"), (Number) techniqueData.get("hold"),
                (Number) techniqueData.get("priority"),(String)techniqueData.get("description"),
                (String)techniqueData.get("synergy"), (String)techniqueData.get("synergy_effect"));
    }
}
