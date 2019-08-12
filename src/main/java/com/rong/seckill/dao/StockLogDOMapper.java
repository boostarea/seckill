package com.rong.seckill.dao;

import com.rong.seckill.dataobject.StockLog;

public interface StockLogDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_log
     *
     * @mbg.generated Mon Feb 25 23:42:11 CST 2019
     */
    int deleteByPrimaryKey(String stockLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_log
     *
     * @mbg.generated Mon Feb 25 23:42:11 CST 2019
     */
    int insert(StockLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_log
     *
     * @mbg.generated Mon Feb 25 23:42:11 CST 2019
     */
    int insertSelective(StockLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_log
     *
     * @mbg.generated Mon Feb 25 23:42:11 CST 2019
     */
    StockLog selectByPrimaryKey(String stockLogId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_log
     *
     * @mbg.generated Mon Feb 25 23:42:11 CST 2019
     */
    int updateByPrimaryKeySelective(StockLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_log
     *
     * @mbg.generated Mon Feb 25 23:42:11 CST 2019
     */
    int updateByPrimaryKey(StockLog record);
}