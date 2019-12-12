package jException;

import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		UserManager mgr = new UserManager();
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("1.ע�� 2.��¼");
			String cmd = s.nextLine();
			if("1".equals(cmd)) {
				//sign up
				System.out.println("email: ");
				String email = s.nextLine();
				System.out.println("����: ");
				String pwd = s.nextLine();
				try {
					User u = mgr.reg(email,pwd);
					System.out.println("ע��ɹ���"+ u);
				} catch (UserExsitsException e) {
					e.printStackTrace();
				}
			}else if("2".equals(cmd)) {
				//sign in
				System.out.println("email: ");
				String email = s.nextLine();
				System.out.println("����: ");
				String pwd = s.nextLine();
				try {
					User u = mgr.login(email, pwd);
					System.out.println("ע��ɹ���"+ u);
				} catch (EmailOrPwdException e) {
					e.printStackTrace();
				}
			}else {
				System.out.println("����ʶ������");
			}
			
		}

	}

}
