
public class Main {

	public static void main(String[] args) {
	//double CM = 19.99;
	//double litre1 = 20.0;
	//double coverage1 = 10.0;
	
	//double AJ = 17.99; //17.99
	//double litre2 = 15.0;
	//double coverage2 = 11.0;
	
	//double DP = 25.0; //25
	//double litre3 = 10.0;
	//double coverage3 = 20.0;
	
	Paint cheapoMax = new Paint("cheapoMax", 19.99,20.0,10.0);
	Paint averageJoe = new Paint("averageJoe", 17.99,15.0,11.0);
	Paint duluxourousPaints = new Paint("duluxourousPaints",25.0,10.0,20.0);
	

	
	//cheapest to buy
	int roomsize = 500;
	double litreneeded1 = roomsize/cheapoMax.coverage ;
	double litreneeded2 = roomsize/averageJoe.coverage ;
	double litreneeded3 = roomsize/duluxourousPaints.coverage ;
	
	System.out.print("Room size: ");
	System.out.print(roomsize);
	System.out.println(" m2");
	
	System.out.print("CheapoMax: ");
	System.out.println(litreneeded1);
	
	System.out.print("AverageJoes: ");
	System.out.println(litreneeded2);
	
	System.out.print("DuluxourousPaints: ");
	System.out.println(litreneeded3);
	
	double ans1 = litreneeded1 / cheapoMax.litre;
	double ans2 = litreneeded2 / averageJoe.litre;
	double ans3 = litreneeded3 / duluxourousPaints.litre;
	double ans4 = ans1*cheapoMax.price;
	double ans5 = ans2*averageJoe.price;
	double ans6 = ans3*duluxourousPaints.price;
	
	System.out.print("No of Tins needed from CheapoMax: ");
	System.out.println(ans1);
	System.out.print("Cost per room: ");
	System.out.println(ans4);
	System.out.println(" ");
	
	System.out.print("No of Tins needed from AverageJoes: ");
	System.out.println(ans2);
	System.out.print("Cost per room: ");
	System.out.println(ans5);
	System.out.println(" ");
	
	System.out.print("No of Tins needed from DuluxourousPaints: ");
	System.out.println(ans3);
	System.out.print("Cost per room: ");
	System.out.println(ans6);
	System.out.println(" ");
	}
	
	public int Wizard()
	{
		int roomSize;
		
		return 0;
	}
}

//CheapoMax (20Litre) £19.99
//This tin of paint will cover 10m2 per Litre

//AverageJoes (15 Litre) £17.99
//This tin of paint will cover 11m2 per Litre

//DuluxourousPaints (10 Litre) £25
//This tin of paint will cover 20m2 per Litre
