$(()=>{
    $.ajax({
        url: path_url+"selAll",
        dataType:"json",
        type:"get",
        success:function (data) {
            console.log(data)
            var appendVal = "";
            $.each(data,function (index,path) {
                appendVal +=`
    <tr> <td width="25"><input type="checkbox" name="" value=""></td>
                    <td>${path.id}</td>
                    <td>${path.startplace}</td>
                    <td>${path.endplace}</td>
                    <td>${path.priceperunit}</td>
                   <td class="td-manage">
                   <a style="text-decoration:none" onClick="admin_start(this,'10001')" href="javascript:;" title="启用">
                   <i class="Hui-iconfont">&#xe615;</i></a> 
                   <a title="编辑" href="javascript:;" onclick="admin_edit('路线编辑','path-add.html','2','800','500')"class="ml-5" style="text-decoration:none">
                    <i class="Hui-iconfont">&#xe6df;</i></a> 
                    <a title="删除" href="javascript:;" onclick="admin_del(this,'1')" class="ml-5" style="text-decoration:none">
                    <i class="Hui-iconfont">&#xe6e2;</i></a></td>
    </tr>        `
            })
            $("#tbody").html(appendVal);
        }
    })
})