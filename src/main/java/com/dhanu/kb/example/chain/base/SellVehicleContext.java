package com.dhanu.kb.example.chain.base;

import java.util.concurrent.ConcurrentHashMap;

public class SellVehicleContext extends ConcurrentHashMap<String, Object>
        implements BaseContext
{

    private static final long serialVersionUID = 3434023450555469048L;

    @Override
    public <T> T retrive(String key)
    {
        final Object object = get(key);

        if (null == object)
        {
            return null;
        }

        @SuppressWarnings("unchecked")
        final T value = (T) object;

        return value;
    }
}
