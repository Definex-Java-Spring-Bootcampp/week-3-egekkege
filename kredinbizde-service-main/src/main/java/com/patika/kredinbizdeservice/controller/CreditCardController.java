// This is the controller class of the CreditCard entity.
package com.patika.kredinbizdeservice.controller;

import com.patika.kredinbizdeservice.model.CreditCard;
import com.patika.kredinbizdeservice.service.CreditCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@RequestMapping("/api/cards")
@RequiredArgsConstructor
public class CreditCardController {
    private final CreditCardService creditCardService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreditCard create(CreditCard creditCard) {
        return creditCardService.save(creditCard);
    }

    // The getAll method is used to get all the credit card objects
    @GetMapping
    public List<CreditCard> getAll() {
        return creditCardService.getAll();
    }

}
