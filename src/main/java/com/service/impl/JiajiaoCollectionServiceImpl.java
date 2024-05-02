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

import com.dao.JiajiaoCollectionDao;
import com.entity.JiajiaoCollectionEntity;
import com.service.JiajiaoCollectionService;
import com.entity.view.JiajiaoCollectionView;

/**
 * 家教收藏 服务实现类
 * @author 
 * @since 2021-05-06
 */
@Service("jiajiaoCollectionService")
@Transactional
public class JiajiaoCollectionServiceImpl extends ServiceImpl<JiajiaoCollectionDao, JiajiaoCollectionEntity> implements JiajiaoCollectionService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<JiajiaoCollectionView> page =new Query<JiajiaoCollectionView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
