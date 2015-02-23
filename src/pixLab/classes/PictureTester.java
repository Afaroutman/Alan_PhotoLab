package pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testMirrorHorizontal()
  {
	  Picture zinogre = new Picture("zinogre3.jpg");
	  zinogre.explore();
	  zinogre.MirrorHorizontal();
	  zinogre.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("zinogre3.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
   
  }
  public static void testKeepOnlyBlue()
  {
	  Picture blueMark = new Picture("blue-mark.jpg");
	  blueMark.explore();
	  blueMark.testKeepOnlyBlue();
  }
  public static void testKeepOnlyRed()
  {
	  Picture gorge = new Picture("george.jpg");
	  gorge.explore();
	  gorge.testKeepOnlyRed();
  }
  public static void testKeepOnlyGreen()
  {
	  Picture wall = new Picture("wall.jpg");
	  wall.explore();
	  wall.testKeepOnlyRed();
  }
  public static void testNegate()
  {
	  Picture illuminarty = new Picture ("illuminarty.jpg");
	  illuminarty.explore();
	  illuminarty.Negate();
  }
  public static void testGrayscale()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.explore();
	  snowman.Grayscale();
  }
  public static void testFixUnderwater()
  {
	  Picture water = new Picture("water.jpg");
	  water.explore();
	  water.FixUnderwater();
  }
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.MirrorArms();
	  snowman.explore();
	  
  }
  public static void testMirrorGull()
  {
	  Picture seagull = new Picture("seagull.jpg");
	  seagull.MirrorGull();
	  seagull.explore();
  }
  public static void testMirrorDiagonal()
  {
	  Picture beach = new Picture("beach.jpg");
	  beach.mirrorDiagonal();
	  beach.explore();
  }
  public static void testMakeFilter()
  {
	  Picture caterpillar = new Picture("caterpillar.jpg");
	  caterpillar.makeFilter();
	  caterpillar.explore();
  }
  public static void testColorFilter()
  {
	  Picture zinogre = new Picture("zinogre.jpg");
	  zinogre.explore();
	  zinogre.rotateColorFilter();
	  zinogre.explore();
  }
  public static void testColorFilter1()
  {
	  Picture zinogre = new Picture("zinogre.jpg");
	  zinogre.explore();
	  zinogre.rotateColorFilter1();
	  zinogre.explore();
  }
  public static void testColorFilter2()
  {
	  Picture zinogre = new Picture("zinogre.jpg");
	  zinogre.explore();
	  zinogre.rotateColorFilter2();
	  zinogre.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
//	    testZeroBlue();
//	    testKeepOnlyBlue();
//	    testKeepOnlyRed();
//	    testKeepOnlyGreen();
//	    testNegate();
//      testGrayscale();
//	    testFixUnderwater();
//	    testMirrorVertical();
//	    testMirrorHorizontal();
//	    testMirrorTemple();
//	    testMirrorArms();
//	    testMirrorGull();
//	    testMirrorDiagonal();
//	  	testColorFilter();
//	    testColorFilter1();
//	    testColorFilter2();
//	    testMakeFilter();
//	    testCollage();
//	    testCopy();
//	    testEdgeDetection();
//	    testEdgeDetection2();
//	    testChromakey();
//	    testEncodeAndDecode();
//	    testGetCountRedOverValue(250);
//	    testSetRedToHalfValueInTopHalf();
//	    testClearBlueOverValue(200);
//	    testGetAverageForColumn(0);
  }

 
}