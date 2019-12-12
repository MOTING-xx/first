package jException;

public class ExceptionDemo {

	public static void main(String[] args) throws Exception {
		UserManager mgr = new UserManager();
		User u = mgr.reg("2233440410@qq.com", "132465");
		System.out.println("注册成功！");
		//测试1，重复注册，出现异常
		//u = mgr.reg("2223745240@qq.com", "132465");
		//测试2，登录密码错误，出现异常，密码不对
		//u = mgr.login("2233440410@qq.com", "132");
		//测试3，登陆成功
		User someone = mgr.login("2233440410@qq.com", "132465");
		System.out.println(someone);
		

	}

}
