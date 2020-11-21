package com.lgl.zhuye.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 李国龙
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel("学生用户类")
public class Account {
    @ApiModelProperty("学生学号")
    String xh;
    @ApiModelProperty("学生姓名")
    String name;
    @ApiModelProperty("学生账号密码")
    String password;
}
