package com.home.dao.impl;

import com.home.dao.BaseDao;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.sql.SQLException;

/**
 * Created by zhiwen.cao on 2017/2/7.
 */
@Repository
public abstract  class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {

    @Autowired
    public void setSuperSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    /**
     * save
     * @param t
     * @return
     */
    public Serializable save(T t) {
        return this.getHibernateTemplate().save(t);
    }

    /**
     * update
     * @param t
     */
    public void update(T t) {
        this.getHibernateTemplate().update(t);
    }

    /**
     * delete
     *
     * @param t
     */
    public void delete(T t) {
        this.getHibernateTemplate().delete(t);
    }

    /**
     * get
     * @param id
     * @return
     */
    public T get(Class<T> clazz, Serializable id) {
        return this.getHibernateTemplate().get(clazz, id);
    }

    /**
     * saveOrUpdate
     *
     * @param t
     */
    public void saveOrUpdate(T t) {
        this.getHibernateTemplate().saveOrUpdate(t);
    }

    /**
     * findOne
     * @param clazz
     * @param fieldName
     * @param fieldValue
     * @return
     */
    public T findOne(final Class<T> clazz, final String fieldName,
                     final Object fieldValue) {
        return this.getHibernateTemplate().execute(new HibernateCallback<T>() {
            @SuppressWarnings("unchecked")
            public T doInHibernate(Session session) throws HibernateException,
                    SQLException {
                Criteria criteria = session.createCriteria(clazz);
                criteria.add(Restrictions.eq(fieldName, fieldValue));
                return (T) criteria.uniqueResult();
            }
        });
    }
}
