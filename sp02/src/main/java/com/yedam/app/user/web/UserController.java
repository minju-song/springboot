package com.yedam.app.user.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yedam.app.user.UserService;
import com.yedam.app.user.UserVO;
import com.yedam.app.user.UserVOList;

@CrossOrigin("*")
@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	//1) Ajax + get + QueryString
	@GetMapping("getAjax")
	@ResponseBody
	public UserVO insertGetAjax(UserVO userVO) {
		return userService.insertUserInfo(userVO);
	}
	
	//2)
	@PostMapping("postAjax")
	@ResponseBody
	public UserVO insertPostAjax(UserVO userVO) {
		return userService.insertUserInfo(userVO);
	}
	
	@PostMapping("jsonAjax")
	@ResponseBody 
	public UserVO jsonAjax(@RequestBody UserVO userVO) {
		return userService.insertUserInfo(userVO);
	}
	
	@PostMapping("jsonListAjax")
	   @ResponseBody Map<String, Object> insertJsonListAjax(@RequestBody List<UserVO> list){
	      return userService.insertUserList(list);
	   }
	
	@PostMapping("postListAjax")
	@ResponseBody 
	public Map<String, Object> insertPostAjax(UserVOList userList) {
		return userService.insertUserList(userList.getList());
	}
}
