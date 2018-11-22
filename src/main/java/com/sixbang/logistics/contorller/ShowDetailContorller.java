package com.sixbang.logistics.contorller;

import com.sixbang.logistics.domain.ShowDetail;
import com.sixbang.logistics.seriver.ShowDetailSeriver;
import com.sixbang.logistics.util.RandomNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/showDetail")
public class ShowDetailContorller {

    @Autowired
    private ShowDetailSeriver showDetailSeriver;

    /**
     * 根据 订单查询该订单的状态
     * @param Numbering
     * @return
     */
    @RequestMapping(value = "/selForNum",method = RequestMethod.POST)
    public ResponseEntity<?> seleteForNum(@RequestParam("numbering")String Numbering){
        ShowDetail showDetail = showDetailSeriver.seleteForNum(Numbering);
        if (showDetail==null){
            showDetail.setMsg("未查询到该订单信息");
        }
        return new ResponseEntity<>(showDetail, HttpStatus.OK);
    }

    /**
     * 更具 查询出来的订单信息对订单的 支付状态 运输状态修改
     * @param stateId
     * @param ispayed
     * @return
     */
    @RequestMapping(value = "/updForNum",method = RequestMethod.POST)
    public ResponseEntity<?> updateForNum(@RequestParam("numbering")String Numbering,
            @RequestParam("stateId")Integer stateId,@RequestParam("ispayed")Integer ispayed){
        ShowDetail showDetail = new ShowDetail();
        showDetail.setStateId(stateId);
        showDetail.setIspayed(ispayed);
        int fluRows = showDetailSeriver.updateForNum(showDetail);
        String str = null;
        //修改成功生成回执单
        if (fluRows>0) {
                str = "保存成功";
                int restul = addReceiptOrder(Numbering);
                if (restul>0){

                }else {
                    str = "修改的时候出现了问题";
                }
        }else {
            str = "修改的时候出现了问题";
        }
        return new ResponseEntity<>(str,HttpStatus.OK);
    }


    /**
     * 回执单
     */

    public int addReceiptOrder(String numbering){
        int fluRows = 0;
        ShowDetail showDetail = new ShowDetail();
        showDetail.setNumbering(numbering);
        showDetail.setContractId(new RandomNumber().getContractId());
        showDetailSeriver.addReceiptOrder(showDetail);
        return fluRows;
    }

}
