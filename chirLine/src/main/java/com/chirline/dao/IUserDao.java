package com.chirline.dao;

import com.chirline.entity.User;

public interface IUserDao {

	User selectByPrimaryKey(int userId);

}
