package thirdyearlab1.Service;

import org.springframework.stereotype.Service;
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
}