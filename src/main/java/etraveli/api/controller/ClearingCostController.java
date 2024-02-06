package etraveli.api.controller;
import etraveli.api.model.ClearingCost;
import etraveli.api.service.ClearingCostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@Component
@RestController
@RequestMapping("/clearing-cost")
public class ClearingCostController {
    
    @Autowired(required = false)
    private ClearingCostService clearingCostService;
    
    @GetMapping
    public List<ClearingCost> getAllClearingCosts() {
        try{
            System.out.println("getClearingCosts");
            return clearingCostService.findAll();
        }catch(Exception e){
            System.out.println(e);
            return null;
        }

    }

    @GetMapping("/{id}")
    public ClearingCost getClearingCostById(@PathVariable Long id) {
        return clearingCostService.findById(id).orElse(null);
    }

    @PostMapping
    public ClearingCost createClearingCost(@RequestBody ClearingCost clearingCost) {
        return clearingCostService.save(clearingCost);
    }

    @PutMapping("/{id}")
    public ClearingCost updateClearingCost(@PathVariable Long id, @RequestBody ClearingCost clearingCost) {
        return clearingCostService.save(clearingCost);
    }

    @DeleteMapping("/{id}")
    public void deleteClearingCost(@PathVariable Long id) {
        clearingCostService.deleteById(id);
    }
    
}
