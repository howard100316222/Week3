import java.util.*;
import java.io.*;

public class HW1
{
	public static void main(String[] args) 
	{
		String string1; 
		String temp;							//宣告
		int sum=0;
		ArrayList<String> array = new ArrayList<String>();
		
		System.out.println("請輸入一串字(分段請以,隔開)："); 
		Scanner scanner = new Scanner(System.in); 			//輸入
		
		string1 = scanner.nextLine(); 					//接收輸入並印出
		
		String string2 = string1.toLowerCase(); 			//轉小寫
		System.out.println(string2);					//輸出

		String[] string3 = string2.split(",| |\\."); 			//分割字串
			
		for(int i=0;i<string3.length;i++)				//排序，依字串大小由小到大排列
		{
			for(int j=0;j<string3.length;j++)
			{
				if(string3[i].compareTo(string3[j])<0)
				{
					temp = string3[i];
					string3[i] = string3[j];
					string3[j] = temp;
				}
			}
		}
			
		for(int i=0;i<string3.length;i++)
		{
			try
			{  
				System.out.println(Integer.parseInt(string3[i]));  
				sum+=Integer.parseInt(string3[i]);
			} catch(NumberFormatException e)
			{  
				array.add(string3[i]); 					//將string3[i]的內容依序加入array裡存放
			}  
		}
		
		/*for(int i=0;i<array.size();i++)					//刪除重複
		{
			for(int j=0;j<array.size();j++)
			{
				if(array.get(i).equals(array.get(j))&&i!=j)
				{
					array.remove(j);
				}
			}
		}*/
		
		for(int i=0;i<array.size();i++)
		{
			System.out.println(array.get(i)); 			//印出結果
		}
		System.out.println("數字總合為:"+sum);
	}
}