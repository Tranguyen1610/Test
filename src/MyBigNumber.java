import java.io.Console;
import java.util.Iterator;

public class MyBigNumber {
	public String sum(String stn1, String stn2) {
		System.out.printf("%s + %s: \n",stn1,stn2);
		int tem=0;
		String result="";
		while (stn2.length()!=stn1.length()) {
			if(stn2.length()<stn1.length())
				stn2="0".concat(stn2);
			else 
				stn1="0".concat(stn1);
		}
		for(int i=stn1.length()-1;i>=0;i--) {
			int n1=Integer.parseInt(stn1.charAt(i)+"");
			int n2=Integer.parseInt(stn2.charAt(i)+"");
			int a=n1+n2+tem;
			if(tem==0)
				System.out.printf("- Lay %d cong voi %d duoc %d \n",n1,n2,a);
			else
				System.out.printf("- Lay %d cong voi %d . Cong tiep voi nho %d duoc %d \n",n1,n2,tem,a);
			if(a>=10) {
				result=Integer.toString(a%10).concat(result);
				tem = a/10;
				System.out.printf("\t Luu %d, nho %d \n",a%10,a/10 );
			}else {
				result= Integer.toString(a).concat(result);
				tem=0;
				System.out.printf("\t Luu %d, nho %d \n",a,0 );
			}
		}
		System.out.printf("Ket qua:");
		return result;
	}
}
