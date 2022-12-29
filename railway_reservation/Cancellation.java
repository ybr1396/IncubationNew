package railway_reservation;

import java.util.*;

public class Cancellation extends Passenger_Details 
{

	static Scanner sc = new Scanner(System.in);
	void showDetails() {
		System.out.println("Welcome to the Cancellation Portal");
		System.out.println("Enter the  Allocation to cancel");
		int C =sc.nextInt();
		int Index=getIndex(C);
		if(Age[Index]>5)
		{
			if(RAC<=3)
			{  
				int Index2=getsIndex("RAC");
				changeElement(Index,Index2);
				int Index3=interswap(Index2);
				++RAC;
				if(WL<=2)
				{
					String m="WL";
					int Index4=getsIndex(m);
					changeElement(Index3,Index4);
					interswap(Index4);
					++WL;
				}
			}
			else
				del(Index);
		}
		else
			del(Index);

	}
	static int getIndex(int C) 
	{
		int c=0;
		for(int i=0;i<Allocation.length;i++)
		{
			if(Allocation[i]==C)
			{
				c=i;
				break;
			}
		}
		return c;
	}
	static int getsIndex(String S)
	{
		int d=0;
		for(int i=0;i<Allocation.length;i++)
		{
			if(Berth[i]==S)
			{
				d=i;
				break;
			}
			else
				d=0;
		}
		return d;
	}
	static void changeElement(int n,int n1) {

		Name[n]=Name[n1];
		Age[n]=Age[n1];
		Gender[n]=Gender[n1];
		Fare[n]=Fare[n1];
		Name[n1]="null";
		Age[n1]=0;
		Gender[n1]="null";
		Fare[n1]=0;
	}
    static int interswap(int Ind) {
    	
    	Fare[Ind]=400;

		String temp=Name[Ind];
		Name[Ind]=Name[Ind+1];
		Name[Ind+1]=temp;

		int temp1=Age[Ind];
		Age[Ind]=Age[Ind+1];
		Age[Ind+1]=temp1;

		String temp2=Gender[Ind];
		Gender[Ind]=Gender[Ind+1];
		Gender[Ind+1]=temp2;

		return Ind+1;
    }
    static void del(int n1) {
    	Name[n1]="null";
		Age[n1]=0;
		Gender[n1]="null";
		Fare[n1]=0;
    }
}
