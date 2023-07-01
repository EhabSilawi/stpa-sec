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
	 * The feature id for the '<em><b>Subsystems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SUBSYSTEMS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>System Mode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SYSTEM_MODE = 3;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Sends Feedbacks</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__SENDS_FEEDBACKS = 6;

	/**
	 * The feature id for the '<em><b>Sends Commands</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__SENDS_COMMANDS = 7;

	/**
	 * The feature id for the '<em><b>Controller Sends Info</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__CONTROLLER_SENDS_INFO = 8;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__CONTROLLER = 9;

	/**
	 * The number of structural features of the '<em>Control Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_FEATURE_COUNT = 10;

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
	 * The feature id for the '<em><b>Sends Feedbacks</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS__SENDS_FEEDBACKS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controled Process Sends Info</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS__CONTROLED_PROCESS_SENDS_INFO = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Controlled Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS_FEATURE_COUNT = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Controller Command Receiver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__CONTROLLER_COMMAND_RECEIVER = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controled Proccess Receiver Commands</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__CONTROLED_PROCCESS_RECEIVER_COMMANDS = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION_FEATURE_COUNT = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Controller Feedback Receiver</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__CONTROLLER_FEEDBACK_RECEIVER = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FEATURE_COUNT = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Ccontroller Receiver Info</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_INFORMATION__CCONTROLLER_RECEIVER_INFO = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controled Process Recevier Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_INFORMATION__CONTROLED_PROCESS_RECEVIER_INFO = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Other Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_INFORMATION_FEATURE_COUNT = CONTROL_STRUCTURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Other Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_INFORMATION_OPERATION_COUNT = CONTROL_STRUCTURE_ELEMENT_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.System#getSubsystems <em>Subsystems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subsystems</em>'.
	 * @see tau.systemengineering.STPAsec.System#getSubsystems()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Subsystems();

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
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.System#getSystemMode <em>System Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Mode</em>'.
	 * @see tau.systemengineering.STPAsec.System#getSystemMode()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_SystemMode();

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
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlStructure#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controller</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure#getController()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_Controller();

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
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.ControlStructure#getSendsFeedbacks <em>Sends Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sends Feedbacks</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure#getSendsFeedbacks()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_SendsFeedbacks();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.ControlStructure#getSendsCommands <em>Sends Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sends Commands</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure#getSendsCommands()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_SendsCommands();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlStructure#getControllerSendsInfo <em>Controller Sends Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controller Sends Info</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure#getControllerSendsInfo()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_ControllerSendsInfo();

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
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.ControlledProcess#getSendsFeedbacks <em>Sends Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sends Feedbacks</em>'.
	 * @see tau.systemengineering.STPAsec.ControlledProcess#getSendsFeedbacks()
	 * @see #getControlledProcess()
	 * @generated
	 */
	EReference getControlledProcess_SendsFeedbacks();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlledProcess#getControledProcessSendsInfo <em>Controled Process Sends Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controled Process Sends Info</em>'.
	 * @see tau.systemengineering.STPAsec.ControlledProcess#getControledProcessSendsInfo()
	 * @see #getControlledProcess()
	 * @generated
	 */
	EReference getControlledProcess_ControledProcessSendsInfo();

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
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlAction#getControllerCommandReceiver <em>Controller Command Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controller Command Receiver</em>'.
	 * @see tau.systemengineering.STPAsec.ControlAction#getControllerCommandReceiver()
	 * @see #getControlAction()
	 * @generated
	 */
	EReference getControlAction_ControllerCommandReceiver();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.ControlAction#getControledProccessReceiverCommands <em>Controled Proccess Receiver Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controled Proccess Receiver Commands</em>'.
	 * @see tau.systemengineering.STPAsec.ControlAction#getControledProccessReceiverCommands()
	 * @see #getControlAction()
	 * @generated
	 */
	EReference getControlAction_ControledProccessReceiverCommands();

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
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.Feedback#getControllerFeedbackReceiver <em>Controller Feedback Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controller Feedback Receiver</em>'.
	 * @see tau.systemengineering.STPAsec.Feedback#getControllerFeedbackReceiver()
	 * @see #getFeedback()
	 * @generated
	 */
	EReference getFeedback_ControllerFeedbackReceiver();

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
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.OtherInformation#getCcontrollerReceiverInfo <em>Ccontroller Receiver Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ccontroller Receiver Info</em>'.
	 * @see tau.systemengineering.STPAsec.OtherInformation#getCcontrollerReceiverInfo()
	 * @see #getOtherInformation()
	 * @generated
	 */
	EReference getOtherInformation_CcontrollerReceiverInfo();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.OtherInformation#getControledProcessRecevierInfo <em>Controled Process Recevier Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controled Process Recevier Info</em>'.
	 * @see tau.systemengineering.STPAsec.OtherInformation#getControledProcessRecevierInfo()
	 * @see #getOtherInformation()
	 * @generated
	 */
	EReference getOtherInformation_ControledProcessRecevierInfo();

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
		 * The meta object literal for the '<em><b>Subsystems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SUBSYSTEMS = eINSTANCE.getSystem_Subsystems();
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
		 * The meta object literal for the '<em><b>System Mode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SYSTEM_MODE = eINSTANCE.getSystem_SystemMode();
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
		 * The meta object literal for the '<em><b>Controller</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__CONTROLLER = eINSTANCE.getControlStructure_Controller();
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
		 * The meta object literal for the '<em><b>Sends Feedbacks</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__SENDS_FEEDBACKS = eINSTANCE.getControlStructure_SendsFeedbacks();
		/**
		 * The meta object literal for the '<em><b>Sends Commands</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__SENDS_COMMANDS = eINSTANCE.getControlStructure_SendsCommands();
		/**
		 * The meta object literal for the '<em><b>Controller Sends Info</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__CONTROLLER_SENDS_INFO = eINSTANCE.getControlStructure_ControllerSendsInfo();
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
		 * The meta object literal for the '<em><b>Sends Feedbacks</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLED_PROCESS__SENDS_FEEDBACKS = eINSTANCE.getControlledProcess_SendsFeedbacks();
		/**
		 * The meta object literal for the '<em><b>Controled Process Sends Info</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLED_PROCESS__CONTROLED_PROCESS_SENDS_INFO = eINSTANCE
				.getControlledProcess_ControledProcessSendsInfo();
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
		 * The meta object literal for the '<em><b>Controller Command Receiver</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ACTION__CONTROLLER_COMMAND_RECEIVER = eINSTANCE.getControlAction_ControllerCommandReceiver();
		/**
		 * The meta object literal for the '<em><b>Controled Proccess Receiver Commands</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ACTION__CONTROLED_PROCCESS_RECEIVER_COMMANDS = eINSTANCE
				.getControlAction_ControledProccessReceiverCommands();
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
		 * The meta object literal for the '<em><b>Controller Feedback Receiver</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK__CONTROLLER_FEEDBACK_RECEIVER = eINSTANCE.getFeedback_ControllerFeedbackReceiver();
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
		 * The meta object literal for the '<em><b>Ccontroller Receiver Info</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OTHER_INFORMATION__CCONTROLLER_RECEIVER_INFO = eINSTANCE
				.getOtherInformation_CcontrollerReceiverInfo();
		/**
		 * The meta object literal for the '<em><b>Controled Process Recevier Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OTHER_INFORMATION__CONTROLED_PROCESS_RECEVIER_INFO = eINSTANCE
				.getOtherInformation_ControledProcessRecevierInfo();

	}

} //STPAsecPackage
