package hk.edu20250717.day11;

import java.util.Arrays;

public class D3_MagicSquareMain {

	public D3_MagicSquareMain(String[] args) {
		D3_OddMagicSquare oddMagic = new D3_OddMagicSquare(11);
		oddMagic.make();
		int [][] magic = oddMagic.magic;
		for (int i = 0; i < magic.length; i++) {
			for (int j = 0; j < magic.length; j++) {
				System.out.println(magic[i]+"\t");
			} System.out.println(Arrays.toString(magic[i]));
		}
	}
}
