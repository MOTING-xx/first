package jException;

public class ExceptionDemo {

	public static void main(String[] args) throws Exception {
		UserManager mgr = new UserManager();
		User u = mgr.reg("2233440410@qq.com", "132465");
		System.out.println("ע��ɹ���");
		//����1���ظ�ע�ᣬ�����쳣
		//u = mgr.reg("2223745240@qq.com", "132465");
		//����2����¼������󣬳����쳣�����벻��
		//u = mgr.login("2233440410@qq.com", "132");
		//����3����½�ɹ�
		User someone = mgr.login("2233440410@qq.com", "132465");
		System.out.println(someone);
		

	}

}
