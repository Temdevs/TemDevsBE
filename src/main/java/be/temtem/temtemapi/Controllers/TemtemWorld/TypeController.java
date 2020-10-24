package be.temtem.temtemapi.Controllers.TemtemWorld;

import be.temtem.temtemapi.Entities.TemtemWorld.Furniture;
import be.temtem.temtemapi.Entities.TemtemWorld.Type;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TypeController {

    @PostMapping("/temtem/create/")
    public Type createType(@RequestBody String typeInfo) {

        JSONObject typeData = new JSONObject(typeInfo);
        return new Type((String)typeData.get("image_url"), (String)typeData.get("img_uri"));
    }
}
