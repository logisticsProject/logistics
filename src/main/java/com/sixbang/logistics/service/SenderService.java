package com.sixbang.logistics.service;

import com.sixbang.logistics.domain.Sender;
import com.sixbang.logistics.mapper.SenderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SenderService {
    @Autowired
    private SenderMapper senderMapper;

    public int addSender(Sender sender){
        return senderMapper.insert(sender);
    }

}
