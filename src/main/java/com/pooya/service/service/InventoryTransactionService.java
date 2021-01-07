package com.pooya.service.service;

import com.pooya.common.service.BaseService;
import com.pooya.entity.dto.data.InventoryTransactionData;
import com.pooya.entity.entity.Inventory;
import com.pooya.entity.entity.InventoryTransaction;

import java.util.List;

public interface InventoryTransactionService extends BaseService<InventoryTransaction>{

    public List<InventoryTransactionData> fetchInventoryTransactions(Integer id);
}
