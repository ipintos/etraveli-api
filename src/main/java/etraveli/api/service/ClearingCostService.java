package etraveli.api.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import etraveli.api.model.ClearingCost;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Component
@Service
public interface ClearingCostService extends JpaRepository<ClearingCost, Long>{
    public List<ClearingCost> getAllClearingCosts();
    public ClearingCost getClearingCostById(Long id);
    public ClearingCost createClearingCost(ClearingCost clearingCost);
    public ClearingCost updateClearingCost(Long id, ClearingCost clearingCost);
    public void deleteClearingCost(Long id);
}
