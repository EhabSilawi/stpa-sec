/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_SEC__SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Loss</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_SEC__LOSS = 1;

	/**
	 * The feature id for the '<em><b>System Level Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_SEC__SYSTEM_LEVEL_HAZARD = 2;

	/**
	 * The feature id for the '<em><b>System Level Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_SEC__SYSTEM_LEVEL_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_SEC__SCENARIO = 4;

	/**
	 * The feature id for the '<em><b>Insecure Control Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_SEC__INSECURE_CONTROL_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Controller Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_SEC__CONTROLLER_CONSTRAINTS = 6;

	/**
	 * The number of structural features of the '<em>STPA Sec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_SEC_FEATURE_COUNT = 7;

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
	 * The feature id for the '<em><b>Contro Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTRO_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__FEEDBACK = 1;

	/**
	 * The feature id for the '<em><b>Control Loop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTROL_LOOP = 2;

	/**
	 * The feature id for the '<em><b>Sub System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SUB_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ID = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 5;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__GOAL = 6;

	/**
	 * The feature id for the '<em><b>Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__INFORMATION = 7;

	/**
	 * The feature id for the '<em><b>Receives Info</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__RECEIVES_INFO = 8;

	/**
	 * The feature id for the '<em><b>Sends Info</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SENDS_INFO = 9;

	/**
	 * The feature id for the '<em><b>Receives Feedback</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__RECEIVES_FEEDBACK = 10;

	/**
	 * The feature id for the '<em><b>Sends Feedback</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SENDS_FEEDBACK = 11;

	/**
	 * The feature id for the '<em><b>Controls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTROLS = 12;

	/**
	 * The feature id for the '<em><b>Performs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__PERFORMS = 13;

	/**
	 * The feature id for the '<em><b>Controller Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONTROLLER_CONSTRAINTS = 14;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.ControlActionImpl <em>Control Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.ControlActionImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getControlAction()
	 * @generated
	 */
	int CONTROL_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Control Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Control Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.FeedbackImpl <em>Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.FeedbackImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getFeedback()
	 * @generated
	 */
	int FEEDBACK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__NAME = 1;

	/**
	 * The number of structural features of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.ControlLoopImpl <em>Control Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.ControlLoopImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getControlLoop()
	 * @generated
	 */
	int CONTROL_LOOP = 4;

	/**
	 * The feature id for the '<em><b>Cmdflow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_LOOP__CMDFLOW = 0;

	/**
	 * The feature id for the '<em><b>Feedbackflow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_LOOP__FEEDBACKFLOW = 1;

	/**
	 * The feature id for the '<em><b>Infoflow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_LOOP__INFOFLOW = 2;

	/**
	 * The number of structural features of the '<em>Control Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_LOOP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Control Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_LOOP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.CmdFlowImpl <em>Cmd Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.CmdFlowImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getCmdFlow()
	 * @generated
	 */
	int CMD_FLOW = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_FLOW__ID = 0;

	/**
	 * The feature id for the '<em><b>Performed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_FLOW__PERFORMED_BY = 1;

	/**
	 * The feature id for the '<em><b>Controled By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_FLOW__CONTROLED_BY = 2;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_FLOW__CMD = 3;

	/**
	 * The number of structural features of the '<em>Cmd Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_FLOW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Cmd Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMD_FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.FeedbackFlowImpl <em>Feedback Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.FeedbackFlowImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getFeedbackFlow()
	 * @generated
	 */
	int FEEDBACK_FLOW = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FLOW__ID = 0;

	/**
	 * The feature id for the '<em><b>Feedback Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FLOW__FEEDBACK_SENDER = 1;

	/**
	 * The feature id for the '<em><b>Feedback Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FLOW__FEEDBACK_RECEIVER = 2;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FLOW__FEEDBACK = 3;

	/**
	 * The number of structural features of the '<em>Feedback Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FLOW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Feedback Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.InfoFlowImpl <em>Info Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.InfoFlowImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getInfoFlow()
	 * @generated
	 */
	int INFO_FLOW = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_FLOW__ID = 0;

	/**
	 * The feature id for the '<em><b>Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_FLOW__INFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Info Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_FLOW__INFO_RECEIVER = 2;

	/**
	 * The feature id for the '<em><b>Info Sender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_FLOW__INFO_SENDER = 3;

	/**
	 * The number of structural features of the '<em>Info Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_FLOW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Info Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.InformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.InformationImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getInformation()
	 * @generated
	 */
	int INFORMATION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.LossImpl <em>Loss</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.LossImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getLoss()
	 * @generated
	 */
	int LOSS = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS__TRACEABLE_TO = 2;

	/**
	 * The number of structural features of the '<em>Loss</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Loss</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.SystemLevelHazardImpl <em>System Level Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.SystemLevelHazardImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getSystemLevelHazard()
	 * @generated
	 */
	int SYSTEM_LEVEL_HAZARD = 10;

	/**
	 * The feature id for the '<em><b>Refine Hazards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_HAZARD__REFINE_HAZARDS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_HAZARD__ID = 1;

	/**
	 * The feature id for the '<em><b>Leads To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_HAZARD__LEADS_TO = 2;

	/**
	 * The feature id for the '<em><b>Unsecure Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_HAZARD__UNSECURE_CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_HAZARD__CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_HAZARD__SYSTEM = 5;

	/**
	 * The feature id for the '<em><b>ICA</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_HAZARD__ICA = 6;

	/**
	 * The number of structural features of the '<em>System Level Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_HAZARD_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>System Level Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_HAZARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.SystemLevelConstraintImpl <em>System Level Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.SystemLevelConstraintImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getSystemLevelConstraint()
	 * @generated
	 */
	int SYSTEM_LEVEL_CONSTRAINT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Condition To Enforce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_CONSTRAINT__CONDITION_TO_ENFORCE = 1;

	/**
	 * The feature id for the '<em><b>Traceable To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_CONSTRAINT__TRACEABLE_TO = 2;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_CONSTRAINT__SYSTEM = 3;

	/**
	 * The number of structural features of the '<em>System Level Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>System Level Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LEVEL_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.InsecureControlActionImpl <em>Insecure Control Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.InsecureControlActionImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getInsecureControlAction()
	 * @generated
	 */
	int INSECURE_CONTROL_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSECURE_CONTROL_ACTION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSECURE_CONTROL_ACTION__CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSECURE_CONTROL_ACTION__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Link To Hazrd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSECURE_CONTROL_ACTION__LINK_TO_HAZRD = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSECURE_CONTROL_ACTION__ID = 4;

	/**
	 * The feature id for the '<em><b>Control Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSECURE_CONTROL_ACTION__CONTROL_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Cmdflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSECURE_CONTROL_ACTION__CMDFLOW = 6;

	/**
	 * The number of structural features of the '<em>Insecure Control Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSECURE_CONTROL_ACTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Insecure Control Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSECURE_CONTROL_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.ControllerConstraintsImpl <em>Controller Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.ControllerConstraintsImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getControllerConstraints()
	 * @generated
	 */
	int CONTROLLER_CONSTRAINTS = 13;

	/**
	 * The feature id for the '<em><b>ICA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CONSTRAINTS__ICA = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CONSTRAINTS__ID = 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CONSTRAINTS__CONSTRAINTS = 2;

	/**
	 * The feature id for the '<em><b>Systemlevelhazard</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CONSTRAINTS__SYSTEMLEVELHAZARD = 3;

	/**
	 * The number of structural features of the '<em>Controller Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CONSTRAINTS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Controller Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.ScenarioImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 14;

	/**
	 * The feature id for the '<em><b>ICA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ICA = 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>System Level Hazard</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__SYSTEM_LEVEL_HAZARD = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__ID = 3;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__CONTEXT = 4;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.TypeOfUnsecureControlAction <em>Type Of Unsecure Control Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.TypeOfUnsecureControlAction
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getTypeOfUnsecureControlAction()
	 * @generated
	 */
	int TYPE_OF_UNSECURE_CONTROL_ACTION = 15;

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
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.STPASec#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System</em>'.
	 * @see tau.systemengineering.STPAsec.STPASec#getSystem()
	 * @see #getSTPASec()
	 * @generated
	 */
	EReference getSTPASec_System();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.STPASec#getLoss <em>Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loss</em>'.
	 * @see tau.systemengineering.STPAsec.STPASec#getLoss()
	 * @see #getSTPASec()
	 * @generated
	 */
	EReference getSTPASec_Loss();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.STPASec#getSystemLevelHazard <em>System Level Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Level Hazard</em>'.
	 * @see tau.systemengineering.STPAsec.STPASec#getSystemLevelHazard()
	 * @see #getSTPASec()
	 * @generated
	 */
	EReference getSTPASec_SystemLevelHazard();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.STPASec#getSystemLevelConstraint <em>System Level Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Level Constraint</em>'.
	 * @see tau.systemengineering.STPAsec.STPASec#getSystemLevelConstraint()
	 * @see #getSTPASec()
	 * @generated
	 */
	EReference getSTPASec_SystemLevelConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.STPASec#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario</em>'.
	 * @see tau.systemengineering.STPAsec.STPASec#getScenario()
	 * @see #getSTPASec()
	 * @generated
	 */
	EReference getSTPASec_Scenario();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.STPASec#getInsecureControlAction <em>Insecure Control Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Insecure Control Action</em>'.
	 * @see tau.systemengineering.STPAsec.STPASec#getInsecureControlAction()
	 * @see #getSTPASec()
	 * @generated
	 */
	EReference getSTPASec_InsecureControlAction();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.STPASec#getControllerConstraints <em>Controller Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controller Constraints</em>'.
	 * @see tau.systemengineering.STPAsec.STPASec#getControllerConstraints()
	 * @see #getSTPASec()
	 * @generated
	 */
	EReference getSTPASec_ControllerConstraints();

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
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.System#getControAction <em>Contro Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contro Action</em>'.
	 * @see tau.systemengineering.STPAsec.System#getControAction()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ControAction();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.System#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feedback</em>'.
	 * @see tau.systemengineering.STPAsec.System#getFeedback()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Feedback();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.System#getControlLoop <em>Control Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Loop</em>'.
	 * @see tau.systemengineering.STPAsec.System#getControlLoop()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ControlLoop();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.System#getSubSystem <em>Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub System</em>'.
	 * @see tau.systemengineering.STPAsec.System#getSubSystem()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_SubSystem();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.System#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tau.systemengineering.STPAsec.System#getId()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Id();

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
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.System#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal</em>'.
	 * @see tau.systemengineering.STPAsec.System#getGoal()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Goal();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.System#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Information</em>'.
	 * @see tau.systemengineering.STPAsec.System#getInformation()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Information();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.System#getReceivesInfo <em>Receives Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receives Info</em>'.
	 * @see tau.systemengineering.STPAsec.System#getReceivesInfo()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ReceivesInfo();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.System#getSendsInfo <em>Sends Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sends Info</em>'.
	 * @see tau.systemengineering.STPAsec.System#getSendsInfo()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_SendsInfo();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.System#getReceivesFeedback <em>Receives Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Receives Feedback</em>'.
	 * @see tau.systemengineering.STPAsec.System#getReceivesFeedback()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ReceivesFeedback();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.System#getSendsFeedback <em>Sends Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sends Feedback</em>'.
	 * @see tau.systemengineering.STPAsec.System#getSendsFeedback()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_SendsFeedback();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.System#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Controls</em>'.
	 * @see tau.systemengineering.STPAsec.System#getControls()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Controls();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.System#getPerforms <em>Performs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Performs</em>'.
	 * @see tau.systemengineering.STPAsec.System#getPerforms()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Performs();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.System#getControllerConstraints <em>Controller Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controller Constraints</em>'.
	 * @see tau.systemengineering.STPAsec.System#getControllerConstraints()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ControllerConstraints();

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
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.ControlAction#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tau.systemengineering.STPAsec.ControlAction#getId()
	 * @see #getControlAction()
	 * @generated
	 */
	EAttribute getControlAction_Id();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.ControlAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tau.systemengineering.STPAsec.ControlAction#getName()
	 * @see #getControlAction()
	 * @generated
	 */
	EAttribute getControlAction_Name();

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
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.Feedback#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tau.systemengineering.STPAsec.Feedback#getId()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_Id();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.Feedback#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tau.systemengineering.STPAsec.Feedback#getName()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_Name();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.ControlLoop <em>Control Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Loop</em>'.
	 * @see tau.systemengineering.STPAsec.ControlLoop
	 * @generated
	 */
	EClass getControlLoop();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.ControlLoop#getCmdflow <em>Cmdflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cmdflow</em>'.
	 * @see tau.systemengineering.STPAsec.ControlLoop#getCmdflow()
	 * @see #getControlLoop()
	 * @generated
	 */
	EReference getControlLoop_Cmdflow();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.ControlLoop#getFeedbackflow <em>Feedbackflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feedbackflow</em>'.
	 * @see tau.systemengineering.STPAsec.ControlLoop#getFeedbackflow()
	 * @see #getControlLoop()
	 * @generated
	 */
	EReference getControlLoop_Feedbackflow();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.ControlLoop#getInfoflow <em>Infoflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infoflow</em>'.
	 * @see tau.systemengineering.STPAsec.ControlLoop#getInfoflow()
	 * @see #getControlLoop()
	 * @generated
	 */
	EReference getControlLoop_Infoflow();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.CmdFlow <em>Cmd Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmd Flow</em>'.
	 * @see tau.systemengineering.STPAsec.CmdFlow
	 * @generated
	 */
	EClass getCmdFlow();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.CmdFlow#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tau.systemengineering.STPAsec.CmdFlow#getId()
	 * @see #getCmdFlow()
	 * @generated
	 */
	EAttribute getCmdFlow_Id();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.CmdFlow#getPerformedBy <em>Performed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Performed By</em>'.
	 * @see tau.systemengineering.STPAsec.CmdFlow#getPerformedBy()
	 * @see #getCmdFlow()
	 * @generated
	 */
	EReference getCmdFlow_PerformedBy();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.CmdFlow#getControledBy <em>Controled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controled By</em>'.
	 * @see tau.systemengineering.STPAsec.CmdFlow#getControledBy()
	 * @see #getCmdFlow()
	 * @generated
	 */
	EReference getCmdFlow_ControledBy();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.CmdFlow#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cmd</em>'.
	 * @see tau.systemengineering.STPAsec.CmdFlow#getCmd()
	 * @see #getCmdFlow()
	 * @generated
	 */
	EReference getCmdFlow_Cmd();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.FeedbackFlow <em>Feedback Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback Flow</em>'.
	 * @see tau.systemengineering.STPAsec.FeedbackFlow
	 * @generated
	 */
	EClass getFeedbackFlow();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.FeedbackFlow#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tau.systemengineering.STPAsec.FeedbackFlow#getId()
	 * @see #getFeedbackFlow()
	 * @generated
	 */
	EAttribute getFeedbackFlow_Id();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.FeedbackFlow#getFeedbackSender <em>Feedback Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feedback Sender</em>'.
	 * @see tau.systemengineering.STPAsec.FeedbackFlow#getFeedbackSender()
	 * @see #getFeedbackFlow()
	 * @generated
	 */
	EReference getFeedbackFlow_FeedbackSender();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.FeedbackFlow#getFeedbackReceiver <em>Feedback Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feedback Receiver</em>'.
	 * @see tau.systemengineering.STPAsec.FeedbackFlow#getFeedbackReceiver()
	 * @see #getFeedbackFlow()
	 * @generated
	 */
	EReference getFeedbackFlow_FeedbackReceiver();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.FeedbackFlow#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feedback</em>'.
	 * @see tau.systemengineering.STPAsec.FeedbackFlow#getFeedback()
	 * @see #getFeedbackFlow()
	 * @generated
	 */
	EReference getFeedbackFlow_Feedback();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.InfoFlow <em>Info Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Flow</em>'.
	 * @see tau.systemengineering.STPAsec.InfoFlow
	 * @generated
	 */
	EClass getInfoFlow();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.InfoFlow#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tau.systemengineering.STPAsec.InfoFlow#getId()
	 * @see #getInfoFlow()
	 * @generated
	 */
	EAttribute getInfoFlow_Id();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.InfoFlow#getInformation <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Information</em>'.
	 * @see tau.systemengineering.STPAsec.InfoFlow#getInformation()
	 * @see #getInfoFlow()
	 * @generated
	 */
	EReference getInfoFlow_Information();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.InfoFlow#getInfoReceiver <em>Info Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Info Receiver</em>'.
	 * @see tau.systemengineering.STPAsec.InfoFlow#getInfoReceiver()
	 * @see #getInfoFlow()
	 * @generated
	 */
	EReference getInfoFlow_InfoReceiver();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.InfoFlow#getInfoSender <em>Info Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Info Sender</em>'.
	 * @see tau.systemengineering.STPAsec.InfoFlow#getInfoSender()
	 * @see #getInfoFlow()
	 * @generated
	 */
	EReference getInfoFlow_InfoSender();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information</em>'.
	 * @see tau.systemengineering.STPAsec.Information
	 * @generated
	 */
	EClass getInformation();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.Information#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tau.systemengineering.STPAsec.Information#getId()
	 * @see #getInformation()
	 * @generated
	 */
	EAttribute getInformation_Id();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.Information#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tau.systemengineering.STPAsec.Information#getName()
	 * @see #getInformation()
	 * @generated
	 */
	EAttribute getInformation_Name();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.Loss <em>Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loss</em>'.
	 * @see tau.systemengineering.STPAsec.Loss
	 * @generated
	 */
	EClass getLoss();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.Loss#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tau.systemengineering.STPAsec.Loss#getId()
	 * @see #getLoss()
	 * @generated
	 */
	EAttribute getLoss_Id();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.Loss#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tau.systemengineering.STPAsec.Loss#getName()
	 * @see #getLoss()
	 * @generated
	 */
	EAttribute getLoss_Name();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.Loss#getTraceableTo <em>Traceable To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traceable To</em>'.
	 * @see tau.systemengineering.STPAsec.Loss#getTraceableTo()
	 * @see #getLoss()
	 * @generated
	 */
	EReference getLoss_TraceableTo();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.SystemLevelHazard <em>System Level Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Level Hazard</em>'.
	 * @see tau.systemengineering.STPAsec.SystemLevelHazard
	 * @generated
	 */
	EClass getSystemLevelHazard();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.SystemLevelHazard#getRefineHazards <em>Refine Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refine Hazards</em>'.
	 * @see tau.systemengineering.STPAsec.SystemLevelHazard#getRefineHazards()
	 * @see #getSystemLevelHazard()
	 * @generated
	 */
	EReference getSystemLevelHazard_RefineHazards();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.SystemLevelHazard#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tau.systemengineering.STPAsec.SystemLevelHazard#getId()
	 * @see #getSystemLevelHazard()
	 * @generated
	 */
	EAttribute getSystemLevelHazard_Id();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.SystemLevelHazard#getLeadsTo <em>Leads To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Leads To</em>'.
	 * @see tau.systemengineering.STPAsec.SystemLevelHazard#getLeadsTo()
	 * @see #getSystemLevelHazard()
	 * @generated
	 */
	EReference getSystemLevelHazard_LeadsTo();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.SystemLevelHazard#getUnsecureCondition <em>Unsecure Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsecure Condition</em>'.
	 * @see tau.systemengineering.STPAsec.SystemLevelHazard#getUnsecureCondition()
	 * @see #getSystemLevelHazard()
	 * @generated
	 */
	EAttribute getSystemLevelHazard_UnsecureCondition();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.SystemLevelHazard#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraint</em>'.
	 * @see tau.systemengineering.STPAsec.SystemLevelHazard#getConstraint()
	 * @see #getSystemLevelHazard()
	 * @generated
	 */
	EReference getSystemLevelHazard_Constraint();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.SystemLevelHazard#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see tau.systemengineering.STPAsec.SystemLevelHazard#getSystem()
	 * @see #getSystemLevelHazard()
	 * @generated
	 */
	EReference getSystemLevelHazard_System();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.SystemLevelHazard#getICA <em>ICA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ICA</em>'.
	 * @see tau.systemengineering.STPAsec.SystemLevelHazard#getICA()
	 * @see #getSystemLevelHazard()
	 * @generated
	 */
	EReference getSystemLevelHazard_ICA();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.SystemLevelConstraint <em>System Level Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Level Constraint</em>'.
	 * @see tau.systemengineering.STPAsec.SystemLevelConstraint
	 * @generated
	 */
	EClass getSystemLevelConstraint();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.SystemLevelConstraint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tau.systemengineering.STPAsec.SystemLevelConstraint#getId()
	 * @see #getSystemLevelConstraint()
	 * @generated
	 */
	EAttribute getSystemLevelConstraint_Id();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.SystemLevelConstraint#getConditionToEnforce <em>Condition To Enforce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition To Enforce</em>'.
	 * @see tau.systemengineering.STPAsec.SystemLevelConstraint#getConditionToEnforce()
	 * @see #getSystemLevelConstraint()
	 * @generated
	 */
	EAttribute getSystemLevelConstraint_ConditionToEnforce();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.SystemLevelConstraint#getTraceableTo <em>Traceable To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Traceable To</em>'.
	 * @see tau.systemengineering.STPAsec.SystemLevelConstraint#getTraceableTo()
	 * @see #getSystemLevelConstraint()
	 * @generated
	 */
	EReference getSystemLevelConstraint_TraceableTo();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.SystemLevelConstraint#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see tau.systemengineering.STPAsec.SystemLevelConstraint#getSystem()
	 * @see #getSystemLevelConstraint()
	 * @generated
	 */
	EReference getSystemLevelConstraint_System();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.InsecureControlAction <em>Insecure Control Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insecure Control Action</em>'.
	 * @see tau.systemengineering.STPAsec.InsecureControlAction
	 * @generated
	 */
	EClass getInsecureControlAction();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.InsecureControlAction#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tau.systemengineering.STPAsec.InsecureControlAction#getType()
	 * @see #getInsecureControlAction()
	 * @generated
	 */
	EAttribute getInsecureControlAction_Type();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.InsecureControlAction#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see tau.systemengineering.STPAsec.InsecureControlAction#getContext()
	 * @see #getInsecureControlAction()
	 * @generated
	 */
	EAttribute getInsecureControlAction_Context();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.InsecureControlAction#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see tau.systemengineering.STPAsec.InsecureControlAction#getSource()
	 * @see #getInsecureControlAction()
	 * @generated
	 */
	EReference getInsecureControlAction_Source();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.InsecureControlAction#getLinkToHazrd <em>Link To Hazrd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Link To Hazrd</em>'.
	 * @see tau.systemengineering.STPAsec.InsecureControlAction#getLinkToHazrd()
	 * @see #getInsecureControlAction()
	 * @generated
	 */
	EReference getInsecureControlAction_LinkToHazrd();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.InsecureControlAction#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tau.systemengineering.STPAsec.InsecureControlAction#getId()
	 * @see #getInsecureControlAction()
	 * @generated
	 */
	EAttribute getInsecureControlAction_Id();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.InsecureControlAction#getControlAction <em>Control Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Action</em>'.
	 * @see tau.systemengineering.STPAsec.InsecureControlAction#getControlAction()
	 * @see #getInsecureControlAction()
	 * @generated
	 */
	EReference getInsecureControlAction_ControlAction();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.InsecureControlAction#getCmdflow <em>Cmdflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cmdflow</em>'.
	 * @see tau.systemengineering.STPAsec.InsecureControlAction#getCmdflow()
	 * @see #getInsecureControlAction()
	 * @generated
	 */
	EReference getInsecureControlAction_Cmdflow();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.ControllerConstraints <em>Controller Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Constraints</em>'.
	 * @see tau.systemengineering.STPAsec.ControllerConstraints
	 * @generated
	 */
	EClass getControllerConstraints();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.ControllerConstraints#getICA <em>ICA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ICA</em>'.
	 * @see tau.systemengineering.STPAsec.ControllerConstraints#getICA()
	 * @see #getControllerConstraints()
	 * @generated
	 */
	EReference getControllerConstraints_ICA();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.ControllerConstraints#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tau.systemengineering.STPAsec.ControllerConstraints#getId()
	 * @see #getControllerConstraints()
	 * @generated
	 */
	EAttribute getControllerConstraints_Id();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.ControllerConstraints#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see tau.systemengineering.STPAsec.ControllerConstraints#getConstraints()
	 * @see #getControllerConstraints()
	 * @generated
	 */
	EAttribute getControllerConstraints_Constraints();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.ControllerConstraints#getSystemlevelhazard <em>Systemlevelhazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Systemlevelhazard</em>'.
	 * @see tau.systemengineering.STPAsec.ControllerConstraints#getSystemlevelhazard()
	 * @see #getControllerConstraints()
	 * @generated
	 */
	EReference getControllerConstraints_Systemlevelhazard();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see tau.systemengineering.STPAsec.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.Scenario#getICA <em>ICA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ICA</em>'.
	 * @see tau.systemengineering.STPAsec.Scenario#getICA()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_ICA();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.Scenario#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see tau.systemengineering.STPAsec.Scenario#getSystem()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_System();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.Scenario#getSystemLevelHazard <em>System Level Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>System Level Hazard</em>'.
	 * @see tau.systemengineering.STPAsec.Scenario#getSystemLevelHazard()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_SystemLevelHazard();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.Scenario#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tau.systemengineering.STPAsec.Scenario#getId()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Id();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.Scenario#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see tau.systemengineering.STPAsec.Scenario#getContext()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Context();

	/**
	 * Returns the meta object for enum '{@link tau.systemengineering.STPAsec.TypeOfUnsecureControlAction <em>Type Of Unsecure Control Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Of Unsecure Control Action</em>'.
	 * @see tau.systemengineering.STPAsec.TypeOfUnsecureControlAction
	 * @generated
	 */
	EEnum getTypeOfUnsecureControlAction();

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
		 * The meta object literal for the '<em><b>System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STPA_SEC__SYSTEM = eINSTANCE.getSTPASec_System();

		/**
		 * The meta object literal for the '<em><b>Loss</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STPA_SEC__LOSS = eINSTANCE.getSTPASec_Loss();

		/**
		 * The meta object literal for the '<em><b>System Level Hazard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STPA_SEC__SYSTEM_LEVEL_HAZARD = eINSTANCE.getSTPASec_SystemLevelHazard();

		/**
		 * The meta object literal for the '<em><b>System Level Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STPA_SEC__SYSTEM_LEVEL_CONSTRAINT = eINSTANCE.getSTPASec_SystemLevelConstraint();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STPA_SEC__SCENARIO = eINSTANCE.getSTPASec_Scenario();

		/**
		 * The meta object literal for the '<em><b>Insecure Control Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STPA_SEC__INSECURE_CONTROL_ACTION = eINSTANCE.getSTPASec_InsecureControlAction();

		/**
		 * The meta object literal for the '<em><b>Controller Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STPA_SEC__CONTROLLER_CONSTRAINTS = eINSTANCE.getSTPASec_ControllerConstraints();

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
		 * The meta object literal for the '<em><b>Contro Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CONTRO_ACTION = eINSTANCE.getSystem_ControAction();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__FEEDBACK = eINSTANCE.getSystem_Feedback();

		/**
		 * The meta object literal for the '<em><b>Control Loop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CONTROL_LOOP = eINSTANCE.getSystem_ControlLoop();

		/**
		 * The meta object literal for the '<em><b>Sub System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SUB_SYSTEM = eINSTANCE.getSystem_SubSystem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__ID = eINSTANCE.getSystem_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__GOAL = eINSTANCE.getSystem_Goal();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__INFORMATION = eINSTANCE.getSystem_Information();

		/**
		 * The meta object literal for the '<em><b>Receives Info</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__RECEIVES_INFO = eINSTANCE.getSystem_ReceivesInfo();

		/**
		 * The meta object literal for the '<em><b>Sends Info</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SENDS_INFO = eINSTANCE.getSystem_SendsInfo();

		/**
		 * The meta object literal for the '<em><b>Receives Feedback</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__RECEIVES_FEEDBACK = eINSTANCE.getSystem_ReceivesFeedback();

		/**
		 * The meta object literal for the '<em><b>Sends Feedback</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SENDS_FEEDBACK = eINSTANCE.getSystem_SendsFeedback();

		/**
		 * The meta object literal for the '<em><b>Controls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CONTROLS = eINSTANCE.getSystem_Controls();

		/**
		 * The meta object literal for the '<em><b>Performs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__PERFORMS = eINSTANCE.getSystem_Performs();

		/**
		 * The meta object literal for the '<em><b>Controller Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CONTROLLER_CONSTRAINTS = eINSTANCE.getSystem_ControllerConstraints();

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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_ACTION__ID = eINSTANCE.getControlAction_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_ACTION__NAME = eINSTANCE.getControlAction_Name();

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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__ID = eINSTANCE.getFeedback_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__NAME = eINSTANCE.getFeedback_Name();

		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.ControlLoopImpl <em>Control Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.ControlLoopImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getControlLoop()
		 * @generated
		 */
		EClass CONTROL_LOOP = eINSTANCE.getControlLoop();

		/**
		 * The meta object literal for the '<em><b>Cmdflow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_LOOP__CMDFLOW = eINSTANCE.getControlLoop_Cmdflow();

		/**
		 * The meta object literal for the '<em><b>Feedbackflow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_LOOP__FEEDBACKFLOW = eINSTANCE.getControlLoop_Feedbackflow();

		/**
		 * The meta object literal for the '<em><b>Infoflow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_LOOP__INFOFLOW = eINSTANCE.getControlLoop_Infoflow();

		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.CmdFlowImpl <em>Cmd Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.CmdFlowImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getCmdFlow()
		 * @generated
		 */
		EClass CMD_FLOW = eINSTANCE.getCmdFlow();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMD_FLOW__ID = eINSTANCE.getCmdFlow_Id();

		/**
		 * The meta object literal for the '<em><b>Performed By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMD_FLOW__PERFORMED_BY = eINSTANCE.getCmdFlow_PerformedBy();

		/**
		 * The meta object literal for the '<em><b>Controled By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMD_FLOW__CONTROLED_BY = eINSTANCE.getCmdFlow_ControledBy();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMD_FLOW__CMD = eINSTANCE.getCmdFlow_Cmd();

		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.FeedbackFlowImpl <em>Feedback Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.FeedbackFlowImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getFeedbackFlow()
		 * @generated
		 */
		EClass FEEDBACK_FLOW = eINSTANCE.getFeedbackFlow();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK_FLOW__ID = eINSTANCE.getFeedbackFlow_Id();

		/**
		 * The meta object literal for the '<em><b>Feedback Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_FLOW__FEEDBACK_SENDER = eINSTANCE.getFeedbackFlow_FeedbackSender();

		/**
		 * The meta object literal for the '<em><b>Feedback Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_FLOW__FEEDBACK_RECEIVER = eINSTANCE.getFeedbackFlow_FeedbackReceiver();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK_FLOW__FEEDBACK = eINSTANCE.getFeedbackFlow_Feedback();

		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.InfoFlowImpl <em>Info Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.InfoFlowImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getInfoFlow()
		 * @generated
		 */
		EClass INFO_FLOW = eINSTANCE.getInfoFlow();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_FLOW__ID = eINSTANCE.getInfoFlow_Id();

		/**
		 * The meta object literal for the '<em><b>Information</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_FLOW__INFORMATION = eINSTANCE.getInfoFlow_Information();

		/**
		 * The meta object literal for the '<em><b>Info Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_FLOW__INFO_RECEIVER = eINSTANCE.getInfoFlow_InfoReceiver();

		/**
		 * The meta object literal for the '<em><b>Info Sender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_FLOW__INFO_SENDER = eINSTANCE.getInfoFlow_InfoSender();

		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.InformationImpl <em>Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.InformationImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getInformation()
		 * @generated
		 */
		EClass INFORMATION = eINSTANCE.getInformation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION__ID = eINSTANCE.getInformation_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION__NAME = eINSTANCE.getInformation_Name();

		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.LossImpl <em>Loss</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.LossImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getLoss()
		 * @generated
		 */
		EClass LOSS = eINSTANCE.getLoss();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOSS__ID = eINSTANCE.getLoss_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOSS__NAME = eINSTANCE.getLoss_Name();

		/**
		 * The meta object literal for the '<em><b>Traceable To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOSS__TRACEABLE_TO = eINSTANCE.getLoss_TraceableTo();

		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.SystemLevelHazardImpl <em>System Level Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.SystemLevelHazardImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getSystemLevelHazard()
		 * @generated
		 */
		EClass SYSTEM_LEVEL_HAZARD = eINSTANCE.getSystemLevelHazard();

		/**
		 * The meta object literal for the '<em><b>Refine Hazards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_LEVEL_HAZARD__REFINE_HAZARDS = eINSTANCE.getSystemLevelHazard_RefineHazards();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_LEVEL_HAZARD__ID = eINSTANCE.getSystemLevelHazard_Id();

		/**
		 * The meta object literal for the '<em><b>Leads To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_LEVEL_HAZARD__LEADS_TO = eINSTANCE.getSystemLevelHazard_LeadsTo();

		/**
		 * The meta object literal for the '<em><b>Unsecure Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_LEVEL_HAZARD__UNSECURE_CONDITION = eINSTANCE.getSystemLevelHazard_UnsecureCondition();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_LEVEL_HAZARD__CONSTRAINT = eINSTANCE.getSystemLevelHazard_Constraint();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_LEVEL_HAZARD__SYSTEM = eINSTANCE.getSystemLevelHazard_System();

		/**
		 * The meta object literal for the '<em><b>ICA</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_LEVEL_HAZARD__ICA = eINSTANCE.getSystemLevelHazard_ICA();

		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.SystemLevelConstraintImpl <em>System Level Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.SystemLevelConstraintImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getSystemLevelConstraint()
		 * @generated
		 */
		EClass SYSTEM_LEVEL_CONSTRAINT = eINSTANCE.getSystemLevelConstraint();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_LEVEL_CONSTRAINT__ID = eINSTANCE.getSystemLevelConstraint_Id();

		/**
		 * The meta object literal for the '<em><b>Condition To Enforce</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_LEVEL_CONSTRAINT__CONDITION_TO_ENFORCE = eINSTANCE
				.getSystemLevelConstraint_ConditionToEnforce();

		/**
		 * The meta object literal for the '<em><b>Traceable To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_LEVEL_CONSTRAINT__TRACEABLE_TO = eINSTANCE.getSystemLevelConstraint_TraceableTo();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_LEVEL_CONSTRAINT__SYSTEM = eINSTANCE.getSystemLevelConstraint_System();

		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.InsecureControlActionImpl <em>Insecure Control Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.InsecureControlActionImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getInsecureControlAction()
		 * @generated
		 */
		EClass INSECURE_CONTROL_ACTION = eINSTANCE.getInsecureControlAction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSECURE_CONTROL_ACTION__TYPE = eINSTANCE.getInsecureControlAction_Type();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSECURE_CONTROL_ACTION__CONTEXT = eINSTANCE.getInsecureControlAction_Context();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSECURE_CONTROL_ACTION__SOURCE = eINSTANCE.getInsecureControlAction_Source();

		/**
		 * The meta object literal for the '<em><b>Link To Hazrd</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSECURE_CONTROL_ACTION__LINK_TO_HAZRD = eINSTANCE.getInsecureControlAction_LinkToHazrd();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSECURE_CONTROL_ACTION__ID = eINSTANCE.getInsecureControlAction_Id();

		/**
		 * The meta object literal for the '<em><b>Control Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSECURE_CONTROL_ACTION__CONTROL_ACTION = eINSTANCE.getInsecureControlAction_ControlAction();

		/**
		 * The meta object literal for the '<em><b>Cmdflow</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSECURE_CONTROL_ACTION__CMDFLOW = eINSTANCE.getInsecureControlAction_Cmdflow();

		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.ControllerConstraintsImpl <em>Controller Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.ControllerConstraintsImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getControllerConstraints()
		 * @generated
		 */
		EClass CONTROLLER_CONSTRAINTS = eINSTANCE.getControllerConstraints();

		/**
		 * The meta object literal for the '<em><b>ICA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_CONSTRAINTS__ICA = eINSTANCE.getControllerConstraints_ICA();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_CONSTRAINTS__ID = eINSTANCE.getControllerConstraints_Id();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_CONSTRAINTS__CONSTRAINTS = eINSTANCE.getControllerConstraints_Constraints();

		/**
		 * The meta object literal for the '<em><b>Systemlevelhazard</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_CONSTRAINTS__SYSTEMLEVELHAZARD = eINSTANCE.getControllerConstraints_Systemlevelhazard();

		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.ScenarioImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>ICA</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__ICA = eINSTANCE.getScenario_ICA();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SYSTEM = eINSTANCE.getScenario_System();

		/**
		 * The meta object literal for the '<em><b>System Level Hazard</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__SYSTEM_LEVEL_HAZARD = eINSTANCE.getScenario_SystemLevelHazard();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__ID = eINSTANCE.getScenario_Id();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__CONTEXT = eINSTANCE.getScenario_Context();

		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.TypeOfUnsecureControlAction <em>Type Of Unsecure Control Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.TypeOfUnsecureControlAction
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getTypeOfUnsecureControlAction()
		 * @generated
		 */
		EEnum TYPE_OF_UNSECURE_CONTROL_ACTION = eINSTANCE.getTypeOfUnsecureControlAction();

	}

} //STPAsecPackage
