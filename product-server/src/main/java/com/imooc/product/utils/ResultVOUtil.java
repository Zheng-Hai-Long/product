package com.imooc.product.utils;

import com.imooc.product.vo.ProductVO;
import com.imooc.product.vo.ResultVO;

import java.util.List;

/**
 * Created by ZHL on 2018/11/9.
 */
public class ResultVOUtil {

    public static ResultVO success(List<ProductVO> productVOList){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(productVOList);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
