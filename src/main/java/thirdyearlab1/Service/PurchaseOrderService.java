package thirdyearlab1.Service;

import thirdyearlab1.Client.CatalogClient;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
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

    public String testCatalogConnection(Long ProductId){
        return catalogClient.getProductById(ProductId);
    }
}