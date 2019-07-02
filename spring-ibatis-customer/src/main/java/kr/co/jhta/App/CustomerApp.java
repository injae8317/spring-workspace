package kr.co.jhta.App;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.dao.CustomerDao;
import kr.co.jhta.vo.Customer;

public class CustomerApp {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/context.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);

		CustomerDao customerDao = ctx.getBean(CustomerDao.class);
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n");
			System.out.println("------------------------------------------------------");
			System.out.println("1.��ü��ȸ 2.�˻� 3.��� 4.���� 5.���� 0.����");
			System.out.println("------------------------------------------------------");
			
			System.out.print("�޴�����> ");
			int menu = scanner.nextInt();
			
			if (menu == 1) {
				List<Customer> customers = customerDao.getAllCustomer();
				for(Customer cust : customers) {
					System.out.println("����ȣ" + cust.getNo());
					System.out.println("����" + cust.getName());
					System.out.println("��ȭ��ȣ" + cust.getPhone());
				}
			} else if (menu == 2) {
				
			} else if (menu == 3) {
				
			} else if (menu == 4) {
				
			} else if (menu == 5) {
				
			} else if (menu == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
		}
		
	}
}
