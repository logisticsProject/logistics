$(()=>{
    /**
     * 查询触发
     */
    $("#selbtn").click(()=>{
        var numbering = $("#numbering").val();
        if (!numbering){
            alert("订单信息不能为空");
            return;
        }
        $.ajax({
            url: nginx_url + "selForNum",
            type: "post",
            data: {"numbering":numbering},
            dataType: 'json',
            success: function (showDetail) {
                // console.log(showDetail.startTime);

                // $("#sid").val(showDetail.sid)  ;
                //发货客户
                $("#sname").val(showDetail.sname)  ;
                //发货客户的电话
                $("#sphone").val(showDetail.sphone)  ;
                //发货客户的地址
                $("#saddress").val(showDetail.saddress)  ;
                //收货人编号
                $("#rid").val(showDetail.rid)  ;
                //收货人姓名
                $("#rname").val(showDetail.rname)  ;
                //收货人电话
                $("#rphone").val(showDetail.rphone)  ;
                //收货人地址
                $("#raddress").val(showDetail.raddress);
                //路线编号
                //$("#pathId").val(showDetail.pathId);
                //订单编号
                $("#numbering").val(showDetail.numbering)  ;

                $("#id").val(showDetail.id)  ;

                $("#sendGoodsAddr").val(showDetail.saddress);

                $("#receiveGoodsAddr").val(showDetail.raddress)  ;

                $("#stateId").val(showDetail.state_id)  ;

                $("#ispayed").val(showDetail.ispayed)  ;

                $("#payWay").val(showDetail.payWay)  ;

                $("#payment").val(showDetail.payment);

                $("#weight").val(showDetail.weight);

                $("#startTime").val(showDetail.startTime);

                /*private Date startTime;

                private Date fillDate;

                private Date forwardArriveTime;

                private Date endTime;*/

                $("#driverId").val(showDetail.driverId)  ;

                $("#receivablesRate").val(showDetail.receivablesRate);

                $("#receivables").val(showDetail.receivables);

                $("#subtraction").val(showDetail.subtraction);

                $("#staffId").val(showDetail.staffId)  ;

                $("#deliveryFee").val(showDetail.deliveryFee);

                $("#remark").val(showDetail.remark)  ;

                $("#insurance").val(showDetail.insurance);

                $("#amount").val(showDetail.amount);

                $("#volume").val(showDetail.volume);

                $("#goodsValue").val(showDetail.goodsValue);
            }
        })

    })
    /**
     * 修改触发
     * 异常返回 成功返回生成回执单
     */
    $("#updbtn").click(()=>{
        $.ajax({
            url: nginx_url + "updForNum",
            type: "post",
            data: {"stateId":$("#stateId").val(),
                "ispayed":$("#ispayed").val(),
                "numbering":$("#numbering").val()},
            dataType: "json",
            success:function (data) {
                if (!data){
                    alert("保存失败!!!")
                }
            }
        })
    })
})