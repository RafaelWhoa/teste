package matriz.ex1;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ex1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex1Application.class, args);
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Insert number of lines: ");
		int m = sc.nextInt();
		System.out.print("Insert number of columns: ");
		int n = sc.nextInt();

		int mat[][] = new int[m][n];

		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++){
				mat[i][j] = sc.nextInt();
			}
		}

		int x = sc.nextInt();

		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++){
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (i > 0){
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (i < mat.length - 1){
						System.out.println("Down: " + mat[i+1][j]);
					}
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
				}
			}
		}





		sc.close();
	}

}
