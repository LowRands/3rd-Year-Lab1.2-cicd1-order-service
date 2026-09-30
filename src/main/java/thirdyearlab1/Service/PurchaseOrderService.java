package thirdyearlab1.Service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import thirdyearlab1.Model.PurchaseOrder;
import thirdyearlab1.Repo.PurchaseOrderRepo;
import java.util.List;

@Service
public class PurchaseOrderService {

    private final PurchaseOrderRepo purchaseRepo;
    public PurchaseOrderService(PurchaseOrderRepo purchaseRepo) {
        this.purchaseRepo = purchaseRepo;
    }

    public List<PurchaseOrder> getAll() {
        return purchaseRepo.findAll();
    }

    public PurchaseOrder create(PurchaseOrder purchaseOrder) {
        purchaseOrder.setId(null);
        return purchaseRepo.save(purchaseOrder);
    }

    public PurchaseOrder getById(Long id) {
        return purchaseRepo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Purchase Order Not Found"
                ));
    }
}