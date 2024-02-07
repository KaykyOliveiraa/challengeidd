package com.devsuperior.desafioidd.services.services.service;

import com.devsuperior.desafioidd.entities.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        if (order.getBasic() < 100.0) {
            return order.getBasic() + 20.0;
        }
        else if (order.getBasic() > 100.0 && order.getBasic() < 200.0) {
            return order.getBasic() + 12.0;
        }
        return order.getBasic();
    }
}
