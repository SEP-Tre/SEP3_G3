package sep3.g3.rightoversjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.FoodPostCreationDTO;
import sep3.g3.rightoversjava.service.FoodPostService;

@RestController
@RequestMapping("/rightovers")
public class FoodPostController {

    @Autowired
    private FoodPostService service;

    @PostMapping("/posts")
    public ResponseEntity<Object> createFoodPost(@RequestBody FoodPostCreationDTO dto) {
        FoodPost createdFP = service.create(dto);
        System.out.println(createdFP);
        return new ResponseEntity<>(createdFP, HttpStatus.CREATED);
    }

}
