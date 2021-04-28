/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.vizual.viz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numbered List Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.vizual.viz.NumberedListCommand#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.vizual.viz.VizPackage#getNumberedListCommand()
 * @model
 * @generated
 */
public interface NumberedListCommand extends CommonCommand
{
  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.vizual.viz.TextCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.xtext.example.vizual.viz.VizPackage#getNumberedListCommand_Children()
   * @model containment="true"
   * @generated
   */
  EList<TextCommand> getChildren();

} // NumberedListCommand
