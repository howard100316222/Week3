import java.io.*;
import java.util.*;
import java.util.Scanner;

class HW2
{
	public static void main(String[] args)
	{
		HashMap hash = new HashMap();
		Scanner scanner = new Scanner(System.in);
		int opt;
		String name;
		int grade;
		while(true)
		{
			System.out.println("請選擇選項 1)新增 2)查詢 -1)離開 : ");
			opt = scanner.nextInt();
				if(opt==1)
				{
					try
					{
						System.out.println("請輸入學生姓名 : ");
						name = scanner.next();
						System.out.println("請輸入學生成績 : ");
						grade = scanner.nextInt();
						hash.put(name, grade);
					}
					catch(Exception e)
					{
						System.out.println("error : " +e);
					}
				}
				if(opt==2)
				{
					try
					{
						System.out.println("請輸入學生姓名 : ");
						String Sname = scanner.next();
						if(hash.get(Sname) != null)
						{
							System.out.println("學生姓名	學生成績");
							System.out.println(Sname + "	" + hash.get(Sname));
						}
						else
						{
							System.out.println("無此學生資料資料!");
							continue;
						}
					}
					catch(Exception e)
					{
						System.out.println("error : " +e);
					}
				}
				if(opt==-1)
				{
					break;
				}
				if(opt!=1&&opt!=2&&opt!=-1)
				{
					System.out.println("輸入錯誤選項!");
					continue;
				}
		}
	}
}