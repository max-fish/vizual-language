/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.vizual.viz;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.vizual.viz.VizPackage
 * @generated
 */
public interface VizFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VizFactory eINSTANCE = org.xtext.example.vizual.viz.impl.VizFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Main Tag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Main Tag</em>'.
   * @generated
   */
  MainTag createMainTag();

  /**
   * Returns a new object of class '<em>Normal Tag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Normal Tag</em>'.
   * @generated
   */
  NormalTag createNormalTag();

  /**
   * Returns a new object of class '<em>Text Tag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Tag</em>'.
   * @generated
   */
  TextTag createTextTag();

  /**
   * Returns a new object of class '<em>Container Tag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container Tag</em>'.
   * @generated
   */
  ContainerTag createContainerTag();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VizPackage getVizPackage();

} //VizFactory