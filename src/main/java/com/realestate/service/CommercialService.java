package com.realestate.service;

import com.realestate.dto.CommercialPropertyDto;
import com.realestate.mapper.CommercialMapper;
import com.realestate.model.Property.CommercialProperty;
import com.realestate.repository.CommercialRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CommercialService {

    private final CommercialRepository commercialRepository;
    private final CommercialMapper commercialMapper;

    public CommercialService(CommercialRepository commercialRepository, CommercialMapper commercialMapper) {
        this.commercialRepository = commercialRepository;
        this.commercialMapper = commercialMapper;
    }
    @Transactional
    public CommercialPropertyDto saveCommercialProperty(CommercialPropertyDto dto){
        CommercialProperty commercialProperty = commercialMapper.map(dto);
        CommercialProperty saved = commercialRepository.save(commercialProperty);
        return commercialMapper.map(saved);
    }

    public Optional<CommercialPropertyDto> getCommercialPropertyById(Long id){
        return commercialRepository.findById(id).map(commercialMapper::map);
    }
}