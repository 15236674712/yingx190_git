package com.baizhi.yingx190_git.dao;

import com.baizhi.yingx190_git.entity.Category;

public interface CategoryDao {

    Category queryById(String id);

    Category queryByName(String name);
}
