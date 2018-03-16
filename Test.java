import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		Car star = new Car("CN","Star");

		Scanner scanner = new Scanner(System.in);

		while(true){
			System.out.println("请选择方向：");
			System.out.println("东"+"、"+"西"+"、"+"南"+"、"+"北");
			String direction = "东";
			direction = scanner.next();
			if("停止".equals(direction)){
				System.out.println("已停止前进，等待下次命令");
				System.exit(0);
			}		

			System.out.println("请输入目标距离：");
			String target = scanner.next();
			if("停止".equals(target)){
				System.out.println("已停止前进，等待下次命令");
				System.exit(0);
			}

			
			switch(direction){
				case "东":
					star.moveForward(Integer.parseInt(target));
					break;
				case "西":
					star.moveBack(Integer.parseInt(target));
					break;
				case "南":
					star.turnRight(Integer.parseInt(target));
					break;
				case "北":
					star.turnLeft(Integer.parseInt(target));
					break;	
			}

			//int lastEnd = (end>0)?end:(-end);
			System.out.println("报告，向"+direction+"前进了"+Integer.parseInt(target));
			System.out.println("当前坐标为："+star.getxEnd()+","+star.getyEnd());
			

			


		}
		





	}
}