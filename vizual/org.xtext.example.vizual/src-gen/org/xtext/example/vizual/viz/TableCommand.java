/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.vizual.viz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.vizual.viz.TableCommand#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.vizual.viz.VizPackage#getTableCommand()
 * @model
 * @generated
 */
public interface TableCommand extends CommonCommand
{
  /**
   * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.vizual.viz.TableRow}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rows</em>' containment reference list.
   * @see org.xtext.example.vizual.viz.VizPackage#getTableCommand_Rows()
   * @model containment="true"
   * @generated
   */
  EList<TableRow> getRows();

} // TableCommand
