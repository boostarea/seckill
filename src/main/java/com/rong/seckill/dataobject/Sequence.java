package com.rong.seckill.dataobject;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Sequence {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sequence_info.name
     *
     * @mbg.generated Sun Nov 18 22:19:38 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sequence_info.current_value
     *
     * @mbg.generated Sun Nov 18 22:19:38 CST 2018
     */
    private Integer currentValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sequence_info.step
     *
     * @mbg.generated Sun Nov 18 22:19:38 CST 2018
     */
    private Integer step;

}