# The Vizual Language

Vizual is a DSML designed to help programmers develop web pages more efficiently.

## Setting up the Environment

1. Make sure Eclipse Modelling Tools is installed with the Xtext, Xtend, and Xpect plugins.
2. Clone this repository to your file system.
3. In Eclipse, go to File -> Open Projects from File System
4. Make sure that `Search for nested projects` and `Detect and configure project natures` is ticked.
5. Click Directory, and select the `vizual` folder within the vizual-language repo that was cloned.
6. Once the `vizual` folder is selected, 6 entries should appear in the folder selector screen. One of them should be a plane `vizual` folder, and the others are Eclipse projects. Untick the plane `vizual` folder.
7. Press Finish. 5 xText folders should be visible in the Model Explorer of the Eclipse environment.
8. To run the language, a run configuration must be defined. Press Run -> Run Configurations...
9. Select Eclipse Application on the left panel, and expand it.
10. On the top left of the Run Configurations screen, there should be an icon that looks like a blank sheet with a plus superscript. Click on it to create a new configuration.
11. In the expanded Eclipse Application view, there should be an entry called `New_configuration`. 
12. Click close at the bottom right of the Run Configurations screen.
13. In the Model Explorer panel, right-click on the `org.xtext.example.vizual` folder, and click run as -> `Eclipse Application`.
14. Select `New_configuration` and click ok. This step opens the Runtime Eclipse.
15. In the Runtime Eclipse, click on import projects in the Model Explorer panel.
16. In the Import wizard, expand the General folder and select Existing projects into workspace.
17. Click Browse next to `Select root directory`.
18. Navigate to the cloned repo and choose the example_project folder.
19. Make sure `Search for nested projects` is enabled.
20. In the folder selector screen, there should be 3 entries. Untick the `runtime-EclipseXtext` entry.
21. Click Finish.

## Exploring the Language

1. If the Runtime Eclipse is not already opened, open it by right-clicking on the `org.xtext.example.vizual` folder and clicking run as -> Eclipse application. 
2. Then, select the configuration you made when setting up the project.
3. In the model explorer navigate to vizual.project -> src -> main.viz.
4. In the main.viz folder, you will see sample code that demonstrates the main features of the language. This is where you can experiment with Vizual.
5. To see the HTML produced through code generation, save the main.viz file, and navigate to src-gen -> Mainviz.HTML

## Testing the Language

1. In the Runtime Eclipse, navigate to vizual.test -> src/viz/test.
2. In that folder, there are 8 files with .viz.xt extensions.
3. Each file represents a set of Xpect tests which can be run by right-clicking on the file -> Run As -> JUnit Test