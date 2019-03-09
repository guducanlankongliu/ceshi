package cn.smbms.service.user;

import org.apache.ibatis.annotations.Param;

import cn.smbms.pojo.User;

public interface UserService {

	/**
	 * 登陆方法
	 */
	User getUserByCode(@Param("userCode")String userCode);
}
