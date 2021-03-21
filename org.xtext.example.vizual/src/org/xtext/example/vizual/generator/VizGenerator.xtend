/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.vizual.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.vizual.viz.Model
import org.xtext.example.vizual.viz.Create
import org.xtext.example.vizual.viz.CreateBulletPoints
import org.xtext.example.vizual.viz.Command
import java.util.ArrayList
import org.xtext.example.vizual.viz.Generate

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class VizGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.contents.head as Model
		fsa.generateFile(deriveTargetFileNameFor(model, resource), model.doGenerate)
		val className = resource.deriveClassName
		fsa.generateFile(className + '.html', model.doGenerate(className))
	}

		/** This method appends .txt to the end of the resource file being output
		 *  Code provided by Zchaler. S (2021) Lecture 4 Code Generation
		 */
		def deriveTargetFileNameFor(Model model, Resource resource) {
			resource.URI.appendFileExtension('txt').lastSegment
		}
		
		/*	This method derives the file name of containing file
		 * 	Code provided by Zchaler. S (2021) Lecture 4 Code Generation
		 */
		def deriveClassName(Resource r){
			val origFileName = r.URI.lastSegment
			origFileName.substring(0, origFileName.indexOf('.')).toFirstUpper + 'viz'
		}
	
		def doGenerate(Model m, String className)'''
			<!DOCTYPE html>
			«m.getCommands.map[generateHTMLCommand].join('\n')»
		'''
		
		
		def doGenerate(Model m) ''''''
		dispatch def generateHTMLCommand(Command cmd) ''''''
		dispatch def generateHTMLCommand(Create crt) '''
		«if(crt == "BP"){val a =  crt.bullets.split(",")}»
			bullet point code here
			
		'''
		dispatch def generateHTMLCommand(Generate gnrt)'''
		<head> This is a default HTML webpage head </head>
		<body> This is a default HTML webpage body </body>'''
		
}