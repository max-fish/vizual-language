/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.vizual.viz.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.vizual.viz.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VizFactoryImpl extends EFactoryImpl implements VizFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VizFactory init()
  {
    try
    {
      VizFactory theVizFactory = (VizFactory)EPackage.Registry.INSTANCE.getEFactory(VizPackage.eNS_URI);
      if (theVizFactory != null)
      {
        return theVizFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VizFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VizFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case VizPackage.MODEL: return createModel();
      case VizPackage.COMMAND: return createCommand();
      case VizPackage.HEAD_COMMAND: return createHeadCommand();
      case VizPackage.BODY_COMMAND: return createBodyCommand();
      case VizPackage.TITLE_COMMAND: return createTitleCommand();
      case VizPackage.COMMON_COMMAND: return createCommonCommand();
      case VizPackage.DIV_COMMAND: return createDivCommand();
      case VizPackage.CREATE: return createCreate();
      case VizPackage.TEXT_COMMAND: return createTextCommand();
      case VizPackage.DIV: return createDiv();
      case VizPackage.TABLE_COMMAND: return createTableCommand();
      case VizPackage.TABLE_ROW: return createTableRow();
      case VizPackage.TABLE_HEADER: return createTableHeader();
      case VizPackage.TABLE_DATA: return createTableData();
      case VizPackage.INITIALIZER: return createInitializer();
      case VizPackage.DROP_DOWN_COMMAND: return createDropDownCommand();
      case VizPackage.BULLET_POINT_COMMAND: return createBulletPointCommand();
      case VizPackage.NUMBERED_LIST_COMMAND: return createNumberedListCommand();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case VizPackage.HTML_COMMAND:
        return createHtmlCommandFromString(eDataType, initialValue);
      case VizPackage.END_HTML_COMMAND:
        return createEndHtmlCommandFromString(eDataType, initialValue);
      case VizPackage.CREATE_BULLET_POINTS:
        return createCreateBulletPointsFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case VizPackage.HTML_COMMAND:
        return convertHtmlCommandToString(eDataType, instanceValue);
      case VizPackage.END_HTML_COMMAND:
        return convertEndHtmlCommandToString(eDataType, instanceValue);
      case VizPackage.CREATE_BULLET_POINTS:
        return convertCreateBulletPointsToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HeadCommand createHeadCommand()
  {
    HeadCommandImpl headCommand = new HeadCommandImpl();
    return headCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BodyCommand createBodyCommand()
  {
    BodyCommandImpl bodyCommand = new BodyCommandImpl();
    return bodyCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TitleCommand createTitleCommand()
  {
    TitleCommandImpl titleCommand = new TitleCommandImpl();
    return titleCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CommonCommand createCommonCommand()
  {
    CommonCommandImpl commonCommand = new CommonCommandImpl();
    return commonCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DivCommand createDivCommand()
  {
    DivCommandImpl divCommand = new DivCommandImpl();
    return divCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Create createCreate()
  {
    CreateImpl create = new CreateImpl();
    return create;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TextCommand createTextCommand()
  {
    TextCommandImpl textCommand = new TextCommandImpl();
    return textCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TableCommand createTableCommand()
  {
    TableCommandImpl tableCommand = new TableCommandImpl();
    return tableCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TableRow createTableRow()
  {
    TableRowImpl tableRow = new TableRowImpl();
    return tableRow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TableHeader createTableHeader()
  {
    TableHeaderImpl tableHeader = new TableHeaderImpl();
    return tableHeader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TableData createTableData()
  {
    TableDataImpl tableData = new TableDataImpl();
    return tableData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Initializer createInitializer()
  {
    InitializerImpl initializer = new InitializerImpl();
    return initializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DropDownCommand createDropDownCommand()
  {
    DropDownCommandImpl dropDownCommand = new DropDownCommandImpl();
    return dropDownCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BulletPointCommand createBulletPointCommand()
  {
    BulletPointCommandImpl bulletPointCommand = new BulletPointCommandImpl();
    return bulletPointCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumberedListCommand createNumberedListCommand()
  {
    NumberedListCommandImpl numberedListCommand = new NumberedListCommandImpl();
    return numberedListCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HtmlCommand createHtmlCommandFromString(EDataType eDataType, String initialValue)
  {
    HtmlCommand result = HtmlCommand.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertHtmlCommandToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EndHtmlCommand createEndHtmlCommandFromString(EDataType eDataType, String initialValue)
  {
    EndHtmlCommand result = EndHtmlCommand.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEndHtmlCommandToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateBulletPoints createCreateBulletPointsFromString(EDataType eDataType, String initialValue)
  {
    CreateBulletPoints result = CreateBulletPoints.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCreateBulletPointsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VizPackage getVizPackage()
  {
    return (VizPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VizPackage getPackage()
  {
    return VizPackage.eINSTANCE;
  }

} //VizFactoryImpl
