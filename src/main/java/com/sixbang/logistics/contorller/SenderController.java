package com.sixbang.logistics.contorller;

import com.sixbang.logistics.domain.Sender;
import com.sixbang.logistics.service.SenderService;
import com.sixbang.logistics.util.RandomNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenderController {
    @Autowired
    private SenderService senderService;
    @Autowired
    static Sender sender=new Sender();

    public int addSender(Sender s){
        sender.setSname(s.getSname());
        sender.setSphone(s.getSphone());
        sender.setSaddress(s.getSaddress());
        sender.setNumbering(RandomNumber.getReceiver());
        return senderService.addSender(sender);
    }

    //获取发货人的ID
    public static int getSenderId(){
        return sender.getSid();
    }
}
