
 class Pattern {
    public static void main(String[] args) {
        int i, j;
        int n = 15;
        for (i = n / 2; i <= n; i += 2) {
            for (j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom part of the heart
        for (i = n; i >= 1; i--) {
            // Print leading spaces
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (i * 2) - 1; j++) 
            {
                if (i == n / 2 && j == n / 2 - 1) {
                    System.out.print("R");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}

// class Pattern
// {
// 	public static void main(String[] args) {
// 		for(int i=1;i<=5;i++)
// 		{
			
// 			// loop for spaces
// 			for(int j=1;j<=i-1;j++)
// 			{
// 				System.out.print(" ");
// 			}
// 			// loop for stars
// 			for(int j=5;j>=i;j--)
// 			{
// 				System.out.print("* ");
// 			}
			
// 			System.out.println();
// 		}
// 	}
// }

// class Pattern
// {
// 	public static void main(String[] args) {
// 		for(int i=1;i<=5;i++)
// 		{
// 			for(int j=1;j<=i;j++)
// 			{
// 				System.out.print("* ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }

// class Pattern
// {
// 	public static void main(String[] args) {
// 		for(int i=1;i<=5;i++)
// 		{
// 			for(int j=1;j<=i;j++)
// 			{
// 				System.out.print("* ");
// 			}
// 			System.out.println();
// 		}
// 	}
// }