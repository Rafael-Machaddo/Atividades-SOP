//worst - Fit algorithm

public class Main
{

	static void worstFit(int blockSize[], int m, int processSize[],
													int n)
	{

		int allocation[] = new int[n];
	

		for (int i = 0; i < allocation.length; i++)
			allocation[i] = -1;
	

		for (int i=0; i<n; i++)
		{

			int wstIdx = -1;
			for (int j=0; j<m; j++)
			{
				if (blockSize[j] >= processSize[i])
				{
					if (wstIdx == -1)
						wstIdx = j;
					else if (blockSize[wstIdx] < blockSize[j])
						wstIdx = j;
				}
			}
	

			if (wstIdx != -1)
			{

				allocation[i] = wstIdx;
	

				blockSize[wstIdx] -= processSize[i];
			}
		}
	
		System.out.println("\nN°\t Tamanho\t Bloco");
		for (int i = 0; i < n; i++)
		{
			System.out.print(" " + (i+1) + "\t\t" + processSize[i] + "\t\t");
			if (allocation[i] != -1)
				System.out.print(allocation[i] + 1);
			else
				System.out.print("Não Alocado :(");
			System.out.println();
		}
	}
	

	public static void main(String[] args)
	{
		int blockSize[] = {100, 500, 200, 300, 600};
		int processSize[] = {200, 400, 100, 400};
		int m = blockSize.length;
		int n = processSize.length;
		
		worstFit(blockSize, m, processSize, n);
	}
}
