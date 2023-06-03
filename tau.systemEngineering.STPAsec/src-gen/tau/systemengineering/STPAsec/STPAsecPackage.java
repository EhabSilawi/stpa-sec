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
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.LossScenarioImpl <em>Loss Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.LossScenarioImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getLossScenario()
	 * @generated
	 */
	int LOSS_SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_SCENARIO__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_SCENARIO__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_SCENARIO__SEVERITY = 2;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_SCENARIO__SOLUTIONS = 3;

	/**
	 * The number of structural features of the '<em>Loss Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_SCENARIO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Loss Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.HazardImpl <em>Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.HazardImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getHazard()
	 * @generated
	 */
	int HAZARD = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Related Losses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__RELATED_LOSSES = 2;

	/**
	 * The feature id for the '<em><b>Unsafe Control Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD__UNSAFE_CONTROL_ACTIONS = 3;

	/**
	 * The number of structural features of the '<em>Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.MissionGoalImpl <em>Mission Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.MissionGoalImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getMissionGoal()
	 * @generated
	 */
	int MISSION_GOAL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_GOAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_GOAL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_GOAL__ISSUES = 2;

	/**
	 * The number of structural features of the '<em>Mission Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_GOAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mission Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.SecurityRecommendationImpl <em>Security Recommendation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.SecurityRecommendationImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getSecurityRecommendation()
	 * @generated
	 */
	int SECURITY_RECOMMENDATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RECOMMENDATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RECOMMENDATION__SOLUTION = 1;

	/**
	 * The number of structural features of the '<em>Security Recommendation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RECOMMENDATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Security Recommendation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_RECOMMENDATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.SystemImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Recommends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__RECOMMENDS = 1;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__GOALS = 2;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SCENARIO = 3;

	/**
	 * The feature id for the '<em><b>Consists Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONSISTS_OF = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Potential Hazards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__POTENTIAL_HAZARDS = 6;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.STPASecImpl <em>STPA Sec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.STPASecImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getSTPASec()
	 * @generated
	 */
	int STPA_SEC = 5;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STPA_SEC__SYSTEM = 0;

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
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.StructureElementImpl <em>Structure Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.StructureElementImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getStructureElement()
	 * @generated
	 */
	int STRUCTURE_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Structure Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Structure Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.DataFlowImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__NAME = STRUCTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__DESCRIPTION = STRUCTURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__ID = STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Elment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__DATA_ELMENT = STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = STRUCTURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_OPERATION_COUNT = STRUCTURE_ELEMENT_OPERATION_COUNT + 0;

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
	int FEEDBACK__NAME = DATA_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__DESCRIPTION = DATA_FLOW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__ID = DATA_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Data Elment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__DATA_ELMENT = DATA_FLOW__DATA_ELMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__TYPE = DATA_FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__CONTROLLER = DATA_FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Controlled Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK__CONTROLLED_PROCESS = DATA_FLOW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_FEATURE_COUNT = DATA_FLOW_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEEDBACK_OPERATION_COUNT = DATA_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.ControlledProcessImpl <em>Controlled Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.ControlledProcessImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getControlledProcess()
	 * @generated
	 */
	int CONTROLLED_PROCESS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS__NAME = STRUCTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS__DESCRIPTION = STRUCTURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Feedbacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS__FEEDBACKS = STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Controlled Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS_FEATURE_COUNT = STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Controlled Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLED_PROCESS_OPERATION_COUNT = STRUCTURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.ControllerImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = STRUCTURE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__DESCRIPTION = STRUCTURE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__TYPE = STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__COMMANDS = STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feedbacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__FEEDBACKS = STRUCTURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = STRUCTURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = STRUCTURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.ControlStructureImpl <em>Control Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.ControlStructureImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getControlStructure()
	 * @generated
	 */
	int CONTROL_STRUCTURE = 10;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Control Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Control Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.ControlActionImpl <em>Control Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.ControlActionImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getControlAction()
	 * @generated
	 */
	int CONTROL_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__NAME = DATA_FLOW__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__DESCRIPTION = DATA_FLOW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__ID = DATA_FLOW__ID;

	/**
	 * The feature id for the '<em><b>Data Elment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__DATA_ELMENT = DATA_FLOW__DATA_ELMENT;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__RECEIVER = DATA_FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hazards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION__HAZARDS = DATA_FLOW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION_FEATURE_COUNT = DATA_FLOW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Control Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ACTION_OPERATION_COUNT = DATA_FLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tau.systemengineering.STPAsec.impl.DataElmentImpl <em>Data Elment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tau.systemengineering.STPAsec.impl.DataElmentImpl
	 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getDataElment()
	 * @generated
	 */
	int DATA_ELMENT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELMENT__DATA = 1;

	/**
	 * The number of structural features of the '<em>Data Elment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Elment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELMENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.LossScenario <em>Loss Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loss Scenario</em>'.
	 * @see tau.systemengineering.STPAsec.LossScenario
	 * @generated
	 */
	EClass getLossScenario();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.LossScenario#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tau.systemengineering.STPAsec.LossScenario#getId()
	 * @see #getLossScenario()
	 * @generated
	 */
	EAttribute getLossScenario_Id();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.LossScenario#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tau.systemengineering.STPAsec.LossScenario#getDescription()
	 * @see #getLossScenario()
	 * @generated
	 */
	EAttribute getLossScenario_Description();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.LossScenario#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see tau.systemengineering.STPAsec.LossScenario#getSeverity()
	 * @see #getLossScenario()
	 * @generated
	 */
	EAttribute getLossScenario_Severity();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.LossScenario#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solutions</em>'.
	 * @see tau.systemengineering.STPAsec.LossScenario#getSolutions()
	 * @see #getLossScenario()
	 * @generated
	 */
	EReference getLossScenario_Solutions();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.Hazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard</em>'.
	 * @see tau.systemengineering.STPAsec.Hazard
	 * @generated
	 */
	EClass getHazard();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.Hazard#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tau.systemengineering.STPAsec.Hazard#getId()
	 * @see #getHazard()
	 * @generated
	 */
	EAttribute getHazard_Id();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.Hazard#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tau.systemengineering.STPAsec.Hazard#getDescription()
	 * @see #getHazard()
	 * @generated
	 */
	EAttribute getHazard_Description();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.Hazard#getRelatedLosses <em>Related Losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Losses</em>'.
	 * @see tau.systemengineering.STPAsec.Hazard#getRelatedLosses()
	 * @see #getHazard()
	 * @generated
	 */
	EReference getHazard_RelatedLosses();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.Hazard#getUnsafeControlActions <em>Unsafe Control Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Unsafe Control Actions</em>'.
	 * @see tau.systemengineering.STPAsec.Hazard#getUnsafeControlActions()
	 * @see #getHazard()
	 * @generated
	 */
	EReference getHazard_UnsafeControlActions();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.MissionGoal <em>Mission Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission Goal</em>'.
	 * @see tau.systemengineering.STPAsec.MissionGoal
	 * @generated
	 */
	EClass getMissionGoal();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.MissionGoal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tau.systemengineering.STPAsec.MissionGoal#getName()
	 * @see #getMissionGoal()
	 * @generated
	 */
	EAttribute getMissionGoal_Name();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.MissionGoal#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tau.systemengineering.STPAsec.MissionGoal#getDescription()
	 * @see #getMissionGoal()
	 * @generated
	 */
	EAttribute getMissionGoal_Description();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.MissionGoal#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Issues</em>'.
	 * @see tau.systemengineering.STPAsec.MissionGoal#getIssues()
	 * @see #getMissionGoal()
	 * @generated
	 */
	EReference getMissionGoal_Issues();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.SecurityRecommendation <em>Security Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Recommendation</em>'.
	 * @see tau.systemengineering.STPAsec.SecurityRecommendation
	 * @generated
	 */
	EClass getSecurityRecommendation();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.SecurityRecommendation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tau.systemengineering.STPAsec.SecurityRecommendation#getId()
	 * @see #getSecurityRecommendation()
	 * @generated
	 */
	EAttribute getSecurityRecommendation_Id();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.SecurityRecommendation#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solution</em>'.
	 * @see tau.systemengineering.STPAsec.SecurityRecommendation#getSolution()
	 * @see #getSecurityRecommendation()
	 * @generated
	 */
	EAttribute getSecurityRecommendation_Solution();

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
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.System#getRecommends <em>Recommends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recommends</em>'.
	 * @see tau.systemengineering.STPAsec.System#getRecommends()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Recommends();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.System#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goals</em>'.
	 * @see tau.systemengineering.STPAsec.System#getGoals()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Goals();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.System#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario</em>'.
	 * @see tau.systemengineering.STPAsec.System#getScenario()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Scenario();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.System#getConsistsOf <em>Consists Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consists Of</em>'.
	 * @see tau.systemengineering.STPAsec.System#getConsistsOf()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_ConsistsOf();

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
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.System#getPotentialHazards <em>Potential Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Potential Hazards</em>'.
	 * @see tau.systemengineering.STPAsec.System#getPotentialHazards()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_PotentialHazards();

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
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.Feedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feedback</em>'.
	 * @see tau.systemengineering.STPAsec.Feedback
	 * @generated
	 */
	EClass getFeedback();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.Feedback#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tau.systemengineering.STPAsec.Feedback#getType()
	 * @see #getFeedback()
	 * @generated
	 */
	EAttribute getFeedback_Type();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.Feedback#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controller</em>'.
	 * @see tau.systemengineering.STPAsec.Feedback#getController()
	 * @see #getFeedback()
	 * @generated
	 */
	EReference getFeedback_Controller();

	/**
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.Feedback#getControlledProcess <em>Controlled Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controlled Process</em>'.
	 * @see tau.systemengineering.STPAsec.Feedback#getControlledProcess()
	 * @see #getFeedback()
	 * @generated
	 */
	EReference getFeedback_ControlledProcess();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.StructureElement <em>Structure Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Element</em>'.
	 * @see tau.systemengineering.STPAsec.StructureElement
	 * @generated
	 */
	EClass getStructureElement();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.StructureElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tau.systemengineering.STPAsec.StructureElement#getName()
	 * @see #getStructureElement()
	 * @generated
	 */
	EAttribute getStructureElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.StructureElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tau.systemengineering.STPAsec.StructureElement#getDescription()
	 * @see #getStructureElement()
	 * @generated
	 */
	EAttribute getStructureElement_Description();

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
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlledProcess#getFeedbacks <em>Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feedbacks</em>'.
	 * @see tau.systemengineering.STPAsec.ControlledProcess#getFeedbacks()
	 * @see #getControlledProcess()
	 * @generated
	 */
	EReference getControlledProcess_Feedbacks();

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
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.Controller#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see tau.systemengineering.STPAsec.Controller#getType()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Type();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.Controller#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commands</em>'.
	 * @see tau.systemengineering.STPAsec.Controller#getCommands()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Commands();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.Controller#getFeedbacks <em>Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feedbacks</em>'.
	 * @see tau.systemengineering.STPAsec.Controller#getFeedbacks()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Feedbacks();

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
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.ControlStructure#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see tau.systemengineering.STPAsec.ControlStructure#getElements()
	 * @see #getControlStructure()
	 * @generated
	 */
	EReference getControlStructure_Elements();

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
	 * Returns the meta object for the reference '{@link tau.systemengineering.STPAsec.ControlAction#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receiver</em>'.
	 * @see tau.systemengineering.STPAsec.ControlAction#getReceiver()
	 * @see #getControlAction()
	 * @generated
	 */
	EReference getControlAction_Receiver();

	/**
	 * Returns the meta object for the reference list '{@link tau.systemengineering.STPAsec.ControlAction#getHazards <em>Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hazards</em>'.
	 * @see tau.systemengineering.STPAsec.ControlAction#getHazards()
	 * @see #getControlAction()
	 * @generated
	 */
	EReference getControlAction_Hazards();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.DataElment <em>Data Elment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Elment</em>'.
	 * @see tau.systemengineering.STPAsec.DataElment
	 * @generated
	 */
	EClass getDataElment();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.DataElment#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tau.systemengineering.STPAsec.DataElment#getId()
	 * @see #getDataElment()
	 * @generated
	 */
	EAttribute getDataElment_Id();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.DataElment#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see tau.systemengineering.STPAsec.DataElment#getData()
	 * @see #getDataElment()
	 * @generated
	 */
	EAttribute getDataElment_Data();

	/**
	 * Returns the meta object for class '{@link tau.systemengineering.STPAsec.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see tau.systemengineering.STPAsec.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for the attribute '{@link tau.systemengineering.STPAsec.DataFlow#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tau.systemengineering.STPAsec.DataFlow#getId()
	 * @see #getDataFlow()
	 * @generated
	 */
	EAttribute getDataFlow_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link tau.systemengineering.STPAsec.DataFlow#getDataElment <em>Data Elment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Elment</em>'.
	 * @see tau.systemengineering.STPAsec.DataFlow#getDataElment()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_DataElment();

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
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.LossScenarioImpl <em>Loss Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.LossScenarioImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getLossScenario()
		 * @generated
		 */
		EClass LOSS_SCENARIO = eINSTANCE.getLossScenario();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOSS_SCENARIO__ID = eINSTANCE.getLossScenario_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOSS_SCENARIO__DESCRIPTION = eINSTANCE.getLossScenario_Description();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOSS_SCENARIO__SEVERITY = eINSTANCE.getLossScenario_Severity();

		/**
		 * The meta object literal for the '<em><b>Solutions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOSS_SCENARIO__SOLUTIONS = eINSTANCE.getLossScenario_Solutions();

		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.HazardImpl <em>Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.HazardImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getHazard()
		 * @generated
		 */
		EClass HAZARD = eINSTANCE.getHazard();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD__ID = eINSTANCE.getHazard_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD__DESCRIPTION = eINSTANCE.getHazard_Description();

		/**
		 * The meta object literal for the '<em><b>Related Losses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD__RELATED_LOSSES = eINSTANCE.getHazard_RelatedLosses();

		/**
		 * The meta object literal for the '<em><b>Unsafe Control Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD__UNSAFE_CONTROL_ACTIONS = eINSTANCE.getHazard_UnsafeControlActions();

		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.MissionGoalImpl <em>Mission Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.MissionGoalImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getMissionGoal()
		 * @generated
		 */
		EClass MISSION_GOAL = eINSTANCE.getMissionGoal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSION_GOAL__NAME = eINSTANCE.getMissionGoal_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MISSION_GOAL__DESCRIPTION = eINSTANCE.getMissionGoal_Description();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION_GOAL__ISSUES = eINSTANCE.getMissionGoal_Issues();

		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.SecurityRecommendationImpl <em>Security Recommendation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.SecurityRecommendationImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getSecurityRecommendation()
		 * @generated
		 */
		EClass SECURITY_RECOMMENDATION = eINSTANCE.getSecurityRecommendation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_RECOMMENDATION__ID = eINSTANCE.getSecurityRecommendation_Id();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_RECOMMENDATION__SOLUTION = eINSTANCE.getSecurityRecommendation_Solution();

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
		 * The meta object literal for the '<em><b>Recommends</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__RECOMMENDS = eINSTANCE.getSystem_Recommends();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__GOALS = eINSTANCE.getSystem_Goals();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__SCENARIO = eINSTANCE.getSystem_Scenario();

		/**
		 * The meta object literal for the '<em><b>Consists Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__CONSISTS_OF = eINSTANCE.getSystem_ConsistsOf();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__DESCRIPTION = eINSTANCE.getSystem_Description();

		/**
		 * The meta object literal for the '<em><b>Potential Hazards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__POTENTIAL_HAZARDS = eINSTANCE.getSystem_PotentialHazards();

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
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.FeedbackImpl <em>Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.FeedbackImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getFeedback()
		 * @generated
		 */
		EClass FEEDBACK = eINSTANCE.getFeedback();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEEDBACK__TYPE = eINSTANCE.getFeedback_Type();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK__CONTROLLER = eINSTANCE.getFeedback_Controller();

		/**
		 * The meta object literal for the '<em><b>Controlled Process</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEEDBACK__CONTROLLED_PROCESS = eINSTANCE.getFeedback_ControlledProcess();

		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.StructureElementImpl <em>Structure Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.StructureElementImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getStructureElement()
		 * @generated
		 */
		EClass STRUCTURE_ELEMENT = eINSTANCE.getStructureElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_ELEMENT__NAME = eINSTANCE.getStructureElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_ELEMENT__DESCRIPTION = eINSTANCE.getStructureElement_Description();

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
		 * The meta object literal for the '<em><b>Feedbacks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLED_PROCESS__FEEDBACKS = eINSTANCE.getControlledProcess_Feedbacks();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__TYPE = eINSTANCE.getController_Type();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__COMMANDS = eINSTANCE.getController_Commands();

		/**
		 * The meta object literal for the '<em><b>Feedbacks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__FEEDBACKS = eINSTANCE.getController_Feedbacks();

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
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_STRUCTURE__ELEMENTS = eINSTANCE.getControlStructure_Elements();

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
		 * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ACTION__RECEIVER = eINSTANCE.getControlAction_Receiver();

		/**
		 * The meta object literal for the '<em><b>Hazards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ACTION__HAZARDS = eINSTANCE.getControlAction_Hazards();

		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.DataElmentImpl <em>Data Elment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.DataElmentImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getDataElment()
		 * @generated
		 */
		EClass DATA_ELMENT = eINSTANCE.getDataElment();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELMENT__ID = eINSTANCE.getDataElment_Id();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELMENT__DATA = eINSTANCE.getDataElment_Data();

		/**
		 * The meta object literal for the '{@link tau.systemengineering.STPAsec.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tau.systemengineering.STPAsec.impl.DataFlowImpl
		 * @see tau.systemengineering.STPAsec.impl.STPAsecPackageImpl#getDataFlow()
		 * @generated
		 */
		EClass DATA_FLOW = eINSTANCE.getDataFlow();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FLOW__ID = eINSTANCE.getDataFlow_Id();

		/**
		 * The meta object literal for the '<em><b>Data Elment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__DATA_ELMENT = eINSTANCE.getDataFlow_DataElment();

	}

} //STPAsecPackage
