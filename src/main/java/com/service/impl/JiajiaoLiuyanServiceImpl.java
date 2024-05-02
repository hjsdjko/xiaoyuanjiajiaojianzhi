package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.JiajiaoLiuyanDao;
import com.entity.JiajiaoLiuyanEntity;
import com.service.JiajiaoLiuyanService;
import com.entity.view.JiajiaoLiuyanView;

/**
 * 家教评价 服务实现类
 * @author 
 * @since 2021-05-06
 */
@Service("jiajiaoLiuyanService")
@Transactional
public class JiajiaoLiuyanServiceImpl extends ServiceImpl<JiajiaoLiuyanDao, JiajiaoLiuyanEntity> implements JiajiaoLiuyanService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<JiajiaoLiuyanView> page =new Query<JiajiaoLiuyanView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
