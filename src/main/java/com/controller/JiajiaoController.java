package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.JiajiaoEntity;

import com.service.JiajiaoService;
import com.entity.view.JiajiaoView;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 家教
 * 后端接口
 * @author
 * @email
 * @date 2021-05-06
*/
@RestController
@Controller
@RequestMapping("/jiajiao")
public class JiajiaoController {
    private static final Logger logger = LoggerFactory.getLogger(JiajiaoController.class);

    @Autowired
    private JiajiaoService jiajiaoService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
     
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "家教".equals(role)){
            params.put("jiajiaoId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = jiajiaoService.queryPage(params);

        //字典表数据转换
        List<JiajiaoView> list =(List<JiajiaoView>)page.getList();
        for(JiajiaoView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JiajiaoEntity jiajiao = jiajiaoService.selectById(id);
        if(jiajiao !=null){
            //entity转view
            JiajiaoView view = new JiajiaoView();
            BeanUtils.copyProperties( jiajiao , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody JiajiaoEntity jiajiao, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,jiajiao:{}",this.getClass().getName(),jiajiao.toString());
        Wrapper<JiajiaoEntity> queryWrapper = new EntityWrapper<JiajiaoEntity>()
            .eq("username", jiajiao.getUsername())
            .eq("password", jiajiao.getPassword())
            .eq("jiajiao_name", jiajiao.getJiajiaoName())
            .eq("sex_types", jiajiao.getSexTypes())
            .eq("xuqiu_types", jiajiao.getXuqiuTypes())
            .eq("jiajiao_id_number", jiajiao.getJiajiaoIdNumber())
            .eq("jiajiao_phone", jiajiao.getJiajiaoPhone())
            .eq("jiajiao_email", jiajiao.getJiajiaoEmail())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JiajiaoEntity jiajiaoEntity = jiajiaoService.selectOne(queryWrapper);
        if(jiajiaoEntity==null){
            jiajiao.setCreateTime(new Date());
            jiajiao.setPassword("123456");
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      jiajiao.set
        //  }
            jiajiaoService.insert(jiajiao);
            return R.ok();
        }else {
            return R.error(511,"账户或者身份证号或者手机号已经被使用");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody JiajiaoEntity jiajiao, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,jiajiao:{}",this.getClass().getName(),jiajiao.toString());
        //根据字段查询是否有相同数据
        Wrapper<JiajiaoEntity> queryWrapper = new EntityWrapper<JiajiaoEntity>()
            .notIn("id",jiajiao.getId())
            .andNew()
            .eq("username", jiajiao.getUsername())
            .eq("password", jiajiao.getPassword())
            .eq("jiajiao_name", jiajiao.getJiajiaoName())
            .eq("sex_types", jiajiao.getSexTypes())
            .eq("xuqiu_types", jiajiao.getXuqiuTypes())
            .eq("jiajiao_id_number", jiajiao.getJiajiaoIdNumber())
            .eq("jiajiao_phone", jiajiao.getJiajiaoPhone())
            .eq("jiajiao_email", jiajiao.getJiajiaoEmail())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JiajiaoEntity jiajiaoEntity = jiajiaoService.selectOne(queryWrapper);
        if("".equals(jiajiao.getJiajiaoPhoto()) || "null".equals(jiajiao.getJiajiaoPhoto())){
                jiajiao.setJiajiaoPhoto(null);
        }
        if(jiajiaoEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      jiajiao.set
            //  }
            jiajiaoService.updateById(jiajiao);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"账户或者身份证号或者手机号已经被使用");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        jiajiaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

    /**
    * 登录
    */
    @IgnoreAuth
    @RequestMapping(value = "/login")
    public R login(String username, String password, String captcha, HttpServletRequest request) {
        JiajiaoEntity jiajiao = jiajiaoService.selectOne(new EntityWrapper<JiajiaoEntity>().eq("username", username));
        if(jiajiao==null || !jiajiao.getPassword().equals(password)) {
            return R.error("账号或密码不正确");
        }
        //  // 获取监听器中的字典表
        // ServletContext servletContext = ContextLoader.getCurrentWebApplicationContext().getServletContext();
        // Map<String, Map<Integer, String>> dictionaryMap= (Map<String, Map<Integer, String>>) servletContext.getAttribute("dictionaryMap");
        // Map<Integer, String> role_types = dictionaryMap.get("role_types");
        // role_types.get(yonghu.getRoleTypes());
        String token = tokenService.generateToken(jiajiao.getId(),username, "jiajiao", "家教");
        R r = R.ok();
        r.put("token", token);
        r.put("role","家教");
        r.put("username",jiajiao.getJiajiaoName());
        r.put("tableName","jiajiao");
        r.put("userId",jiajiao.getId());
        return r;
    }

    /**
    * 注册
    */
    @IgnoreAuth
    @PostMapping(value = "/register")
    public R register(@RequestBody JiajiaoEntity jiajiao){
    //    	ValidatorUtils.validateEntity(user);
        if(jiajiaoService.selectOne(new EntityWrapper<JiajiaoEntity>().eq("username", jiajiao.getUsername()).orNew().eq("jiajiao_phone",jiajiao.getJiajiaoPhone()).orNew().eq("jiajiao_id_number",jiajiao.getJiajiaoIdNumber())) !=null) {
            return R.error("账户已存在或手机号或身份证号已经被使用");
        }
        jiajiaoService.insert(jiajiao);
        return R.ok();
    }

    /**
     * 重置密码
     */
    @GetMapping(value = "/resetPassword")
    public R resetPassword(Integer  id){
        JiajiaoEntity jiajiao = new JiajiaoEntity();
        jiajiao.setPassword("123456");
        jiajiao.setId(id);
        jiajiaoService.updateById(jiajiao);
        return R.ok();
    }

    /**
    * 获取家教的session家教信息
    */
    @RequestMapping("/session")
    public R getCurrJiajiao(HttpServletRequest request){
        Integer id = (Integer)request.getSession().getAttribute("userId");
        JiajiaoEntity jiajiao = jiajiaoService.selectById(id);
        return R.ok().put("data", jiajiao);
    }


    /**
    * 退出
    */
    @GetMapping(value = "logout")
    public R logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return R.ok("退出成功");
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "家教".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = jiajiaoService.queryPage(params);

        //字典表数据转换
        List<JiajiaoView> list =(List<JiajiaoView>)page.getList();
        for(JiajiaoView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JiajiaoEntity jiajiao = jiajiaoService.selectById(id);
            if(jiajiao !=null){
                //entity转view
        JiajiaoView view = new JiajiaoView();
                BeanUtils.copyProperties( jiajiao , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody JiajiaoEntity jiajiao, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,jiajiao:{}",this.getClass().getName(),jiajiao.toString());
        Wrapper<JiajiaoEntity> queryWrapper = new EntityWrapper<JiajiaoEntity>()
            .eq("username", jiajiao.getUsername())
            .eq("password", jiajiao.getPassword())
            .eq("jiajiao_name", jiajiao.getJiajiaoName())
            .eq("sex_types", jiajiao.getSexTypes())
            .eq("xuqiu_types", jiajiao.getXuqiuTypes())
            .eq("jiajiao_id_number", jiajiao.getJiajiaoIdNumber())
            .eq("jiajiao_phone", jiajiao.getJiajiaoPhone())
            .eq("jiajiao_email", jiajiao.getJiajiaoEmail())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
    JiajiaoEntity jiajiaoEntity = jiajiaoService.selectOne(queryWrapper);
        if(jiajiaoEntity==null){
            jiajiao.setCreateTime(new Date());
        jiajiao.setPassword("123456");
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      jiajiao.set
        //  }
        jiajiaoService.insert(jiajiao);
            return R.ok();
        }else {
            return R.error(511,"账户或者身份证号或者手机号已经被使用");
        }
    }





}

