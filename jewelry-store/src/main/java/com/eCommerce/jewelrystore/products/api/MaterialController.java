package com.eCommerce.jewelrystore.products.api;

import com.eCommerce.jewelrystore.products.model.Material;
import com.eCommerce.jewelrystore.products.service.MaterialService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/materials")
public class MaterialController {
    private MaterialService materialService;

    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }

    @GetMapping
    public ResponseEntity<List<Material>> getAll() {
        List<Material> materials = materialService.getAll();
        return ResponseEntity.ok(materials);
    }

    @GetMapping("/{materialID}")
    public ResponseEntity<Material> getByID(@PathVariable(name = "materialID") long materialID) {
        Optional<Material> materialOptional = materialService.getByID(materialID);
        if (!materialOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(materialOptional.get());
    }

    @PostMapping
    public ResponseEntity<Material> save(@RequestBody Material material) {
        return new ResponseEntity<>(materialService.saveMaterial(material), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Material> update(@RequestBody Material material) {
        Optional<Material> materialOptional = materialService.getByID(material.getMaterialID());
        if (!materialOptional.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }
        return ResponseEntity.ok(materialService.saveMaterial(material));
    }

    @DeleteMapping
    public ResponseEntity<HttpStatus> delete(long materialID){
        materialService.deleteMaterialByID(materialID);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
