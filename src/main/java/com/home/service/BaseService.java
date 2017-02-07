package com.home.service;

import java.io.Serializable;

/**
 * Created by zhiwen.cao on 2017/2/7.
 */
public interface BaseService<T> {
    /**
     * save
     * @param t
     * @return
     */
    public Serializable save(T t);

    /**
     *update
     * @param t
     */
    public void update(T t);

    /**
     * delete
     * @param t
     */
    public void delete(T t);

    /**
     * get
     * @param clazz
     * @param id
     * @return
     */
    public T get(Class<T> clazz, Serializable id);

    /**
     * saveOrUpdate
     * @param t
     */
    public void saveOrUpdate(T t);
}
