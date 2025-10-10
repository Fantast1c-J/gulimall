package com.james.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.james.gulimall.common.utils.PageUtils;
import com.james.gulimall.common.utils.Query;
import com.james.gulimall.product.dao.PmsCategoryDao;
import com.james.gulimall.product.entity.PmsCategoryEntity;
import com.james.gulimall.product.service.PmsCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
@Slf4j
public class PmsCategoryServiceImpl extends ServiceImpl<PmsCategoryDao, PmsCategoryEntity> implements PmsCategoryService {
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsCategoryEntity> page = this.page(
                new Query<PmsCategoryEntity>().getPage(params),
                new QueryWrapper<PmsCategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<PmsCategoryEntity> selectWithTree() {
        List<PmsCategoryEntity> entities = baseMapper.selectList(null);
        entities.stream().filter(entity -> entity.getParentCid() == 0)
                .map(menu -> {
                    menu.setChildren(getChildrens(menu, entities));
                    return menu;
                }).sorted((menu1, menu2) -> {
                            return menu1.getSort() - menu2.getSort();
                        }
                )
                .collect(Collectors.toList());
        return entities;
    }

    //递归获取子分类
    public List<PmsCategoryEntity> getChildrens(PmsCategoryEntity root, List<PmsCategoryEntity> all) {
        List<PmsCategoryEntity> children = all.stream().filter(categoryEntity -> {
                    return categoryEntity.getParentCid().equals(root.getCatId());
                }).map(categoryEntity -> {
                    categoryEntity.setChildren(getChildrens(categoryEntity, all));
                    return categoryEntity;
                }).sorted((menu1, menu2) -> {
                            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                        }
                )
                .collect(Collectors.toList());
        return children;
    }

}