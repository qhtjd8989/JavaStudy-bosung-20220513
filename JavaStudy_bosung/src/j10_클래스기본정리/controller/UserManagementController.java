package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.UserService;

public class UserManagementController {
	
	private UserService userService; // 클래스안에서 선언되는 변수는 무조건 private으로 한다
	
	public UserManagementController() {
		userService  = new UserService();
	}
	
	public void createUser() {
		User user = userService.insertUser();
		
		System.out.println("[새로 추가된 사용자]");
		System.out.println(user.toString());
	}
	
	public void updateUser() {
		
	}
	
}
