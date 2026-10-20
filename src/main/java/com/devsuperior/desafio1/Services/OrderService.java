package com.devsuperior.desafio1.Services;

import com.devsuperior.desafio1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public Double total(Order order) {

       double valueDiscounted = (order.getDiscount() / 100 * order.getBasic());

       return order.getBasic() - valueDiscounted + shippingService.shipment(order) ;

    }

}
