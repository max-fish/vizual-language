/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.vizual.viz;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Head Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.vizual.viz.HeadCommand#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.vizual.viz.VizPackage#getHeadCommand()
 * @model
 * @generated
 */
public interface HeadCommand extends Command
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' containment reference.
   * @see #setTitle(TitleCommand)
   * @see org.xtext.example.vizual.viz.VizPackage#getHeadCommand_Title()
   * @model containment="true"
   * @generated
   */
  TitleCommand getTitle();

  /**
   * Sets the value of the '{@link org.xtext.example.vizual.viz.HeadCommand#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(TitleCommand value);

} // HeadCommand