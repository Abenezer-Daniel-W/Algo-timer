
public class Driver {
	public static void main(String[] args) {
		int[] trial = { -7, 3, 7};
		System.out.println(Algo.Algo3(trial));
		
		System.out.println("n: \t total time per call: elapsed time: ");
		int numTrial = 1;
////		
		for(int n = 50000; n <=800000; n*=2) {
			int[] list = new int[n];
			for(int i=0; i<n; i++) {
//				list[i] = (int)(Math.random()*100) +1;
				list[i] = i+1;
			}
			long startTime = System.currentTimeMillis();
			for(int j =0; j<numTrial; j++) {
				Algo.Algo1(list);
			}
			long stopTime = System.currentTimeMillis();
			long elapsedtime = stopTime - startTime;
			System.out.println(n + "\t" + (stopTime-startTime)/(double)numTrial + "\t \t \t" + (double)elapsedtime);
		}
		
		numTrial = 1000;
		
		for(int n = 50000; n <=800000; n*=2) {
			int[] list = new int[n];
			for(int i=0; i<n; i++) {
//				list[i] = (int)(Math.random()*100) +1;
				list[i] = i+1;
			}
			long startTime = System.currentTimeMillis();
			for(int j =0; j<numTrial; j++) {
				Algo.Algo2(list);
			}
			long stopTime = System.currentTimeMillis();
			long elapsedtime = stopTime - startTime;
			System.out.println(n + "\t" + (stopTime-startTime)/(double)numTrial + "\t \t \t" + (double)elapsedtime);
		}
		

		System.out.println("n: \t total time per call: \t elapsed time: ");
		numTrial = 10000;
		
		for(int n = 50000; n <=800000; n*=2) {
			int[] list = new int[n];
			for(int i=0; i<n; i++) {
//				list[i] = (int)(Math.random()*100) +1;
				list[i] = i+1;
			}
			long startTime = System.currentTimeMillis();
			for(int j =0; j<numTrial; j++) {
				Algo.Algo3(list);
			}
			long stopTime = System.currentTimeMillis();
			long elapsedtime = stopTime - startTime;
			System.out.println(n + "\t" + (stopTime-startTime)/(double)numTrial + "\t \t" + (double)elapsedtime);
		}
		
		
		

	}
	
}
