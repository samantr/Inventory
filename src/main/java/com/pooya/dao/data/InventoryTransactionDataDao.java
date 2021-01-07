package com.pooya.dao.data;

import com.pooya.common.dao.BaseDataDao;
import com.pooya.entity.dto.data.InventoryTransactionData;

import java.util.List;


public interface InventoryTransactionDataDao extends BaseDataDao<InventoryTransactionData> {

    public List<InventoryTransactionData> fetchInventoryTransactions(Integer id);
    public List<InventoryTransactionData> fetchAmounts();
    public List<InventoryTransactionData> fetchAmounts(int i);

}
