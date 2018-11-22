package com.sixbang.logistics.seriver;

import com.sixbang.logistics.domain.ShowDetail;
import com.sixbang.logistics.mapper.ShowDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowDetailSeriver {

    @Autowired
    private ShowDetailMapper showDetailMapper;

    public ShowDetail seleteForNum(String numbering){
        return showDetailMapper.selectForNum(numbering);
    }

    public int updateForNum(ShowDetail showDetail){
        return showDetailMapper.updForNumber(showDetail);
    }

    public int addReceiptOrder(ShowDetail showDetail){
        return showDetailMapper.addReceiptOrder(showDetail);
    }

}
