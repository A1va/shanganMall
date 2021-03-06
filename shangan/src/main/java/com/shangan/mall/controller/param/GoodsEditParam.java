package com.shangan.mall.controller.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class GoodsEditParam {
    @ApiModelProperty("商品ID")
    private Long goodsId;

    @ApiModelProperty("商品名称")
    private String goodsName;

    @ApiModelProperty("商品标签")
    private String tag;

    @ApiModelProperty("商品成本价")
    private Integer originalPrice;

    @ApiModelProperty("商品利润")
    private Integer profit;

    @ApiModelProperty("商品库存")
    private Integer stockNum;

    @ApiModelProperty("商品上架状态")
    private Byte goodsSellStatus;

    @ApiModelProperty("商品详细说明")
    private String goodsDetailContent;
}
