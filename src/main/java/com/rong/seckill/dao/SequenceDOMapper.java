package com.rong.seckill.dao;

import com.rong.seckill.dataobject.Sequence;

public interface SequenceDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Sun Nov 18 22:19:38 CST 2018
     */
    int deleteByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Sun Nov 18 22:19:38 CST 2018
     */
    int insert(Sequence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Sun Nov 18 22:19:38 CST 2018
     */
    int insertSelective(Sequence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Sun Nov 18 22:19:38 CST 2018
     */
    Sequence selectByPrimaryKey(String name);

    Sequence getSequenceByName(String name);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Sun Nov 18 22:19:38 CST 2018
     */
    int updateByPrimaryKeySelective(Sequence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Sun Nov 18 22:19:38 CST 2018
     */
    int updateByPrimaryKey(Sequence record);
}