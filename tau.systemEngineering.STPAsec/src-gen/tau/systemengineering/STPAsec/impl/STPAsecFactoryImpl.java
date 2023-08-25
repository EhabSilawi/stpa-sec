/**
 */
package tau.systemengineering.STPAsec.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class STPAsecFactoryImpl extends EFactoryImpl implements STPAsecFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static STPAsecFactory init() {
		try {
			STPAsecFactory theSTPAsecFactory = (STPAsecFactory) EPackage.Registry.INSTANCE
					.getEFactory(STPAsecPackage.eNS_URI);
			if (theSTPAsecFactory != null) {
				return theSTPAsecFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new STPAsecFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STPAsecFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case STPAsecPackage.STPA_SEC:
			return createSTPASec();
		case STPAsecPackage.SYSTEM:
			return createSystem();
		case STPAsecPackage.CONTROL_ACTION:
			return createControlAction();
		case STPAsecPackage.FEEDBACK:
			return createFeedback();
		case STPAsecPackage.CONTROL_LOOP:
			return createControlLoop();
		case STPAsecPackage.CMD_FLOW:
			return createCmdFlow();
		case STPAsecPackage.FEEDBACK_FLOW:
			return createFeedbackFlow();
		case STPAsecPackage.INFO_FLOW:
			return createInfoFlow();
		case STPAsecPackage.INFORMATION:
			return createInformation();
		case STPAsecPackage.LOSS:
			return createLoss();
		case STPAsecPackage.SYSTEM_LEVEL_HAZARD:
			return createSystemLevelHazard();
		case STPAsecPackage.SYSTEM_LEVEL_CONSTRAINT:
			return createSystemLevelConstraint();
		case STPAsecPackage.INSECURE_CONTROL_ACTION:
			return createInsecureControlAction();
		case STPAsecPackage.CONTROLLER_CONSTRAINTS:
			return createControllerConstraints();
		case STPAsecPackage.SCENARIO:
			return createScenario();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case STPAsecPackage.TYPE_OF_UNSECURE_CONTROL_ACTION:
			return createTypeOfUnsecureControlActionFromString(eDataType, initialValue);
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
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case STPAsecPackage.TYPE_OF_UNSECURE_CONTROL_ACTION:
			return convertTypeOfUnsecureControlActionToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STPASec createSTPASec() {
		STPASecImpl stpaSec = new STPASecImpl();
		return stpaSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tau.systemengineering.STPAsec.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAction createControlAction() {
		ControlActionImpl controlAction = new ControlActionImpl();
		return controlAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feedback createFeedback() {
		FeedbackImpl feedback = new FeedbackImpl();
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlLoop createControlLoop() {
		ControlLoopImpl controlLoop = new ControlLoopImpl();
		return controlLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdFlow createCmdFlow() {
		CmdFlowImpl cmdFlow = new CmdFlowImpl();
		return cmdFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackFlow createFeedbackFlow() {
		FeedbackFlowImpl feedbackFlow = new FeedbackFlowImpl();
		return feedbackFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoFlow createInfoFlow() {
		InfoFlowImpl infoFlow = new InfoFlowImpl();
		return infoFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Information createInformation() {
		InformationImpl information = new InformationImpl();
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loss createLoss() {
		LossImpl loss = new LossImpl();
		return loss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemLevelHazard createSystemLevelHazard() {
		SystemLevelHazardImpl systemLevelHazard = new SystemLevelHazardImpl();
		return systemLevelHazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemLevelConstraint createSystemLevelConstraint() {
		SystemLevelConstraintImpl systemLevelConstraint = new SystemLevelConstraintImpl();
		return systemLevelConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsecureControlAction createInsecureControlAction() {
		InsecureControlActionImpl insecureControlAction = new InsecureControlActionImpl();
		return insecureControlAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerConstraints createControllerConstraints() {
		ControllerConstraintsImpl controllerConstraints = new ControllerConstraintsImpl();
		return controllerConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOfUnsecureControlAction createTypeOfUnsecureControlActionFromString(EDataType eDataType,
			String initialValue) {
		TypeOfUnsecureControlAction result = TypeOfUnsecureControlAction.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeOfUnsecureControlActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STPAsecPackage getSTPAsecPackage() {
		return (STPAsecPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static STPAsecPackage getPackage() {
		return STPAsecPackage.eINSTANCE;
	}

} //STPAsecFactoryImpl
