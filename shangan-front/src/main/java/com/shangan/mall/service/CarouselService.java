package com.shangan.mall.service;

import com.shangan.mall.controller.vo.IndexCarouselVo;

import java.util.List;

/**
 * @Author Alva
 * @CreateTime 2021/1/28 13:46
 */
public interface CarouselService {

    /**
     * 返回固定数量的轮播图对象(首页调用)
     * @param number
     * @return
     */
    List<IndexCarouselVo> getCarouselsForIndex(int number);
}
