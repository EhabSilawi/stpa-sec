/**
 */
package tau.systemengineering.STPAsec.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tau.systemengineering.STPAsec.ControlAction;
import tau.systemengineering.STPAsec.ControlStructure;
import tau.systemengineering.STPAsec.ControlledProcess;
import tau.systemengineering.STPAsec.Controller;
import tau.systemengineering.STPAsec.Feedback;
import tau.systemengineering.STPAsec.Hazard;
import tau.systemengineering.STPAsec.LossScenario;
import tau.systemengineering.STPAsec.MissionGoal;
import tau.systemengineering.STPAsec.STPASec;
import tau.systemengineering.STPAsec.STPAsecFactory;
import tau.systemengineering.STPAsec.STPAsecPackage;
import tau.systemengineering.STPAsec.SecurityRecomendation;

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
		case STPAsecPackage.LOSS_SCENARIO:
			return createLossScenario();
		case STPAsecPackage.HAZARD:
			return createHazard();
		case STPAsecPackage.MISSION_GOAL:
			return createMissionGoal();
		case STPAsecPackage.SECURITY_RECOMENDATION:
			return createSecurityRecomendation();
		case STPAsecPackage.SYSTEM:
			return createSystem();
		case STPAsecPackage.STPA_SEC:
			return createSTPASec();
		case STPAsecPackage.FEEDBACK:
			return createFeedback();
		case STPAsecPackage.CONTROLLED_PROCESS:
			return createControlledProcess();
		case STPAsecPackage.CONTROLLER:
			return createController();
		case STPAsecPackage.CONTROL_STRUCTURE:
			return createControlStructure();
		case STPAsecPackage.CONTROL_ACTION:
			return createControlAction();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LossScenario createLossScenario() {
		LossScenarioImpl lossScenario = new LossScenarioImpl();
		return lossScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hazard createHazard() {
		HazardImpl hazard = new HazardImpl();
		return hazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissionGoal createMissionGoal() {
		MissionGoalImpl missionGoal = new MissionGoalImpl();
		return missionGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRecomendation createSecurityRecomendation() {
		SecurityRecomendationImpl securityRecomendation = new SecurityRecomendationImpl();
		return securityRecomendation;
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
	public STPASec createSTPASec() {
		STPASecImpl stpaSec = new STPASecImpl();
		return stpaSec;
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
	public ControlledProcess createControlledProcess() {
		ControlledProcessImpl controlledProcess = new ControlledProcessImpl();
		return controlledProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlStructure createControlStructure() {
		ControlStructureImpl controlStructure = new ControlStructureImpl();
		return controlStructure;
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
