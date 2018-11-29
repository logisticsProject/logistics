package com.sixbang.logistics.contorller;

import com.sixbang.logistics.domain.Orders;
import com.sixbang.logistics.domain.Path;
import com.sixbang.logistics.domain.Recipient;
import com.sixbang.logistics.domain.Sender;
import com.sixbang.logistics.service.AddOrderService;
import com.sixbang.logistics.util.RandomNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class AddOrderController {
    @Autowired
    private AddOrderService addOrderService;
    @Autowired
    private SenderController senderController;
    @Autowired
    private RecipientController recipientController;
    @Autowired
    private PathContorller pathContorller;


    @RequestMapping(value = "unfinished",method = RequestMethod.POST)
    public ResponseEntity<?> addOrder(@RequestParam(name = "sname") String sname,
                                      @RequestParam(name = "sphone") String sphone,
                                      @RequestParam(name="saddress") String saddress,
                                      @RequestParam(name="rname") String rname,
                                      @RequestParam(name="rphone") String rphone,
                                      @RequestParam(name="raddress") String raddress){
        //发货信息
        Sender sender=new Sender();
        sender.setSname(sname);
        sender.setSphone(sphone);
        sender.setSaddress(saddress);
        //收货信息
        Recipient recipient=new Recipient();
        recipient.setRname(rname);
        recipient.setRphone(rphone);
        recipient.setRaddress(raddress);
        //路线信息
        Path path=new Path();
        path.setStartplace(saddress);
        path.setEndplace(raddress);


        int ret=senderController.addSender(sender);
        int ret1=recipientController.addRecipient(recipient);
        Orders orders=new Orders();
        //生成该订单的编号
        orders.setNumberring(RandomNumber.getLiuShuiId());
        //插入该订单发货人的ID
        orders.setSendorId(SenderController.getSenderId());

        //插入该订单收货人的ID
        orders.setReceiverId(RecipientController.getRecipentId());

        //设置该订单状态为未填写完成
        orders.setStateId(0);

        //插入该订单的路线ID
        orders.setPathId(pathContorller.getPathId(path));
        //生成订单
        addOrderService.addOrder(orders);
        if (ret>0 && ret1>0) {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>("未提交成功",HttpStatus.OK);
    }

}

