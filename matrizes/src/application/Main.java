package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int x = sc.nextInt();		
		int y = sc.nextInt();
		int m[][] = new int[x][y];
		
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[i].length;j++){
				m[i][j] = sc.nextInt();
			}
		}
		
		int num = sc.nextInt();	
		
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[i].length;j++){
				if (num == m[i][j]) {
					System.out.println("position: " + i + "," + j);
					if (j > 0) {
						System.out.println("Left: " + m[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + m[i-1][j]);
					}
					if (j < m[i].length-1) {
						System.out.println("Right: " + m[i][j+1]);
					}
					if (i < m.length-1) {
						System.out.println("Down: " + m[i+1][j]);
					}
				}
			}
		
		}

		sc.close();
	}
}
	