package com.jsprogramming.orderservice.controller;

import com.jsprogramming.orderservice.dto.OrderRequest;
import com.jsprogramming.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderedRequest) {
        orderService.placeOrder(orderedRequest);
        return "Order placed successfully";
    }
}
