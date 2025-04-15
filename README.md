# gene-visualisation-app
This is GUI-based Java application project, developed for visualising gene models based on gene structure data from GTF annotation files and sequence data from FASTA files

### Introduction
This is a GUI-based application for visualising gene models based on gene structure data from GTF annotation files and sequence data from FASTA files. The application was developed using NetBeans Swing components. Below is the layout of the graphical components of the application.

 ![image](https://github.com/user-attachments/assets/79e596db-6f56-43d6-8bbb-45db652e35ca)

Figure1: Layout of the geneVisualisation app.

The program takes in two input files (gtf and fasta), displays the results of the files in a textArea (fasta sequence) and jTable (gtf content). The program was designed to calculate basic statistics based on the data from the files, highlight exons in the fasta display sequence and display a visual representation of the genes in the files. Below is the UML representation of the structure and flow of the program.

<img width="412" alt="image" src="https://github.com/user-attachments/assets/496fc91a-cd0c-403b-a2eb-c92bdaaf3a23" />

Unified Modelling Language of the geneVisualisation - App

### Program Description
1.	**Taking Input files** – this was implemented using file chooser and CSVReader from the OpenCSV library. A menu bar with two menu items was created “OpenGTF” and “OpenFASTA” for opening gtf and fasta files respectively as shown below.

 ![image](https://github.com/user-attachments/assets/af62988d-e62f-45dc-ad17-4e9c65c21daa)

Figure2: Screenshot of the menu items of the program

a)	**Opening FASTA file** – a jTextArea called “fastaTextArea” to display the fasta sequence was created. OpenFASTA menu item has an action performed method (openFastaFileMenuItemActionPerformed) that allows the user to select a fasta file using file chooser option. The method uses CSVReader from the OpenCSV library to read the fasta file and append the content to the fastaTextArea as shown in the example image below.

 ![image](https://github.com/user-attachments/assets/b08c64fd-f32e-4b61-a243-bcc0ddb28edf)

Figure3: FASTA Sequence displayed in a fastaTextArea of the program.

b)	**Opening GTF file** – gtfTable was created to display the content of the gtf annotation file in a table format. Just like OpenFASTA menu item, OpenGTF also has an action performed method (openGTFFileMenuItemActionPerformed) that allows the user to select a gtf file using file chooser and uses CSVReader to read the content of the gtf file but displays the result in a table format (gtfTable) as shown below. The method also generates a list of all the genes in the gtf file and populate them in a jComboBox (geneModelComboBox) which will be used later for visual representation of the genes.

 ![image](https://github.com/user-attachments/assets/c9bbb867-2a62-4595-8548-0dd590336263)

Figure4: a generated jTable by the program displaying the content of a gtf file.

2.	**Calculating Basic Statistics of the Loaded Files** – two jButtons were created for this purpose; fastaStat button for calculating fasta file statistics and gtfStat button for calculating gtf file statistics.

a)	fastaStatActionPerformed method gets the fasta sequence from the fastaTextArea, calculate sequence length or average length (for multiple sequences), GC content and display the result in a message dialog as shown in the example image below. Fasta sequence length and GC counts required for calculating the average sequence length and GC content percentage are calculated by the methods getFastaSequenceLength and gcContentCount respectively.

 ![image](https://github.com/user-attachments/assets/754671c1-5f4f-43f4-b6a0-1fa7ef14b596)

Figure5: Message dialog box showing the results fasta statistics calculated by the program.

b)	gtfStatActionPerformed method on the hand gets gtf content from the gtfTable model and calculates the gtf statistics. A sub class of this method called “calculateGeneStatistics” was created. The method takes in the gtfTable model and its rowCount as inputs and calculate total genes, average gene length, longest and shortest genes and average number of exons per gene. The results of the basic statistics are displayed in a message dialog as shown in the example image below.

  ![image](https://github.com/user-attachments/assets/1fd7a9ee-db00-4336-97b1-f9f19f4b303a)

Figure6: A message dialog displaying gtf statistics calculated by the program.


3.	**Highlighting Exons in the Fasta Sequence Display** – a jButton called “Highlight Exons” was created for this purpose. The action performed method of this button (highlightExonsActionPerformed) combines information from the two files before highlighting the exons. Information about the length and positions of the exons in the fasta sequence is obtained from the gtfTable model before exons are highlighted on the fasta sequence displayed in the fastaTextArea. A method called hightlightExonRanges performs the highlighting and takes in the start and end of the exons as well as the HighlightPainter as arguments. Below is an example obtained from the example gtf and fasta files provided.

 ![image](https://github.com/user-attachments/assets/fd84399a-5b9e-460b-934f-54031253c34e)

Figure7: showing some exons highlighted by the program.

4.	**Visual Representation of Gene Models** – A jComboBox was created as highlighted earlier to allow the user to select a specific gene and get a visual representation of the exons in the gene. The comboBox will be populated with geneIDs of all the genes in a gtf file on importing the gtf content into the gtfTable model. An example is shown below. The geneIDs will not display any visual representation yet because this part of the program could not be completed as at the time of writing this report.

 ![image](https://github.com/user-attachments/assets/27542520-0e5b-49b7-bbe1-cb5256a06d59)

Figure8: showing geneIDs populated in a ComboBox generated by the program.


### User Manual
To use geneVisualisation App please take note of the following simple guide.

•	The program is compatible with any operating system so long as the user has a java installed in his/her machine.

•	To use the application, you have been provided with a zipped distribution folder called “dist.zip” which contains the geneVisualisation app as jar file and a library folder containing all dependent libraries for the program to run efficiently.

•	Kindly unzip the folder after installing java in your computer and double-click the jar file to run the application.

•	Please note that the application is designed to take in fasta sequence and gtf annotation files as input only, other file formats may not give the required results.

•	Click “File” next to “Edit” at the top-left corner of the application and select openFASTA or OpenGTF to load the respective files into the application. Fasta file content will be displayed in textArea (upper part of the program) while gtf file content will be displayed in tableArea (lower part of the program).

•	Please note that the files can be loaded interchangeably, that gtf in textArea and fasta in the jTable but this would not yield the required results.

•	Click on fastaStat button to view average sequence length and GC content of the loaded fasta file. A message dialog box will display these results.

•	Click on gtfStat button to view total genes, average gene length, longest and shortest genes and average number of exons per gene in the message dialog.

•	Click the Highlight Exons button to highlight exons in the fasta display textArea.

•	Note that the Highlight Exons button uses information from the two gene files as such all files must be loaded to highlight the exons.

•	Please upload complementary fasta and gtf files since the program uses information from one for the other.

•	You are provided with a scroll bar for both the fastTextArea and the gtfTable to navigate the files’ content.

•	You can minimize, maximize and/or close the application using the appropriate buttons at the top-right corner of the app.

### Attachments
•	The project folder of this application is attached to this report which contains the source code, dependent libraries, the application jar file and a generated java documentation in dist folder. 

•	All screenshots referenced in this report were produced by the application.

•	Unified Modelling Language (UML) diagram was produced based on the structure of the program.
