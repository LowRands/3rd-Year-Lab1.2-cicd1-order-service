package thirdyearlab1.Service;

import thirdyearlab1.Client.CatalogClient;
import org.springframework.stereotype.Service;
import thirdyearlab1.Client.dto.ProductResponse;
import thirdyearlab1.Model.PurchaseOrder;
import thirdyearlab1.Repo.PurchaseOrderRepo;
import java.util.List;

@Service
public class PurchaseOrderService {

    private final PurchaseOrderRepo purchaseRepo;
    private final CatalogClient catalogClient;

    public PurchaseOrderService(PurchaseOrderRepo purchaseRepo, CatalogClient catalogClient) {
        this.purchaseRepo = purchaseRepo;
        this.catalogClient = catalogClient;
    }

    public List<PurchaseOrder> getAll() {
        return purchaseRepo.findAll();
    }

    public PurchaseOrder create(PurchaseOrder purchaseOrder) {
        purchaseOrder.setId(null);
        return purchaseRepo.save(purchaseOrder);
    }

    public ProductResponse testCatalogConnection(Long productId) {
        return catalogClient.getProductById(productId);
    }
}