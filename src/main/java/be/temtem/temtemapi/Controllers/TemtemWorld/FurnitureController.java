package be.temtem.temtemapi.Controllers.TemtemWorld;

import be.temtem.temtemapi.Entities.TemtemWorld.Furniture;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FurnitureController {

    @PostMapping("/temtem/create/")
    public Furniture createFurniture(@RequestBody String furnitureInfo) {

        JSONObject furnitureData = new JSONObject(furnitureInfo);

        return new Furniture((String)furnitureData.get("classification"), (String)furnitureData.get("image_url"),
                (String)furnitureData.get("img_uri"), (Number)furnitureData.get("cost"),
                (Number) furnitureData.get("space"));
    }
}
