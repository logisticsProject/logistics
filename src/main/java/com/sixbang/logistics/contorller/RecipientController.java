package com.sixbang.logistics.contorller;

import com.sixbang.logistics.domain.Recipient;
import com.sixbang.logistics.service.RecipientService;
import com.sixbang.logistics.util.RandomNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipientController {
    @Autowired
    private RecipientService recipientService;
    @Autowired
    static Recipient recipient=new Recipient();

    public int addRecipient(Recipient r){
        recipient.setNumbering(RandomNumber.getReceiver());

        recipient.setRname(r.getRname());
        recipient.setRphone(r.getRphone());
        recipient.setRaddress(r.getRaddress());

        return recipientService.addRecipient(recipient);
    }

    //获取收货人的ID
    public static int getRecipentId(){
        return recipient.getRid();
    }
}
