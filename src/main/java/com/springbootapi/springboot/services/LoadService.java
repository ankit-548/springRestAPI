package com.springbootapi.springboot.services;

import java.util.List;

import com.springbootapi.springboot.entities.Load;

public interface LoadService {
    public List<Load> getLoads();
    public Load getLoad(long shipperId);
    public Load addLoad(Load load);
    public Load updateLoad(Load load);
    public void deletLoad(long parseLong);
}
