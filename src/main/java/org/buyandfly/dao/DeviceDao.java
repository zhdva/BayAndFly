package org.buyandfly.dao;

import org.buyandfly.model.Device;
import org.springframework.stereotype.Repository;

@Repository
public class DeviceDao extends BaseDao<Device> implements IDeviceDao {

    DeviceDao() {
        super(Device.class);
    }

}