/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.vizual.viz.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.vizual.viz.TableData;
import org.xtext.example.vizual.viz.VizPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.vizual.viz.impl.TableDataImpl#getDataValue <em>Data Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableDataImpl extends CommonCommandImpl implements TableData
{
  /**
   * The default value of the '{@link #getDataValue() <em>Data Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataValue()
   * @generated
   * @ordered
   */
  protected static final String DATA_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDataValue() <em>Data Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataValue()
   * @generated
   * @ordered
   */
  protected String dataValue = DATA_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TableDataImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return VizPackage.Literals.TABLE_DATA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDataValue()
  {
    return dataValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDataValue(String newDataValue)
  {
    String oldDataValue = dataValue;
    dataValue = newDataValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VizPackage.TABLE_DATA__DATA_VALUE, oldDataValue, dataValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case VizPackage.TABLE_DATA__DATA_VALUE:
        return getDataValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VizPackage.TABLE_DATA__DATA_VALUE:
        setDataValue((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case VizPackage.TABLE_DATA__DATA_VALUE:
        setDataValue(DATA_VALUE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case VizPackage.TABLE_DATA__DATA_VALUE:
        return DATA_VALUE_EDEFAULT == null ? dataValue != null : !DATA_VALUE_EDEFAULT.equals(dataValue);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (dataValue: ");
    result.append(dataValue);
    result.append(')');
    return result.toString();
  }

} //TableDataImpl
