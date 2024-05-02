package com.dao;

import com.entity.JiajiaoOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiajiaoOrderView;

/**
 * 家教订单 Dao 接口
 *
 * @author 
 * @since 2021-05-06
 */
public interface JiajiaoOrderDao extends BaseMapper<JiajiaoOrderEntity> {

   List<JiajiaoOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
