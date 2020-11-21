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
@ApiModel("学长学姐类")
public class Graduate {
    @ApiModelProperty("学号")
    private String xh;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("性别")
    private String sex;
    @ApiModelProperty("毕业去向")
    private String company;
    @ApiModelProperty("个人介绍")
    private String info;
    @ApiModelProperty("个人图片地址")
    private String img;
}
