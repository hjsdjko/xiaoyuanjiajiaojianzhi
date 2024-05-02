package com.dao;

import com.entity.JiajiaoLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiajiaoLiuyanView;

/**
 * 家教评价 Dao 接口
 *
 * @author 
 * @since 2021-05-06
 */
public interface JiajiaoLiuyanDao extends BaseMapper<JiajiaoLiuyanEntity> {

   List<JiajiaoLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
