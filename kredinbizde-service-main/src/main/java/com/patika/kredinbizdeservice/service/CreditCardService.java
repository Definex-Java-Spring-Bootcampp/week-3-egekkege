package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.CreditCard;
import com.patika.kredinbizdeservice.repository.CreditCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CreditCardService {
    private CreditCardRepository creditCardRepository = new CreditCardRepository();

    public CreditCard save(CreditCard creditCard) {
        creditCardRepository.save(creditCard);
        return creditCard;
    }

    public List<CreditCard> getAll() {
        return creditCardRepository.getAll();
    }


}
