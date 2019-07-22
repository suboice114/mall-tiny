package com.macro.malltiny.service.impl;

import com.macro.malltiny.mbg.mapper.PmsProductMapper;
import com.macro.malltiny.mbg.model.PmsProduct;
import com.macro.malltiny.service.PmsProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PmsProductServiceImpl implements PmsProductService {

    @Autowired
    private PmsProductMapper productMapper;

    @Transactional
    @Override
    public int create(PmsProduct product) {
        return 0;
    }
}
