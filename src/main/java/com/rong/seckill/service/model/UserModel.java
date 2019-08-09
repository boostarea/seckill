package com.rong.seckill.service.model;

import lombok.Data;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * @Author chenrong
 * @Date 2019-08-11 15:27
 **/
@Data
public class UserModel implements Serializable{
    private Integer id;
    @NotBlank(message = "用户名不能为空")
    private String name;

    @NotNull(message = "性别不能不填写")
    private Byte gender;

    @NotNull(message = "年龄不能不填写")
    @Min(value = 0,message = "年龄必须大于0岁")
    @Max(value = 150,message = "年龄必须小于150岁")
    private Integer age;

    @NotBlank(message = "手机号不能为空")
    private String telphone;
    private String registerMode;
    private String thirdPartyId;
    @NotBlank(message = "密码不能为空")
    private String encrptPassword;

}