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
import tau.systemengineering.STPAsec.Feedback;
import tau.systemengineering.STPAsec.OtherInformation;
import tau.systemengineering.STPAsec.STPASec;
import tau.systemengineering.STPAsec.STPAsecFactory;
import tau.systemengineering.STPAsec.STPAsecPackage;

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
		case STPAsecPackage.CONTROL_STRUCTURE:
			return createControlStructure();
		case STPAsecPackage.CONTROLLED_PROCESS:
			return createControlledProcess();
		case STPAsecPackage.CONTROL_ACTION:
			return createControlAction();
		case STPAsecPackage.FEEDBACK:
			return createFeedback();
		case STPAsecPackage.OTHER_INFORMATION:
			return createOtherInformation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public ControlStructure createControlStructure() {
		ControlStructureImpl controlStructure = new ControlStructureImpl();
		return controlStructure;
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
	public OtherInformation createOtherInformation() {
		OtherInformationImpl otherInformation = new OtherInformationImpl();
		return otherInformation;
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
