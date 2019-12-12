package jException;

import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		UserManager mgr = new UserManager();
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("1.注册 2.登录");
			String cmd = s.nextLine();
			if("1".equals(cmd)) {
				//sign up
				System.out.println("email: ");
				String email = s.nextLine();
				System.out.println("密码: ");
				String pwd = s.nextLine();
				try {
					User u = mgr.reg(email,pwd);
					System.out.println("注册成功："+ u);
				} catch (UserExsitsException e) {
					e.printStackTrace();
				}
			}else if("2".equals(cmd)) {
				//sign in
				System.out.println("email: ");
				String email = s.nextLine();
				System.out.println("密码: ");
				String pwd = s.nextLine();
				try {
					User u = mgr.login(email, pwd);
					System.out.println("注册成功："+ u);
				} catch (EmailOrPwdException e) {
					e.printStackTrace();
				}
			}else {
				System.out.println("不可识别的命令！");
			}
			
		}

	}

}
