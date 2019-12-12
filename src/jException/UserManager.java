package jException;

import java.util.*;

public class UserManager {
	
	private Map<String,User> users = new HashMap<String,User>();
	private int id = 1;
	public User reg(String email,String pwd)throws UserExsitsException{
		if(users.containsKey(email)){
			throw new UserExsitsException("该邮箱"+email+"已存在!!");
		}
		User newuser = new User(id++,email,pwd);
		users.put(email, newuser);
		return newuser;
	}
	public User login(String email,String pwd)throws EmailOrPwdException{
		if(!users.containsKey(email)){
			throw new EmailOrPwdException("不存在！");
		}
		User u = users.get(email);
		if(!u.pwd.equals(pwd)){
			throw new EmailOrPwdException("用户密码错误！");
		}
		return u;
	}
	
}
class UserExsitsException extends Exception{
	public UserExsitsException(String message){
		super(message);
	}
}
class EmailOrPwdException extends Exception{
	public EmailOrPwdException(String massage){
		super(massage);
	}
}

