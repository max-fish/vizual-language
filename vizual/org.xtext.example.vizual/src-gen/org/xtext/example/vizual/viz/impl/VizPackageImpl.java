/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.vizual.viz.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.vizual.viz.BodyCommand;
import org.xtext.example.vizual.viz.BulletPointCommand;
import org.xtext.example.vizual.viz.Command;
import org.xtext.example.vizual.viz.CommonCommand;
import org.xtext.example.vizual.viz.Create;
import org.xtext.example.vizual.viz.CreateBulletPoints;
import org.xtext.example.vizual.viz.Div;
import org.xtext.example.vizual.viz.DivCommand;
import org.xtext.example.vizual.viz.DropDownCommand;
import org.xtext.example.vizual.viz.EndHtmlCommand;
import org.xtext.example.vizual.viz.HeadCommand;
import org.xtext.example.vizual.viz.HtmlCommand;
import org.xtext.example.vizual.viz.Initializer;
import org.xtext.example.vizual.viz.Model;
import org.xtext.example.vizual.viz.NumberedListCommand;
import org.xtext.example.vizual.viz.TableCommand;
import org.xtext.example.vizual.viz.TableData;
import org.xtext.example.vizual.viz.TableHeader;
import org.xtext.example.vizual.viz.TableRow;
import org.xtext.example.vizual.viz.TextCommand;
import org.xtext.example.vizual.viz.TitleCommand;
import org.xtext.example.vizual.viz.VizFactory;
import org.xtext.example.vizual.viz.VizPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VizPackageImpl extends EPackageImpl implements VizPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass titleCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commonCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableRowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableHeaderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableDataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dropDownCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bulletPointCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberedListCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum htmlCommandEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum endHtmlCommandEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum createBulletPointsEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.vizual.viz.VizPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private VizPackageImpl()
  {
    super(eNS_URI, VizFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link VizPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static VizPackage init()
  {
    if (isInited) return (VizPackage)EPackage.Registry.INSTANCE.getEPackage(VizPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredVizPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    VizPackageImpl theVizPackage = registeredVizPackage instanceof VizPackageImpl ? (VizPackageImpl)registeredVizPackage : new VizPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theVizPackage.createPackageContents();

    // Initialize created meta-data
    theVizPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theVizPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(VizPackage.eNS_URI, theVizPackage);
    return theVizPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Commands()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCommand()
  {
    return commandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCommand_Html()
  {
    return (EAttribute)commandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCommand_EndHtml()
  {
    return (EAttribute)commandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getHeadCommand()
  {
    return headCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getHeadCommand_Title()
  {
    return (EReference)headCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBodyCommand()
  {
    return bodyCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getBodyCommand_Children()
  {
    return (EReference)bodyCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTitleCommand()
  {
    return titleCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTitleCommand_Text()
  {
    return (EAttribute)titleCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCommonCommand()
  {
    return commonCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDivCommand()
  {
    return divCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDivCommand_Div()
  {
    return (EReference)divCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDivCommand_DivText()
  {
    return (EAttribute)divCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCreate()
  {
    return createEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCreate_Command()
  {
    return (EAttribute)createEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCreate_Bullets()
  {
    return (EAttribute)createEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTextCommand()
  {
    return textCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTextCommand_Heading()
  {
    return (EAttribute)textCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTextCommand_Text()
  {
    return (EAttribute)textCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDiv()
  {
    return divEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDiv_Division()
  {
    return (EAttribute)divEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTableCommand()
  {
    return tableCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTableCommand_Rows()
  {
    return (EReference)tableCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTableRow()
  {
    return tableRowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTableRow_Data()
  {
    return (EReference)tableRowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTableHeader()
  {
    return tableHeaderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTableHeader_Text()
  {
    return (EAttribute)tableHeaderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTableData()
  {
    return tableDataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTableData_DataValue()
  {
    return (EAttribute)tableDataEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInitializer()
  {
    return initializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInitializer_Lang()
  {
    return (EAttribute)initializerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDropDownCommand()
  {
    return dropDownCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDropDownCommand_Label()
  {
    return (EAttribute)dropDownCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDropDownCommand_Options()
  {
    return (EAttribute)dropDownCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBulletPointCommand()
  {
    return bulletPointCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getBulletPointCommand_Children()
  {
    return (EReference)bulletPointCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNumberedListCommand()
  {
    return numberedListCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNumberedListCommand_Children()
  {
    return (EReference)numberedListCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getHtmlCommand()
  {
    return htmlCommandEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getEndHtmlCommand()
  {
    return endHtmlCommandEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getCreateBulletPoints()
  {
    return createBulletPointsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VizFactory getVizFactory()
  {
    return (VizFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__COMMANDS);

    commandEClass = createEClass(COMMAND);
    createEAttribute(commandEClass, COMMAND__HTML);
    createEAttribute(commandEClass, COMMAND__END_HTML);

    headCommandEClass = createEClass(HEAD_COMMAND);
    createEReference(headCommandEClass, HEAD_COMMAND__TITLE);

    bodyCommandEClass = createEClass(BODY_COMMAND);
    createEReference(bodyCommandEClass, BODY_COMMAND__CHILDREN);

    titleCommandEClass = createEClass(TITLE_COMMAND);
    createEAttribute(titleCommandEClass, TITLE_COMMAND__TEXT);

    commonCommandEClass = createEClass(COMMON_COMMAND);

    divCommandEClass = createEClass(DIV_COMMAND);
    createEReference(divCommandEClass, DIV_COMMAND__DIV);
    createEAttribute(divCommandEClass, DIV_COMMAND__DIV_TEXT);

    createEClass = createEClass(CREATE);
    createEAttribute(createEClass, CREATE__COMMAND);
    createEAttribute(createEClass, CREATE__BULLETS);

    textCommandEClass = createEClass(TEXT_COMMAND);
    createEAttribute(textCommandEClass, TEXT_COMMAND__HEADING);
    createEAttribute(textCommandEClass, TEXT_COMMAND__TEXT);

    divEClass = createEClass(DIV);
    createEAttribute(divEClass, DIV__DIVISION);

    tableCommandEClass = createEClass(TABLE_COMMAND);
    createEReference(tableCommandEClass, TABLE_COMMAND__ROWS);

    tableRowEClass = createEClass(TABLE_ROW);
    createEReference(tableRowEClass, TABLE_ROW__DATA);

    tableHeaderEClass = createEClass(TABLE_HEADER);
    createEAttribute(tableHeaderEClass, TABLE_HEADER__TEXT);

    tableDataEClass = createEClass(TABLE_DATA);
    createEAttribute(tableDataEClass, TABLE_DATA__DATA_VALUE);

    initializerEClass = createEClass(INITIALIZER);
    createEAttribute(initializerEClass, INITIALIZER__LANG);

    dropDownCommandEClass = createEClass(DROP_DOWN_COMMAND);
    createEAttribute(dropDownCommandEClass, DROP_DOWN_COMMAND__LABEL);
    createEAttribute(dropDownCommandEClass, DROP_DOWN_COMMAND__OPTIONS);

    bulletPointCommandEClass = createEClass(BULLET_POINT_COMMAND);
    createEReference(bulletPointCommandEClass, BULLET_POINT_COMMAND__CHILDREN);

    numberedListCommandEClass = createEClass(NUMBERED_LIST_COMMAND);
    createEReference(numberedListCommandEClass, NUMBERED_LIST_COMMAND__CHILDREN);

    // Create enums
    htmlCommandEEnum = createEEnum(HTML_COMMAND);
    endHtmlCommandEEnum = createEEnum(END_HTML_COMMAND);
    createBulletPointsEEnum = createEEnum(CREATE_BULLET_POINTS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    headCommandEClass.getESuperTypes().add(this.getCommand());
    bodyCommandEClass.getESuperTypes().add(this.getCommand());
    commonCommandEClass.getESuperTypes().add(this.getCommand());
    divCommandEClass.getESuperTypes().add(this.getCommonCommand());
    createEClass.getESuperTypes().add(this.getCommonCommand());
    textCommandEClass.getESuperTypes().add(this.getCommonCommand());
    tableCommandEClass.getESuperTypes().add(this.getCommonCommand());
    tableRowEClass.getESuperTypes().add(this.getCommonCommand());
    tableHeaderEClass.getESuperTypes().add(this.getCommonCommand());
    tableDataEClass.getESuperTypes().add(this.getCommonCommand());
    initializerEClass.getESuperTypes().add(this.getCommand());
    dropDownCommandEClass.getESuperTypes().add(this.getCommonCommand());
    bulletPointCommandEClass.getESuperTypes().add(this.getCommonCommand());
    numberedListCommandEClass.getESuperTypes().add(this.getCommonCommand());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Commands(), this.getCommand(), null, "commands", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCommand_Html(), this.getHtmlCommand(), "html", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCommand_EndHtml(), this.getEndHtmlCommand(), "endHtml", null, 0, 1, Command.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(headCommandEClass, HeadCommand.class, "HeadCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHeadCommand_Title(), this.getTitleCommand(), null, "title", null, 0, 1, HeadCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bodyCommandEClass, BodyCommand.class, "BodyCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBodyCommand_Children(), this.getCommonCommand(), null, "children", null, 0, -1, BodyCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(titleCommandEClass, TitleCommand.class, "TitleCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTitleCommand_Text(), ecorePackage.getEString(), "text", null, 0, 1, TitleCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commonCommandEClass, CommonCommand.class, "CommonCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(divCommandEClass, DivCommand.class, "DivCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDivCommand_Div(), this.getDiv(), null, "div", null, 0, 1, DivCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDivCommand_DivText(), ecorePackage.getEString(), "divText", null, 0, 1, DivCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createEClass, Create.class, "Create", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreate_Command(), this.getCreateBulletPoints(), "command", null, 0, 1, Create.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreate_Bullets(), ecorePackage.getEString(), "bullets", null, 0, 1, Create.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textCommandEClass, TextCommand.class, "TextCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTextCommand_Heading(), ecorePackage.getEString(), "heading", null, 0, 1, TextCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTextCommand_Text(), ecorePackage.getEString(), "text", null, 0, 1, TextCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(divEClass, Div.class, "Div", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDiv_Division(), ecorePackage.getEString(), "Division", null, 0, 1, Div.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableCommandEClass, TableCommand.class, "TableCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTableCommand_Rows(), this.getTableRow(), null, "rows", null, 0, -1, TableCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableRowEClass, TableRow.class, "TableRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTableRow_Data(), this.getCommonCommand(), null, "data", null, 0, -1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableHeaderEClass, TableHeader.class, "TableHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTableHeader_Text(), ecorePackage.getEString(), "text", null, 0, 1, TableHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableDataEClass, TableData.class, "TableData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTableData_DataValue(), ecorePackage.getEString(), "dataValue", null, 0, 1, TableData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initializerEClass, Initializer.class, "Initializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInitializer_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, Initializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dropDownCommandEClass, DropDownCommand.class, "DropDownCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDropDownCommand_Label(), ecorePackage.getEString(), "label", null, 0, 1, DropDownCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDropDownCommand_Options(), ecorePackage.getEString(), "options", null, 0, -1, DropDownCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bulletPointCommandEClass, BulletPointCommand.class, "BulletPointCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBulletPointCommand_Children(), this.getTextCommand(), null, "children", null, 0, -1, BulletPointCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberedListCommandEClass, NumberedListCommand.class, "NumberedListCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberedListCommand_Children(), this.getTextCommand(), null, "children", null, 0, -1, NumberedListCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(htmlCommandEEnum, HtmlCommand.class, "HtmlCommand");
    addEEnumLiteral(htmlCommandEEnum, HtmlCommand.HTML);

    initEEnum(endHtmlCommandEEnum, EndHtmlCommand.class, "EndHtmlCommand");
    addEEnumLiteral(endHtmlCommandEEnum, EndHtmlCommand.END_HTML);

    initEEnum(createBulletPointsEEnum, CreateBulletPoints.class, "CreateBulletPoints");
    addEEnumLiteral(createBulletPointsEEnum, CreateBulletPoints.BP);

    // Create resource
    createResource(eNS_URI);
  }

} //VizPackageImpl
