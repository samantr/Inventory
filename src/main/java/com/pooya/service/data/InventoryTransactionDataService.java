package com.pooya.service.data;

import com.pooya.common.service.BaseDataService;
import com.pooya.entity.dto.data.InventoryTransactionData;

import java.util.List;

public interface InventoryTransactionDataService extends BaseDataService<InventoryTransactionData>{

    public List<InventoryTransactionData> fetchInventoryTransactions(Integer id);
    public List<InventoryTransactionData> fetchAmounts();
    public List<InventoryTransactionData> fetchAmounts(int i);
}
