/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tau.systemengineering.STPAsec.STPAsecPackage
 * @generated
 */
public interface STPAsecFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	STPAsecFactory eINSTANCE = tau.systemengineering.STPAsec.impl.STPAsecFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>STPA Sec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>STPA Sec</em>'.
	 * @generated
	 */
	STPASec createSTPASec();

	/**
	 * Returns a new object of class '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System</em>'.
	 * @generated
	 */
	System createSystem();

	/**
	 * Returns a new object of class '<em>Control Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Action</em>'.
	 * @generated
	 */
	ControlAction createControlAction();

	/**
	 * Returns a new object of class '<em>Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feedback</em>'.
	 * @generated
	 */
	Feedback createFeedback();

	/**
	 * Returns a new object of class '<em>Control Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Loop</em>'.
	 * @generated
	 */
	ControlLoop createControlLoop();

	/**
	 * Returns a new object of class '<em>Cmd Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cmd Flow</em>'.
	 * @generated
	 */
	CmdFlow createCmdFlow();

	/**
	 * Returns a new object of class '<em>Feedback Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feedback Flow</em>'.
	 * @generated
	 */
	FeedbackFlow createFeedbackFlow();

	/**
	 * Returns a new object of class '<em>Info Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Info Flow</em>'.
	 * @generated
	 */
	InfoFlow createInfoFlow();

	/**
	 * Returns a new object of class '<em>Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information</em>'.
	 * @generated
	 */
	Information createInformation();

	/**
	 * Returns a new object of class '<em>Loss</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loss</em>'.
	 * @generated
	 */
	Loss createLoss();

	/**
	 * Returns a new object of class '<em>System Level Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Level Hazard</em>'.
	 * @generated
	 */
	SystemLevelHazard createSystemLevelHazard();

	/**
	 * Returns a new object of class '<em>System Level Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Level Constraint</em>'.
	 * @generated
	 */
	SystemLevelConstraint createSystemLevelConstraint();

	/**
	 * Returns a new object of class '<em>Insecure Control Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insecure Control Action</em>'.
	 * @generated
	 */
	InsecureControlAction createInsecureControlAction();

	/**
	 * Returns a new object of class '<em>Controller Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller Constraints</em>'.
	 * @generated
	 */
	ControllerConstraints createControllerConstraints();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	STPAsecPackage getSTPAsecPackage();

} //STPAsecFactory
