package com.sixbang.logistics.service;

import com.sixbang.logistics.domain.Recipient;
import com.sixbang.logistics.mapper.RecipientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipientService {
    @Autowired
    private RecipientMapper recipientMapper;

    public int addRecipient(Recipient recipient){
        return recipientMapper.insert(recipient);
    }
}
