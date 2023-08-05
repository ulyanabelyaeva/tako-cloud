package com.belyaeva.storage.api;

import com.belyaeva.model.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);

}
