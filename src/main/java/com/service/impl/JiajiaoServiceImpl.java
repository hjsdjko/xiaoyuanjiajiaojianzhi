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

import com.dao.JiajiaoDao;
import com.entity.JiajiaoEntity;
import com.service.JiajiaoService;
import com.entity.view.JiajiaoView;

/**
 * 家教 服务实现类
 * @author 
 * @since 2021-05-06
 */
@Service("jiajiaoService")
@Transactional
public class JiajiaoServiceImpl extends ServiceImpl<JiajiaoDao, JiajiaoEntity> implements JiajiaoService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<JiajiaoView> page =new Query<JiajiaoView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
