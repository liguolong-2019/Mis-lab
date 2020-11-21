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
@ApiModel("工作室信息类")
public class MisLabInfo {
    @ApiModelProperty("主键id")
    Integer id;
    @ApiModelProperty("图片所描述方向")
    String describes;
    @ApiModelProperty("图片地址")
    String img;
    @ApiModelProperty("信息所属大类")
    Integer type;
    @ApiModelProperty("图片信息")
    String info;
}
