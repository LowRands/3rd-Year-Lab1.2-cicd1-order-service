package thirdyearlab1.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import thirdyearlab1.Model.PurchaseOrder;
import thirdyearlab1.Service.PurchaseOrderService;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class PurchaseOrderController {
    private final PurchaseOrderService service;

    public PurchaseOrderController(PurchaseOrderService service) {
        this.service = service;
    }

    @GetMapping
    public List<PurchaseOrder> getAll() {
        return service.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PurchaseOrder create(@RequestBody PurchaseOrder order) {
        return service.create(order);
    }
}
