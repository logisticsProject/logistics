package com.sixbang.logistics.contorller;

import com.sixbang.logistics.domain.Path;
import com.sixbang.logistics.service.PathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/path")
public class PathContorller {

    @Autowired
    private PathService pathService;

    public int addPath(Path path){
        return pathService.addPath(path);
    }


    @RequestMapping(value = "/selAll",method = RequestMethod.GET)
    public ResponseEntity<?> seleteAll(){
        List<Path> path =  pathService.selectAll();
        if (path!=null) {
            return new ResponseEntity<>(path, HttpStatus.OK);
        }
        return new ResponseEntity<>("未到路线查询",HttpStatus.OK);
    }

    /**
     * 删除路线
     * @param id
     * @return
     */
    @RequestMapping(value = "/del" , method = RequestMethod.DELETE)
    public ResponseEntity<?> del(@RequestParam(name = "id")Integer id){
        int folRows = pathService.deleteByPrimaryKey(id);
        if (folRows>0){
            return new ResponseEntity<>("删除成功",HttpStatus.OK);
        }
        return new ResponseEntity<>("删除失败",HttpStatus.OK);
    }

    @RequestMapping(value = "/upd",method = RequestMethod.PUT)
    public ResponseEntity<?> updateByPrimaryKey(@RequestParam("id") Integer id,
                                 @RequestParam("startplace")String startplace,
                                 @RequestParam("endplace")String endplace,
                                 @RequestParam("priceperunit")Double priceperunit) {
        Path path = new Path();
        path.setId(id);
        path.setEndplace(endplace);
        path.setStartplace(startplace);
        path.setPriceperunit(priceperunit);
        //判断id是否为空值，id空值不为空修改
        if (path.getId() != null) {
            //修改
            int fowRols = pathService.updateByPrimaryKey(path);
            if (fowRols>0){
                return new ResponseEntity<>("修改成功", HttpStatus.OK);
            }else {
                return new ResponseEntity<>("修改失败", HttpStatus.OK);
            }
        }else {
            //新增
            int fowRols = pathService.insert(path);
            if (fowRols>0){
                return new ResponseEntity<>("新增成功", HttpStatus.OK);
            }else {
                return new ResponseEntity<>("新增失败", HttpStatus.OK);
            }
        }
    }

    //查询所有出发地
    @RequestMapping(value = "selpath",method = RequestMethod.GET)
    public ResponseEntity<?> selectStartPlace(){
        List<String> placeList=pathService.selectStartPlace();
        return new ResponseEntity<>(placeList,HttpStatus.OK);
    }

    //根据出发地查询到达地
    @RequestMapping(value = "endplace",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> selectStopPlace(@RequestParam(name = "saddress") String startPlace){
        List<String> placeList=pathService.selectEndPlace(startPlace);
        return new ResponseEntity<>(placeList,HttpStatus.OK);
    }

    //根据出发地和到达地获得路线ID
    public int getPathId(Path path){
        int pathId=pathService.selectPathId(path);
        return pathId;
    }
}
