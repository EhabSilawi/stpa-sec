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
import tau.systemengineering.STPAsec.ControlledProcess;
import tau.systemengineering.STPAsec.Controller;
import tau.systemengineering.STPAsec.DataFlow;
import tau.systemengineering.STPAsec.Feedback;
import tau.systemengineering.STPAsec.Hazard;
import tau.systemengineering.STPAsec.LossScenario;
import tau.systemengineering.STPAsec.MissionGoal;
import tau.systemengineering.STPAsec.STPASec;
import tau.systemengineering.STPAsec.STPAsecFactory;
import tau.systemengineering.STPAsec.STPAsecPackage;
import tau.systemengineering.STPAsec.SecurityRecomendation;
import tau.systemengineering.STPAsec.StructureElement;
import tau.systemengineering.STPAsec.UnsafeControlAction;

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
	private EClass lossScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missionGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityRecomendationEClass = null;

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
	private EClass stpaSecEClass = null;

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
	private EClass structureElementEClass = null;

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
	private EClass controllerEClass = null;

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
	private EClass controlActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsafeControlActionEClass = null;

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
	public EClass getLossScenario() {
		return lossScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLossScenario_Id() {
		return (EAttribute) lossScenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLossScenario_Description() {
		return (EAttribute) lossScenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLossScenario_Severity() {
		return (EAttribute) lossScenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLossScenario_Solutions() {
		return (EReference) lossScenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHazard() {
		return hazardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazard_Id() {
		return (EAttribute) hazardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHazard_Description() {
		return (EAttribute) hazardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazard_RelatedLosses() {
		return (EReference) hazardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHazard_UnsafeControlAction() {
		return (EReference) hazardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMissionGoal() {
		return missionGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMissionGoal_Name() {
		return (EAttribute) missionGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMissionGoal_Description() {
		return (EAttribute) missionGoalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMissionGoal_Issues() {
		return (EReference) missionGoalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityRecomendation() {
		return securityRecomendationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRecomendation_Id() {
		return (EAttribute) securityRecomendationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityRecomendation_Solution() {
		return (EAttribute) securityRecomendationEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getSystem_Name() {
		return (EAttribute) systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Recomends() {
		return (EReference) systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Goals() {
		return (EReference) systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Scenario() {
		return (EReference) systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_ConsistsOf() {
		return (EReference) systemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Description() {
		return (EAttribute) systemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Causes() {
		return (EReference) systemEClass.getEStructuralFeatures().get(6);
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
	public EReference getSTPASec_System() {
		return (EReference) stpaSecEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getFeedback_Type() {
		return (EAttribute) feedbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedback_Controller() {
		return (EReference) feedbackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedback_ControlledProcess() {
		return (EReference) feedbackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureElement() {
		return structureElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureElement_Name() {
		return (EAttribute) structureElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureElement_Description() {
		return (EAttribute) structureElementEClass.getEStructuralFeatures().get(1);
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
	public EReference getControlledProcess_Feedbacks() {
		return (EReference) controlledProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_Type() {
		return (EAttribute) controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_Commands() {
		return (EReference) controllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getController_Feedbacks() {
		return (EReference) controllerEClass.getEStructuralFeatures().get(2);
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
	public EReference getControlStructure_Elements() {
		return (EReference) controlStructureEClass.getEStructuralFeatures().get(0);
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
	public EReference getControlAction_Receiver() {
		return (EReference) controlActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlow() {
		return dataFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFlow_Id() {
		return (EAttribute) dataFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsafeControlAction() {
		return unsafeControlActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnsafeControlAction_Hazard() {
		return (EReference) unsafeControlActionEClass.getEStructuralFeatures().get(0);
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
		lossScenarioEClass = createEClass(LOSS_SCENARIO);
		createEAttribute(lossScenarioEClass, LOSS_SCENARIO__ID);
		createEAttribute(lossScenarioEClass, LOSS_SCENARIO__DESCRIPTION);
		createEAttribute(lossScenarioEClass, LOSS_SCENARIO__SEVERITY);
		createEReference(lossScenarioEClass, LOSS_SCENARIO__SOLUTIONS);

		hazardEClass = createEClass(HAZARD);
		createEAttribute(hazardEClass, HAZARD__ID);
		createEAttribute(hazardEClass, HAZARD__DESCRIPTION);
		createEReference(hazardEClass, HAZARD__RELATED_LOSSES);
		createEReference(hazardEClass, HAZARD__UNSAFE_CONTROL_ACTION);

		missionGoalEClass = createEClass(MISSION_GOAL);
		createEAttribute(missionGoalEClass, MISSION_GOAL__NAME);
		createEAttribute(missionGoalEClass, MISSION_GOAL__DESCRIPTION);
		createEReference(missionGoalEClass, MISSION_GOAL__ISSUES);

		securityRecomendationEClass = createEClass(SECURITY_RECOMENDATION);
		createEAttribute(securityRecomendationEClass, SECURITY_RECOMENDATION__ID);
		createEAttribute(securityRecomendationEClass, SECURITY_RECOMENDATION__SOLUTION);

		systemEClass = createEClass(SYSTEM);
		createEAttribute(systemEClass, SYSTEM__NAME);
		createEReference(systemEClass, SYSTEM__RECOMENDS);
		createEReference(systemEClass, SYSTEM__GOALS);
		createEReference(systemEClass, SYSTEM__SCENARIO);
		createEReference(systemEClass, SYSTEM__CONSISTS_OF);
		createEAttribute(systemEClass, SYSTEM__DESCRIPTION);
		createEReference(systemEClass, SYSTEM__CAUSES);

		stpaSecEClass = createEClass(STPA_SEC);
		createEReference(stpaSecEClass, STPA_SEC__SYSTEM);

		feedbackEClass = createEClass(FEEDBACK);
		createEAttribute(feedbackEClass, FEEDBACK__TYPE);
		createEReference(feedbackEClass, FEEDBACK__CONTROLLER);
		createEReference(feedbackEClass, FEEDBACK__CONTROLLED_PROCESS);

		structureElementEClass = createEClass(STRUCTURE_ELEMENT);
		createEAttribute(structureElementEClass, STRUCTURE_ELEMENT__NAME);
		createEAttribute(structureElementEClass, STRUCTURE_ELEMENT__DESCRIPTION);

		controlledProcessEClass = createEClass(CONTROLLED_PROCESS);
		createEReference(controlledProcessEClass, CONTROLLED_PROCESS__FEEDBACKS);

		controllerEClass = createEClass(CONTROLLER);
		createEAttribute(controllerEClass, CONTROLLER__TYPE);
		createEReference(controllerEClass, CONTROLLER__COMMANDS);
		createEReference(controllerEClass, CONTROLLER__FEEDBACKS);

		controlStructureEClass = createEClass(CONTROL_STRUCTURE);
		createEReference(controlStructureEClass, CONTROL_STRUCTURE__ELEMENTS);

		controlActionEClass = createEClass(CONTROL_ACTION);
		createEReference(controlActionEClass, CONTROL_ACTION__RECEIVER);

		dataFlowEClass = createEClass(DATA_FLOW);
		createEAttribute(dataFlowEClass, DATA_FLOW__ID);

		unsafeControlActionEClass = createEClass(UNSAFE_CONTROL_ACTION);
		createEReference(unsafeControlActionEClass, UNSAFE_CONTROL_ACTION__HAZARD);
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
		feedbackEClass.getESuperTypes().add(this.getDataFlow());
		controlledProcessEClass.getESuperTypes().add(this.getStructureElement());
		controllerEClass.getESuperTypes().add(this.getStructureElement());
		controlActionEClass.getESuperTypes().add(this.getDataFlow());
		dataFlowEClass.getESuperTypes().add(this.getStructureElement());
		unsafeControlActionEClass.getESuperTypes().add(this.getControlAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(lossScenarioEClass, LossScenario.class, "LossScenario", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLossScenario_Id(), ecorePackage.getEInt(), "id", null, 0, 1, LossScenario.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLossScenario_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				LossScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLossScenario_Severity(), ecorePackage.getEString(), "severity", null, 0, 1,
				LossScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getLossScenario_Solutions(), this.getSecurityRecomendation(), null, "solutions", null, 0, -1,
				LossScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hazardEClass, Hazard.class, "Hazard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHazard_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Hazard.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazard_Description(), ecorePackage.getEString(), "description", null, 0, 1, Hazard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazard_RelatedLosses(), this.getLossScenario(), null, "relatedLosses", null, 0, -1,
				Hazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazard_UnsafeControlAction(), this.getUnsafeControlAction(), null, "unsafeControlAction",
				null, 0, -1, Hazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(missionGoalEClass, MissionGoal.class, "MissionGoal", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMissionGoal_Name(), ecorePackage.getEString(), "name", null, 0, 1, MissionGoal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMissionGoal_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				MissionGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMissionGoal_Issues(), this.getLossScenario(), null, "issues", null, 0, -1, MissionGoal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityRecomendationEClass, SecurityRecomendation.class, "SecurityRecomendation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityRecomendation_Id(), ecorePackage.getEInt(), "id", null, 0, 1,
				SecurityRecomendation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityRecomendation_Solution(), ecorePackage.getEString(), "solution", null, 0, 1,
				SecurityRecomendation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, tau.systemengineering.STPAsec.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Recomends(), this.getSecurityRecomendation(), null, "recomends", null, 0, -1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Goals(), this.getMissionGoal(), null, "goals", null, 1, -1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Scenario(), this.getLossScenario(), null, "scenario", null, 0, -1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_ConsistsOf(), this.getControlStructure(), null, "consistsOf", null, 1, 1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Causes(), this.getHazard(), null, "causes", null, 0, -1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stpaSecEClass, STPASec.class, "STPASec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSTPASec_System(), this.getSystem(), null, "system", null, 1, 1, STPASec.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(feedbackEClass, Feedback.class, "Feedback", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeedback_Type(), ecorePackage.getEString(), "type", null, 0, 1, Feedback.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedback_Controller(), this.getController(), this.getController_Feedbacks(), "controller",
				null, 0, 1, Feedback.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedback_ControlledProcess(), this.getControlledProcess(),
				this.getControlledProcess_Feedbacks(), "controlledProcess", null, 0, 1, Feedback.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(structureElementEClass, StructureElement.class, "StructureElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructureElement_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				StructureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructureElement_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				StructureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(controlledProcessEClass, ControlledProcess.class, "ControlledProcess", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlledProcess_Feedbacks(), this.getFeedback(), this.getFeedback_ControlledProcess(),
				"feedbacks", null, 0, -1, ControlledProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getController_Type(), ecorePackage.getEString(), "type", null, 0, 1, Controller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_Commands(), this.getControlAction(), this.getControlAction_Receiver(), "commands",
				null, 0, -1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getController_Feedbacks(), this.getFeedback(), this.getFeedback_Controller(), "feedbacks", null,
				0, -1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlStructureEClass, ControlStructure.class, "ControlStructure", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlStructure_Elements(), this.getStructureElement(), null, "elements", null, 0, -1,
				ControlStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlActionEClass, ControlAction.class, "ControlAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlAction_Receiver(), this.getController(), this.getController_Commands(), "receiver",
				null, 0, 1, ControlAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFlowEClass, DataFlow.class, "DataFlow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataFlow_Id(), ecorePackage.getEInt(), "id", null, 0, 1, DataFlow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unsafeControlActionEClass, UnsafeControlAction.class, "UnsafeControlAction", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnsafeControlAction_Hazard(), this.getHazard(), null, "hazard", null, 0, 1,
				UnsafeControlAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //STPAsecPackageImpl
