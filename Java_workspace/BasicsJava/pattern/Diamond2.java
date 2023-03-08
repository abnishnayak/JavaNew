package pattern;

public class Diamond2 {
	void display(int a) {
		int space=a/2;
		int n=1;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
				int count=n/2+1;
				for(int k=1;k<=n;k++) {
					System.out.print(count);
					if(k<=n/2) count--;
					else count++;
			}
				System.out.println();
				if(i<=a/2) {
					space-=1;
					n+=2;
				}
				else {
					space+=1;
					n-=2;
				}
		}
	}
}