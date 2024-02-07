package com.devsuperior.desafioidd.services.services;

import com.devsuperior.desafioidd.entities.entities.Order;
import com.devsuperior.desafioidd.services.services.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total (Order order){
        double perc = order.getBasic() * order.getDiscount() / 100;
       return shippingService.shipment(order) - perc;

    }
}
