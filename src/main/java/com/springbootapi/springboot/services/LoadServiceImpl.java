package com.springbootapi.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootapi.springboot.dao.LoadDao;
import com.springbootapi.springboot.entities.Load;
@Service
public class LoadServiceImpl implements LoadService {
    @Autowired
    private LoadDao loadDao;


    public LoadServiceImpl() {
    }

    @Override
    public List<Load> getLoads() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getLoads'");
         return loadDao.findAll();
    }

    @Override
    public Load getLoad(long shipperId) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getLoad'");
        return loadDao.getReferenceById(shipperId);
    }

    @Override
    public Load addLoad(Load load) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'addLoad'");
         loadDao.save(load);
        return load;
    }

    @Override
    public Load updateLoad(Load load) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'updateLoad'");
        loadDao.save(load);
        return load;
    }

    @Override
    public void deletLoad(long parseLong) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'deletLoad'");
        Load entity = loadDao.getReferenceById(parseLong);
            loadDao.delete(entity);

    }
 
}
