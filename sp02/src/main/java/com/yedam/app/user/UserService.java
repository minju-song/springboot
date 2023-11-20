package com.yedam.app.user;

import java.util.List;
import java.util.Map;

public interface UserService {
	public UserVO insertUserInfo(UserVO userVO);
	public Map<String, Object> insertUserList(List<UserVO> userList);
}
