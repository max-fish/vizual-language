/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.vizual.validation;

import java.util.Iterator;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.vizual.viz.BodyCommand;
import org.xtext.example.vizual.viz.CommonCommand;
import org.xtext.example.vizual.viz.HeadCommand;
import org.xtext.example.vizual.viz.Initializer;
import org.xtext.example.vizual.viz.Model;
import org.xtext.example.vizual.viz.TableData;
import org.xtext.example.vizual.viz.TableRow;
import org.xtext.example.vizual.viz.VizPackage;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class VizValidator extends AbstractVizValidator {
	
	@Check
	public void checkFileStartsWithDoctype(Model model) {
		if(model.eContents().size() > 0) {
			if(!model.eContents().get(0).eClass().getName().equals("Initializer")) {
			warning("File should start with 'doctype html' statement", model.eContents().get(0), null, VizPackage.MODEL, 
					"org.xtext.example.vizual.doctypeMissing", null);
			}
		}
	}
	
	@Check
	public void checkFileHasOnlyOneDoctypeStatement(Model model) {
		if(model.eContents().size() > 0) {
			List<Initializer> initializerCommands = EcoreUtil2.getAllContentsOfType(model, Initializer.class);

			if(initializerCommands.size() > 1) {
				warning("There should only be one 'doctype html' statement", initializerCommands.get(initializerCommands.size() - 1), null, VizPackage.INITIALIZER, 
						"org.xtext.example.vizual.doctypeOveruse", null);
			}
		}
	}
	
	@Check
	public void checkHeadCommandExists(Model model) {
		if(model.eContents().size() > 0) {
			if(!(EcoreUtil2.getAllContentsOfType(model, HeadCommand.class).size() > 0)) {
				warning("File should have a 'head' tag", model.eContents().get(0), null, VizPackage.MODEL, 
						"org.xtext.example.vizual.headTagMissing", null);
			}
		}
	}
	
	@Check
	public void checkFileHasOnlyOneHeadCommand(Model model) {
		if(model.eContents().size() > 0) {
			List<HeadCommand> headCommands = EcoreUtil2.getAllContentsOfType(model, HeadCommand.class);
			if(headCommands.size() > 1) {
				warning("There should be only one 'head' tag", headCommands.get(headCommands.size() - 1), null, VizPackage.HEAD_COMMAND, 
						"org.xtext.example.vizual.headTagOveruse", null);
			}
		}
	}
	
	@Check
	public void checkBodyCommandExists(Model model) {
		if(model.eContents().size() > 0) {
			if(EcoreUtil2.getAllContentsOfType(model, BodyCommand.class).size() == 0) {
				warning("File should have one 'body' tag", model.eContents().get(0), null, VizPackage.MODEL, 
						"org.xtext.example.vizual.bodyTagMissing", null);
			}
		}
	}
	
	@Check
	public void checkFilehasOnlyOneBodyCommand(Model model) {
		if(model.eContents().size() > 0) {
			List<BodyCommand> bodyCommands = EcoreUtil2.getAllContentsOfType(model, BodyCommand.class);
			if(bodyCommands.size() > 1) {
				warning("File should only have one 'body' tag", bodyCommands.get(bodyCommands.size() - 1), null, VizPackage.BODY_COMMAND, 
						"org.xtext.example.vizual.bodyTagOveruse", null);
			}
		}
	}

	@Check
	public void checkCommonCommandIsInBody(CommonCommand commonCommand) {
		boolean containsBody = false;
		Iterator<EObject> ancestorItr = EcoreUtil2.getAllContainers(commonCommand).iterator();
		
		while(ancestorItr.hasNext()) {
			EObject ancestor = ancestorItr.next();
			if(ancestor.eClass().getName().equals("BodyCommand")) {
				containsBody = true;
				break;
			}
		}
		
		if(!containsBody) {
			warning("Command should be inside the body.", commonCommand, null, VizPackage.COMMON_COMMAND, 
					"org.xtext.example.vizual.bodyAncestorError", null);
		}
	}

	@Check
	public void checkTableDataIsInsideATableRow(TableData tableData) {
		if(!tableData.eContainer().eClass().getName().equals("TableRow")) {
			warning("Table data should be inside of a table row.", tableData, null, VizPackage.TABLE_DATA, 
					"org.xtext.example.vizual.tableDataError", null);
		}
	}
	
	@Check
	public void checkTableRowIsInsideTable(TableRow tableRow) {
		if(!tableRow.eContainer().eClass().getName().equals("TableCommand")) {
			warning("Table row should be inside a table.", tableRow, null, VizPackage.TABLE_ROW, 
					"org.xtext.example.vizual.tableRowError", null);
		}
	}
}