/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tau.systemengineering.STPAsec.STPAsecFactory
 * @model kind="package"
 * @generated
 */
public interface STPAsecPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "STPAsec";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/STPAsec";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "STPAsec";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	STPAsecPackage eINSTANCE = tau.systemengineering.STPAsec.impl.STPAsecPackageImpl.init();

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.STPASecImpl <em>STPA Sec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.STPASecImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getSTPASec()
	 * @generated
	 */
	int STPA_SEC = 0;

	/**
	 * The feature id for the '<em><b>Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_SEC__SYSTEMS = 0;

	/**
	 * The number of structural features of the '<em>STPA Sec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_SEC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>STPA Sec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_SEC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.SystemImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>System Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SYSTEM_MODEL = 2;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl <em>Control Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.ControlStructureImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getControlStructure()
	 * @generated
	 */
	int CONTROL_STRUCTURE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Model Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__MODEL_GOAL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Controlledprocess</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__CONTROLLEDPROCESS = 3;

	/**
	 * The feature id for the '<em><b>Controlaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__CONTROLACTION = 4;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__FEEDBACK = 5;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__CONTROLLER = 6;

	/**
	 * The feature id for the '<em><b>Subsystem Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__SUBSYSTEM_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Otherinformation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__OTHERINFORMATION = 8;

	/**
	 * The feature id for the '<em><b>Subsystem Senders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__SUBSYSTEM_SENDERS = 9;

	/**
	 * The feature id for the '<em><b>Subsystems Receivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__SUBSYSTEMS_RECEIVERS = 10;

	/**
	 * The feature id for the '<em><b>Swnds Infor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__SWNDS_INFOR = 11;

	/**
	 * The feature id for the '<em><b>Receives Info</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__RECEIVES_INFO = 12;

	/**
	 * The feature id for the '<em><b>Sends Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__SENDS_COMMANDS = 13;

	/**
	 * The feature id for the '<em><b>Receives Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__RECEIVES_COMMANDS = 14;

	/**
	 * The number of structural features of the '<em>Control Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Control Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.ControlStructureElementImpl <em>Control Structure Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.ControlStructureElementImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getControlStructureElement()
	 * @generated
	 */
	int CONTROL_STRUCTURE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_ELEMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Control Structure Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Control Structure Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.ControlledProcessImpl <em>Controlled Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.ControlledProcessImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getControlledProcess()
	 * @generated
	 */
	int CONTROLLED_PROCESS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS__NAME = CONTROL_STRUCTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS__DESCRIPTION = CONTROL_STRUCTURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sends Info</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS__SENDS_INFO = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receives Info</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS__RECEIVES_INFO = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receives Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS__RECEIVES_COMMANDS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Receives Feedbacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS__RECEIVES_FEEDBACKS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sends Feedbacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS__SENDS_FEEDBACKS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Controlled Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS_FEATURE_COUNT = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Controlled Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS_OPERATION_COUNT = CONTROL_STRUCTURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.ControlActionImpl <em>Control Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.ControlActionImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getControlAction()
	 * @generated
	 */
	int CONTROL_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__NAME = CONTROL_STRUCTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__DESCRIPTION = CONTROL_STRUCTURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Controller Senders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__CONTROLLER_SENDERS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controller Receivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__CONTROLLER_RECEIVERS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Controled Proccess Receivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__CONTROLED_PROCCESS_RECEIVERS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subsystem Senders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__SUBSYSTEM_SENDERS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Subsystem Receivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__SUBSYSTEM_RECEIVERS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Control Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION_FEATURE_COUNT = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Control Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION_OPERATION_COUNT = CONTROL_STRUCTURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.FeedbackImpl <em>Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.FeedbackImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getFeedback()
	 * @generated
	 */
	int FEEDBACK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__NAME = CONTROL_STRUCTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__DESCRIPTION = CONTROL_STRUCTURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Controller Senders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__CONTROLLER_SENDERS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controller Receivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__CONTROLLER_RECEIVERS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Controled Process Receivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__CONTROLED_PROCESS_RECEIVERS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Controled Process Senders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__CONTROLED_PROCESS_SENDERS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sends Feedbacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__SENDS_FEEDBACKS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Receivers Feedbacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__RECEIVERS_FEEDBACKS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FEATURE_COUNT = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_OPERATION_COUNT = CONTROL_STRUCTURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.OtherInformationImpl <em>Other Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.OtherInformationImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getOtherInformation()
	 * @generated
	 */
	int OTHER_INFORMATION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_INFORMATION__NAME = CONTROL_STRUCTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_INFORMATION__DESCRIPTION = CONTROL_STRUCTURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Controller Senders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_INFORMATION__CONTROLLER_SENDERS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controled Process Senders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_INFORMATION__CONTROLED_PROCESS_SENDERS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Controled Process Receivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_INFORMATION__CONTROLED_PROCESS_RECEIVERS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Controller Receivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_INFORMATION__CONTROLLER_RECEIVERS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Subsystem Senders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_INFORMATION__SUBSYSTEM_SENDERS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Subsystem Receivers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_INFORMATION__SUBSYSTEM_RECEIVERS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Other Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_INFORMATION_FEATURE_COUNT = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Other Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_INFORMATION_OPERATION_COUNT = CONTROL_STRUCTURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.ControllerImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = CONTROL_STRUCTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__DESCRIPTION = CONTROL_STRUCTURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sends Feedbacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__SENDS_FEEDBACKS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sends Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__SENDS_COMMANDS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sends Info</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__SENDS_INFO = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Receives Info</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__RECEIVES_INFO = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Receives Feedbacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__RECEIVES_FEEDBACKS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Receives Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__RECEIVES_COMMANDS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = CONTROL_STRUCTURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.STPASec <em>STPA Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STPA Sec</em>'.
	 * @see tau.systemengineering.STPAsec.STPASec
	 * @generated
	 */
	EClass getSTPASec();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.STPASec#getSystems <em>Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Systems</em>'.
	 * @see tau.systemengineering.STPAsec.STPASec#getSystems()
	 * @see #getSTPASec()
	 * @generated
	 */
	EReference getSTPASec_Systems();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see tau.systemengineering.STPAsec.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.System#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tau.systemengineering.STPAsec.System#getName()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Name();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.System#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tau.systemengineering.STPAsec.System#getDescription()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.System#getSystemModel <em>System Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Model</em>'.
	 * @see tau.systemengineering.STPAsec.System#getSystemModel()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_SystemModel();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.ControlStructure <em>Control Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Structure</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure
	 * @generated
	 */
	EClass getControlStructure();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.ControlStructure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure#getName()
	 * @see #getControlStructure()
	 * @generated
	 */
	EAttribute getControlStructure_Name();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.ControlStructure#getModelGoal <em>Model Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Goal</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure#getModelGoal()
	 * @see #getControlStructure()
	 * @generated
	 */
	EAttribute getControlStructure_ModelGoal();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.ControlStructure#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure#getDescription()
	 * @see #getControlStructure()
	 * @generated
	 */
	EAttribute getControlStructure_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.ControlStructure#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controller</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure#getController()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_Controller();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.ControlStructure#getSubsystemModel <em>Subsystem Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subsystem Model</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure#getSubsystemModel()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_SubsystemModel();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.ControlStructure#getOtherinformation <em>Otherinformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Otherinformation</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure#getOtherinformation()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_Otherinformation();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlStructure#getSubsystemSenders <em>Subsystem Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subsystem Senders</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure#getSubsystemSenders()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_SubsystemSenders();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlStructure#getSubsystemsReceivers <em>Subsystems Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subsystems Receivers</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure#getSubsystemsReceivers()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_SubsystemsReceivers();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlStructure#getSwndsInfor <em>Swnds Infor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Swnds Infor</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure#getSwndsInfor()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_SwndsInfor();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlStructure#getReceivesInfo <em>Receives Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receives Info</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure#getReceivesInfo()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_ReceivesInfo();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlStructure#getSendsCommands <em>Sends Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sends Commands</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure#getSendsCommands()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_SendsCommands();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlStructure#getReceivesCommands <em>Receives Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receives Commands</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure#getReceivesCommands()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_ReceivesCommands();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.ControlStructure#getControlledprocess <em>Controlledprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controlledprocess</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure#getControlledprocess()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_Controlledprocess();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.ControlStructure#getControlaction <em>Controlaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controlaction</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure#getControlaction()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_Controlaction();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.ControlStructure#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feedback</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure#getFeedback()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_Feedback();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.ControlStructureElement <em>Control Structure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Structure Element</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructureElement
	 * @generated
	 */
	EClass getControlStructureElement();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.ControlStructureElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructureElement#getName()
	 * @see #getControlStructureElement()
	 * @generated
	 */
	EAttribute getControlStructureElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.ControlStructureElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructureElement#getDescription()
	 * @see #getControlStructureElement()
	 * @generated
	 */
	EAttribute getControlStructureElement_Description();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.ControlledProcess <em>Controlled Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controlled Process</em>'.
	 * @see tau.systemengineering.STPAsec.ControlledProcess
	 * @generated
	 */
	EClass getControlledProcess();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlledProcess#getSendsInfo <em>Sends Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sends Info</em>'.
	 * @see tau.systemengineering.STPAsec.ControlledProcess#getSendsInfo()
	 * @see #getControlledProcess()
	 * @generated
	 */
	EReference getControlledProcess_SendsInfo();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlledProcess#getSendsFeedbacks <em>Sends Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sends Feedbacks</em>'.
	 * @see tau.systemengineering.STPAsec.ControlledProcess#getSendsFeedbacks()
	 * @see #getControlledProcess()
	 * @generated
	 */
	EReference getControlledProcess_SendsFeedbacks();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlledProcess#getReceivesInfo <em>Receives Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receives Info</em>'.
	 * @see tau.systemengineering.STPAsec.ControlledProcess#getReceivesInfo()
	 * @see #getControlledProcess()
	 * @generated
	 */
	EReference getControlledProcess_ReceivesInfo();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlledProcess#getReceivesCommands <em>Receives Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receives Commands</em>'.
	 * @see tau.systemengineering.STPAsec.ControlledProcess#getReceivesCommands()
	 * @see #getControlledProcess()
	 * @generated
	 */
	EReference getControlledProcess_ReceivesCommands();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlledProcess#getReceivesFeedbacks <em>Receives Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receives Feedbacks</em>'.
	 * @see tau.systemengineering.STPAsec.ControlledProcess#getReceivesFeedbacks()
	 * @see #getControlledProcess()
	 * @generated
	 */
	EReference getControlledProcess_ReceivesFeedbacks();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.ControlAction <em>Control Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Action</em>'.
	 * @see tau.systemengineering.STPAsec.ControlAction
	 * @generated
	 */
	EClass getControlAction();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlAction#getControllerSenders <em>Controller Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controller Senders</em>'.
	 * @see tau.systemengineering.STPAsec.ControlAction#getControllerSenders()
	 * @see #getControlAction()
	 * @generated
	 */
	EReference getControlAction_ControllerSenders();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlAction#getControllerReceivers <em>Controller Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controller Receivers</em>'.
	 * @see tau.systemengineering.STPAsec.ControlAction#getControllerReceivers()
	 * @see #getControlAction()
	 * @generated
	 */
	EReference getControlAction_ControllerReceivers();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlAction#getControledProccessReceivers <em>Controled Proccess Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controled Proccess Receivers</em>'.
	 * @see tau.systemengineering.STPAsec.ControlAction#getControledProccessReceivers()
	 * @see #getControlAction()
	 * @generated
	 */
	EReference getControlAction_ControledProccessReceivers();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlAction#getSubsystemSenders <em>Subsystem Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subsystem Senders</em>'.
	 * @see tau.systemengineering.STPAsec.ControlAction#getSubsystemSenders()
	 * @see #getControlAction()
	 * @generated
	 */
	EReference getControlAction_SubsystemSenders();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlAction#getSubsystemReceivers <em>Subsystem Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subsystem Receivers</em>'.
	 * @see tau.systemengineering.STPAsec.ControlAction#getSubsystemReceivers()
	 * @see #getControlAction()
	 * @generated
	 */
	EReference getControlAction_SubsystemReceivers();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.Feedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback</em>'.
	 * @see tau.systemengineering.STPAsec.Feedback
	 * @generated
	 */
	EClass getFeedback();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.Feedback#getControllerSenders <em>Controller Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controller Senders</em>'.
	 * @see tau.systemengineering.STPAsec.Feedback#getControllerSenders()
	 * @see #getFeedback()
	 * @generated
	 */
	EReference getFeedback_ControllerSenders();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.Feedback#getControllerReceivers <em>Controller Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controller Receivers</em>'.
	 * @see tau.systemengineering.STPAsec.Feedback#getControllerReceivers()
	 * @see #getFeedback()
	 * @generated
	 */
	EReference getFeedback_ControllerReceivers();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.Feedback#getControledProcessReceivers <em>Controled Process Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controled Process Receivers</em>'.
	 * @see tau.systemengineering.STPAsec.Feedback#getControledProcessReceivers()
	 * @see #getFeedback()
	 * @generated
	 */
	EReference getFeedback_ControledProcessReceivers();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.Feedback#getControledProcessSenders <em>Controled Process Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controled Process Senders</em>'.
	 * @see tau.systemengineering.STPAsec.Feedback#getControledProcessSenders()
	 * @see #getFeedback()
	 * @generated
	 */
	EReference getFeedback_ControledProcessSenders();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.Feedback#getSendsFeedbacks <em>Sends Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sends Feedbacks</em>'.
	 * @see tau.systemengineering.STPAsec.Feedback#getSendsFeedbacks()
	 * @see #getFeedback()
	 * @generated
	 */
	EReference getFeedback_SendsFeedbacks();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.Feedback#getReceiversFeedbacks <em>Receivers Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receivers Feedbacks</em>'.
	 * @see tau.systemengineering.STPAsec.Feedback#getReceiversFeedbacks()
	 * @see #getFeedback()
	 * @generated
	 */
	EReference getFeedback_ReceiversFeedbacks();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.OtherInformation <em>Other Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Information</em>'.
	 * @see tau.systemengineering.STPAsec.OtherInformation
	 * @generated
	 */
	EClass getOtherInformation();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.OtherInformation#getControllerSenders <em>Controller Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controller Senders</em>'.
	 * @see tau.systemengineering.STPAsec.OtherInformation#getControllerSenders()
	 * @see #getOtherInformation()
	 * @generated
	 */
	EReference getOtherInformation_ControllerSenders();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.OtherInformation#getControledProcessSenders <em>Controled Process Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controled Process Senders</em>'.
	 * @see tau.systemengineering.STPAsec.OtherInformation#getControledProcessSenders()
	 * @see #getOtherInformation()
	 * @generated
	 */
	EReference getOtherInformation_ControledProcessSenders();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.OtherInformation#getControledProcessReceivers <em>Controled Process Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controled Process Receivers</em>'.
	 * @see tau.systemengineering.STPAsec.OtherInformation#getControledProcessReceivers()
	 * @see #getOtherInformation()
	 * @generated
	 */
	EReference getOtherInformation_ControledProcessReceivers();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.OtherInformation#getControllerReceivers <em>Controller Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controller Receivers</em>'.
	 * @see tau.systemengineering.STPAsec.OtherInformation#getControllerReceivers()
	 * @see #getOtherInformation()
	 * @generated
	 */
	EReference getOtherInformation_ControllerReceivers();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.OtherInformation#getSubsystemSenders <em>Subsystem Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subsystem Senders</em>'.
	 * @see tau.systemengineering.STPAsec.OtherInformation#getSubsystemSenders()
	 * @see #getOtherInformation()
	 * @generated
	 */
	EReference getOtherInformation_SubsystemSenders();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.OtherInformation#getSubsystemReceivers <em>Subsystem Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subsystem Receivers</em>'.
	 * @see tau.systemengineering.STPAsec.OtherInformation#getSubsystemReceivers()
	 * @see #getOtherInformation()
	 * @generated
	 */
	EReference getOtherInformation_SubsystemReceivers();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see tau.systemengineering.STPAsec.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.Controller#getSendsFeedbacks <em>Sends Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sends Feedbacks</em>'.
	 * @see tau.systemengineering.STPAsec.Controller#getSendsFeedbacks()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_SendsFeedbacks();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.Controller#getSendsCommands <em>Sends Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sends Commands</em>'.
	 * @see tau.systemengineering.STPAsec.Controller#getSendsCommands()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_SendsCommands();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.Controller#getSendsInfo <em>Sends Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sends Info</em>'.
	 * @see tau.systemengineering.STPAsec.Controller#getSendsInfo()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_SendsInfo();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.Controller#getReceivesInfo <em>Receives Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receives Info</em>'.
	 * @see tau.systemengineering.STPAsec.Controller#getReceivesInfo()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_ReceivesInfo();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.Controller#getReceivesFeedbacks <em>Receives Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receives Feedbacks</em>'.
	 * @see tau.systemengineering.STPAsec.Controller#getReceivesFeedbacks()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_ReceivesFeedbacks();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.Controller#getReceivesCommands <em>Receives Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receives Commands</em>'.
	 * @see tau.systemengineering.STPAsec.Controller#getReceivesCommands()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_ReceivesCommands();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	STPAsecFactory getSTPAsecFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.STPASecImpl <em>STPA Sec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.STPASecImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getSTPASec()
		 * @generated
		 */
		EClass STPA_SEC = eINSTANCE.getSTPASec();
		/**
		 * The meta object literal for the '<em><b>Systems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STPA_SEC__SYSTEMS = eINSTANCE.getSTPASec_Systems();
		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.SystemImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__DESCRIPTION = eINSTANCE.getSystem_Description();
		/**
		 * The meta object literal for the '<em><b>System Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SYSTEM_MODEL = eINSTANCE.getSystem_SystemModel();
		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl <em>Control Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.ControlStructureImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getControlStructure()
		 * @generated
		 */
		EClass CONTROL_STRUCTURE = eINSTANCE.getControlStructure();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_STRUCTURE__NAME = eINSTANCE.getControlStructure_Name();
		/**
		 * The meta object literal for the '<em><b>Model Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_STRUCTURE__MODEL_GOAL = eINSTANCE.getControlStructure_ModelGoal();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_STRUCTURE__DESCRIPTION = eINSTANCE.getControlStructure_Description();
		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__CONTROLLER = eINSTANCE.getControlStructure_Controller();
		/**
		 * The meta object literal for the '<em><b>Subsystem Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__SUBSYSTEM_MODEL = eINSTANCE.getControlStructure_SubsystemModel();
		/**
		 * The meta object literal for the '<em><b>Otherinformation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__OTHERINFORMATION = eINSTANCE.getControlStructure_Otherinformation();
		/**
		 * The meta object literal for the '<em><b>Subsystem Senders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__SUBSYSTEM_SENDERS = eINSTANCE.getControlStructure_SubsystemSenders();
		/**
		 * The meta object literal for the '<em><b>Subsystems Receivers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__SUBSYSTEMS_RECEIVERS = eINSTANCE.getControlStructure_SubsystemsReceivers();
		/**
		 * The meta object literal for the '<em><b>Swnds Infor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__SWNDS_INFOR = eINSTANCE.getControlStructure_SwndsInfor();
		/**
		 * The meta object literal for the '<em><b>Receives Info</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__RECEIVES_INFO = eINSTANCE.getControlStructure_ReceivesInfo();
		/**
		 * The meta object literal for the '<em><b>Sends Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__SENDS_COMMANDS = eINSTANCE.getControlStructure_SendsCommands();
		/**
		 * The meta object literal for the '<em><b>Receives Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__RECEIVES_COMMANDS = eINSTANCE.getControlStructure_ReceivesCommands();
		/**
		 * The meta object literal for the '<em><b>Controlledprocess</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__CONTROLLEDPROCESS = eINSTANCE.getControlStructure_Controlledprocess();
		/**
		 * The meta object literal for the '<em><b>Controlaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__CONTROLACTION = eINSTANCE.getControlStructure_Controlaction();
		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__FEEDBACK = eINSTANCE.getControlStructure_Feedback();
		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.ControlStructureElementImpl <em>Control Structure Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.ControlStructureElementImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getControlStructureElement()
		 * @generated
		 */
		EClass CONTROL_STRUCTURE_ELEMENT = eINSTANCE.getControlStructureElement();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_STRUCTURE_ELEMENT__NAME = eINSTANCE.getControlStructureElement_Name();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_STRUCTURE_ELEMENT__DESCRIPTION = eINSTANCE.getControlStructureElement_Description();
		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.ControlledProcessImpl <em>Controlled Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.ControlledProcessImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getControlledProcess()
		 * @generated
		 */
		EClass CONTROLLED_PROCESS = eINSTANCE.getControlledProcess();
		/**
		 * The meta object literal for the '<em><b>Sends Info</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLED_PROCESS__SENDS_INFO = eINSTANCE.getControlledProcess_SendsInfo();
		/**
		 * The meta object literal for the '<em><b>Sends Feedbacks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLED_PROCESS__SENDS_FEEDBACKS = eINSTANCE.getControlledProcess_SendsFeedbacks();
		/**
		 * The meta object literal for the '<em><b>Receives Info</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLED_PROCESS__RECEIVES_INFO = eINSTANCE.getControlledProcess_ReceivesInfo();
		/**
		 * The meta object literal for the '<em><b>Receives Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLED_PROCESS__RECEIVES_COMMANDS = eINSTANCE.getControlledProcess_ReceivesCommands();
		/**
		 * The meta object literal for the '<em><b>Receives Feedbacks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLED_PROCESS__RECEIVES_FEEDBACKS = eINSTANCE.getControlledProcess_ReceivesFeedbacks();
		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.ControlActionImpl <em>Control Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.ControlActionImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getControlAction()
		 * @generated
		 */
		EClass CONTROL_ACTION = eINSTANCE.getControlAction();
		/**
		 * The meta object literal for the '<em><b>Controller Senders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ACTION__CONTROLLER_SENDERS = eINSTANCE.getControlAction_ControllerSenders();
		/**
		 * The meta object literal for the '<em><b>Controller Receivers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ACTION__CONTROLLER_RECEIVERS = eINSTANCE.getControlAction_ControllerReceivers();
		/**
		 * The meta object literal for the '<em><b>Controled Proccess Receivers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ACTION__CONTROLED_PROCCESS_RECEIVERS = eINSTANCE
				.getControlAction_ControledProccessReceivers();
		/**
		 * The meta object literal for the '<em><b>Subsystem Senders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ACTION__SUBSYSTEM_SENDERS = eINSTANCE.getControlAction_SubsystemSenders();
		/**
		 * The meta object literal for the '<em><b>Subsystem Receivers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ACTION__SUBSYSTEM_RECEIVERS = eINSTANCE.getControlAction_SubsystemReceivers();
		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.FeedbackImpl <em>Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.FeedbackImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getFeedback()
		 * @generated
		 */
		EClass FEEDBACK = eINSTANCE.getFeedback();
		/**
		 * The meta object literal for the '<em><b>Controller Senders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK__CONTROLLER_SENDERS = eINSTANCE.getFeedback_ControllerSenders();
		/**
		 * The meta object literal for the '<em><b>Controller Receivers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK__CONTROLLER_RECEIVERS = eINSTANCE.getFeedback_ControllerReceivers();
		/**
		 * The meta object literal for the '<em><b>Controled Process Receivers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK__CONTROLED_PROCESS_RECEIVERS = eINSTANCE.getFeedback_ControledProcessReceivers();
		/**
		 * The meta object literal for the '<em><b>Controled Process Senders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK__CONTROLED_PROCESS_SENDERS = eINSTANCE.getFeedback_ControledProcessSenders();
		/**
		 * The meta object literal for the '<em><b>Sends Feedbacks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK__SENDS_FEEDBACKS = eINSTANCE.getFeedback_SendsFeedbacks();
		/**
		 * The meta object literal for the '<em><b>Receivers Feedbacks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK__RECEIVERS_FEEDBACKS = eINSTANCE.getFeedback_ReceiversFeedbacks();
		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.OtherInformationImpl <em>Other Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.OtherInformationImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getOtherInformation()
		 * @generated
		 */
		EClass OTHER_INFORMATION = eINSTANCE.getOtherInformation();
		/**
		 * The meta object literal for the '<em><b>Controller Senders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OTHER_INFORMATION__CONTROLLER_SENDERS = eINSTANCE.getOtherInformation_ControllerSenders();
		/**
		 * The meta object literal for the '<em><b>Controled Process Senders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OTHER_INFORMATION__CONTROLED_PROCESS_SENDERS = eINSTANCE
				.getOtherInformation_ControledProcessSenders();
		/**
		 * The meta object literal for the '<em><b>Controled Process Receivers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OTHER_INFORMATION__CONTROLED_PROCESS_RECEIVERS = eINSTANCE
				.getOtherInformation_ControledProcessReceivers();
		/**
		 * The meta object literal for the '<em><b>Controller Receivers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OTHER_INFORMATION__CONTROLLER_RECEIVERS = eINSTANCE.getOtherInformation_ControllerReceivers();
		/**
		 * The meta object literal for the '<em><b>Subsystem Senders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OTHER_INFORMATION__SUBSYSTEM_SENDERS = eINSTANCE.getOtherInformation_SubsystemSenders();
		/**
		 * The meta object literal for the '<em><b>Subsystem Receivers</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OTHER_INFORMATION__SUBSYSTEM_RECEIVERS = eINSTANCE.getOtherInformation_SubsystemReceivers();
		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.ControllerImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();
		/**
		 * The meta object literal for the '<em><b>Sends Feedbacks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__SENDS_FEEDBACKS = eINSTANCE.getController_SendsFeedbacks();
		/**
		 * The meta object literal for the '<em><b>Sends Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__SENDS_COMMANDS = eINSTANCE.getController_SendsCommands();
		/**
		 * The meta object literal for the '<em><b>Sends Info</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__SENDS_INFO = eINSTANCE.getController_SendsInfo();
		/**
		 * The meta object literal for the '<em><b>Receives Info</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__RECEIVES_INFO = eINSTANCE.getController_ReceivesInfo();
		/**
		 * The meta object literal for the '<em><b>Receives Feedbacks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__RECEIVES_FEEDBACKS = eINSTANCE.getController_ReceivesFeedbacks();
		/**
		 * The meta object literal for the '<em><b>Receives Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__RECEIVES_COMMANDS = eINSTANCE.getController_ReceivesCommands();

	}

} //STPAsecPackage
