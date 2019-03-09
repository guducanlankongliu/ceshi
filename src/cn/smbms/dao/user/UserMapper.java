package cn.smbms.dao.user;

import org.apache.ibatis.annotations.Param;

import cn.smbms.pojo.User;

public interface UserMapper {

	/**
	 * 登陆方法
	 */
	User getUserByCode(@Param("userCode")String userCode);
}
