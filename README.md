#Instructions
1. Change "yourArtifactID", i.e. the folder's name, to your project name. This is your artifactID.

2. Go to pom.xml and change the artifactID and groupID. 
   Your groupID is usually the reverse of your domain plus your artifactID, e.g. com.someNameOrWord.artifactID
   
3. Set your app's name, description, version inside the pom.xml.

4. Near end of pom.xml, in the middle of <mainClass>yourGroupID.Main</mainClass> replace the alias with your actual groupID.

5. Refactor your package and name it to your groupID.

6. In Main.fxml, where it says fx:controller="yourGroupID.Controller"> put in your groupID.

7. Maven clean and install. Then, build with Maven and add the following Goal: compile javafx:run.

8. A simple program should appear indicating a successfully set up project. 

