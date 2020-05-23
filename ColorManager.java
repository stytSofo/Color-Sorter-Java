package colorSort;

import java.awt.Color;
import java.util.Arrays;
import java.util.Comparator;

import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdOut;

public class ColorManager extends Color{
	
	public ColorManager(int r, int g, int b, int a) {
		super(r, g, b, a);
		// TODO Auto-generated constructor stub
	}

	public static void visualizeSquare(Color tab[]) {
		
		StdDraw.setCanvasSize(2000, 2000);
		StdDraw.setXscale(0,2000);
		StdDraw.setYscale(0,2000);
		StdDraw.enableDoubleBuffering();
		double rectWidth = 2000.0/tab.length;
		
		for(int i = 0;i<tab.length;i++) {
			StdDraw.setPenColor(tab[i]);
			StdDraw.filledRectangle((i*rectWidth)+rectWidth/2, 1000, rectWidth/2, 1000);
		}
		StdDraw.show();
		
	}
	
	public static void sortColors(Color tab[]) {
		
		Arrays.sort(tab, new Comparator<Color>(){
			@Override
			public int compare(Color c1,Color c2) {
				return c1.getRGB()-c2.getRGB();
			}
		});
		
	}
	
	
	

}
