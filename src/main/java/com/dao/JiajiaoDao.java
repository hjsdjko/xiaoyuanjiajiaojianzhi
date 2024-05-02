package com.dao;

import com.entity.JiajiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiajiaoView;

/**
 * 家教 Dao 接口
 *
 * @author 
 * @since 2021-05-06
 */
public interface JiajiaoDao extends BaseMapper<JiajiaoEntity> {

   List<JiajiaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
