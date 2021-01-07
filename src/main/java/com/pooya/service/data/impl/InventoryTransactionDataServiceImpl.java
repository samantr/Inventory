package com.pooya.service.data.impl;

import com.pooya.dao.data.InventoryTransactionDataDao;
import com.pooya.entity.dto.data.InventoryTransactionData;
import com.pooya.service.data.InventoryTransactionDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryTransactionDataServiceImpl implements InventoryTransactionDataService {

    @Autowired
    InventoryTransactionDataDao dao;

    @Override
    public List<InventoryTransactionData> fetchInventoryTransactions(Integer id) {
        return dao.fetchInventoryTransactions(id);
    }

    @Override
    public List<InventoryTransactionData> fetchAmounts() {
        return dao.fetchAmounts();
    }

    @Override
    public List<InventoryTransactionData> fetchAmounts(int i) {
        return dao.fetchAmounts(i);
    }
}
