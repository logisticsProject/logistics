package com.sixbang.logistics.service;

import com.sixbang.logistics.domain.Path;
import com.sixbang.logistics.mapper.PathMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PathService {

    @Autowired
    private PathMapper pathMapper;


    public List<Path> selectAll(){
        return pathMapper.selectAll();
    }

    public Path selectByPrimaryKey(Integer id){
        return pathMapper.selectByPrimaryKey(id);
    }

    public int deleteByPrimaryKey(Integer id){
        return pathMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKey(Path path){
        return pathMapper.updateByPrimaryKey(path);
    }

    public int insert (Path path){
        return pathMapper.insert(path);
    }

    public List<String> selectStartPlace(){
        return pathMapper.selectStartPlace();
    }

    public List<String> selectEndPlace(String startPlace){
        return pathMapper.selectEndPlace(startPlace);
    }

    public int selectPathId(Path path){
        return pathMapper.selectPathId(path);
    }

    public int addPath(Path path){
        return pathMapper.insert(path);
    }


}
