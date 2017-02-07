package com.home.dao;

import java.io.Serializable;

/**
 * Created by zhiwen.cao on 2017/2/7.
 */
public interface BaseDao<T> {
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

    /**
     * findOne
     * @param clazz
     * @param fieldName
     * @param fieldValue
     * @return
     */
    public T findOne(final Class<T> clazz, final String fieldName, final Object fieldValue);
}
