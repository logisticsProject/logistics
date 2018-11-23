$(()=>{
    $.ajax({
        url : emp_url+"selEmpAll",
        dataType:"json",
        type:"get",
                success : function (data) {
                    if (data == undefined ){
                        alert("暂无数据")
                        return
            }
            var appendVal=""
            $.each(data,function (index,empList) {
                appendVal +=`   
   <tr> <td width="25" ><input type="checkbox" name="${empList.id}" value="" id="${empList.id}"></td>
              <!--<td ">${empList.id}</td>-->
                <!--员工类型-->
                <td>${empList.descr}</td>
                <!--员工编号-->
                 <td>${empList.numbering}</td>
                <!--员工姓名-->
                <td>${empList.name}</td>
                <!--工作场地-->
                <td>${empList.workplace}</td>
                <!--角色id-->
                <input class="${empList.roleId}" type="hidden"/>
                <!--汽车ID-->
                <!--<td></td>-->
                      <td class="td-manage">
                   <a style="text-decoration:none" onClick="admin_start(this,'10001')" href="javascript:;" title="启用">
                   <i class="Hui-iconfont">&#xe615;</i></a> 
                   <a title="编辑" href="javascript:;" onclick="admin_edit('人员编辑','emp-add.html','2','800','500')"class="ml-5" style="text-decoration:none">
                    <i class="Hui-iconfont">&#xe6df;</i></a> 
                    <a title="删除" href="javascript:;" onclick="admin_del(this,'1')" class="ml-5" style="text-decoration:none">
                    <i class="Hui-iconfont">&#xe6e2;</i></a></td>
    </tr>  
               `
            })
                    $("#tbody").html(appendVal);
        }
    })

    //id点击事件
    $("${empList.id}").click(()=>{
        $.ajax({
            url: emp_url+"selfornum",
            data :{"id":$("#id").val(),"roleId":$("#roleId").val()},
            dataType: "json",
            type: "post",
            success:function (data) {
                alert(data)
            }
        })
    })

})