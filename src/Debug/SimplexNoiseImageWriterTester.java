package Debug;

import java.util.Arrays;
import java.util.Random;

import Math.SimplexNoise;

public class SimplexNoiseImageWriterTester {
	public static void main(String args[]){
		SimplexNoise simplexNoise=new SimplexNoise(100,0.1,5000);

		Random rnd=new Random(5000);

	    double xStart=0;
	    double XEnd=rnd.nextDouble() * 10000;
	    double yStart=0;
	    double yEnd=rnd.nextDouble() * 10000;

	    int xResolution=200;
	    int yResolution=200;

	    double[][] result=new double[xResolution][yResolution];

	    for(int i=0;i<xResolution;i++){
	        for(int j=0;j<yResolution;j++){
	            int x=(int)(xStart+i*((XEnd-xStart)/xResolution));
	            int y=(int)(yStart+j*((yEnd-yStart)/yResolution));
	            result[i][j]=0.5*(1+simplexNoise.getNoise(x,y));

	           double printResult = 100.0*result[i][j];
	           int integerResultClamp = (int) Math.abs(printResult);
	           integerResultClamp = integerResultClamp%3;
	           System.out.println(integerResultClamp);
	           
	        }
	    }
	   
	    ImageWriter.greyWriteImage(result);
	    System.out.println(Arrays.deepToString(result));


	}
}
