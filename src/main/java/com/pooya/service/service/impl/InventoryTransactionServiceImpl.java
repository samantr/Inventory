package com.pooya.service.service.impl;

import com.pooya.common.service.impl.BaseServiceImpl;
import com.pooya.dao.data.InventoryTransactionDataDao;
import com.pooya.entity.dto.data.InventoryTransactionData;
import com.pooya.entity.entity.InventoryTransaction;
import com.pooya.service.service.InventoryTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryTransactionServiceImpl extends BaseServiceImpl<InventoryTransaction> implements InventoryTransactionService {

    @Autowired
    InventoryTransactionDataDao dao;

    @Override
    public List<InventoryTransactionData> fetchInventoryTransactions(Integer id) {
        return dao.fetchInventoryTransactions(id);
    }
}
