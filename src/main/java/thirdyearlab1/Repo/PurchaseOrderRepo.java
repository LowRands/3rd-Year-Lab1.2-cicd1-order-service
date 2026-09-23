package thirdyearlab1.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import thirdyearlab1.Model.PurchaseOrder;

public interface PurchaseOrderRepo extends JpaRepository<PurchaseOrder,Long> {
}
