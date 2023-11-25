/**
 */
package tau.systemengineering.STPAsec.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tau.systemengineering.STPAsec.CmdFlow;
import tau.systemengineering.STPAsec.ControlAction;
import tau.systemengineering.STPAsec.ControlLoop;
import tau.systemengineering.STPAsec.ControllerConstraints;
import tau.systemengineering.STPAsec.Feedback;
import tau.systemengineering.STPAsec.FeedbackFlow;
import tau.systemengineering.STPAsec.InfoFlow;
import tau.systemengineering.STPAsec.Information;
import tau.systemengineering.STPAsec.InsecureControlAction;
import tau.systemengineering.STPAsec.Loss;
import tau.systemengineering.STPAsec.STPASec;
import tau.systemengineering.STPAsec.STPAsecFactory;
import tau.systemengineering.STPAsec.STPAsecPackage;
import tau.systemengineering.STPAsec.Scenario;
import tau.systemengineering.STPAsec.SystemLevelConstraint;
import tau.systemengineering.STPAsec.SystemLevelHazard;
import tau.systemengineering.STPAsec.TypeOfUnsecureControlAction;

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
	private EClass controlLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmdFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedbackFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lossEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemLevelHazardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemLevelConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insecureControlActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeOfUnsecureControlActionEEnum = null;

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
	public EReference getSTPASec_System() {
		return (EReference) stpaSecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSTPASec_Loss() {
		return (EReference) stpaSecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSTPASec_SystemLevelHazard() {
		return (EReference) stpaSecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSTPASec_SystemLevelConstraint() {
		return (EReference) stpaSecEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSTPASec_Scenario() {
		return (EReference) stpaSecEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSTPASec_InsecureControlAction() {
		return (EReference) stpaSecEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSTPASec_ControllerConstraints() {
		return (EReference) stpaSecEClass.getEStructuralFeatures().get(6);
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
	public EReference getSystem_ControAction() {
		return (EReference) systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Feedback() {
		return (EReference) systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_ControlLoop() {
		return (EReference) systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_SubSystem() {
		return (EReference) systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Id() {
		return (EAttribute) systemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Name() {
		return (EAttribute) systemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Goal() {
		return (EAttribute) systemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Information() {
		return (EReference) systemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_ReceivesInfo() {
		return (EReference) systemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_SendsInfo() {
		return (EReference) systemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_ReceivesFeedback() {
		return (EReference) systemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_SendsFeedback() {
		return (EReference) systemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Controls() {
		return (EReference) systemEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Performs() {
		return (EReference) systemEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_ControllerConstraints() {
		return (EReference) systemEClass.getEStructuralFeatures().get(14);
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
	public EAttribute getControlAction_Id() {
		return (EAttribute) controlActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlAction_Name() {
		return (EAttribute) controlActionEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getFeedback_Id() {
		return (EAttribute) feedbackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeedback_Name() {
		return (EAttribute) feedbackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlLoop() {
		return controlLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlLoop_Cmdflow() {
		return (EReference) controlLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlLoop_Feedbackflow() {
		return (EReference) controlLoopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlLoop_Infoflow() {
		return (EReference) controlLoopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmdFlow() {
		return cmdFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmdFlow_Id() {
		return (EAttribute) cmdFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmdFlow_PerformedBy() {
		return (EReference) cmdFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmdFlow_ControledBy() {
		return (EReference) cmdFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmdFlow_Cmd() {
		return (EReference) cmdFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeedbackFlow() {
		return feedbackFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeedbackFlow_Id() {
		return (EAttribute) feedbackFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackFlow_FeedbackSender() {
		return (EReference) feedbackFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackFlow_FeedbackReceiver() {
		return (EReference) feedbackFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeedbackFlow_Feedback() {
		return (EReference) feedbackFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfoFlow() {
		return infoFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoFlow_Id() {
		return (EAttribute) infoFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfoFlow_Information() {
		return (EReference) infoFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfoFlow_InfoReceiver() {
		return (EReference) infoFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfoFlow_InfoSender() {
		return (EReference) infoFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformation() {
		return informationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformation_Id() {
		return (EAttribute) informationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformation_Name() {
		return (EAttribute) informationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoss() {
		return lossEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoss_Id() {
		return (EAttribute) lossEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoss_Name() {
		return (EAttribute) lossEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoss_TraceableTo() {
		return (EReference) lossEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemLevelHazard() {
		return systemLevelHazardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemLevelHazard_RefineHazards() {
		return (EReference) systemLevelHazardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemLevelHazard_Id() {
		return (EAttribute) systemLevelHazardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemLevelHazard_LeadsTo() {
		return (EReference) systemLevelHazardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemLevelHazard_UnsecureCondition() {
		return (EAttribute) systemLevelHazardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemLevelHazard_Constraint() {
		return (EReference) systemLevelHazardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemLevelHazard_System() {
		return (EReference) systemLevelHazardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemLevelHazard_ICA() {
		return (EReference) systemLevelHazardEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemLevelConstraint() {
		return systemLevelConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemLevelConstraint_Id() {
		return (EAttribute) systemLevelConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemLevelConstraint_ConditionToEnforce() {
		return (EAttribute) systemLevelConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemLevelConstraint_TraceableTo() {
		return (EReference) systemLevelConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemLevelConstraint_System() {
		return (EReference) systemLevelConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsecureControlAction() {
		return insecureControlActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsecureControlAction_Type() {
		return (EAttribute) insecureControlActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsecureControlAction_Context() {
		return (EAttribute) insecureControlActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsecureControlAction_Source() {
		return (EReference) insecureControlActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsecureControlAction_LinkToHazrd() {
		return (EReference) insecureControlActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsecureControlAction_Id() {
		return (EAttribute) insecureControlActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsecureControlAction_ControlAction() {
		return (EReference) insecureControlActionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsecureControlAction_Cmdflow() {
		return (EReference) insecureControlActionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerConstraints() {
		return controllerConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerConstraints_ICA() {
		return (EReference) controllerConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerConstraints_Id() {
		return (EAttribute) controllerConstraintsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerConstraints_Constraints() {
		return (EAttribute) controllerConstraintsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerConstraints_Systemlevelhazard() {
		return (EReference) controllerConstraintsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_ICA() {
		return (EReference) scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_System() {
		return (EReference) scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Id() {
		return (EAttribute) scenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Context() {
		return (EAttribute) scenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeOfUnsecureControlAction() {
		return typeOfUnsecureControlActionEEnum;
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
		createEReference(stpaSecEClass, STPA_SEC__SYSTEM);
		createEReference(stpaSecEClass, STPA_SEC__LOSS);
		createEReference(stpaSecEClass, STPA_SEC__SYSTEM_LEVEL_HAZARD);
		createEReference(stpaSecEClass, STPA_SEC__SYSTEM_LEVEL_CONSTRAINT);
		createEReference(stpaSecEClass, STPA_SEC__SCENARIO);
		createEReference(stpaSecEClass, STPA_SEC__INSECURE_CONTROL_ACTION);
		createEReference(stpaSecEClass, STPA_SEC__CONTROLLER_CONSTRAINTS);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__CONTRO_ACTION);
		createEReference(systemEClass, SYSTEM__FEEDBACK);
		createEReference(systemEClass, SYSTEM__CONTROL_LOOP);
		createEReference(systemEClass, SYSTEM__SUB_SYSTEM);
		createEAttribute(systemEClass, SYSTEM__ID);
		createEAttribute(systemEClass, SYSTEM__NAME);
		createEAttribute(systemEClass, SYSTEM__GOAL);
		createEReference(systemEClass, SYSTEM__INFORMATION);
		createEReference(systemEClass, SYSTEM__RECEIVES_INFO);
		createEReference(systemEClass, SYSTEM__SENDS_INFO);
		createEReference(systemEClass, SYSTEM__RECEIVES_FEEDBACK);
		createEReference(systemEClass, SYSTEM__SENDS_FEEDBACK);
		createEReference(systemEClass, SYSTEM__CONTROLS);
		createEReference(systemEClass, SYSTEM__PERFORMS);
		createEReference(systemEClass, SYSTEM__CONTROLLER_CONSTRAINTS);

		controlActionEClass = createEClass(CONTROL_ACTION);
		createEAttribute(controlActionEClass, CONTROL_ACTION__ID);
		createEAttribute(controlActionEClass, CONTROL_ACTION__NAME);

		feedbackEClass = createEClass(FEEDBACK);
		createEAttribute(feedbackEClass, FEEDBACK__ID);
		createEAttribute(feedbackEClass, FEEDBACK__NAME);

		controlLoopEClass = createEClass(CONTROL_LOOP);
		createEReference(controlLoopEClass, CONTROL_LOOP__CMDFLOW);
		createEReference(controlLoopEClass, CONTROL_LOOP__FEEDBACKFLOW);
		createEReference(controlLoopEClass, CONTROL_LOOP__INFOFLOW);

		cmdFlowEClass = createEClass(CMD_FLOW);
		createEAttribute(cmdFlowEClass, CMD_FLOW__ID);
		createEReference(cmdFlowEClass, CMD_FLOW__PERFORMED_BY);
		createEReference(cmdFlowEClass, CMD_FLOW__CONTROLED_BY);
		createEReference(cmdFlowEClass, CMD_FLOW__CMD);

		feedbackFlowEClass = createEClass(FEEDBACK_FLOW);
		createEAttribute(feedbackFlowEClass, FEEDBACK_FLOW__ID);
		createEReference(feedbackFlowEClass, FEEDBACK_FLOW__FEEDBACK_SENDER);
		createEReference(feedbackFlowEClass, FEEDBACK_FLOW__FEEDBACK_RECEIVER);
		createEReference(feedbackFlowEClass, FEEDBACK_FLOW__FEEDBACK);

		infoFlowEClass = createEClass(INFO_FLOW);
		createEAttribute(infoFlowEClass, INFO_FLOW__ID);
		createEReference(infoFlowEClass, INFO_FLOW__INFORMATION);
		createEReference(infoFlowEClass, INFO_FLOW__INFO_RECEIVER);
		createEReference(infoFlowEClass, INFO_FLOW__INFO_SENDER);

		informationEClass = createEClass(INFORMATION);
		createEAttribute(informationEClass, INFORMATION__ID);
		createEAttribute(informationEClass, INFORMATION__NAME);

		lossEClass = createEClass(LOSS);
		createEAttribute(lossEClass, LOSS__ID);
		createEAttribute(lossEClass, LOSS__NAME);
		createEReference(lossEClass, LOSS__TRACEABLE_TO);

		systemLevelHazardEClass = createEClass(SYSTEM_LEVEL_HAZARD);
		createEReference(systemLevelHazardEClass, SYSTEM_LEVEL_HAZARD__REFINE_HAZARDS);
		createEAttribute(systemLevelHazardEClass, SYSTEM_LEVEL_HAZARD__ID);
		createEReference(systemLevelHazardEClass, SYSTEM_LEVEL_HAZARD__LEADS_TO);
		createEAttribute(systemLevelHazardEClass, SYSTEM_LEVEL_HAZARD__UNSECURE_CONDITION);
		createEReference(systemLevelHazardEClass, SYSTEM_LEVEL_HAZARD__CONSTRAINT);
		createEReference(systemLevelHazardEClass, SYSTEM_LEVEL_HAZARD__SYSTEM);
		createEReference(systemLevelHazardEClass, SYSTEM_LEVEL_HAZARD__ICA);

		systemLevelConstraintEClass = createEClass(SYSTEM_LEVEL_CONSTRAINT);
		createEAttribute(systemLevelConstraintEClass, SYSTEM_LEVEL_CONSTRAINT__ID);
		createEAttribute(systemLevelConstraintEClass, SYSTEM_LEVEL_CONSTRAINT__CONDITION_TO_ENFORCE);
		createEReference(systemLevelConstraintEClass, SYSTEM_LEVEL_CONSTRAINT__TRACEABLE_TO);
		createEReference(systemLevelConstraintEClass, SYSTEM_LEVEL_CONSTRAINT__SYSTEM);

		insecureControlActionEClass = createEClass(INSECURE_CONTROL_ACTION);
		createEAttribute(insecureControlActionEClass, INSECURE_CONTROL_ACTION__TYPE);
		createEAttribute(insecureControlActionEClass, INSECURE_CONTROL_ACTION__CONTEXT);
		createEReference(insecureControlActionEClass, INSECURE_CONTROL_ACTION__SOURCE);
		createEReference(insecureControlActionEClass, INSECURE_CONTROL_ACTION__LINK_TO_HAZRD);
		createEAttribute(insecureControlActionEClass, INSECURE_CONTROL_ACTION__ID);
		createEReference(insecureControlActionEClass, INSECURE_CONTROL_ACTION__CONTROL_ACTION);
		createEReference(insecureControlActionEClass, INSECURE_CONTROL_ACTION__CMDFLOW);

		controllerConstraintsEClass = createEClass(CONTROLLER_CONSTRAINTS);
		createEReference(controllerConstraintsEClass, CONTROLLER_CONSTRAINTS__ICA);
		createEAttribute(controllerConstraintsEClass, CONTROLLER_CONSTRAINTS__ID);
		createEAttribute(controllerConstraintsEClass, CONTROLLER_CONSTRAINTS__CONSTRAINTS);
		createEReference(controllerConstraintsEClass, CONTROLLER_CONSTRAINTS__SYSTEMLEVELHAZARD);

		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__ICA);
		createEReference(scenarioEClass, SCENARIO__SYSTEM);
		createEAttribute(scenarioEClass, SCENARIO__ID);
		createEAttribute(scenarioEClass, SCENARIO__CONTEXT);

		// Create enums
		typeOfUnsecureControlActionEEnum = createEEnum(TYPE_OF_UNSECURE_CONTROL_ACTION);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(stpaSecEClass, STPASec.class, "STPASec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSTPASec_System(), this.getSystem(), null, "system", null, 0, -1, STPASec.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSTPASec_Loss(), this.getLoss(), null, "loss", null, 1, -1, STPASec.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSTPASec_SystemLevelHazard(), this.getSystemLevelHazard(), null, "systemLevelHazard", null, 1,
				-1, STPASec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSTPASec_SystemLevelConstraint(), this.getSystemLevelConstraint(), null,
				"SystemLevelConstraint", null, 1, -1, STPASec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSTPASec_Scenario(), this.getScenario(), null, "scenario", null, 0, -1, STPASec.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSTPASec_InsecureControlAction(), this.getInsecureControlAction(), null,
				"insecureControlAction", null, 0, -1, STPASec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSTPASec_ControllerConstraints(), this.getControllerConstraints(), null,
				"controllerConstraints", null, 0, -1, STPASec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, tau.systemengineering.STPAsec.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_ControAction(), this.getControlAction(), null, "controAction", null, 0, -1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Feedback(), this.getFeedback(), null, "feedback", null, 0, -1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_ControlLoop(), this.getControlLoop(), null, "controlLoop", null, 0, -1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_SubSystem(), this.getSystem(), null, "subSystem", null, 0, -1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Id(), ecorePackage.getEInt(), "Id", null, 0, 1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Goal(), ecorePackage.getEString(), "goal", null, 0, 1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Information(), this.getInformation(), null, "information", null, 0, -1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_ReceivesInfo(), this.getInfoFlow(), this.getInfoFlow_InfoReceiver(), "receivesInfo",
				null, 0, -1, tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_SendsInfo(), this.getInfoFlow(), this.getInfoFlow_InfoSender(), "sendsInfo", null, 0,
				-1, tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_ReceivesFeedback(), this.getFeedbackFlow(), this.getFeedbackFlow_FeedbackReceiver(),
				"receivesFeedback", null, 0, -1, tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSystem_SendsFeedback(), this.getFeedbackFlow(), this.getFeedbackFlow_FeedbackSender(),
				"sendsFeedback", null, 0, -1, tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Controls(), this.getCmdFlow(), this.getCmdFlow_ControledBy(), "controls", null, 0, -1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_Performs(), this.getCmdFlow(), this.getCmdFlow_PerformedBy(), "performs", null, 0, -1,
				tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_ControllerConstraints(), this.getControllerConstraints(), null,
				"controllerConstraints", null, 0, -1, tau.systemengineering.STPAsec.System.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(controlActionEClass, ControlAction.class, "ControlAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlAction_Id(), ecorePackage.getEInt(), "id", null, 0, 1, ControlAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControlAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, ControlAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feedbackEClass, Feedback.class, "Feedback", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeedback_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Feedback.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeedback_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feedback.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlLoopEClass, ControlLoop.class, "ControlLoop", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlLoop_Cmdflow(), this.getCmdFlow(), null, "cmdflow", null, 0, -1, ControlLoop.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlLoop_Feedbackflow(), this.getFeedbackFlow(), null, "feedbackflow", null, 0, -1,
				ControlLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlLoop_Infoflow(), this.getInfoFlow(), null, "infoflow", null, 0, -1, ControlLoop.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cmdFlowEClass, CmdFlow.class, "CmdFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCmdFlow_Id(), ecorePackage.getEInt(), "id", null, 0, 1, CmdFlow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmdFlow_PerformedBy(), this.getSystem(), this.getSystem_Performs(), "performedBy", null, 1, 1,
				CmdFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmdFlow_ControledBy(), this.getSystem(), this.getSystem_Controls(), "controledBy", null, 1, 1,
				CmdFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmdFlow_Cmd(), this.getControlAction(), null, "cmd", null, 1, -1, CmdFlow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feedbackFlowEClass, FeedbackFlow.class, "FeedbackFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeedbackFlow_Id(), ecorePackage.getEInt(), "id", null, 0, 1, FeedbackFlow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedbackFlow_FeedbackSender(), this.getSystem(), this.getSystem_SendsFeedback(),
				"feedbackSender", null, 1, 1, FeedbackFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedbackFlow_FeedbackReceiver(), this.getSystem(), this.getSystem_ReceivesFeedback(),
				"feedbackReceiver", null, 1, 1, FeedbackFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeedbackFlow_Feedback(), this.getFeedback(), null, "feedback", null, 1, -1,
				FeedbackFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infoFlowEClass, InfoFlow.class, "InfoFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfoFlow_Id(), ecorePackage.getEInt(), "id", null, 0, 1, InfoFlow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfoFlow_Information(), this.getInformation(), null, "information", null, 1, -1,
				InfoFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfoFlow_InfoReceiver(), this.getSystem(), this.getSystem_ReceivesInfo(), "infoReceiver",
				null, 1, 1, InfoFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfoFlow_InfoSender(), this.getSystem(), this.getSystem_SendsInfo(), "infoSender", null, 1, 1,
				InfoFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationEClass, Information.class, "Information", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInformation_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Information.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Information.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lossEClass, Loss.class, "Loss", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoss_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Loss.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoss_Name(), ecorePackage.getEString(), "name", null, 0, 1, Loss.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoss_TraceableTo(), this.getSystemLevelHazard(), this.getSystemLevelHazard_LeadsTo(),
				"traceableTo", null, 1, -1, Loss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemLevelHazardEClass, SystemLevelHazard.class, "SystemLevelHazard", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemLevelHazard_RefineHazards(), this.getSystemLevelHazard(), null, "refineHazards", null,
				0, -1, SystemLevelHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemLevelHazard_Id(), ecorePackage.getEInt(), "id", null, 0, 1, SystemLevelHazard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemLevelHazard_LeadsTo(), this.getLoss(), this.getLoss_TraceableTo(), "leadsTo", null, 1,
				-1, SystemLevelHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemLevelHazard_UnsecureCondition(), ecorePackage.getEString(), "unsecureCondition", null,
				0, 1, SystemLevelHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemLevelHazard_Constraint(), this.getSystemLevelConstraint(),
				this.getSystemLevelConstraint_TraceableTo(), "constraint", null, 1, -1, SystemLevelHazard.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemLevelHazard_System(), this.getSystem(), null, "system", null, 1, 1,
				SystemLevelHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemLevelHazard_ICA(), this.getInsecureControlAction(),
				this.getInsecureControlAction_LinkToHazrd(), "ICA", null, 1, -1, SystemLevelHazard.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(systemLevelConstraintEClass, SystemLevelConstraint.class, "SystemLevelConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemLevelConstraint_Id(), ecorePackage.getEInt(), "id", null, 0, 1,
				SystemLevelConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemLevelConstraint_ConditionToEnforce(), ecorePackage.getEString(), "conditionToEnforce",
				null, 0, 1, SystemLevelConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemLevelConstraint_TraceableTo(), this.getSystemLevelHazard(),
				this.getSystemLevelHazard_Constraint(), "traceableTo", null, 1, -1, SystemLevelConstraint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemLevelConstraint_System(), this.getSystem(), null, "system", null, 0, 1,
				SystemLevelConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insecureControlActionEClass, InsecureControlAction.class, "InsecureControlAction", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsecureControlAction_Type(), this.getTypeOfUnsecureControlAction(), "type", null, 0, 1,
				InsecureControlAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsecureControlAction_Context(), ecorePackage.getEString(), "context", null, 0, 1,
				InsecureControlAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsecureControlAction_Source(), this.getSystem(), null, "source", null, 1, 1,
				InsecureControlAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInsecureControlAction_LinkToHazrd(), this.getSystemLevelHazard(),
				this.getSystemLevelHazard_ICA(), "linkToHazrd", null, 1, -1, InsecureControlAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getInsecureControlAction_Id(), ecorePackage.getEInt(), "id", null, 0, 1,
				InsecureControlAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsecureControlAction_ControlAction(), this.getControlAction(), null, "controlAction", null,
				1, 1, InsecureControlAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInsecureControlAction_Cmdflow(), this.getCmdFlow(), null, "cmdflow", null, 1, 1,
				InsecureControlAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerConstraintsEClass, ControllerConstraints.class, "ControllerConstraints", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllerConstraints_ICA(), this.getInsecureControlAction(), null, "ICA", null, 0, 1,
				ControllerConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerConstraints_Id(), ecorePackage.getEInt(), "id", null, 0, 1,
				ControllerConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerConstraints_Constraints(), ecorePackage.getEString(), "constraints", null, 0, 1,
				ControllerConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllerConstraints_Systemlevelhazard(), this.getSystemLevelHazard(), null,
				"systemlevelhazard", null, 0, 1, ControllerConstraints.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_ICA(), this.getInsecureControlAction(), null, "ICA", null, 1, 1, Scenario.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_System(), this.getSystem(), null, "system", null, 1, 1, Scenario.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Scenario.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenario_Context(), ecorePackage.getEString(), "context", null, 0, 1, Scenario.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeOfUnsecureControlActionEEnum, TypeOfUnsecureControlAction.class, "TypeOfUnsecureControlAction");
		addEEnumLiteral(typeOfUnsecureControlActionEEnum, TypeOfUnsecureControlAction.NOT_PROVIDED);
		addEEnumLiteral(typeOfUnsecureControlActionEEnum, TypeOfUnsecureControlAction.PROVIDING_CAUSES_HAZARD);
		addEEnumLiteral(typeOfUnsecureControlActionEEnum, TypeOfUnsecureControlAction.TO_EARLY_TO_LATE);
		addEEnumLiteral(typeOfUnsecureControlActionEEnum, TypeOfUnsecureControlAction.STOP_TOO_SOON_APPLIED_TO_LONG);

		// Create resource
		createResource(eNS_URI);
	}

} //STPAsecPackageImpl
