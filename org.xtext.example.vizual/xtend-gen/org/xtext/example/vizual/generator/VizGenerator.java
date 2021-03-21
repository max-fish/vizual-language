/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.vizual.generator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.vizual.viz.Model;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class VizGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final Model model = ((Model) _head);
    fsa.generateFile(this.deriveTargetFileNameFor(model, resource), this.doGenerate(model));
  }
  
  public String deriveTargetFileNameFor(final Model model, final Resource resource) {
    return resource.getURI().lastSegment();
  }
  
  public String doGenerate(final Model m) {
    return null;
  }
}
