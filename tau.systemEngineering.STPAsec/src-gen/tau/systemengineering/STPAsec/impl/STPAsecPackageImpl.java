/**
 */
package tau.systemengineering.STPAsec.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import tau.systemengineering.STPAsec.ControlAction;
import tau.systemengineering.STPAsec.ControlStructure;
import tau.systemengineering.STPAsec.ControlStructureElement;
import tau.systemengineering.STPAsec.ControlledProcess;
import tau.systemengineering.STPAsec.Feedback;
import tau.systemengineering.STPAsec.OtherInformation;
import tau.systemengineering.STPAsec.STPASec;
import tau.systemengineering.STPAsec.STPAsecFactory;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class STPAsecPackageImpl extends EPackageImpl implements STPAsecPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stpaSecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlStructureElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlledProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherInformationEClass = null;

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
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private STPAsecPackageImpl() {
		super(eNS_URI, STPAsecFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link STPAsecPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static STPAsecPackage init() {
		if (isInited)
			return (STPAsecPackage) EPackage.Registry.INSTANCE.getEPackage(STPAsecPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSTPAsecPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		STPAsecPackageImpl theSTPAsecPackage = registeredSTPAsecPackage instanceof STPAsecPackageImpl
				? (STPAsecPackageImpl) registeredSTPAsecPackage
				: new STPAsecPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSTPAsecPackage.createPackageContents();

		// Initialize created meta-data
		theSTPAsecPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSTPAsecPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(STPAsecPackage.eNS_URI, theSTPAsecPackage);
		return theSTPAsecPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSTPASec() {
		return stpaSecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSTPASec_Systems() {
		return (EReference) stpaSecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Subsystems() {
		return (EReference) systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Name() {
		return (EAttribute) systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Description() {
		return (EAttribute) systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_SystemMode() {
		return (EReference) systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlStructure() {
		return controlStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlStructure_Name() {
		return (EAttribute) controlStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlStructure_ModelGoal() {
		return (EAttribute) controlStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlStructure_Description() {
		return (EAttribute) controlStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlStructure_Controller() {
		return (EReference) controlStructureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlStructure_Controlledprocess() {
		return (EReference) controlStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlStructure_Controlaction() {
		return (EReference) controlStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlStructure_Feedback() {
		return (EReference) controlStructureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlStructure_SendsFeedbacks() {
		return (EReference) controlStructureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlStructure_SendsCommands() {
		return (EReference) controlStructureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlStructure_ControllerSendsInfo() {
		return (EReference) controlStructureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlStructureElement() {
		return controlStructureElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlStructureElement_Name() {
		return (EAttribute) controlStructureElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlStructureElement_Description() {
		return (EAttribute) controlStructureElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlledProcess() {
		return controlledProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlledProcess_SendsFeedbacks() {
		return (EReference) controlledProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlledProcess_ControledProcessSendsInfo() {
		return (EReference) controlledProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlAction() {
		return controlActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlAction_ControllerCommandReceiver() {
		return (EReference) controlActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlAction_ControledProccessReceiverCommands() {
		return (EReference) controlActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedback() {
		return feedbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedback_ControllerFeedbackReceiver() {
		return (EReference) feedbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherInformation() {
		return otherInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherInformation_CcontrollerReceiverInfo() {
		return (EReference) otherInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherInformation_ControledProcessRecevierInfo() {
		return (EReference) otherInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STPAsecFactory getSTPAsecFactory() {
		return (STPAsecFactory) getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		stpaSecEClass = createEClass(STPA_SEC);
		createEReference(stpaSecEClass, STPA_SEC__SYSTEMS);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__SUBSYSTEMS);
		createEAttribute(systemEClass, SYSTEM__NAME);
		createEAttribute(systemEClass, SYSTEM__DESCRIPTION);
		createEReference(systemEClass, SYSTEM__SYSTEM_MODE);

		controlStructureEClass = createEClass(CONTROL_STRUCTURE);
		createEAttribute(controlStructureEClass, CONTROL_STRUCTURE__NAME);
		createEAttribute(controlStructureEClass, CONTROL_STRUCTURE__MODEL_GOAL);
		createEAttribute(controlStructureEClass, CONTROL_STRUCTURE__DESCRIPTION);
		createEReference(controlStructureEClass, CONTROL_STRUCTURE__CONTROLLEDPROCESS);
		createEReference(controlStructureEClass, CONTROL_STRUCTURE__CONTROLACTION);
		createEReference(controlStructureEClass, CONTROL_STRUCTURE__FEEDBACK);
		createEReference(controlStructureEClass, CONTROL_STRUCTURE__SENDS_FEEDBACKS);
		createEReference(controlStructureEClass, CONTROL_STRUCTURE__SENDS_COMMANDS);
		createEReference(controlStructureEClass, CONTROL_STRUCTURE__CONTROLLER_SENDS_INFO);
		createEReference(controlStructureEClass, CONTROL_STRUCTURE__CONTROLLER);

		controlStructureElementEClass = createEClass(CONTROL_STRUCTURE_ELEMENT);
		createEAttribute(controlStructureElementEClass, CONTROL_STRUCTURE_ELEMENT__NAME);
		createEAttribute(controlStructureElementEClass, CONTROL_STRUCTURE_ELEMENT__DESCRIPTION);

		controlledProcessEClass = createEClass(CONTROLLED_PROCESS);
		createEReference(controlledProcessEClass, CONTROLLED_PROCESS__SENDS_FEEDBACKS);
		createEReference(controlledProcessEClass, CONTROLLED_PROCESS__CONTROLED_PROCESS_SENDS_INFO);

		controlActionEClass = createEClass(CONTROL_ACTION);
		createEReference(controlActionEClass, CONTROL_ACTION__CONTROLLER_COMMAND_RECEIVER);
		createEReference(controlActionEClass, CONTROL_ACTION__CONTROLED_PROCCESS_RECEIVER_COMMANDS);

		feedbackEClass = createEClass(FEEDBACK);
		createEReference(feedbackEClass, FEEDBACK__CONTROLLER_FEEDBACK_RECEIVER);

		otherInformationEClass = createEClass(OTHER_INFORMATION);
		createEReference(otherInformationEClass, OTHER_INFORMATION__CCONTROLLER_RECEIVER_INFO);
		createEReference(otherInformationEClass, OTHER_INFORMATION__CONTROLED_PROCESS_RECEVIER_INFO);
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
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		controlledProcessEClass.getESuperTypes().add(this.getControlStructureElement());
		controlActionEClass.getESuperTypes().add(this.getControlStructureElement());
		feedbackEClass.getESuperTypes().add(this.getControlStructureElement());
		otherInformationEClass.getESuperTypes().add(this.getControlStructureElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(stpaSecEClass, STPASec.class, "STPASec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSTPASec_Systems(), this.getSystem(), null, "systems", null, 0, -1, STPASec.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, tau.systemengineering.STPAsec.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Subsystems(), this.getSystem(), null, "subsystems", null, 0, -1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_SystemMode(), this.getControlStructure(), null, "systemMode", null, 0, -1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlStructureEClass, ControlStructure.class, "ControlStructure", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlStructure_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ControlStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlStructure_ModelGoal(), ecorePackage.getEString(), "modelGoal", null, 0, 1,
				ControlStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlStructure_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ControlStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getControlStructure_Controlledprocess(), this.getControlledProcess(), null, "controlledprocess",
				null, 0, -1, ControlStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlStructure_Controlaction(), this.getControlAction(), null, "controlaction", null, 0, -1,
				ControlStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlStructure_Feedback(), this.getFeedback(), null, "feedback", null, 0, -1,
				ControlStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlStructure_SendsFeedbacks(), this.getFeedback(),
				this.getFeedback_ControllerFeedbackReceiver(), "sendsFeedbacks", null, 0, 1, ControlStructure.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlStructure_SendsCommands(), this.getControlAction(),
				this.getControlAction_ControllerCommandReceiver(), "sendsCommands", null, 0, 1, ControlStructure.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlStructure_ControllerSendsInfo(), this.getOtherInformation(),
				this.getOtherInformation_CcontrollerReceiverInfo(), "controllerSendsInfo", null, 0, -1,
				ControlStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlStructure_Controller(), this.getSystem(), null, "controller", null, 0, -1,
				ControlStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlStructureElementEClass, ControlStructureElement.class, "ControlStructureElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlStructureElement_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ControlStructureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlStructureElement_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ControlStructureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlledProcessEClass, ControlledProcess.class, "ControlledProcess", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlledProcess_SendsFeedbacks(), this.getFeedback(), null, "sendsFeedbacks", null, 0, 1,
				ControlledProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlledProcess_ControledProcessSendsInfo(), this.getOtherInformation(),
				this.getOtherInformation_ControledProcessRecevierInfo(), "controledProcessSendsInfo", null, 0, -1,
				ControlledProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlActionEClass, ControlAction.class, "ControlAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlAction_ControllerCommandReceiver(), this.getControlStructure(),
				this.getControlStructure_SendsCommands(), "controllerCommandReceiver", null, 0, -1, ControlAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlAction_ControledProccessReceiverCommands(), this.getControlledProcess(), null,
				"controledProccessReceiverCommands", null, 0, 1, ControlAction.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feedbackEClass, Feedback.class, "Feedback", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeedback_ControllerFeedbackReceiver(), this.getControlStructure(),
				this.getControlStructure_SendsFeedbacks(), "controllerFeedbackReceiver", null, 0, -1, Feedback.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(otherInformationEClass, OtherInformation.class, "OtherInformation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOtherInformation_CcontrollerReceiverInfo(), this.getControlStructure(),
				this.getControlStructure_ControllerSendsInfo(), "ccontrollerReceiverInfo", null, 0, -1,
				OtherInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOtherInformation_ControledProcessRecevierInfo(), this.getControlledProcess(),
				this.getControlledProcess_ControledProcessSendsInfo(), "ControledProcessRecevierInfo", null, 0, 1,
				OtherInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //STPAsecPackageImpl
