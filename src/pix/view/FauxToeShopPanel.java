package pix.view;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

import pix.controller.FauxToeShopController;
import pixLab.classes.ImageDisplay;
import pixLab.classes.Picture;


	public class FauxToeShopPanel extends JPanel
	{

		private FauxToeShopController baseController;	
			
		private JComboBox<String> pictureBox;
		private JComboBox<String> filterBox;
		private JScrollPane imagePane;
		private SpringLayout baseLayout;
		private Picture basePicture;
		private Picture selectedPicture;
		
		public FauxToeShopPanel(FauxToeShopController baseController)
		{
			this.baseController = baseController;
			
			
			imagePane = new JScrollPane();
			basePicture = new Picture("zinogre3.jpg");
			selectedPicture = new Picture("zinogre3.jpg");
			baseLayout = new SpringLayout();
			
			setupPicture();
			setupComboBox();
			setupPanel();
			setupLayout();
			setupListeners();
		}
		
		private void setupPicture()
		{
			BufferedImage bufferedPic = basePicture.getBufferedImage();
			ImageDisplay picDisplay = new ImageDisplay(bufferedPic);
			imagePane.setViewportView(picDisplay);
		}
		
		private void resetButton()
		{
			basePicture = new Picture(selectedPicture.getFileName());
		}
		private void setupComboBox()
		{
			String [] filterArray = 
			{	
			"Reset", //0
			"KeepOnlyBlue", //1
			"KeepOnlyRed", //2
			"KeepOnlyGreen", //3
			"Negate", //4 
			"Grayscale", //5
			"FixUnderwater", //6
			"MirrorVertical", //7
			"MirrorHorizontal", //8
			"MirrorHorizontalBottomToTop", //9
			"MirrorDiagonal", //10
			"MirrorTemple", //11
			"MirrorArms", //12
			"MirrorGull", //13
			"ColorFilter",//14
			"ColorFilter 1",//15
			"ColorFilter 2",//16
			"MakeFilter", //17
			"Copy",  //18
			"EdgeDetection", //19
			};
			filterBox = new JComboBox (filterArray);
	
			
				String [] pictureArray = 
				{
					"Default",
					"Temple",
					"seagull",
					"snowman",
				};
			pictureBox = new JComboBox (pictureArray);
			
			}
			
		
		private void setupPanel()
		{
			this.setBackground(Color.GREEN);
			this.setLayout(baseLayout);
			this.add(filterBox);
			this.add(imagePane);
			this.add(pictureBox);
		}
		private void setupLayout()
		{
			baseLayout.putConstraint(SpringLayout.NORTH, imagePane, 100, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, imagePane, 50, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.NORTH, filterBox, 25, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, filterBox, 211, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.NORTH, pictureBox, 0, SpringLayout.NORTH, filterBox);
			baseLayout.putConstraint(SpringLayout.WEST, pictureBox, 0, SpringLayout.WEST, imagePane);
		}
		private void setupListeners()
		{
			filterBox.addItemListener(new ItemListener()
			{
				public void itemStateChanged(ItemEvent currentEvent)
				{
					if(filterBox.getSelectedIndex() == 0)
					{
						resetButton();
						setupPicture();
					}
					else if(filterBox.getSelectedIndex() == 1)
					{
						resetButton();
						basePicture.testKeepOnlyBlue();
						setupPicture();
					}
					else if(filterBox.getSelectedIndex() == 2)
					{
						resetButton();
						basePicture.testKeepOnlyRed();
						setupPicture();
					}
					else if(filterBox.getSelectedIndex() == 3)
					{
						resetButton();
						basePicture.testKeepOnlyGreen();
						setupPicture();
					}
					else if(filterBox.getSelectedIndex() == 4)
					{
						resetButton();
						basePicture.Negate();
						setupPicture();
					}
					else if(filterBox.getSelectedIndex() == 5)
					{
						resetButton();
						basePicture.Grayscale();
						setupPicture();
					}
					else if(filterBox.getSelectedIndex() == 6)
					{
						resetButton();
						basePicture.FixUnderwater();
						setupPicture();
					}
					else if(filterBox.getSelectedIndex() == 7)
					{
						resetButton();
						basePicture.mirrorVertical();
						setupPicture();
					}
					else if(filterBox.getSelectedIndex() == 8)
					{
						resetButton();
						basePicture.MirrorHorizontal();
						setupPicture();
					}
					else if(filterBox.getSelectedIndex() == 9)
					{
						resetButton();
						basePicture.mirrorHorizontalBottomToTop();
						setupPicture();
					}
					else if(filterBox.getSelectedIndex() == 10)
					{
						resetButton();
						basePicture.mirrorDiagonal();
						setupPicture();
					}
					else if(filterBox.getSelectedIndex() == 11)
					{
						resetButton();
						basePicture.mirrorTemple();
						setupPicture();
					}
					else if(filterBox.getSelectedIndex() == 12)
					{
						resetButton();
						basePicture.MirrorArms();
						setupPicture();
					}
					else if(filterBox.getSelectedIndex() == 13)
					{
						resetButton();
						basePicture.MirrorGull();
						setupPicture();
					}
					else if(filterBox.getSelectedIndex() == 14)
					{
						resetButton();
						basePicture.rotateColorFilter();
						setupPicture();
					}
					else if(filterBox.getSelectedIndex() == 15)
					{
						resetButton();
						basePicture.rotateColorFilter1();
						setupPicture();
					}
					else if(filterBox.getSelectedIndex() == 16)
					{
						resetButton();
						basePicture.rotateColorFilter2();
						setupPicture();
					}
					else if(filterBox.getSelectedIndex() == 17)
					{
						resetButton();
						basePicture.makeFilter();
						setupPicture();
					}
					else if(filterBox.getSelectedIndex() == 18)
					{
						resetButton();
						basePicture = new Picture("doesNothing.jpg");
						//basePicture.copy();
						setupPicture();
					}
					else if(filterBox.getSelectedIndex() == 19)
					{
						resetButton();
						basePicture.edgeDetection(50);
						setupPicture();
					}
				}
			});
			pictureBox.addItemListener(new ItemListener()
			{
				public void itemStateChanged(ItemEvent currentEvent)
				{
					if(pictureBox.getSelectedIndex() == 0)
					{
						basePicture = new Picture("zinogre3.jpg");
						selectedPicture = new Picture("zinogre3.jpg");
						setupPicture();
					}
					else if(pictureBox.getSelectedIndex() == 1)
					{
						basePicture = new Picture("Temple.jpg");
						selectedPicture = new Picture("Temple.jpg");
						setupPicture();
					}
					else if(pictureBox.getSelectedIndex() == 2)
					{
						basePicture = new Picture("seagull.jpg");
						selectedPicture = new Picture("seagull.jpg");
						setupPicture();
					}
					else if(pictureBox.getSelectedIndex() == 3)
					{
						basePicture = new Picture("snowman.jpg");
						selectedPicture = new Picture("snowman.jpg");
						setupPicture();
					}
					
				}
			}
					);
		}
	}

